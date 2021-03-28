FROM suresh10/myimage:1
RUN sudo git clone https://github.com/vinaysimhayv/selenium-docker.git
RUN cd selenium-docker
RUN mvn -f pom.xml test 
