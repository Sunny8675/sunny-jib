FROM java:8
VOLUME /tmp
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
COPY target/sunny-jib-0.0.1.jar /usr/src/sunny-jib.jar
ENV JAVA_OPTS=""
EXPOSE 8100
ENTRYPOINT ["java","-jar","/usr/src/sunny-jib.jar"]