src/main/java/com/interviewprep/backend/module/questions/blind75/controller/Blind75Controller.java: REST controller handling Blind75 questions endpoints, uses ApiResponse and Constants for uniform responses.
src/main/java/com/interviewprep/backend/module/questions/blind75/repository/Blind75Repository.java: JPA repository for Blind75Question entities, including custom queries.
src/main/java/com/interviewprep/backend/common/constant/Constants.java: Central place for response codes and associated messages used throughout the application.
src/main/java/com/interviewprep/backend/module/questions/blind75/enums/VideoAvailability.java: Enum for video solution availability with user-facing labels and label getter.
src/main/java/com/interviewprep/backend/module/questions/blind75/service/Blind75Service.java: Interface for Blind75 business logic, now includes getting video availability options.
src/main/java/com/interviewprep/backend/module/questions/blind75/service/impl/Blind75ServiceImpl.java: Implements Blind75Service, now with method returning all video availability enum options.
