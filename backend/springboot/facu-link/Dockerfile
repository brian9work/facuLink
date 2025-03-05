FROM ubuntu:latest
LABEL authors="michl"

ENTRYPOINT ["top", "-b"]

FROM openjdk:17-slim

WORKDIR /app

# COPY target/ms-spring-security-jwt-0.0.1-SNAPSHOT.jar /app/ms-spring-security-jwt.jar
COPY target/*.jar /app/app.jar

EXPOSE 3306

CMD ["java", "-jar", "/app/app.jar"]
# CMD ["java", "-jar", "app.jar"]
