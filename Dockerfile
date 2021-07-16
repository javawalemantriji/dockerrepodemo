FROM openjdk:8-jdk-alpine
VOLUME /temp
ADD target/jenkinspushdemo.jar  jenkinspushdemo.jar
ENTRYPOINT ["java","-jar","/jenkinspushdemo.jar"]
