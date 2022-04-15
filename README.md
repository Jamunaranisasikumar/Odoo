# Odoo-Inventory and Manufacturing
Create New Inventory and Add the created Inventory into manufacturing item and Trying to change the status to "Done"
### Prerequisites
1.Install JAVA and set JAVA path

2.Install Maven

### Installing
1.Clone this project from master branch or download in zip and extract
### Built With
Selenium + TestNG + PageObjectModel
### Content of each File
1. Created property file under “src/test/resources” with name AppConfiguration.properties
Which contains application level configuration(Appurl,Browser name)

2.Test data are stored in Test Data folder with name AspireTC.xlsx(test data are Username,Password,ProductName)

3.Created ProjectSpecificMethod(Base Class ) under Package Base
Which contains @BeforeMethod,@AfterMethod,@DataProvider

4.Classes for each page having separate Classes which under src/test/java/pages

5.@Test method created under src/test/java/testcase/Odoo_TC001

![image](https://user-images.githubusercontent.com/100022413/163473512-f72d0a7f-e969-4aa3-8678-f5bbabb587e9.png)


### Running the tests
To run the test, execute `mvn test` from the command line

### TestReport
Once run is completed, to see the test result goto test-output/index.html report 

![image](https://user-images.githubusercontent.com/100022413/163516318-96a08ab5-f068-4374-a4b2-8812ec8730ec.png)


### Sample Report:

![image](https://user-images.githubusercontent.com/100022413/163473742-a6f98b23-2d6d-4d48-8b85-857e7cca459a.png)


