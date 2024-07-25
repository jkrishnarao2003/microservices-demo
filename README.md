# microservices-demo

- Release Command
  -  ./mvnw  release:clean release:prepare release:perform  -e -Darguments=-DskipTests

- Service Registry
  - Run Java file com.example.service.registry.ServiceRegistryApplication
  - http://localhost:8761

- API Gateway
  - Run Java file com.example.api.gateway.ApiGatewayApplication
  - http://localhost:8550 (No need to open it)

- Department Service
  - Run Java file com.example.department.DepartmentServiceApplication
  - http://localhost:8551/info (Don't open but use Postman Collection)

- Employee Service
  - Run Java file com.example.employee.EmployeeServiceApplication
  - http://localhost:8552/employee (Don't open but use Postman Collection)

- Cloud Config Server
  - Modify application.yaml file and set "searchLocations" to correct "common-config" folder path as in your machine.
  - Run Java file com.example.config.server.ConfigServerApplication
  - http://localhost:8888/actuator/info

  - Zipkin Server
    - CD to microservices-demo\zipkin-server\ folder in command line and run 
    > java -jar zipkin-server-2.23.4-exec.jar
    - OR
    - Download Zipkin Server jar file @ https://zipkin.io/pages/quickstart and run it as 
    > java -jar zipkin.jar
    - Then access the Zipkin Server @ http://localhost:9411/zipkin/

- Hystrix Dashboard
  - Run Java file com.example.hystrix.dashboard.HystrixDashboardApplication
  - http://localhost:8999/hystrix (Enter http://localhost:8550/actuator/hystrix.stream in the text field )

    
- Postman Collection to access all APIs through Postman
  - Download Latest Postman Collection at https://www.postman.com/downloads/
  - Import this collection /microservices-demo/docs/microservices-demo.postman_collection.json
  - Use the APIS above mentioned