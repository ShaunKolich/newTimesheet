#Create React Image
FROM node:14.0 AS reactapp
#Creates a container layer
WORKDIR /app
# Copies package.json and package-lock.json to Docker environment
COPY . ./

Run yarn 
Run yarn build

# Finally runs the application
CMD [ "yarn", "start" ]

# ENTRYPOINT ["/.app"]