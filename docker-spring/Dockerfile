# OpenJDK as a parent image
FROM openjdk:17-jdk-slim

# Set custom working directory
WORKDIR /test/bin

# Copy the JAR file to bin
COPY target/*.jar docker-test.jar

# Expose port to lanch application
EXPOSE 9222

# Command to run the application
ENTRYPOINT ["java", "-jar", "docker-test.jar"]


