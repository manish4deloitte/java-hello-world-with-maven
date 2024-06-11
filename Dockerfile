FROM openjdk:17-oracle
VOLUME /tmp
ADD target/jb-hello-world-maven-0.2.0.jar test.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/test.jar"]
