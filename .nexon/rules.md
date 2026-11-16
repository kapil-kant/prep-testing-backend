response-codes-location: Response codes and their messages are defined in common/constant/Constants.java and referenced application-wide.
controller-response-shape: Controllers return ResponseEntity<ApiResponse> with a standardized shape including code, success, data, using builder pattern.
service-interface-pattern: Business logic is abstracted with interface-based services named *Service, implemented per module.
repository-pattern: Data access is handled through JpaRepository interfaces named *Repository, supporting Spring Data custom queries.
