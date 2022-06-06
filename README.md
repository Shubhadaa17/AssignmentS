# AssignmentS

# JabaTalks

1. The project is named 'Assignment'.
2. Under which we have src/main/java and src/test/java folders.
3. src/main/java consists of BaseClass and signUpPage class.
   1. In BaseClass, driver declaration is done thus helping globalisation of the driver.
   2. Then in signUpPage, we have locators for the signup page and respective variables.
4. src/test/java consists of BaseTest and signUpTest class.
   1. In BaseTest, we have code for browser launching and browser teardown.
   2. Also, object related to the page is also kept here.
   3. Then in signUpTest, here we wrote the test cases.


## Running the Project

1. The code can cloned and run
2. After you run the project, BaseTest will be accesed where the browser will be launched as per BrowserLaunch method.
3. SignUpTest will be accessed after that.
4. In SignUpTest, testNG is accessed when we use @Test and the method verifyUrlOfPage is run as it has priority 0.
5. Now, the url is accessed from SignUpPage class where it is assigned value using .getCurrentUrl method.
6. After this is done, in SignUpTest, object url is compared with the required url. Thus verifying if the entered url is correct ot not.
7. Then, we move on to next test as per priority i.e Lang method which takes us to langverifyMethod from SignUpPage.
8. That takes us to lanverifyMethod from SignUpPage. Here is use locator to click on the language field and verify if English and Dutch languages are available.
9. We then verify if the Get Started button is clickable or not using verifyCreateBtn from SignUpTest which takes us to verifyCreateActIsDisplayed method from SignUpPage.
10. Then we move on the the next method from SignUpTest i.e signupCreds where is give input for the fields by calling signupMethod from SignUpPage.
11. In this method we enter inputs in the field, click on the terms and conditions checkbox and click on Get Started button.
12. After this is done the tearDownBrowser from the BaseTest quits the browser.
