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

WebUI.executeJavaScript('window.scrollTo(document.body.scrollHeight, 0)', null)

WebUI.verifyElementText(findTestObject('Theme Lens/Theme Maturity Phase/Page_AI Palette/h4_Theme Details'), 'Theme Details')

/*WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Share'))

WebUI.switchToWindowTitle('Share with your Teammates')

WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Cancel'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Cancel'))*/
WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Bookmark'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Bookmark'))

WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Copy  Link to Clipboard'))

/*WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Download'))*/
WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Add to Compare'))

WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Clear and Close'))

WebUI.verifyElementVisible(findTestObject('Trend Page/Trend Graph/Page_AI Palette/Tspan_Trend Ranking and Maturity'))

WebUI.verifyElementText(findTestObject('Trend Page/Trend Graph/Page_AI Palette/Th3_Sentiment'), 'Sentiment')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Graph/Page_AI Palette/Th4_Trend Growth'), 'Trend Growth')

WebUI.executeJavaScript('window.scrollTo(0, 150)', null)

WebUI.verifyElementPresent(findTestObject('Trend Page/Trend Graph/Page_AI Palette/span_4 year CAGR'), 0)

WebUI.verifyElementPresent(findTestObject('Trend Page/Trend Graph/Page_AI Palette/span_Predicted Growth'), 0)

/*WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/button_Download'))*/
WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/Page_AI Palette/div_Market Trend'))

WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/Page_AI Palette/li_Web Search Data'))

WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/Page_AI Palette/div_Web Search Data'))

WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/Page_AI Palette/li_Market Trend'))

WebUI.executeJavaScript('window.scrollTo(4000, 35)', null)

WebUI.verifyElementText(findTestObject('Trend Page/Related Trends/Related Product/Page_AI Palette/h3_Related Products'), 
    'Related Products')

WebUI.click(findTestObject('Trend Page/Related Trends/Related Product/Page_AI Palette/div_Rank'))

WebUI.click(findTestObject('Trend Page/Related Trends/Related Product/Page_AI Palette/li_Volume'))

WebUI.click(findTestObject('Trend Page/Related Trends/Related Product/Page_AI Palette/div_Volume'))

WebUI.click(findTestObject('Trend Page/Related Trends/Related Product/Page_AI Palette/li_Rank'))

WebUI.executeJavaScript('window.scrollTo(5000, 55)', null)

WebUI.verifyElementText(findTestObject('Trend Page/Related Trends/Related Ingredient/Page_AI Palette/h3_Related Ingredients'), 
    'Related Ingredients')

WebUI.click(findTestObject('Trend Page/Related Trends/Related Ingredient/Page_AI Palette/div_Rank'))

WebUI.click(findTestObject('Trend Page/Related Trends/Related Ingredient/Page_AI Palette/li_Volume'))

WebUI.click(findTestObject('Trend Page/Related Trends/Related Ingredient/Page_AI Palette/div_Volume'))

WebUI.click(findTestObject('Trend Page/Related Trends/Related Ingredient/Page_AI Palette/li_Rank'))

/*WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/button_Download'))
*/
WebUI.executeJavaScript('window.scrollTo(7000, 78)', null)

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Quotes/Page_AI Palette/h3_Verbatims'), 'Verbatims')

