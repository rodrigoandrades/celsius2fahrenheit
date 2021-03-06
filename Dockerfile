FROM openjdk:8-jdk

WORKDIR /tmp

COPY . .

RUN ./mvnw package 
RUN cp target/celsius2fahrenheit*.jar /app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
