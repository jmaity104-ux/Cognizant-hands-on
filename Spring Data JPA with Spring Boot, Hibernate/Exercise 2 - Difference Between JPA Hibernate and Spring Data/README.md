# Exercise 2: Difference Between JPA, Hibernate and Spring Data

JPA is a specification. It tells Java how object-relational mapping should work, but it does not do the work by itself.

Hibernate is an implementation of JPA. It actually performs the mapping between Java objects and database tables.

Spring Data JPA sits on top of JPA and Hibernate. It reduces boilerplate code by giving repository interfaces such as `JpaRepository`, so common database operations can be done without writing DAO classes manually.

In simple words:

- JPA is the rule book.
- Hibernate is the engine that follows the rule book.
- Spring Data JPA is the helper that makes the engine easier to use in Spring applications.
