FROM selenium/standalone-chrome:latest
WORKDIR /app
RUN git clone https://github.com/vinaysimhayv/selenium-docker.git









CMD mvn -f pom.xml test 
