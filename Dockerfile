FROM openjdk:8
ADD target/rest-service.jar rest-service.jar
ENTRYPOINT ["java", "-jar","rest-service.jar"]