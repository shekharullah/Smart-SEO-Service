Smart-SEO-Service <span style="color: green"> build passed</span>
=================================

This App is using PlayAuthenticate Plugins


Plugins
=======

+ Play Framework (2.3.5)
+ PlayAuthenticate (0.6.5-SNAPSHOT)
+ Deadbolt (2.3.0-RC1)
+ Mongo Java Driver (2.12.2)
+ Morphia (0.108)

Sample
======
https://smartseoservice.herokuapp.com/

Usage
=====

+ Download the files or fork the repository

+ (Optional) Run **./activator idea** to make the project compatible with IntellijIdea

+ Open [conf/application.conf](https://github.com/ntenisOT/play-authenticate-mongo/blob/master/conf/application.conf) and fill ur mongodb URI:

        mongodb.uri=""

        For example:

        mongodb.uri="mongodb://username:password@url:port/database"

+ Fill the missing information required for the providers that you would like to support in [conf/play-authenticate/mine.conf](https://github.com/ntenisOT/play-authenticate-mongo/blob/master/conf/play-authenticate/mine.conf)

+ Uncomment the plugins that you would like to enable in [conf/play.plugins](https://github.com/ntenisOT/play-authenticate-mongo/blob/master/conf/play.plugins) (after filling the required information - previous step)

+ **Run the project!** (**./activator run**)

