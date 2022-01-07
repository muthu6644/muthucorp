FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} muthucorp.jar
ENTRYPOINT ["java","-jar","/muthucorp.jar"]