# Exercise 5: Add a New Country

This exercise adds a `POST` API for saving a new country.

Run the app and send:

```json
{
  "code": "fr",
  "name": "France"
}
```

to:

```text
POST /countries
```

The service converts the country code to uppercase before saving it.
