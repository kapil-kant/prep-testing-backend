package com.interviewprep.backend.module.questions.blind75.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProgressSummaryResponse {

    private long solvedCount;
    private long totalCount;
}