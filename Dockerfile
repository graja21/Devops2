FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/demo-app-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-cp", "app.jar", "com.example.App"]
