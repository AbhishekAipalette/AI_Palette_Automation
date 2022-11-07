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


WebUI.executeJavaScript('window.scrollTo(0, 50)', null)
WebUI.click(findTestObject('Ingrdient Lens/Ing Maturity Phase/Page_AI Palette/button_List'))

WebUI.click(findTestObject('Ingrdient Lens/Ing Maturity Phase/Page_AI Palette/button_Ingredients'))

WebUI.click(findTestObject('Ingrdient Lens/Ing Maturity Phase/Page_AI Palette/span_Growing'))

WebUI.click(findTestObject('Ingrdient Lens/Ing Maturity Phase/Page_AI Palette/Gro(img1)'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementText(findTestObject('Ingrdient Lens/Ing Maturity Phase/Page_AI Palette/h4_Ingredient Details'), 'Ingredient Details')

/*CustomKeywords.'trend_page.TrendKey.TrendK'()*/
WebUI.callTestCase(findTestCase('Ingredient Lens/Trend Page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Ingredient Lens/Trend CN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Ingredient Lens/Trend SCN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Ingredient Lens/Growing/Gro2'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Ingredient Lens/Trend Page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.executeJavaScript('window.scrollTo(2000, 40)', null)

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Consumer Insights'), 
    'Consumer Insights')

WebUI.click(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/div_English'))

WebUI.click(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/li_English'))

/*WebUI.click(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/button_Download'))
*/
WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h6_Driver'), 'Driver')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h6_Product Attribute'), 
    'Product Attribute')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h6_Occasion'), 
    'Occasion')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h6_Expressed Persona'), 
    'Expressed Persona')

WebUI.click(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/Consumer Insights CN'))

WebUI.switchToWindowIndex(4)

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h4_Consumer Insight'), 
    'Consumer Insight')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Trend Growth'), 
    'Trend Growth')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Volume'), 'Volume')

WebUI.executeJavaScript('window.scrollTo(5000, 80)', null)

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Driver'), 'Driver')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Verbatims'), 
    'Verbatims')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Topics'), 'Topics')

WebUI.executeJavaScript('window.scrollTo(document.body.scrollHeight, 0)', null)

WebUI.click(findTestObject('Trend Page/Trend Page Consumer Insights/Trend SCN/Page_AI Palette/Consumer Insights SCN'))

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend SCN/Page_AI Palette/h4_Consumer Insight'), 
    'Consumer Insight')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend SCN/Page_AI Palette/h3_Trend Growth'), 
    'Trend Growth')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend SCN/Page_AI Palette/h3_Volume'), 'Volume')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend SCN/Page_AI Palette/h3_Topics'), 'Topics')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend SCN/Page_AI Palette/h3_Driver'), 'Driver')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend SCN/Page_AI Palette/h3_Verbatims'), 
    'Verbatims')

WebUI.back()

WebUI.switchToWindowIndex(0)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Ingredient Lens/Growing/Gro3'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('Ingredient Lens/Trend Page'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.executeJavaScript('window.scrollTo(2000, 40)', null)

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Consumer Insights'), 
    'Consumer Insights')

WebUI.click(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/div_English'))

WebUI.click(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/li_English'))

/*WebUI.click(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/button_Download'))
*/
WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h6_Driver'), 'Driver')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h6_Product Attribute'), 
    'Product Attribute')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h6_Occasion'), 
    'Occasion')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h6_Expressed Persona'), 
    'Expressed Persona')

WebUI.click(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/Consumer Insights CN'))

WebUI.switchToWindowIndex(6)

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h4_Consumer Insight'), 
    'Consumer Insight')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Trend Growth'), 
    'Trend Growth')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Volume'), 'Volume')

WebUI.executeJavaScript('window.scrollTo(5000, 80)', null)

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Driver'), 'Driver')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Verbatims'), 
    'Verbatims')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Topics'), 'Topics')

WebUI.executeJavaScript('window.scrollTo(document.body.scrollHeight, 0)', null)

WebUI.click(findTestObject('Trend Page/Trend Page Consumer Insights/Trend SCN/Page_AI Palette/Consumer Insights SCN'))

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend SCN/Page_AI Palette/h4_Consumer Insight'), 
    'Consumer Insight')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend SCN/Page_AI Palette/h3_Trend Growth'), 
    'Trend Growth')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend SCN/Page_AI Palette/h3_Volume'), 'Volume')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend SCN/Page_AI Palette/h3_Topics'), 'Topics')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend SCN/Page_AI Palette/h3_Driver'), 'Driver')

WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend SCN/Page_AI Palette/h3_Verbatims'), 
    'Verbatims')

WebUI.back()

WebUI.switchToWindowIndex(0)

