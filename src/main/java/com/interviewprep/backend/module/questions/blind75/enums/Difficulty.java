package com.interviewprep.backend.module.questions.blind75.enums;

public enum Difficulty {
    EASY("Easy"),
    MEDIUM("Medium"),
    HARD("Hard");

    private final String label;

    Difficulty(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static java.util.List<DifficultyLevel> getAllAsLevels() {
        java.util.List<DifficultyLevel> levels = new java.util.ArrayList<>();
        for (Difficulty d : Difficulty.values()) {
            levels.add(new DifficultyLevel(d.name(), d.getLabel()));
        }
        return levels;
    }

    public static class DifficultyLevel {
        private final String name;
        private final String label;
        public DifficultyLevel(String name, String label) {
            this.name = name;
            this.label = label;
        }
        public String getName() {
            return name;
        }
        public String getLabel() {
            return label;
        }
    }
}