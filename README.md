## Sample App for the Grails atmosphere-meteor Plugin

I use this application along with the [grails-plugin-test-script](https://github.com/kensiprell/grails-plugin-test-script) for testing the [grails-atmosphere-meteor](https://github.com/kensiprell/grails-atmosphere-meteor) plugin.

If you have a question, problem, suggestion, or want to report a bug, please submit an [issue](https://github.com/kensiprell/grails-atmosphere-meteor-sample/issues?state=open). I will reply as soon as I can.

```
git clone git://github.com/kensiprell/grails-atmosphere-meteor-sample.git

cd grails-atmosphere-meteor-sample

grails refresh-dependencies

grails run-app
```

You will have a simple application that performs the following tasks out of the box. Please note that this sample is not production ready. It merely incorporates some of the lessons I have learned and provides a point of departure for your own application.

* Chat (open two different browsers on your computer and start chatting)

* Sends a one-time, client-triggered notification to subscribers

* Automatically updates the web page at predefined intervals

You can review the files below to understand how it all works. 

* The files in grails-app/atmosphere/org/grails/plugins/atmosphere_meteor_sample/

* grails-app/conf/AtmosphereMeteorConfig.groovy

* grails-app/controllers/org/grails/plugins/atmosphere_meteor_sample/AtmosphereTestController.groovy

* grails-app/services/org/grails/plugins/atmosphere_meteor_sample/AtmosphereTestService.groovy

* grails-app/views/AtmosphereTest/index.gsp: This file contains all internal JavaScript.

The application also has eight geb functional tests. Use the command below to run the tests in Chrome although you'll have to set the path to the driver in test/functional/GebConfig.groovy:

```
git clone git://github.com/kensiprell/grails-atmosphere-meteor-sample.git

cd grails-atmosphere-meteor-sample

grails refresh-dependencies

grails -Dgeb.env=chrome test-app functional:
```
Use the command below to run the tests in Firefox. However, I could not get Selenium to send an ENTER key in Firefox, so the chat test could fail.

```
git clone git://github.com/kensiprell/grails-atmosphere-meteor-sample.git

cd grails-atmosphere-meteor-sample

grails refresh-dependencies

grails test-app functional:
```



