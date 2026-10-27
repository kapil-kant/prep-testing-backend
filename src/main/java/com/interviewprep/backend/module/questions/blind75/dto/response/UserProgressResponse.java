package com.interviewprep.backend.module.questions.blind75.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProgressResponse {
    private int solvedCount;
    private int totalCount;
}
