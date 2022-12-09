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

WebUI.click(findTestObject('Object Repository/WSO/Page_AI Palette/button_White Space Opportunity'))

WebUI.takeScreenshot('C:/Users/WSO_Ingredient.png')

WebUI.click(findTestObject('Object Repository/WSO/Page_AI Palette/button_Graph View'))

WebUI.setText(findTestObject('Object Repository/WSO/Page_AI Palette/input_Country_country-select'), GlobalVariable.country)

WebUI.sendKeys(findTestObject('Object Repository/WSO/Page_AI Palette/input_Country_country-select'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Object Repository/WSO/Page_AI Palette/input_Country_country-select'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/WSO/Page_AI Palette/input_Category_combo-box'), GlobalVariable.category)

WebUI.sendKeys(findTestObject('Object Repository/WSO/Page_AI Palette/input_Category_combo-box'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Object Repository/WSO/Page_AI Palette/input_Category_combo-box'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot('C:/Users/WSO_Ingredient_Graph.png')

WebUI.click(findTestObject('Object Repository/WSO/Page_AI Palette/button_Table View'))

WebUI.takeScreenshot('C:/Users/WSO_Ingredient_Table.png')

WebUI.click(findTestObject('Object Repository/WSO/Page_AI Palette/button_themes'))

WebUI.click(findTestObject('Object Repository/WSO/Page_AI Palette/button_Graph View'))

WebUI.setText(findTestObject('Object Repository/WSO/Page_AI Palette/input_Country_country-select'), GlobalVariable.country)

WebUI.sendKeys(findTestObject('Object Repository/WSO/Page_AI Palette/input_Country_country-select'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Object Repository/WSO/Page_AI Palette/input_Country_country-select'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/WSO/Page_AI Palette/input_Category_combo-box'), GlobalVariable.category)

WebUI.sendKeys(findTestObject('Object Repository/WSO/Page_AI Palette/input_Category_combo-box'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Object Repository/WSO/Page_AI Palette/input_Category_combo-box'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot('C:/Users/WSO_Theme_Graph.png')

WebUI.click(findTestObject('Object Repository/WSO/Page_AI Palette/button_Table View'))

WebUI.takeScreenshot('C:/Users/WSO_Theme_Table.png')

WebUI.closeBrowser()

