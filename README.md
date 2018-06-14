-Project Description 
Title ：test
Language ：Java
Do What ：A Maven Web Project

-How to build?
First configure the maven and jdk environment, I use maven3.5.3, jdk1.8, use maven to create a web project, add the API, plug-in and bind jdk1.8 in the pom.xml configuration file. Create a HelloServlet in the java folder The class inherits HttpHttpServlet, when the request is sent, the page renders hello world, and then the junit test class is created in the test folder.

-How to use？
You can use eclipse to import the project from GitHub, URL: https://github.com/cjn1995/test.git. Right after the successful import project - Run as--Maven build - Goals: tomcat: run - Run, in the console you can see the successful start of tomcat, and enter http://localhost:8080/test in the browser /HelloServlet, will see hell word.

-add gitignore
Only submit src content by setting the ignore file。

-start tomcat and test through mvn clean install 