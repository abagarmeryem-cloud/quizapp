## Quiz Application – Telescope

A RESTful Backend API built with Spring Boot that dynamically generates quizzes by category, selects random questions, and automatically calculates user scores.

## Project Overview

This project was developed as part of my backend development training using Spring Boot and JPA.

The main objective is to design and implement a structured REST API following the MVC architecture pattern, with clean separation of concerns and database persistence using MySQL.

## Architecture

The application follows a layered architecture:

Controller → Service → Repository → Database

Controller Layer – Handles HTTP requests and responses

Service Layer – Contains business logic

Repository Layer – Data access using Spring Data JPA

Model Layer – JPA entities mapped to database tables

This structure ensures maintainability, scalability, and clean code organization.

## Tech Stack
Technology-	Purpose
Java 17	Core- programming language
Spring Boot- Backend framework
Spring Data- JPA Data persistence
Hibernate- ORM framework
MySQL- Relational database
Maven- Dependency management
Rest Client- API testing

## Implemented Features

✔ Add and manage quiz questions
✔ Categorize questions
✔ Random question selection per category
✔ Dynamic quiz generation
✔ Quiz submission and automatic score calculation
✔ Custom JPA queries (@Query)
✔ Proper HTTP response handling using ResponseEntity

Application will start at:
http://localhost:8080

## Key Technical Concepts Demonstrated

-REST API design principles
-MVC Architecture implementation
-Dependency Injection
-Custom native and JPQL queries
-Exception handling & HTTP status management
-Database entity mapping with JPA