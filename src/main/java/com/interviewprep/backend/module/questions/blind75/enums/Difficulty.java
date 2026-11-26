package com.interviewprep.backend.module.questions.blind75.enums;

import java.util.List;

public enum Difficulty {
    EASY("Easy"),
    MEDIUM("Medium"),
    HARD("Hard");

    private final String displayName;

    Difficulty(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static List<DifficultyLevelDto> getAllDifficulties() {
        return java.util.Arrays.stream(values())
                .map(d -> new DifficultyLevelDto(d.name(), d.getDisplayName()))
                .toList();
    }

    public static class DifficultyLevelDto {
        private final String code;
        private final String name;

        public DifficultyLevelDto(String code, String name) {
            this.code = code;
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }
    }
}