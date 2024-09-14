# Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

# Information around who maintains the image
MAINTAINER saquib.com

# Add the application's jar to the image
COPY target/spring-boot-app-0.0.1-SNAPSHOT.jar spring-boot-app-0.0.1-SNAPSHOT.jar

# Command to execute the application
ENTRYPOINT ["java", "-jar", "spring-boot-app-0.0.1-SNAPSHOT.jar"]