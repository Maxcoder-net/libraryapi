FROM openjdk:18
WORKDIR /app
COPY ./libv-0.0.1-SNAPSHOT.war /app
EXPOSE 8090
CMD ["java", "-jar", "spring-0.0.1-SNAPSHOT.jar"]