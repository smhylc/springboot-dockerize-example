#Install JDK
FROM adoptopenjdk:11-jre-hotspot

#We show the location of the project
ADD build/libs/*.jar dockerizeapp.jar

#We set the port where the program will run
EXPOSE 8080

#specify the command that the project will run on
ENTRYPOINT ["java","-jar","/dockerizeapp.jar"]