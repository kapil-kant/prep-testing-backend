package com.interviewprep.backend.module.questions.blind75.seed;

import com.interviewprep.backend.module.questions.blind75.entity.Blind75Question;
import com.interviewprep.backend.module.questions.blind75.repository.Blind75Repository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@Component
@RequiredArgsConstructor
public class Blind75QuestionSeeder implements CommandLineRunner {

    private final Blind75Repository blind75Repository;

    @Value("${app.questions.seed-version}")
    private int configuredSeedVersion;

    @Override
    @Transactional
    public void run(String... args) {
        int currentSeedVersion = blind75Repository.findMaxSeedVersion();

        if (currentSeedVersion == configuredSeedVersion) {
            log.info("Blind75 questions already seeded at version {}, skipping", configuredSeedVersion);
            return;
        }

        log.info("Seeding Blind75 questions: version {} -> {}", currentSeedVersion, configuredSeedVersion);

        Map<String, Blind75Question> existingByKey = blind75Repository.findAll().stream()
                .collect(Collectors.toMap(Blind75Question::getQuestionKey, Function.identity()));

        List<Blind75Question> toSave = Blind75QuestionSeedData.QUESTIONS.stream()
                .map(blind75SeedQuestion -> {
                    Blind75Question question = existingByKey.getOrDefault(blind75SeedQuestion.key(),
                            Blind75Question.builder().questionKey(blind75SeedQuestion.key()).build());

                    question.setTitle(blind75SeedQuestion.title());
                    question.setDifficulty(blind75SeedQuestion.difficulty());
                    question.setTopic(blind75SeedQuestion.topic());
                    question.setPattern(blind75SeedQuestion.pattern());
                    question.setPracticeLink(blind75SeedQuestion.practiceLink());
                    question.setVideoSolutionLink(blind75SeedQuestion.videoSolutionLink());
                    question.setVideoAvailability(blind75SeedQuestion.videoAvailability());
                    question.setSeedVersion(configuredSeedVersion);
                    return question;
                })
                .toList();

        blind75Repository.saveAll(toSave);
        log.info("Seeded {} Blind75 questions at version {}", toSave.size(), configuredSeedVersion);
    }
}