package com.interviewprep.backend.module.questions.blind75.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgressSummaryResponse {
    private long solved;
    private long total;
}
