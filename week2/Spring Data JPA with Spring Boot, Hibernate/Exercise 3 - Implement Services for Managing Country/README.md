# Exercise 3: Implement Services for Managing Country

This exercise keeps controller logic small and puts country-related work in a service layer.

- `CountryRepository` talks to the database.
- `CountryService` defines what the application can do.
- `CountryServiceImpl` contains the actual service logic.
- `CountryController` exposes the service as REST APIs.

Useful endpoints:

- `GET /countries`
- `POST /countries`
