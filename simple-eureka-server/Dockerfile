FROM openjdk:8-jre-alpine

WORKDIR /

COPY /target/simple-eureka-server-1.0-SNAPSHOT.jar /eureka.jar

EXPOSE 8761

ENTRYPOINT ["java","-Xmx256m","-Xms256m","-XX:+UseConcMarkSweepGC","-jar","/eureka.jar"]