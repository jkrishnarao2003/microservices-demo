# microservices-demo

- Release Command
  -  ./mvnw  release:clean release:prepare release:perform  -e -Darguments=-DskipTests

- Service Registry
  - http://localhost:8761

- API Gateway
  - http://localhost:8550

- Department Service
  - http://localhost:8551

- Employee Service
  - http://localhost:8552

- Hystrix Stream
  - http://localhost:8500/actuator/hystrix.stream

- Hystrix Dashboard
  - http://localhost:8999/hystrix (Enter http://localhost:8500/actuator/hystrix.stream in the text field )

