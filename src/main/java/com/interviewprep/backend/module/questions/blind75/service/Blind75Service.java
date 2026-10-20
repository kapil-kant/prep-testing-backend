package com.interviewprep.backend.module.questions.blind75.service;

import com.interviewprep.backend.module.questions.blind75.dto.request.ProgressRequest;
import com.interviewprep.backend.module.questions.blind75.dto.response.Blind75Response;
import com.interviewprep.backend.module.questions.blind75.enums.ProgressStatus;

import java.util.List;
import java.util.UUID;

public interface Blind75Service {

    List<Integer> calculateUserStats(UUID userId);

    List<ProgressStatus> getStatuses();

    void updateProgress(UUID questionId, UUID userId, ProgressRequest request);
}