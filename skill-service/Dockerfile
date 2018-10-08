FROM java:8-jre

ADD ./target/skill-service-1.1.0.jar /usr/src/skill-service-1.1.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "skill-service-1.1.0.jar"]
