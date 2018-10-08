FROM java:8-jre

ADD ./target/projects-service-1.1.0.jar /usr/src/projects-service-1.1.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "projects-service-1.1.0.jar"]
