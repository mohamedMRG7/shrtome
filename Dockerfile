FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY client-module/target/*.jar client-module-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/client-module-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080