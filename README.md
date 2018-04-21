# sportdec-football
Command line application using Github API and Twitter API.

## Getting Started

To get the application you can download the project as a zip
or you can use the git bash and the follow command: 
```
git clone https://github.com/xDouglasx/sportdec-football
```

### Prerequisites

JDK 1.8
Maven 
Eclipse(Optional)
You will need a Consumer Key and Consumer Secret that you can get on the follow link:
(https://apps.twitter.com/)

### Installing

After downloading or cloning the project, on the main folder
open your cmd, i suggest you to use [Cmder](http://cmder.net/) if you are using windows
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
 

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc