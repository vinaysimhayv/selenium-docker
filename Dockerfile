FROM suresh10/myimage:1
RUN sudo git clone https://github.com/vinaysimhayv/selenium-docker.git
RUN sudo touch a b c
CMD echo "Hello World" 
