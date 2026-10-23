package com.interviewprep.backend.module.questions.blind75.service.impl;

import com.interviewprep.backend.common.exception.AppException;
import com.interviewprep.backend.module.auth.entity.User;
import com.interviewprep.backend.module.auth.repository.UserRepository;
import com.interviewprep.backend.module.questions.blind75.dto.request.ProgressRequest;
import com.interviewprep.backend.module.questions.blind75.dto.response.Blind75Response;
import com.interviewprep.backend.module.questions.blind75.entity.Blind75Question;
import com.interviewprep.backend.module.questions.blind75.entity.UserQuestionProgress;
import com.interviewprep.backend.module.questions.blind75.enums.ProgressStatus;
import com.interviewprep.backend.module.questions.blind75.exception.ProgressUpdateFailedException;
import com.interviewprep.backend.module.questions.blind75.exception.QuestionNotFoundException;
import com.interviewprep.backend.module.questions.blind75.exception.QuestionsFetchFailedException;
import com.interviewprep.backend.module.questions.blind75.repository.Blind75Repository;
import com.interviewprep.backend.module.questions.blind75.repository.UserProgressRepository;
import com.interviewprep.backend.module.questions.blind75.service.Blind75Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class Blind75ServiceImpl implements Blind75Service {

    private final Blind75Repository blind75Repository;
    private final UserProgressRepository userProgressRepository;
    private final UserRepository userRepository;

    @Override
    public List<Blind75Response> getAllQuestions(UUID userId) {
        try {
            List<Blind75Question> questions = blind75Repository.findAll();

            Map<UUID, ProgressStatus> progressMap = userProgressRepository.findByUserId(userId)
                    .stream()
                    .collect(Collectors.toMap(
                            progress -> progress.getQuestion().getId(),
                            UserQuestionProgress::getStatus
                    ));

            return questions.stream()
                    .map(question -> Blind75Response.builder()
                            .id(question.getId())
                            .title(question.getTitle())
                            .difficulty(question.getDifficulty())
                            .topic(question.getTopic())
                            .pattern(question.getPattern())
                            .practiceLink(question.getPracticeLink())
                            .videoSolutionLink(question.getVideoSolutionLink())
                            .videoAvailability(question.getVideoAvailability())
                            .status(progressMap.getOrDefault(question.getId(), ProgressStatus.NOT_STARTED))
                            .build())
                    .toList();
        } catch (Exception e) {
            log.error("Failed to fetch questions", e);
            throw new QuestionsFetchFailedException();
        }
    }

    @Override
    public Map<String, Integer> getSolvedQuestionCount(UUID userId) {
        int totalCount = (int) blind75Repository.count();

        int solvedCount = (int) userProgressRepository.findByUserId(userId)
                .stream()
                .filter(progress -> progress.getStatus() == ProgressStatus.SOLVED)
                .count();

        return Map.of(
                "solvedCount", solvedCount,
                "totalCount", totalCount
        );
    }
        } catch (AppException ex) {
            throw ex;
        } catch (Exception ex) {
            log.error("Failed to fetch blind75 questions for user {}: {}", userId, ex.getMessage(), ex);
            throw new QuestionsFetchFailedException(ex);
        }
    }

    @Override
    public List<ProgressStatus> getStatuses() {
        return List.of(ProgressStatus.SOLVED, ProgressStatus.ATTEMPTED, ProgressStatus.TODO);
    }

    @Override
    public void updateProgress(UUID questionId, UUID userId, ProgressRequest request) {
        try {
            Blind75Question question = blind75Repository.findById(questionId).orElseThrow(QuestionNotFoundException::new);

            userProgressRepository.findByUserIdAndQuestionId(userId, questionId)
                    .ifPresentOrElse(
                            progress -> {
                                progress.setStatus(request.getStatus());
                                userProgressRepository.save(progress);
                            },
                            () -> {
                                User user = userRepository.getReferenceById(userId);
                                userProgressRepository.save(UserQuestionProgress.builder()
                                        .user(user)
                                        .question(question)
                                        .status(request.getStatus())
                                        .build());
                            }
                    );

        } catch (AppException ex) {
            throw ex;
        } catch (Exception ex) {
            log.error("Failed to update progress for question {} and user {}: {}", questionId, userId, ex.getMessage(), ex);
            throw new ProgressUpdateFailedException(ex);
        }
    }
}