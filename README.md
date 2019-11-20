# springbootSwaggerMultiplePathExample

## Steps to reproduce swagger behavior ##
./gradlew clean bootRun

open browser

localhost:8080/swagger-ui.html

hello-controller -> /hello -> "try it out"

There you can see, that you can set the <name> variable without actually using it in the /hello route

![swagger ui](https://raw.githubusercontent.com/stefan538871/springbootSwaggerMultiplePathExample/master/image/swaggerui.png)