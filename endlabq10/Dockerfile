FROM eclipse-temurin:25-jdk
WORKDIR /app
COPY target/*.war app.war
EXPOSE 8001
ENTRYPOINT ["java", "-jar", "app.war"]