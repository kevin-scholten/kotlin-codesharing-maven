# Kotlin JVM Maven code sharing

## This application contains:
- Spring Boot KotlinJVM maven module
- Shared KotlinJVM maven module

The template contains a `Werknemer` (employee) class in the shared module, which the backend module (Spring Boot) uses. Code is shared by declaring the 2 modules at the parent module, and adding the shared module as dependency to the backend module.

## Getting the employee
To see emmployee information in JSON, go to `localhost:8080/api/werknemer`


*Created by Kevin Scholten on March 2nd 2022.*
