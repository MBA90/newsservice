# Newsserivces

This project was initiated to consume rest API service and display the output in web application page

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

## Prerequisites

* [Java 8+](http://openjdk.java.net/install/) - Programming language
* [Maven](https://maven.apache.org/) - Dependency Management *

### Installing

#### Installing Java
First you need to check what java version installed on your machine, in your terminal type :
```
java -version

if output contains 'jre' keyword then you need to install java jdk version, you can follow this site
for java installation [How to install java on mac](https://docs.oracle.com/javase/8/docs/technotes/guides/install/mac_jdk.html).

#### Installing Maven
After Java JDK version is being installed, we need to install Maven from Apache site, in your terminal type :

```
cd /usr/local
wget http://www-eu.apache.org/dist/maven/maven-3/3.5.4/binaries/apache-maven-3.5.4-bin.tar.gz
```

Now Extract your downloaded file :

```
sudo tar xzf apache-maven-3.5.4-bin.tar.gz
sudo ln -s apache-maven-3.5.4 maven
```
Once your extraction is finished successfully we'll set environment variables for maven :

```
sudo vi /etc/profile.d/maven.sh
```

after opening file using vim tool (vi), click on 'i' keyboard, this will activate vi in editing mode, 
navigate to the end of your file and type :

```
export M2_HOME=/usr/local/maven
export PATH=${M2_HOME}/bin:${PATH}
```
then click on 'esc' button and type ' :wq ', it is a command shortcut to write and quit.

reload your environment variables with this command :

```
source /etc/profile.d/maven.sh
```

check your installation by typing 'mvn -version', you should see output similar to the below  :

Apache Maven 3.5.4 (1edded0938998edf8bf061f1ceb3cfdeccf443fe; 2018-06-17T22:33:14+04:00)
Maven home: /usr/local/maven
Java version: 1.8.0_181, vendor: Oracle Corporation, runtime: /Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.13.6", arch: "x86_64", family: "mac"
Muhammads-MacBook-Pro:~ MBA$ 


## Project structure

Project is consist of main project (newsservice) build in MVC UI design pattern.

newsservice main project contains pom.xml which includes dependencies and properties.

#### main dependencies in projects are :
1- jersey-client : used to consume rest API service as client
2- gson			 : used to parse json to java object
3- jsf 			 : server side component based user interface framework. It is 	used to develop 						web applications.

#### properties

Sometimes when you may need to compile a certain project to a different version than what you are currently using. The javac can accept such command using -source and -target. The Compiler Plugin can also be configured to provide these options during compilation.

<maven.compiler.source>1.8</maven.compiler.source>
<maven.compiler.target>1.8</maven.compiler.target>

## Before running the application 
make sure to install apache tomcat server, in this solution is used apache tomcat server 9

## Running Application 
1- navigate to the root of application 'newsservice' and click run on server then select the server you have and click finish

2- the application will directly navigate to welcome page Mostpopular.xhtml where you can search for the most popular news using the defined search criteria section and period 
