package com.interviewprep.backend.module.questions.blind75.service;

import com.interviewprep.backend.module.questions.blind75.dto.request.ProgressRequest;
import com.interviewprep.backend.module.questions.blind75.dto.response.Blind75Response;
import com.interviewprep.backend.module.questions.blind75.enums.ProgressStatus;

import java.util.List;
import java.util.UUID;

public interface Blind75Service {

    List<Blind75Response> getAllQuestions(UUID userId);

    List<ProgressStatus> getStatuses();

    /**
     * Returns a list of all difficulty levels supported by the app.
     */
    List<DifficultyLevelResponse> getDifficultyLevels();

    void updateProgress(UUID questionId, UUID userId, ProgressRequest request);
}