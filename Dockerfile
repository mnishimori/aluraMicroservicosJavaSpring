FROM openjdk:17
COPY target/pagamentos*SNAPSHOT.jar pagamentos.jar
ENTRYPOINT ["java", "-jar", "/pagamentos.jar"]
