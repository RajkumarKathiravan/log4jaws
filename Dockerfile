FROM eclipse-temurin:24
COPY target/log4jdock.jar second-log4jdock.jar
CMD [ "java","-jar","second-log4jdock.jar" ]