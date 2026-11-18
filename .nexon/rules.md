response-codes: All API response codes and their messages are defined as constants in Constants.java.
controller-response-shape: Controllers return API results wrapped in an ApiResponse object, with code, success, and data fields.
service-interface-pattern: Services are defined as interfaces with domain-specific operations tied to the module.
repository-pattern: Data access uses Spring Data JPA repositories per entity, optionally with custom queries.
