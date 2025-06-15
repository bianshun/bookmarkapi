FROM openjdk:21-jdk
ADD target/bookmarkapi-1.0.jar bookmarkapi.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/bookmarkapi.jar"]
