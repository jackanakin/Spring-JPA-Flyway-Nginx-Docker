FROM amazoncorretto:18.0.2

MAINTAINER github/jackanakin

EXPOSE 8080

WORKDIR /opt

ARG JAR_FILE

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "/opt/app.jar"]
