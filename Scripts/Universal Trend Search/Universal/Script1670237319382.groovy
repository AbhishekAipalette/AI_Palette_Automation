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

WebUI.click(findTestObject('Object Repository/Universal Trend Search/Page_AI Palette/button_Universal Trend Search'))

WebUI.takeScreenshot('Documents/universal.png')

WebUI.click(findTestObject('Object Repository/Universal Trend Search/Page_AI Palette/input__bucket-search'))

WebUI.sendKeys(findTestObject('Object Repository/Universal Trend Search/Page_AI Palette/input__bucket-search'), Keys.chord(
        Keys.DOWN))

WebUI.sendKeys(findTestObject('Universal Trend Search/Page_AI Palette/input__bucket-search'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot('Documents/universal_ingredient.png')

WebUI.click(findTestObject('Object Repository/Universal Trend Search/Page_AI Palette/input__bucket-search'))

WebUI.click(findTestObject('Universal Trend Search/Page_AI Palette/svg__MuiSvgIcon-root MuiSvgIcon-fontSizeSmall css-1k33q06'))

WebUI.setText(findTestObject('Object Repository/Universal Trend Search/Page_AI Palette/input__bucket-search'), 'party')

WebUI.sendKeys(findTestObject('Object Repository/Universal Trend Search/Page_AI Palette/input__bucket-search'), Keys.chord(
        Keys.DOWN))

WebUI.sendKeys(findTestObject('Universal Trend Search/Page_AI Palette/input__bucket-search'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot('Documents/universal_theme.png')

WebUI.closeBrowser()

