FROM suresh10/myimage:1
RUN docker run -it -p 80:80 suresh10/myimage:1 bash
RUN sudo git clone https://github.com/vinaysimhayv/selenium-docker.git
RUN mvn -f selenium-docker/pom.xml test 
