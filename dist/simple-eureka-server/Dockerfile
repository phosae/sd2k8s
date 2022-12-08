FROM eclipse-temurin:8u352-b08-jre-ubi9-minimal
WORKDIR /
COPY simple-eureka-server.jar simple-eureka-server.jar
ENTRYPOINT ["java","-Xmx256m","-Xms256m","-XX:+UseConcMarkSweepGC","-jar","/simple-eureka-server.jar"]

