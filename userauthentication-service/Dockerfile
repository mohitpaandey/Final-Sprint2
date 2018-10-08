FROM java:8-jre

ADD ./target/userauthentication-service-1.1.0.jar /usr/src/userauthentication-service-1.1.0.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "userauthentication-service-1.1.0.jar"]
