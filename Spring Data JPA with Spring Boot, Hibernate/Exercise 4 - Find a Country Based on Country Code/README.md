# Exercise 4: Find a Country Based on Country Code

This exercise adds a focused service method for country lookup.

Try this endpoint after running the app:

```text
GET /countries/IN
```

The service converts the code to uppercase, searches by primary key, and throws a clear exception if the country is missing.
