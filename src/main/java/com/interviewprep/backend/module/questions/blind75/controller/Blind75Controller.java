package com.interviewprep.backend.module.questions.blind75.controller;

import com.interviewprep.backend.common.constant.Constants;
import com.interviewprep.backend.common.response.ApiResponse;
import com.interviewprep.backend.common.security.CustomUserDetails;
import com.interviewprep.backend.module.questions.blind75.dto.request.ProgressRequest;
import com.interviewprep.backend.module.questions.blind75.enums.ProgressStatus;
import com.interviewprep.backend.module.questions.blind75.service.Blind75Service;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/blind75")
@RequiredArgsConstructor
public class Blind75Controller {

    private final Blind75Service blind75Service;

    @GetMapping
    public ResponseEntity<ApiResponse> getAllQuestions(@AuthenticationPrincipal CustomUserDetails userDetails) {
        UUID userId = userDetails.getUser().getId();
        List<?> questions = blind75Service.getAllQuestions(userId);
        return ResponseEntity.ok(ApiResponse.builder().code(Constants.QUESTIONS_FETCHED).success(true).data(questions).build());
    }

    @GetMapping("/statuses")
    public ResponseEntity<ApiResponse> getStatuses() {
        List<ProgressStatus> statuses = blind75Service.getStatuses();
        return ResponseEntity.ok(ApiResponse.builder().code(Constants.STATUSES_FETCHED).success(true).data(statuses).build());
    }

    @PostMapping("/{id}/progress")
    public ResponseEntity<ApiResponse> updateProgress(@PathVariable UUID id, @AuthenticationPrincipal CustomUserDetails userDetails, @Valid @RequestBody ProgressRequest request) {
        UUID userId = userDetails.getUser().getId();
        blind75Service.updateProgress(id, userId, request);
        return ResponseEntity.ok(ApiResponse.builder().code(Constants.PROGRESS_UPDATED).success(true).build());
    }

    @GetMapping("/utf8-size")
    public ResponseEntity<ApiResponse> getUtf8Size(@RequestParam String text) {
        int size;
        try {
            size = text.getBytes("UTF-8").length;
        } catch (java.io.UnsupportedEncodingException e) {
            // Should not happen for UTF-8
            return ResponseEntity.internalServerError().body(ApiResponse.builder()
                .code(Constants.INTERNAL_SERVER_ERROR)
                .success(false)
                .message("UTF-8 encoding not supported")
                .build());
        }
        return ResponseEntity.ok(ApiResponse.builder()
            .code(Constants.QUESTIONS_FETCHED)
            .success(true)
            .data(size)
            .build());
    }
}
