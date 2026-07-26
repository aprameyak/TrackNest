# TrackNest

![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white&style=for-the-badge)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?logo=springboot&logoColor=white&style=for-the-badge)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?logo=postgresql&logoColor=white&style=for-the-badge)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?logo=hibernate&logoColor=white&style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-C71A36?logo=apachemaven&logoColor=white&style=for-the-badge)
![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=white&style=for-the-badge)

## About

**TrackNest** is a production-ready REST API for managing users and their associated music tracks. Built with **Java, Spring Boot, and PostgreSQL**, it exposes full CRUD endpoints for both `User` and `Track` resources, models their relationship with JPA, and is containerized with Docker for deployment on Render.

## Features

- Full CRUD endpoints for `User` and `Track` resources with a publicly accessible API
- `@OneToMany` / `@ManyToOne` JPA relationships with cascade delete and orphan removal
- PostgreSQL persistence via Spring Data JPA (Hibernate) with H2 available for local testing
- Controller → Service → Repository layered architecture for clean separation of concerns
- Jackson annotations on models to prevent JSON serialization cycles
- Docker containerization for consistent local and cloud environments
- Deployed to Render with a cloud-hosted PostgreSQL database

## Technology Stack

- **Language**: Java 17
- **Framework**: Spring Boot 3.5
- **Database**: PostgreSQL
- **ORM**: Hibernate (JPA)
- **Build**: Maven
- **Containerization**: Docker

## Deployment

Visit the live API at [https://tracknest-i73t.onrender.com](https://tracknest-i73t.onrender.com)
