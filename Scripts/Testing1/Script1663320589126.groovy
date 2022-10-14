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

WebUI.callTestCase(findTestCase('Home Page/Home Page'), [('country') : 'Philippines', ('category') : 'Ready-to-Eat'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Ingredient Lens/Ing Maturity Phase'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'To scroll top of the page'
WebUI.executeJavaScript('window.scrollTo(document.body.scrollHeight, 0)', null)

Trend_Name = WebUI.getText(findTestObject('Trend Page/Header buttons/Page_AI Palette/Trend_name'))

println(Trend_Name)

WebUI.verifyElementText(findTestObject('Trend Page/Header buttons/Page_AI Palette/h4_Ingredient Details'), 'Ingredient Details')

/*WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Share'))

WebUI.switchToWindowTitle('Share with your Teammates')

WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Cancel'))

WebUI.switchToDefaultContent()*/
'To click on bookmark button'
WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Bookmark'))

'To click on copy link to clipboard'
WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Copy  Link to Clipboard'))

/*WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Download'))*/
'To click on add to compare'
WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Add to Compare'))

'To close the add to compare popup'
WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Clear and Close'))

WebUI.verifyElementVisible(findTestObject('Trend Page/Header buttons/Page_AI Palette/span_Trend Ranking and Maturity'))

WebUI.verifyElementText(findTestObject('Trend Page/Header buttons/Page_AI Palette/h3_Sentiment'), 'Sentiment')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Graph/Page_AI Palette/h3_Trend Growth'), 'Trend Growth')

'To chek CAGR is present or not'
WebUI.verifyElementPresent(findTestObject('Trend Page/Trend Graph/Page_AI Palette/span_4 year CAGR'), 0)

'To check prediction is present or not'
WebUI.verifyElementPresent(findTestObject('Trend Page/Trend Graph/Page_AI Palette/span_Predicted Growth'), 0)

/*WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/button_Download'))*/
'TO click on Market trend '
WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/div_Market Trend'))

'To click on Web Search Data '
WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/li_Web Search Data'))

WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/div_Market Trend'))

WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/li_Market Trend'))

CustomKeywords.'food_service.FoodService.FoodServiceProducts'()
CustomKeywords.'retail_products.RetailProduct.RetailProducts'()

WebUI.executeJavaScript('window.scrollTo(6000, 50)', null)

'To check if Related Trend is available or not.'
WebUI.verifyElementText(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/h3_Related Themes'), 'Related Themes')

WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/div_Rank'))

WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/li_Volume'))

WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/div_Volume'))

WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/li_Rank'))

WebUI.scrollToElement(findTestObject('Trend Page/Trend Page Consumer Quotes/Page_AI Palette/Consumer Quotes Block'), 20)

/*WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/button_Download'))
*/
WebUI.executeJavaScript('window.scrollTo(8000, 80)', null)

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Quotes/Page_AI Palette/h3_Verbatims'), 'Verbatims')
