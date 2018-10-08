FROM java:8-jre

ADD ./target/coreNLP-service-1.1.0.jar /usr/src/coreNLP-service-1.1.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "coreNLP-service-1.1.0.jar"]
