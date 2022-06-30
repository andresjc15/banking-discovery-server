FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/banking-discovery-server-1.0.0.jar banking-discovery-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/banking-discovery-server-1.0.0.jar"]