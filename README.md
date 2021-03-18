# microservices-zuul-demo

This is a simple Zuul Server.

## Installation

Once you have checked out this repository, go to the base directory and build it using maven

```bash
maven clean install
```

## Running the application

Once the project is successfully built, you can run the following command:

```bash
java -jar .\target\microservices-zuul-demo-1.jar
```

The application would run at the configured port and act as a edge server for all your micro-services.

Currently the application.properties file is configured to run a default and dev instance of https://github.com/vkirodian/spring-boot-example project.

All requests to http://localhost:8111/proxy/ will land on default instance of <b>spring-boot-example</b> running on http://localhost:8081 and http://localhost:8111/proxy2/ will land on dev instance of <b>spring-boot-example</b> running on http://localhost:8082