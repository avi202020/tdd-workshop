# For maven users:

- generate IDEA project file: `./mvnw idea:idea`

- run local build with both unit tests and integration tests: `./mvnw clean install`

- run only unit test: `./mvnw clean test`

- run only integration tests(by default end with "IT.java"): `./mvnw clean integration-test -DskipUTs`

- run checkstyle: `./mvnw checkstyle:check`

- run findbugs: `./mvnw findbugs:findbugs`


#For gradle users:

- generate IDEA project file: `./gradlew cleanIdea idea`

- run unit test:
`./gradlew clean test`

- run local build with unit test, checkstyle and findbugs:
`./gradlew clean build`

- get unit test code coverage report:
1. run `./gradlew clean test`
2. run `./gradlew jacocoTestReport`


