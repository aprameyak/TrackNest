# TrackNest

![Java](https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white&style=for-the-badge)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.5.0-6DB33F?logo=springboot&logoColor=white&style=for-the-badge)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-4169E1?logo=postgresql&logoColor=white&style=for-the-badge)
![JPA](https://img.shields.io/badge/JPA-Hibernate-59666C?logo=hibernate&logoColor=white&style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-C71A36?logo=apachemaven&logoColor=white&style=for-the-badge)
![REST API](https://img.shields.io/badge/REST%20API-Spring%20Web-FF6F61?style=for-the-badge)

## About

**TrackNest** is a lightweight backend project built with **Java, Spring Boot, and PostgreSQL** that provides CRUD endpoints for managing users and their associated tracks. It features clean architecture, JPA-based entity relationships, and real database integration — perfect as a boilerplate for more complex microservices.

## Features

- Full CRUD for `User` and `Track` models  
- `@OneToMany` + `@ManyToOne` relationship with cascade control  
- PostgreSQL + Hibernate via Spring Data JPA  
- Cycle-safe JSON serialization with Jackson annotations  
- Clean layered architecture (controller, service, repository)

## Technology Stack

- **Language**: Java 17  
- **Framework**: Spring Boot 3.5  
- **Database**: PostgreSQL 14  
- **ORM**: Hibernate (JPA)  
- **Build Tool**: Maven  
- **Testing**: Postman / curl
