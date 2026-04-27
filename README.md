
---

# Java — Spring Boot Task Manager API

```md id="java_readme"
# Task Manager API (Spring Boot)

A RESTful backend application built with Spring Boot for managing tasks.  
The project follows a layered architecture (Controller, Service, Repository).

---

## Features

- Create tasks
- Retrieve tasks
- Delete tasks
- REST API structure
- Database integration using JPA

---

## Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## Project Structure

controller/ → REST endpoints
service/ → business logic
repository/ → database layer
model/ → entity classes

---

## How to run

mvn spring-boot:run

API available at:
http://localhost:8080/tasks

## API Endpoints
GET /tasks
POST /tasks
DELETE /tasks/{id}

## What I learned
Spring Boot architecture
Dependency Injection
REST API development in Java
JPA/Hibernate basics
Layered backend design

## Future improvements
JWT authentication
User-task relationship
PostgreSQL integration
Docker support
