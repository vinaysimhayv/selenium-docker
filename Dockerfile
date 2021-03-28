FROM suresh10/myimage:1
RUN sudo git clone https://github.com/vinaysimhayv/selenium-docker.git
RUN pwd
RUN mvn -f pom.xml test 
