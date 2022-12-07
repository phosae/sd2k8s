FROM openjdk:8-jre-alpine
WORKDIR /
COPY simple-eureka-server.jar simple-eureka-server.jar
ENTRYPOINT ["java","-Xmx256m","-Xms256m","-XX:+UseConcMarkSweepGC","-jar","/simple-eureka-server.jar"]

