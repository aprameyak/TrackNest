# TrackNest

![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white&style=for-the-badge)
![Spring Boot](https://img.shields.io/badge/SpringBoot-6DB33F?logo=springboot&logoColor=white&style=for-the-badge)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?logo=postgresql&logoColor=white&style=for-the-badge)
![JPA](https://img.shields.io/badge/JPA-Hibernate-59666C?logo=hibernate&logoColor=white&style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-C71A36?logo=apachemaven&logoColor=white&style=for-the-badge)
![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=white&style=for-the-badge)
![Postman](https://img.shields.io/badge/Postman-FF6C37?logo=postman&logoColor=white&style=for-the-badge)
![Render](https://img.shields.io/badge/Deployed%20on-Render-3f3f3f?logo=render&logoColor=white&style=for-the-badge)

---

## About

**TrackNest** is a production-ready backend service built with **Java, Spring Boot, and PostgreSQL** that provides robust CRUD endpoints for managing users and their associated music tracks. It features clean architecture, JPA-based entity relationships, and cloud deployment with a publicly accessible API. The project demonstrates modern DevOps practices with Docker containerization and cloud hosting, making it an excellent example of a professional-grade microservice.

---

## Features

- Full CRUD operations for `User` and `Track` models with a public API endpoint
- Production-grade deployment on Render with live API documentation
- Containerized with Docker for consistent development and deployment
- `@OneToMany` + `@ManyToOne` JPA relationships with cascade and orphan removal
- PostgreSQL integration via Spring Data JPA (Hibernate)
- JSON serialization with cycle prevention (Jackson annotations)
- Modular architecture: Controller → Service → Repository
- Cloud-hosted PostgreSQL database for persistent storage

---

## Technology Stack

- **Language**: Java 17  
- **Framework**: Spring Boot 3.5  
- **Database**: PostgreSQL 14  
- **ORM**: Hibernate (JPA)  
- **Build Tool**: Maven  
- **Containerization**: Docker
- **Testing Tool**: Postman / curl

---

## Live Deployment

View here: [https://tracknest-i73t.onrender.com](https://tracknest-i73t.onrender.com)
