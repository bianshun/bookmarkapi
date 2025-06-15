# Container Test
Container Test is setup with Spring Mock MVC and Docker database image.
The "totalElements" display only the total of current page, not whole records.

# Build up project using Dockerfile with fat-jar, multistage layers and SpringBoot maven buildpacks
Build up application image and run on docker
* >docker build -t bianshun/bookmarkapi .
* >spring-boot:build-image -Dspring-boot.build-image.imageName=bianshun/bookmarkapi
* >spring-boot:build-image (if set project name in maven compiler plugin)
* >docker run -p 9090:8080 bianshun/bookmarkapi
* > http://localhost:9090/api?page=2

# Build up project using Jib
* Add Jib plugin
* Run Docker
* >mvn jib:build 
  > mvn jib:dockerBuild (if local docker installed)
  > mvn jib:build -Dimage=bianshun/bookmarkapi-jib-customname
  > docker run -p 9090:8080 bianshun/bookmarkapi-jib-customname
