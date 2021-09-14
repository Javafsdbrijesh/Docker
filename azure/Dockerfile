FROM openjdk:8
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} azure.jar
ENTRYPOINT ["java", "-jar", "/azure.jar"]