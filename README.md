# AspireApp - Odoo

Steps to Follow:
1.Download project from github 
URL:https://github.com/Jamunaranisasikumar/Odoo
2. Open Intellji/Eclipse import the Project
3. Created property file under “src/test/resources” with name AppConfiguration.properties
Which contains application level configuration(Appurl,Browser name)
4.Test data are stored in Test Data folder with name AspireTC.xlsx(test data are Username,Password,ProductName)
5.Created ProjectSpecificMethod(Base Class ) under Package Base
Which contains @BeforeMethod,@AfterMethod,@DataProvider
6.Classes for each page having separate Classes which under src/test/java/pages
7. Goto src folder and expand and go to and goto Odoo_TC001
 ![image](https://user-images.githubusercontent.com/100022413/163441143-ad412787-77ab-4842-ac4a-5f6e2db64df7.png)
8. Right click on the Odoo_TC001and click Runas/TestNG test
9. Once run is completed, to see the test result goto test-output/index.html report  
![image](https://user-images.githubusercontent.com/100022413/163441570-a1006880-ddc7-448e-8e59-2398658bcdbc.png)
Sample Report:
 ![image](https://user-images.githubusercontent.com/100022413/163441605-7d28d90e-3cd4-41b9-8467-125bd9c4bb92.png)



