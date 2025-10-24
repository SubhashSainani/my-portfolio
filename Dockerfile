# ---- Stage 1: Build the JAR ----
    FROM maven:3.9.6-eclipse-temurin-17 AS build
    WORKDIR /app
    
    # Copy pom.xml and download dependencies (cached)
    COPY pom.xml .
    RUN mvn dependency:go-offline -B
    
    # Copy the rest of the code and build the project
    COPY src ./src
    RUN mvn clean package -DskipTests
    
    # ---- Stage 2: Run the JAR ----
    FROM eclipse-temurin:17-jdk-jammy
    WORKDIR /app
    
    # Copy the built JAR from the previous stage
    COPY --from=build /app/target/*.jar app.jar
    
    # Expose application port (change if your app runs on another port)
    EXPOSE 8080
    
    # Run the Spring Boot app
    ENTRYPOINT ["java", "-jar", "app.jar"]
    