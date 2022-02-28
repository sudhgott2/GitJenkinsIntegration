FROM openjdk:11
COPY target/docker-jenkins-integration-sample.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java","-jar","/docker-jenkins-integration-sample.jar"]