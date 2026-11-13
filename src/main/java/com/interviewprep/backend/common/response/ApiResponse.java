package com.interviewprep.backend.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.interviewprep.backend.common.constant.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {

    private int code;
    private boolean successful;
    private String message;
    private Object data;

    public static class ApiResponseBuilder {
        private boolean successful;

        public ApiResponseBuilder successful(boolean successful) {
            this.successful = successful;
            return this;
        }

        @Deprecated
        public ApiResponseBuilder success(boolean success) {
            // For backward-compatibility during refactor, but to be removed
            this.successful = success;
            return this;
        }

        public ApiResponse build() {
            if (this.message == null) {
                this.message = Constants.RESPONSE.get(this.code);
            }
            if (this.data == null) {
                this.data = Collections.emptyMap();
            }
            return new ApiResponse(this.code, this.successful, this.message, this.data);
        }
    }
}