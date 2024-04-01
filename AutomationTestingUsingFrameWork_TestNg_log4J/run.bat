set projectLocation=G:\WorkSpeace\seleniunm\suresh715\AutomationTestingUsingFrameWork_TestNg_log4j
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testSuite.xml