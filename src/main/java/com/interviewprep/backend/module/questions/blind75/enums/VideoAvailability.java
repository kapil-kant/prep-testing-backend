package com.interviewprep.backend.module.questions.blind75.enums;

public enum VideoAvailability {
    AVAILABLE("Available"),
    COMING_SOON("Coming Soon");

    private final String label;

    VideoAvailability(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

