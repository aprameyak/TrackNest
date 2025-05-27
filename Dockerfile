# --- Stage 1: Build the app using Maven ---
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Set working directory
WORKDIR /app

# Copy source code
COPY . .

# Package the application (skip tests for speed)
RUN mvn clean package -DskipTests


# --- Stage 2: Run the app using a lightweight JDK ---
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built jar from the previous stage
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (Spring Boot default)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
