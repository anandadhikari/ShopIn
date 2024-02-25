FROM node:14-alpine as build

WORKDIR /code

COPY package.json package.json
COPY package-lock.json package-lock.json

RUN npm install -g npm@6.14.15
RUN npm ci --production
COPY . .

# Install the Project Dependencies like Express Framework
RUN npm run build

FROM nginx:1.22-alpine as prod

COPY --from=build /code/build /usr/share/nginx/html

# Tell that this image is going to Open a Port 
EXPOSE 3000

# Default Command to launch the Application
CMD ["nginx", "-g", "daemon off;"]
