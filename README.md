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


订单支付系统需求:

1. 一个订单(Order)包含多个菜品(Item),可以获取订单总价,总价为所有菜品价格之和,单个菜品可以重复
2. 创建订单时,其中至少需要包含一个菜品
3. 提供支付订单功能,支付时需要调用第三方的支付网关,该网关的接口PaymentGateway.pay(order)已提供
4. 订单如果还没有支付,那么允许向其中增加更多的菜品,如果已经支付,则不再允许增加菜品(抛出异常)
5. 有时会有优惠活动,即对订单总价进行打折处理(订单原价满200元的折扣8折,100-200之间的9折,100元以下没有折扣)
