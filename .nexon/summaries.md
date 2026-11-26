src/main/java/com/interviewprep/backend/module/questions/blind75/controller/Blind75Controller.java: REST controller exposing endpoints for Blind75 question-related operations, using ApiResponse.
src/main/java/com/interviewprep/backend/module/questions/blind75/repository/Blind75Repository.java: Spring Data JPA repository for Blind75Question entities with custom seed version query.
src/main/java/com/interviewprep/backend/common/response/ApiResponse.java: Standard API response wrapper with code, success, message, and data, supporting builder pattern.
src/main/java/com/interviewprep/backend/module/questions/blind75/dto/response/DifficultyLevelResponse.java: POJO representing difficulty level for API output (name + display name).
src/main/java/com/interviewprep/backend/module/questions/blind75/enums/Difficulty.java: Enum representing difficulty levels (EASY, MEDIUM, HARD) with display names for API output.
src/main/java/com/interviewprep/backend/module/questions/blind75/service/Blind75Service.java: Service interface for Blind75 questions, progress, status, and difficulty level API operations.
src/main/java/com/interviewprep/backend/common/constant/Constants.java: Central location for all response codes and API response messages used by the app.
src/main/java/com/interviewprep/backend/module/questions/blind75/service/impl/Blind75ServiceImpl.java: Implements Blind75Service business logic, including new getDifficultyLevels().
