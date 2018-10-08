FROM java:8-jre

ADD ./target/upstream-service-1.1.0.jar /usr/src/upstream-service-1.1.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "upstream-service-1.1.0.jar"
