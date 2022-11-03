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

WebUI.verifyElementText(findTestObject('Ingrdient Lens/Advance Filter Search/Page_AI Palette/h4_Product Category'), 'Product Category')

WebUI.executeJavaScript('window.scrollTo(document.body.scrollHeight, 0)', null)

WebUI.click(findTestObject('Ingrdient Lens/Advance Filter Search/Page_AI Palette/span_Abalone'))

WebUI.click(findTestObject('Ingrdient Lens/Advance Filter Search/Page_AI Palette/span_Acai'))

/*WebUI.click(findTestObject('Ingrdient Lens/Advance Filter Search/Page_AI Palette/span_Select all'))*/

WebUI.click(findTestObject('Ingrdient Lens/Advance Filter Search/Page_AI Palette/button_Apply'))

WebUI.waitForPageLoad(10)

/*WebUI.executeJavaScript('window.scrollTo(document.body.scrollHeight, 0)', null)*/
WebUI.executeJavaScript('window.scrollTo(0, 200)', null)

/*WebUI.scrollToElement(findTestObject('Ingrdient Lens/Advance Filter Search/Page_AI Palette/button_Download chart'), 2)

WebUI.scrollToElement(findTestObject('Ingrdient Lens/Advance Filter Search/Page_AI Palette/button_Reset All Filters'), 5)*/
/*WebUI.verifyElementText(findTestObject('Ingrdient Lens/Advance Filter Search/Page_AI Palette/span_Filters'), 'Filters')
*/
WebUI.click(findTestObject('Ingrdient Lens/Advance Filter Search/Page_AI Palette/button_Download chart'))

WebUI.executeJavaScript('window.scrollTo(document.body.scrollHeight, 0)', null)

WebUI.click(findTestObject('Ingrdient Lens/Advance Filter Search/Page_AI Palette/button_Reset All Filters'))

WebUI.waitForPageLoad(10)

