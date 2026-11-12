src/main/java/com/interviewprep/backend/common/constant/Constants.java: Defines global success and error codes as constants, and maps them to human-readable response messages.
src/main/java/com/interviewprep/backend/module/questions/blind75/dto/response/ProgressSummaryResponse.java: DTO representing solved/total progress for a user on Blind 75 questions.
src/main/java/com/interviewprep/backend/module/questions/blind75/controller/Blind75Controller.java: Controller exposing Blind75 REST endpoints including listing questions, progress update, and user solved/total progress.
src/main/java/com/interviewprep/backend/module/questions/blind75/service/Blind75Service.java: Blind 75 Question Service interface, now including user solved/total progress.
src/main/java/com/interviewprep/backend/module/questions/blind75/service/impl/Blind75ServiceImpl.java: Service implementation for Blind 75 questions, now including user solved/total progress counts.
src/main/java/com/interviewprep/backend/module/questions/blind75/repository/UserProgressRepository.java: Repository for Blind75 user progress, now with count for user's solved questions.
src/main/java/com/interviewprep/backend/module/questions/blind75/repository/Blind75Repository.java: Blind75 repository providing DB methods, now including count of total questions.
