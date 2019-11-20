FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar sunny-jib.jar
ENTRYPOINT ["java","-jar","sunny-jib.jar"]