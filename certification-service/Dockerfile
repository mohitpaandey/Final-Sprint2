FROM java:8-jre

ADD ./target/certification-service-1.1.0.jar /usr/src/certification-service-1.1.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "certification-service-1.1.0.jar"]
