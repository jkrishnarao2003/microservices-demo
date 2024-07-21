# microservices-demo

- Release Command
  -  ./mvnw  release:clean release:prepare release:perform  -e -Darguments=-DskipTests

- Service Registry
  - Run Java file com.example.service.registry.ServiceRegistryApplication
  - http://localhost:8761

- API Gateway
  - Run Java file com.example.api.gateway.ApiGatewayApplication
  - http://localhost:8550

- Department Service
  - Run Java file com.example.department.DepartmentServiceApplication
  - http://localhost:8551/department

- Employee Service
  - Run Java file com.example.employee.EmployeeServiceApplication
  - http://localhost:8552/employee

- Hystrix Dashboard
  - Run Java file com.example.hystrix.dashboard.HystrixDashboardApplication
  - http://localhost:8999/hystrix (Enter http://localhost:8500/actuator/hystrix.stream in the text field )

- Cloud Config Server
  - Run Java file com.example.config.server.ConfigServerApplication
  - http://localhost:8888/actuator/info

  - Zipkin Server
    - Go to microservices-demo\zipkin-server\ folder and run 
    > java -jar zipkin-server-2.23.4-exec.jar
    - OR
    - Download Zipkin Server jar file @ https://zipkin.io/pages/quickstart and run it as 
    > java -jar zipkin.jar
    - Then access the Zipkin Server @ http://localhost:9411/zipkin/
- Postman Collection to access all APIs through Postman
  - Download Postman Collection at https://www.postman.com/downloads/
  - Import this collection /microservices-demo/docs/microservices-demo.postman_collection.json
  - Use the APIS above mentioned