import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

/*WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.CONTINUE_ON_FAILURE)*/
'To check the heading of the page'
WebUI.verifyElementText(findTestObject('Home Page/Page_AI Palette/h2_Explore Trends'), 'Explore Trends')

'To select the country from dropdown'
WebUI.setText(findTestObject('Home Page/Page_AI Palette/input_Country_country-select'), country)

'Sending down key '
WebUI.sendKeys(findTestObject('Home Page/Page_AI Palette/input_Country_country-select'), Keys.chord(Keys.DOWN))

'Sending enter key to select the country from dropdown'
WebUI.sendKeys(findTestObject('Home Page/Page_AI Palette/input_Country_country-select'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

'To select the category from dropdown'
WebUI.setText(findTestObject('Home Page/Page_AI Palette/input_Product Category_combo-box'), category)

WebUI.delay(2)

'Sending down key'
WebUI.sendKeys(findTestObject('Home Page/Page_AI Palette/input_Product Category_combo-box'), Keys.chord(Keys.DOWN))
WebUI.sendKeys(findTestObject('Home Page/Page_AI Palette/input_Product Category_combo-box'), Keys.chord(Keys.DOWN))

'Sending enter key to select the category from dropdown'
WebUI.sendKeys(findTestObject('Home Page/Page_AI Palette/input_Product Category_combo-box'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Home Page/Page_AI Palette/h3_Category Preview'), 'Category Preview')

WebUI.verifyElementText(findTestObject('Home Page/Page_AI Palette/h6_Trend Maturity Phase'), 'Trend Maturity Phase')

WebUI.click(findTestObject('Home Page/Page_AI Palette/button_Products'))

WebUI.click(findTestObject('Home Page/Page_AI Palette/button_Themes'))

WebUI.click(findTestObject('Home Page/Page_AI Palette/button_Ingredients'))

/*WebUI.verifyTextPresent('Emerging Trends in the Snacks', false)

WebUI.verifyTextPresent('Growing Trends in the Snacks', false)*/
WebUI.click(findTestObject('Home Page/Page_AI Palette/a_Explore Category'))

'To verify the Dashboard main page'
WebUI.verifyElementText(findTestObject('Home Page/Page_AI Palette/h4_Product Category'), 'Product Category')

