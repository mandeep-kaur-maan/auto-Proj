#Selenium Automation Project
##Overview
This is a sample project for automating tests using selenium with cucumber and java.

##Setup


##Running the tests from the cucumber files
TODO

##Running tests with mvn through command line
TODO

#Tags
* *@InProgress* - Used for tests that are being automated and not finished 

##Branching strategy
Branching strategy is Git flow. Code must not be committed directly to `master` or `develop` branch. Raise a Pull request instead and then merge to the intended branch.

#Preparing your machine
* Download git and install - https://gitforindows.org/
Add path to gin\bin in Path environment variable
* Download and install maven - https://maven.apache.org/download.cgi?Preferred=ftp://ftp.osuosl.org/pub/apache/
Check version on cmd - `mvn -version`
* Download and install Java - https://www.oracle.com/java/technologies/javase-jdk15-downloads.html
* Set up environment variable - JAVA_HOME with path to jdk
Check java version on cmd - `java -version` 


# Pushing the code to existing Github repository
1. In cmd, go to root of the project in IDE
2. Run the following commands in sequence:
* `git init`
* `git remote add origin https://github.com/your git username/name of your repository.git`
* `git push -u -f origin master`
