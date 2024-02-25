# Stage 1: Build the application
FROM maven:3.8.4-openjdk-11-slim AS build
WORKDIR /app
COPY . /app
RUN mvn clean package

# Stage 2: Create a minimal JRE image and copy the built JAR file
FROM openjdk:11-jre-slim
COPY --from=build /app/target/shopin-2.4.3.jar /app.jar

# Set the entry point to run the application
ENTRYPOINT ["java", "-jar", "/app.jar"]
