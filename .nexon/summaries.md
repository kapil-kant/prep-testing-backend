src/main/java/com/interviewprep/backend/common/constant/Constants.java: Defines global success and error codes as constants, and maps them to human-readable response messages.
src/main/java/com/interviewprep/backend/module/questions/blind75/controller/Blind75Controller.java: Blind75Controller with endpoints to view, update, and (now) reset question progress for logged-in users.
src/main/java/com/interviewprep/backend/module/questions/blind75/service/Blind75Service.java: Service interface for Blind75 question operations, now including resetUserProgress.
src/main/java/com/interviewprep/backend/module/questions/blind75/service/impl/Blind75ServiceImpl.java: Service implementation for Blind75 questions, with logic for resetting progress and handling not found/exception logic.
src/main/java/com/interviewprep/backend/module/questions/blind75/repository/UserProgressRepository.java: JPA repository for user-question progress, now includes deleteByUserIdAndQuestionId method.
