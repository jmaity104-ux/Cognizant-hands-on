# Exercise 6: Query Methods Feature of Spring Data JPA

Spring Data JPA can create queries from method names.

Examples used here:

- `findByCode(String code)`
- `findByNameContainingIgnoreCase(String name)`

The method names read like small English sentences, and Spring turns them into SQL through JPA and Hibernate.
