FROM java:8-jre

ADD ./target/location-service-1.1.0.jar /usr/src/location-service-1.1.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "location-service-1.1.0.jar"]
