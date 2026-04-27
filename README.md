
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

```bash
mvn spring-boot:run
