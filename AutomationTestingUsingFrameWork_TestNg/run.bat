set projectLocation=G:\WorkSpeace\seleniunm\suresh715\AutomationTestingUsingFrameWork_TestNG
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testSuite.xml