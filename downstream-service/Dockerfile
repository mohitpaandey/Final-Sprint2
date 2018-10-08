FROM java:8-jre

ADD ./target/downstream-service-1.1.0.jar /usr/src/downstream-service-1.1.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "downstream-service-1.1.0.jar"]
