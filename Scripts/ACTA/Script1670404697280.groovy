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

WebUI.callTestCase(findTestCase('Login Page/Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/button_Common Trends Analysis'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/button_Advanced'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/button_Ingredients'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/input__mui-14'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/span_Dormant'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/span_Emerging'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/span_Growing'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/span_Matured'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/span_Declining'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/span_Fading'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/div_Follow us_MuiBackdrop-root MuiBackdrop-_73e6c6'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/input__mui-15'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/span_Australia'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/span_Canada'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/input__mui-17'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/li_Dairy'))

WebUI.click(findTestObject('Object Repository/ACTA/Page_AI Palette/button_Apply'))

