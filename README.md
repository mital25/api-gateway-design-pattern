# api-gateway-design-pattern
Implementation of Design pattern - API gateway with authentication, authorization and call to multiple microservices on basis of authorization  

-	Authentication
-	Authorization
-	API Gateway (Netflix ZUUL API gateway)
-	Eureka Naming server (service discovery)
-	Authorization server (oauth2 demo, generates JWT token after successful authentication, authorization)
-	3 microservices (2 need authorization, 1 service can be called without authorization and authentication (like home page services, etc.))
-	Services as ademp-area-service, claims-area-service, prints-area-service (doesn’t require authorization and authentication through API Gateway)

# URLs

# Eureka naming server:
http://localhost:8761/

# API Gateway: 
http://localhost:8085/**

# Authorization server(oauth2-demo): 
http://localhost:8085/oauth/token?username=user&password=user&grant_type=password
for authorization ---> clientid = "client", secretid = "secret"

# ademp-area-service: 
http://localhost:8085/ademp/message , http://localhost:8181/ademp/message 

# claims-area-service: 
http://localhost:8085/claims/message, http://localhost:8182/claims/message

# prints-area-service: 
http://localhost:8085/prints/message, http://localhost:8183/prints/message ---> without authoriztion 
