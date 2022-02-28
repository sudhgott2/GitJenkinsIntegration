FROM openjdk:11
FROM tomcat:8.0-alpine
COPY target/docker-jenkins-integration-sample.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java","-jar","docker-jenkins-integration-sample.jar"]
EXPOSE 8092