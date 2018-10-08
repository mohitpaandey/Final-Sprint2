FROM java:8-jre

ADD ./target/personalinfo-service-1.1.0.jar /usr/src/personalinfo-service-1.1.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "personalinfo-service-1.1.0.jar"]
