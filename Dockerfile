From openjdk:8
EXPOSE 8089
ADD target/tpAchatProject-1.1.jar tpAchatProject-1.1.jar
ENTRYPOINT ["java", "-jar", "/tpAchatProject-1.1.jar"]

		