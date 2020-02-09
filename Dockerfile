COPY ./target/football-0.0.1-SNAPSHOT.jar /usr/src/
WORKDIR /usr/src
EXPOSE 8080
CMD ["java", "-jar", "football-0.0.1-SNAPSHOT.jar"]