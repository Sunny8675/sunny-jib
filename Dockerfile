FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/sunny-jib-0.0.1.jar sunny-jib.jar
EXPOSE 8100
ENTRYPOINT ["java","-jar","sunny-jib.jar"]