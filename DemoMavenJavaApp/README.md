## Generating a Demo Maven Java Application

---
### `Step 1` - Download & Install Maven
    ⬇️ Download link: https://maven.apache.org/download.cgi
    💻 Installation instructions link: https://maven.apache.org/install.html
### `Step 2` - Create an empty directory 
    IN MY CASE: 
    📁 Name: DemoMavenJavaApp
    🗺️ Location: labs-java-enterprise
    ⬛ Command 1: - mkdir DemoMavenJavaApp
    ⬛ Command 2: - cd DemoMavenJavaApp

### `Step 3` - Using Maven to generate the Java project
``` shell 
mvn archetype:generate -DgroupId=com.giant.mvnapp -DartifactId=my-mvn-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```
    ⬛🗒️ Command NOTES:
    ➖ mvn ➡ command-line interface for Apache Maven
    ➖ archetype:generate ➡ tells Maven to generate a new project from an archetype, that are project templates or blueprints that define the structure of a new Maven project.
    ➖ -DgroupId=com.mycompany.app ➡ group ID for the new project. Typically based on the organization's domain name in reverse order. In this case, using my name.
    ➖ -DartifactId=my-mvn-app ➡ artifact ID for the new project. Is a unique identifier for the project within the group. It's often used as the name of the project's JAR file when it's built.
    ➖ -DarchetypeArtifactId=maven-archetype-quickstart ➡ a commonly used archetype that sets up a basic Maven project structure for a Java application.
    ➖ -DinteractiveMode=false ➡ disables interactive mode during project generation. Maven won't prompt us for input during the generation process.

### `Step 4` - Using Maven to built the Java project
``` shell 
mvn package
```
    ⬛🗒️ Command NOTES:
    ➖ package ➡ this is a Maven lifecycle phase. When we run it, Maven will execute all preceding phases in the default lifecycle up to the 'package' phase. 
    1️⃣ Validate: Validating the project is correct and all necessary information is available.
    2️⃣ Compile: Compiling the source code of the project.
    3️⃣ Test: Testing the compiled source code using a suitable testing framework.
    4️⃣ Package: Taking the compiled code and package it in a distributable format such as a JAR or WAR file.

### `Step 5` - Running the Maven Java application
``` shell 
java -cp target/my-mvn-app-1.0-SNAPSHOT.jar com.giant.mvnapp.App
```
    ⬛🗒️ Command NOTES:
    ➖ java ➡  command used to launch the Java Virtual Machine (JVM) and execute Java applications.
    ➖ -cp target/my-mvn-app-1.0-SNAPSHOT.jar ➡ this option specifies the classpath for the JVM. 
        The -cp option (short for -classpath) is followed by the path to the JAR file containing the compiled classes of the application.
    ➖ com.giant.mvnapp.App ➡ In Java, the entry point for executing an application is typically the class containing the main method. 
        In this case, the App class is located in the com.giant.mvnapp package.
>OUTPUT:
<img src="C:\Users\User\Desktop\University\Second Semester of Master\JAVA\labs-java-enterprise\DemoMavenJavaApp\MavenJavaAppOutput.png"/>