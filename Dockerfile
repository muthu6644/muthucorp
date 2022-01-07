FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} muthucorp1.jar
ENTRYPOINT ["java","-jar","/muthucorp1.jar"]