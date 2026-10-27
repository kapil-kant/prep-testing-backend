src/main/java/com/interviewprep/backend/module/questions/blind75/controller/Blind75Controller.java: Blind75 question controller with endpoints for questions, statuses, progress update, and user-specific progress count.
src/main/java/com/interviewprep/backend/module/questions/blind75/repository/UserProgressRepository.java: Repository interface for querying and updating user progress on Blind75 questions.
src/main/java/com/interviewprep/backend/module/questions/blind75/repository/Blind75Repository.java: Repository for Blind75Question entity with extra methods for counting and seed version lookup.
src/main/java/com/interviewprep/backend/module/questions/blind75/service/Blind75Service.java: Service interface for Blind75 operations including progress query per user.
src/main/java/com/interviewprep/backend/module/questions/blind75/service/impl/Blind75ServiceImpl.java: Service implementation providing business logic for Blind75 operations, including user progress calculation.
