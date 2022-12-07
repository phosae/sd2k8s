FROM openjdk:8-jre-alpine
WORKDIR /
COPY eureka-callee.jar eureka-callee.jar
ENTRYPOINT ["java","-Xmx256m","-Xms256m","-XX:+UseConcMarkSweepGC","-jar","/eureka-callee.jar"]

