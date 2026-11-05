package com.interviewprep.backend.module.questions.blind75.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserProgressSummaryResponse {

    private int solved;
    private int total;
}
