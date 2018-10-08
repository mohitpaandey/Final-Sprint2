FROM java:8-jre

ADD ./target/indexer-service-1.1.0.jar /usr/src/indexer-service-1.1.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "indexer-service-1.1.0.jar"]
