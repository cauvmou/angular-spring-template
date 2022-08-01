# angular-spring-template
A quick way to get started with Angular and Spring using docker.

## How to use/configure
Frontend and backend have 2 separate images for development and production, you can change the mode of each one by suffixing the Dockerfile with `.prod` or `.dev`.

You can remove the default spring backend for your own, just keep in mind that in order to work inside a docker container, it needs to run on port `4137` and for production it needs to output a `dist.jar` file, see the default `pom.xml` file for the configuration. If you have troubles running the backend inside of a container, try setting the `server.address` property to `0.0.0.0`. 