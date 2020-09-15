#Create Spring Boot Image
#Creates a container layer 
FROM openjdk:8-jre-alpine

WORKDIR /backend
#Port Docker will be using
EXPOSE 8090
# ADD application to container(just the executable JAR)
ADD target/newTimesheet-0.0.1-SNAPSHOT.jar app.jar
# ENTRYPOINT for the the application
ENTRYPOINT ["java","-jar","app.jar"]

#Create React Image
FROM node:14.0
#Creates a container layer
WORKDIR /frontend
# Copies package.json and package-lock.json to Docker environment
COPY package.json yarn.lock ./

# Finally runs the application
CMD [ "yarn", "start" ]

# ENTRYPOINT ["/.app"]