FROM openjdk:8-jre-alpine
WORKDIR /
COPY eureka-caller.jar eureka-caller.jar
ENTRYPOINT ["java","-Xmx256m","-Xms256m","-XX:+UseConcMarkSweepGC","-jar","/eureka-caller.jar"]

