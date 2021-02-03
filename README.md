# api-gateway-design-pattern
Implementation of Design pattern - API gateway with authentication, authorization and call to multiple microservices on basis of authorization  

-	Authentication
-	Authorization
-	API Gateway (Netflix ZUUL API gateway)
-	Eureka Naming server (service discovery)
-	Authorization server (oauth2 demo, generates JWT token after successful authentication, authorization)
-	3 microservices (2 need authorization, 1 service can be called without authorization and authentication (like home page services, etc.))
-	Services as ademp-area-service, claims-area-service, prints-area-service (doesn’t require authorization and authentication through API Gateway)
