# Use a Java runtime base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the jar file
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the app's port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
