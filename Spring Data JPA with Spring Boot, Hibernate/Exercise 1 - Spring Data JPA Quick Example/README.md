# Exercise 1: Spring Data JPA - Quick Example

This exercise shows the shortest useful Spring Data JPA flow:

- `Country` is the entity mapped to the database table.
- `CountryRepository` extends `JpaRepository`, so Spring gives ready-made CRUD methods.
- `CountryRunner` adds sample countries and reads them back when the app starts.

Run with:

```powershell
mvn spring-boot:run
```
