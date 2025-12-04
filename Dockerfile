FROM eclipse-temurin:17-jdk

WORKDIR /app

# Le jar généré par Maven est dans target/
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]


