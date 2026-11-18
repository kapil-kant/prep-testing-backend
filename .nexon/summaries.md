src/main/java/com/interviewprep/backend/module/questions/blind75/repository/Blind75Repository.java: Repository interface for Blind 75 question JPA entity with custom query.
src/main/java/com/interviewprep/backend/module/questions/blind75/enums/Difficulty.java: Defines Difficulty enum with readable names and a method for listing all difficulty levels as label/name pairs.
src/main/java/com/interviewprep/backend/module/questions/blind75/service/Blind75Service.java: Service interface for Blind 75 operations, now also supports fetching list of difficulty levels with readable names.
src/main/java/com/interviewprep/backend/module/questions/blind75/service/impl/Blind75ServiceImpl.java: Implements Blind75Service, now fetches list of difficulties using Difficulty enum static method.
src/main/java/com/interviewprep/backend/module/questions/blind75/controller/Blind75Controller.java: REST controller for Blind 75 module, now adds endpoint to fetch difficulty levels for authenticated users.
src/main/java/com/interviewprep/backend/common/constant/Constants.java: Defines system-wide response codes and messages, now includes code/message for successful difficulties fetch.
