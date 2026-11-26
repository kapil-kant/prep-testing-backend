src/main/java/com/interviewprep/backend/module/questions/blind75/repository/Blind75Repository.java: Spring Data JPA repository for Blind75Question entities with custom seed version query.
src/main/java/com/interviewprep/backend/common/response/ApiResponse.java: Standard API response wrapper with code, success, message, and data, supporting builder pattern.
src/main/java/com/interviewprep/backend/module/questions/blind75/enums/Difficulty.java: Defines Difficulty enum with display names and a DTO for listing all levels with code and name.
src/main/java/com/interviewprep/backend/module/questions/blind75/controller/Blind75Controller.java: REST controller exposing endpoints for Blind75 questions, statuses, progress, and difficulty levels using ApiResponse.
src/main/java/com/interviewprep/backend/module/questions/blind75/service/Blind75Service.java: Service interface for Blind75, including methods for questions, statuses, progress, and difficulty levels.
src/main/java/com/interviewprep/backend/module/questions/blind75/service/impl/Blind75ServiceImpl.java: Service implementation for Blind75, handling questions, statuses, progress, and returning available difficulty levels.
src/main/java/com/interviewprep/backend/common/constant/Constants.java: Defines standard integer codes and response messages for API responses, including Blind75 and difficulty levels.
