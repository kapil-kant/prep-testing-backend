controller-layer: Controllers return ResponseEntity<ApiResponse> and use constants for standardized response codes/messages.
service-layer: Service layer is defined as interfaces specifying business methods for each domain.
repository-layer: Repositories extend Spring Data JPA interfaces and may define custom queries via @Query annotation.
constants-location: All response codes and API response messages are defined in a central Constants.java file.
