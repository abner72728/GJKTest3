import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Demo_Obj/Page_LoginLogout/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Demo_Obj/Page_LoginLogout/input_Username_username'), 'John Doe')

WebUI.setText(findTestObject('Demo_Obj/Page_LoginLogout/input_Password_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Object Repository/Demo_Obj/Page_LoginLogout/button_Login'))

WebUI.delay(3)

println("Login Success")

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Demo_Obj/Page_LoginLogout/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Demo_Obj/Page_LoginLogout/a_Logout'))

WebUI.closeBrowser()