ARG JAVA_VERSION=8u192-zulu-alpine

FROM maven:3-jdk-8 as build

WORKDIR /build
COPY src src
COPY pom.xml .
RUN mvn clean install 



FROM mcr.microsoft.com/java/jdk:${JAVA_VERSION} as runtime
WORKDIR /app
COPY --from=build /build/target/FirstMicroservice-1.0-SNAPSHOT.jar .
EXPOSE 8080
RUN touch file1
CMD java -jar FirstMicroservice-1.0-SNAPSHOT.jar

