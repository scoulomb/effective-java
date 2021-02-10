# README

[![Build Status](https://travis-ci.org/scoulomb/effective-java.svg?branch=main)](https://travis-ci.org/scoulomb/effective-java)

Sample example from Effective Java book.

## Project template and aggregation


We build a project template.

This template is based on https://github.com/scoulomb/sample-maven-app.
Where we did following modifications:

### mvn exec

We can execute with maven exec rather than generating a jar file:
See https://stackoverflow.com/questions/15869784/how-to-run-a-maven-created-jar-file-using-just-the-command-line.
As stated here: https://github.com/scoulomb/sample-maven-app#some-notes

Then we should do

````shell
mvn exec:java
````

Here we run a plugin goal directly we should do before

````shell
mvn clean install
````

or 

````shell
cd my-app
mvn clean install exec:java
````

### Use aggregation

We can aggregate several poms.
It is described here:
https://stackoverflow.com/questions/10665936/maven-how-to-build-multiple-independent-maven-projects-from-one-project

But `mvn exec:java` will not work with aggregation.

https://stackoverflow.com/questions/1469004/mvn-execjava-on-aggregate-pom

So we will use unit test

and run `mvn clean install`

### Docker

We modified docker file to run all sub-project

So that we can run full project with

````shell
docker compose up --build
````

<!-- created new git, del to rm in window,
could try pom parent -->

### We can also run from IDE

Configure project as maven in Pycharm.

## Using book reference

Note we can clone and use IDE directly, for instance:
<!-- if issue clean and restart -->
https://github.com/jbloch/effective-java-3e-source-code/blob/master/src/effectivejava/chapter6/item34/Operation.java

But I use this repo to add more tests,

It can also be runned when class are duplicated via maven or IDE.
See [example](ch7-lambdas-and-streams/src/main/java/com/mycompany/lambdasandstreams/App.java).


# TODO

- Copy pom to improve
- python amd c++ parallel on lambdas
- item 43 on lambda concluded but could read enum item to understand better  
- also mystery how when using lambda it knows it has to override applyAsDouble
- Try parent POM
- next chapters
