# sportdec-football
Command line application using Github API and Twitter API.

## Getting Started

To get the application you can download the project as a zip
or you can use the git bash and the follow command: 
```
git clone https://github.com/xDouglasx/sportdec-football
```

### Prerequisites

* JDK 1.8
* Maven 
* Eclipse(Optional)
* You will need a Consumer Key and Consumer Secret that you can get on the follow link:
(https://apps.twitter.com/)

### Installing

After downloading or cloning the project, on the main folder
open your cmd, i suggest you to use [Cmder](http://cmder.net/) or git bash
and run the command

```
mvn install
```

## Running the application

to run the application you need provide 3 informations
 * Consumer key
 * consumer Secret
 * Keyword

 if you dont provide a keyword, the application will search for projects related with "Football"
 If you provide a invalid consumer key or a invalid consumer secret the application wont retrieve no one tweet about the projects found on github

 to run right the follow command:
```
java -jar target/sportdec-football.jar <consumer key> <consumer secret> <keyword>
```

if you dont want to create a consumer key and a consumer secret i will let mine for you to use.
```
consumer key: AXE7tAccsKLWiHFxpyBHIegtd
consumer secret: 9MxkdUtf1ajiyEctj6aj7yijP91BHzkNiygX6JDje75AzB8vwB
```
 

### Tools and frameworks used: 

* [Feign](https://github.com/OpenFeign/feign) - Used to make http request easier on github API
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring Social Twitter](https://docs.spring.io/spring-social-twitter/docs/current/reference/htmlsingle/) - Used to connect to twitter API and retrieve tweets.
* [Log4j](https://logging.apache.org/log4j/2.x/) - Used to log errors and proccess.
* [Junit](https://junit.org/junit4/) - Used to make tests