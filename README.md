# TrackNest

![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white&style=for-the-badge)
![Spring Boot](https://img.shields.io/badge/SpringBoot-6DB33F?logo=springboot&logoColor=white&style=for-the-badge)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?logo=postgresql&logoColor=white&style=for-the-badge)
![JPA](https://img.shields.io/badge/JPA-Hibernate-59666C?logo=hibernate&logoColor=white&style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-C71A36?logo=apachemaven&logoColor=white&style=for-the-badge)
![Postman](https://img.shields.io/badge/Postman-FF6C37?logo=postman&logoColor=white&style=for-the-badge)

---

## About

**TrackNest** is a lightweight backend project built with **Java, Spring Boot, and PostgreSQL** that provides CRUD endpoints for managing users and their associated music tracks. It features clean architecture, JPA-based entity relationships, and real database integration — ideal as a boilerplate for music cataloging or backend microservices.

---

## Features

- Full CRUD operations for `User` and `Track` models  
- `@OneToMany` + `@ManyToOne` JPA relationships with cascade and orphan removal  
- PostgreSQL integration via Spring Data JPA (Hibernate)  
- JSON serialization with cycle prevention (Jackson annotations)  
- Modular architecture: Controller → Service → Repository  

---

## Technology Stack

- **Language**: Java 17  
- **Framework**: Spring Boot 3.5  
- **Database**: PostgreSQL 14  
- **ORM**: Hibernate (JPA)  
- **Build Tool**: Maven  
- **Testing Tool**: Postman / curl