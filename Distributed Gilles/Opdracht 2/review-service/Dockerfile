FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} review-service-1.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/review-service.jar"]
