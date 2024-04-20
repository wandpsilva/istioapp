FROM openjdk:17

WORKDIR /app

EXPOSE 8080

COPY target/istioapp-0.0.1-SNAPSHOT.jar /app/istioapp-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "istioapp-0.0.1-SNAPSHOT.jar"]