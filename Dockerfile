FROM suresh10/myimage:1
RUN docker ps
RUN sudo git clone https://github.com/vinaysimhayv/selenium-docker.git
RUN mvn -f selenium-docker/pom.xml test 
