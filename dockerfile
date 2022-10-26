FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
RUN apk --no-cache add curl
RUN curl -u admin:nexus -o tpAchat-1.1.jar "http://192.168.1.20:8081/repository/maven-releases/com/esprit/examen/tpAchatProject/1.1/tpAchatProject-1.1.jar" -L
ENTRYPOINT ["java","-jar","/tpAchat-1.1.jar"]
EXPOSE 8089
