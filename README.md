# RHOInterviewTest

To test it execute the applications in the following order:
1. eureka-service-registry
2. movies
3. tvshows
4. zuul

- eureka-service-registry runs on port 8761
- movies runs on port 2222
- tvshows runs on port 3333
- zuul runs on port 8080

To test the specifications given on the assignment document do the following:

5. Localhost:{service1port}/ - list from service 1. -> localhost:2222
6. Localhost:{service2port}/ - list from service 2. -> localhost:3333
7. Localhost:8080/ – welcome message.               -> localhost:8080
8. Localhost:8080/service1 – list from service 1.   -> localhost:8080/movies
9. Localhost:8080/service2 – list from service 2.   -> localhost:8080/tvshows 
