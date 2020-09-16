#Create React Image
FROM node:14.0 AS reactapp
#Creates a container layer
WORKDIR /app
# Copies package.json and package-lock.json to Docker environment
COPY package.json package-lock.json ./
RUN yarn install

# Copy the main application
COPY . ./

# Build the application
RUN yarn run build

#### Stage 2: Serve the React application from Nginx 
FROM nginx:1.17.0-alpine

#### Stage 2: Serve the React application from Nginx 
FROM nginx:1.17.0-alpine

# Copy the react build from Stage 1
COPY --from=build /app/build /var/www

# Copy our custom nginx config
COPY nginx.conf /etc/nginx/nginx.conf

# Expose port 3000 to the Docker host, so we can access it 
# from the outside.
EXPOSE 80

ENTRYPOINT ["nginx","-g","daemon off;"]