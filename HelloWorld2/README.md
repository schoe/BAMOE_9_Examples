# `Hello World 2`

> _This project was auto-generated from the BAMOE Canvas Accelerator `Spring Boot (Full)`, and enables Decision, Rules, and Workflows. It's built on [Spring Boot](https://spring.io/), the Java-based framework for building standalone production-ready Spring applications._

# Description

`Just a simple Hello world shell project, looking at https://github.com/bamoe/bamoe-setup`

# Prerequisite

The necessary dependencies are not provided in maven central.  Please run the docker https://quay.io/repository/bamoe/maven-repository to get the maven repository and follow the instruction.


# Building and running

### In dev mode

```shell script
mvn clean compile spring-boot:run -Pdevelopment
```

The Swagger UI page (http://localhost:8280/kogito/swagger-ui/index.html) shows all the generated endpoints, providing a way to quickly verify them.

### Package and Run

```sh
mvn clean package
java -jar -Dspring.profiles.active=dev target\my-bamoe-business-service.jar
```

### Endpoint call (Use Postman or Bruno or curl)

```
POST http://localhost:8280/kogito/HelloWorld
{}
```

```
curl --location 'http://localhost:8280/kogito/HelloWorld' --header 'Content-Type: application/json' --data '{}'
```

### Enabling security

To enable security for this application follow these steps, in the `application.properties`:

- Set `kogito.auth.enabled` to `true`;
- Remove the `spring.autoconfigure.exclude` property (this will enable the `BamoeSpringBootWebSecurityConfig` class to be automatically loaded);
- Set `spring.security.oauth2.resourceserver.jwt.issuer-uri` to your Identity Provider URL.

> For more information about BAMOE, please refer to [the official BAMOE Documentation](https://www.ibm.com/docs/en/ibamoe).

> Check out https://github.com/bamoe/bamoe-setup and https://github.com/bamoe/bamoe-maven/tree/main/accelerators
> and https://quay.io/organization/bamoe. You need bamoe maven-repository
