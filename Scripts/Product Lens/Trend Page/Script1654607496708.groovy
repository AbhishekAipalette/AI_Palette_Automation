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

WebUI.verifyElementText(findTestObject('Product Lens/Prod Maturity Phase/Page_AI Palette/h4_Product Details'), 'Product Details')

/*WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Share'))

WebUI.switchToWindowTitle('Share with your Teammates')

WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Cancel'))
WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Cancel'))*/
WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Bookmark'))

WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Copy  Link to Clipboard'))

/*WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Download'))*/
WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Add to Compare'))

WebUI.click(findTestObject('Trend Page/Header buttons/Page_AI Palette/button_Clear and Close'))

WebUI.verifyElementVisible(findTestObject('Trend Page/Header buttons/Page_AI Palette/span_Trend Ranking and Maturity'))

WebUI.verifyElementText(findTestObject('Trend Page/Header buttons/Page_AI Palette/h3_Sentiment'), 'Sentiment')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Graph/Page_AI Palette/h3_Trend Growth'), 'Trend Growth')

WebUI.verifyElementPresent(findTestObject('Trend Page/Trend Graph/Page_AI Palette/span_4 year CAGR'), 0)

WebUI.verifyElementPresent(findTestObject('Trend Page/Trend Graph/Page_AI Palette/span_Predicted Growth'), 0)

/*WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/button_Download'))*/
WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/div_Market Trend'))

WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/li_Web Search Data'))

WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/div_Market Trend'))

WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/li_Market Trend'))

WebUI.executeJavaScript('window.scrollTo(4000, 35)', null)

/*WebUI.verifyElementText(findTestObject('Trend Page/FS and Retail Products/Food Service/Page_AI Palette/h3_Food Service Products'), 
    'Food Service Products')

WebUI.click(findTestObject('Trend Page/FS and Retail Products/Food Service/Page_AI Palette/div_English'))

WebUI.click(findTestObject('Trend Page/FS and Retail Products/Food Service/Page_AI Palette/li_English'))*/
/*CustomKeywords.'food_service.FoodService.FoodServiceProducts'()
CustomKeywords.'retail_products.RetailProduct.RetailProducts'()*/
if (WebUI.verifyTextPresent('Food Service Products', true)) {
    WebUI.click(findTestObject('Trend Page/FS and Retail Products/Food Service/Page_AI Palette/div_English'))

    WebUI.click(findTestObject('Trend Page/FS and Retail Products/Food Service/Page_AI Palette/li_English'))
} else {
    System.out.println('Food Service products are missing')
}

if (WebUI.verifyTextPresent('Related Retail Products', true)) {
    WebUI.click(findTestObject('Trend Page/FS and Retail Products/Retail Products/Page_AI Palette/div_English'))

    WebUI.click(findTestObject('Trend Page/FS and Retail Products/Retail Products/Page_AI Palette/li_English'))
} else {
    System.out.println('Retail products are missing')
}

/*WebUI.executeJavaScript('window.scrollTo(4500, 40)', null)

WebUI.verifyElementText(findTestObject('Trend Page/FS and Retail Products/Retail Products/Page_AI Palette/h3_Related Retail Products'), 
    'Related Retail Products')

WebUI.click(findTestObject('Trend Page/FS and Retail Products/Retail Products/Page_AI Palette/div_English'))

WebUI.click(findTestObject('Trend Page/FS and Retail Products/Retail Products/Page_AI Palette/li_English'))

/*WebUI.scrollToElement(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/Related Theme block'), 20)

WebUI.executeJavaScript('window.scrollTo(6000, 50)', null)*/
WebUI.verifyElementText(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/h3_Related Themes'), 'Related Themes')

WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/div_Rank'))

WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/li_Volume'))

WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/div_Volume'))

WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/li_Rank'))

WebUI.scrollToElement(findTestObject('Trend Page/Trend Page Consumer Quotes/Page_AI Palette/Consumer Quotes Block'), 20)

/*WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/button_Download'))
*/
WebUI.executeJavaScript('window.scrollTo(7000, 78)', null)

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Quotes/Page_AI Palette/h3_Verbatims'), 'Verbatims')

