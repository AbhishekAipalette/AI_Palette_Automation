import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.Url)

WebUI.maximizeWindow()

Page_Name = WebUI.getText(findTestObject('Login/Page_AI Palette/Page_AI Palette/h2_Sign in to AI Palette'))

println(Page_Name)

WebUI.verifyElementText(findTestObject('Login/Page_AI Palette/h2_Sign in to AI Palette'), 'Sign in to AI Palette')

WebUI.setText(findTestObject('Login/Page_AI Palette/input_Email Address or Username_email'), GlobalVariable.username)

WebUI.setText(findTestObject('Login/Page_AI Palette/input_Password_password'), GlobalVariable.password, FailureHandling.CONTINUE_ON_FAILURE)

/*WebUI.openBrowser(GlobalVariable.Url)

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Login/Page_AI Palette/h2_Sign in to AI Palette'), 'Sign in to AI Palette')

WebUI.setText(findTestObject('Login/Page_AI Palette/input_Email Address or Username_email'), GlobalVariable.username)

WebUI.setText(findTestObject('Login/Page_AI Palette/input_Password_password'), GlobalVariable.password, FailureHandling.CONTINUE_ON_FAILURE)
*/
WebUI.click(findTestObject('Login/Page_AI Palette/button_Sign in'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Login/Page_AI Palette/h2_Explore Trends'), 'Explore Trends')

