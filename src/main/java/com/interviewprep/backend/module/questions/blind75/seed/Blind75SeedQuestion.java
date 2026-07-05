package com.interviewprep.backend.module.questions.blind75.seed;

import com.interviewprep.backend.module.questions.blind75.enums.Difficulty;
import com.interviewprep.backend.module.questions.blind75.enums.Pattern;
import com.interviewprep.backend.module.questions.blind75.enums.Topic;
import com.interviewprep.backend.module.questions.blind75.enums.VideoAvailability;

public record Blind75SeedQuestion(
        String key,
        String title,
        Difficulty difficulty,
        Topic topic,
        Pattern pattern,
        String practiceLink,
        String videoSolutionLink,
        VideoAvailability videoAvailability
) {

    public Blind75SeedQuestion(String key, String title, Difficulty difficulty, Topic topic, Pattern pattern, String practiceLink) {
        this(key, title, difficulty, topic, pattern, practiceLink, null, VideoAvailability.COMING_SOON);
    }
}