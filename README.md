# akqa-test

To run the project - > mvn test

Please try to re-run the project if the build fails for the first time.

I have used Page Object Model Approach.

This project contains 3 classes

OpenBrowser.java 

This class is used to open the browser.
This class is coonsuming global Data.properties file using which we can run the test in any browser(apart from IE) by just changing the values in properties file.

Data.properties - Its a global data file giving us the  URL and browser name.

LandingPage.java

This class contains all the WebElement objects.


BunningsPage.java

In this class we are consuming the WebElement Objects and have the associated test cases.
