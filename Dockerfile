FROM suresh10/myimage:1
RUN sudo git clone https://github.com/vinaysimhayv/selenium-docker.git
CMD mvn -f pom.xml test 
