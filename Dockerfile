FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copier le jar généré par Maven
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]

