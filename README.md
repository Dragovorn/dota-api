Dota 2 API
==========
The Dota 2 API is a project I've been working on for a little while 
the main aim of the project is to make a java port of the API for Dota 2 
that is as developer friendly as possible, and with developer friendliness 
comes extendability. The API is as modifiable as I could make it, if you 
have some changes/modifications that you want to make to the API feel free 
to fork it and make a pull request!

Usage
-----
You can get the API from my Maven Repo:
```XML
<repository>
    <id>dragovorn-repo</id>
    <url>http://repo.dragovorn.com/</url>
</repository>
```
Then you can make it a dependency:
```XML
<dependency>
    <groupId>com.dragovorn</groupId>
    <artifactId>dota-api</artifactId>
    <version>0.0.1</version>
</dependency>
```
Then you can make an object for the API by doing:
```Java
IDota dota = new Dota("YOUR_API_KEY");
```

Or you could download the [Latest Stable Release](http://build.dragovorn.com:8080/job/dota-api/lastStableBuild/ "Link To Latest Stable Release On Jenkins") from my Jenkins.

Dependencies
------------
- Guava
- org.json
- Apache HTTP

**ALL DEPENDENCIES ARE SHADED INTO THE JAR!**

License
-------
MIT

Help Me!
--------
You could help by forking and improving the codebase/adding features, or if you want
to help without much effort you could [Donate](https://twitch.streamlabs.com/dragovorn#/ "My Streamlabs Donation Link")
or if you are interested in watching me play (or work) on [Twitch](https://twitch.tv/dragovorn "My Twitch Link")!