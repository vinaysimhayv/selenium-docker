FROM suresh10/myimage:1
RUN sudo git clone https://github.com/vinaysimhayv/selenium-docker.git
RUN pwd
RUN ls
RUN mvn -f selenium-docker/pom.xml test 
