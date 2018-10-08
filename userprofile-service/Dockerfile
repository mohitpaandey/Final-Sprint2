FROM java:8-jre
MAINTAINER  Sashi Kumar Singh <sashi18singh@gmail.com>
COPY ./target/userprofile-service-1.1.0.jar /usr/app/src/userprofile-service-1.1.0.jar
WORKDIR /usr/app/src
ENTRYPOINT ["java","-jar", "userprofile-service-1.1.0.jar"]
