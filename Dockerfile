FROM openjdk
FROM ubuntu
FROM tomcat
COPY **/*.war /usr/local/tomcat/webapps
WORKDIR /usr/local/tomcat/webapps
RUN pwd && ls -al
ENTRYPOINT ["java", "-jar", "demoApp.war", "--server.port=8080"]
