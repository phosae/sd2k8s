FROM eclipse-temurin:8u352-b08-jre-ubi9-minimal
WORKDIR /
COPY eureka-caller.jar eureka-caller.jar
ENTRYPOINT ["java","-Xmx256m","-Xms256m","-XX:+UseConcMarkSweepGC","-jar","/eureka-caller.jar"]

