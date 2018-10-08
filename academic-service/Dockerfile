FROM java:8-jre

ADD ./target/academic-service-1.1.0.jar /usr/src/academic-service-1.1.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "academic-service-1.1.0.jar"]

