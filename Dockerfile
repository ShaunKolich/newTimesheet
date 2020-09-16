#Create Spring Boot Image
FROM openjdk:8-jre-alpine AS springapp

WORKDIR /app

# Copy maven executable to the image
COPY mvnw .
COPY .mvn .mvn

# Copy the pom.xml file
COPY pom.xml .

# Build all the dependencies in preparation to go offline. 
# This is a separate step so the dependencies will be cached unless 
# EXPOSE Port 8090
# # Copy the project source
# COPY src src
# #Port Docker will be using
# EXPOSE 8090
# ADD application to container(just the executable JAR)
ADD target/newTimesheet-0.0.1-SNAPSHOT.jar app.jar
# ENTRYPOINT for the the application
ENTRYPOINT ["java","-jar","app.jar"]

