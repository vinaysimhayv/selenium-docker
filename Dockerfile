FROM selenium/standalone-chrome:latest
RUN sudo apt install git-all -y
RUN git clone https://github.com/vinaysimhayv/selenium-docker.git
CMD mvn -f pom.xml test 
