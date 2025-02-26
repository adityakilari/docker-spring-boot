# docker-spring-boot
example of dockerized spring boot application

This is a simple project demonstrate on how to dockerize the spring application
1. create the dockerfile in root dir
2. Dockerfile contains following :
    a. open jdk as a parent image
    b. add the working dir inside the container (optional), 
       this is like how we create diff packages inside our application for tracking
    c. copy the jar file to the working dir from target folder 
        (mvn clean install) -> running this command will create jar file. you can specify the jar name inside your container
    d. now provide a port where docker can listen to your application 
    e. last but not least provide the command to run the application

3. command to create image ->  docker build -t app-name-app . (-t assigns name to image, . defines whare the dockerfile is located)
4. command to create container -> docker run -d -p 2111:9222 --name spring-app my-spring-boot-app 
                                  2111 -> port where docker to run your application
                                  9222 -> port where the actual application is exposed to
   -d runs the container in detached mode.
   -p 8080:8080 maps the container's port 8080 to the host machine's 8080
   --name container-name gives the container a meaningful name.

5. docker ps -> to check if container is running
6. how to check what inside the working dir
   docker exec -it spring-container /bin/bash or docker exec -it spring-container /bin/sh
   cd /test/bin 
   ls -l -> list of files 
   exit -> come out of working dir
7. To check logs docker logs container-name
8. docker ps -a -> check the available containers.
9. docker stop test-container-name  # Stop the container
10. docker rm test-container-name   # Remove the container
11. docker rmi test-image-name  # Remove the image      


