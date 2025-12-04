FROM eclipse-temurin:17-jdk

WORKDIR /app

# On copie le jar généré par Maven
COPY target/*.jar app.jar

EXPOSE 8080

# On lance directement la classe main, sans utiliser le manifest
ENTRYPOINT ["java", "-cp", "app.jar", "com.example.App"]

