# Pull base image.
FROM ubuntu

VOLUME /tmp

RUN \
# Update
apt-get update -y && \

# Install Java
apt-get install default-jre -y
ADD ./target/spring-boot-web-0.0.1-SNAPSHOT.jar spring-web.jar
# update date for static resources
RUN sh -c 'touch /spring-web.jar'
ENTRYPOINT ["java","-Djava.security.edg=file:/dev/ ./urandom","-jar","/spring-web.jar"]
#EXPOSE 8080

#CMD java -jar spring-web.jar
