COPY ./target/football-0.0.1-SNAPSHOT.jar /usr/src/saroj/
WORKDIR /usr/src/saroj
EXPOSE 8080
CMD ["java", "-jar", "football-0.0.1-SNAPSHOT.jar"]