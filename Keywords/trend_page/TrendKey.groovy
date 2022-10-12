package trend_page

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class TrendKey {
	@Keyword
	public void TrendK() {
		WebUI.verifyElementText(findTestObject('Trend Page/Header buttons/Page_AI Palette/h4_Ingredient Details'), 'Ingredient Details')

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

		WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/li_Search Data'))

		WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/div_Market Trend'))

		WebUI.click(findTestObject('Trend Page/Trend Graph/Page_AI Palette/li_Market Trend'))

		WebUI.verifyElementText(findTestObject('Trend Page/FS and Retail Products/Food Service/Page_AI Palette/h3_Food Service Products'),
				'Food Service Products')

		WebUI.click(findTestObject('Trend Page/FS and Retail Products/Food Service/Page_AI Palette/div_English'))

		WebUI.click(findTestObject('Trend Page/FS and Retail Products/Food Service/Page_AI Palette/li_English'))

		WebUI.verifyElementText(findTestObject('Trend Page/FS and Retail Products/Food Service/Page_AI Palette/h4_Formats'), 'Formats')

		WebUI.verifyElementText(findTestObject('Trend Page/FS and Retail Products/Food Service/Page_AI Palette/h4_Sample Products'),
				'Sample Products')

		WebUI.click(findTestObject('Trend Page/FS and Retail Products/Food Service/Page_AI Palette/Formats FS'))

		WebUI.executeJavaScript('window.scrollTo(document.body.scrollHeight, 0)', null)

		WebUI.verifyElementText(findTestObject('Trend Page/FS and Retail Products/Food Service/Page_AI Palette/h4_Food Service Products Format'),
				'Food Service Products Format')

		WebUI.verifyElementText(findTestObject('Trend Page/FS and Retail Products/Food Service/Page_AI Palette/h3_Volume'), 'Volume')

		WebUI.verifyElementText(findTestObject('Trend Page/FS and Retail Products/Food Service/Page_AI Palette/h3_Topics'), 'Topics')

		WebUI.back()

		WebUI.verifyElementText(findTestObject('Trend Page/FS and Retail Products/Retail Products/Page_AI Palette/h3_Related Retail Products'),
				'Related Retail Products')

		WebUI.click(findTestObject('Trend Page/FS and Retail Products/Retail Products/Page_AI Palette/div_English'))

		WebUI.click(findTestObject('Trend Page/FS and Retail Products/Retail Products/Page_AI Palette/li_English'))

		WebUI.verifyElementText(findTestObject('Trend Page/FS and Retail Products/Retail Products/Page_AI Palette/h4_Formats'),
				'Formats')

		WebUI.verifyElementText(findTestObject('Trend Page/FS and Retail Products/Retail Products/Page_AI Palette/h6_Sample Products'),
				'Sample Products')

		WebUI.click(findTestObject('Trend Page/FS and Retail Products/Retail Products/Page_AI Palette/Format Retail Product'))

		WebUI.executeJavaScript('window.scrollTo(document.body.scrollHeight, 0)', null)

		WebUI.verifyElementText(findTestObject('Trend Page/FS and Retail Products/Retail Products/Page_AI Palette/h4_Related Retail Products Format'),
				'Related Retail Products Format')

		WebUI.verifyElementText(findTestObject('Trend Page/FS and Retail Products/Retail Products/Page_AI Palette/h3_Volume'), 'Volume')

		WebUI.verifyElementText(findTestObject('Trend Page/FS and Retail Products/Retail Products/Page_AI Palette/h3_Topics'), 'Topics')

		WebUI.back()

		/*WebUI.scrollToElement(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/Related Theme block'), 20)
		 */
		WebUI.executeJavaScript('window.scrollTo(6000, 50)', null)

		WebUI.verifyElementText(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/h3_Related Themes'), 'Related Themes')

		WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/div_Rank'))

		WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/li_Volume'))

		WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/div_Volume'))

		WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/li_Rank'))

		WebUI.scrollToElement(findTestObject('Trend Page/Trend Page Consumer Quotes/Page_AI Palette/Consumer Quotes Block'), 20)

		/*WebUI.click(findTestObject('Trend Page/Related Trends/Related Theme/Page_AI Palette/button_Download'))
		 */
		WebUI.executeJavaScript('window.scrollTo(8000, 80)', null)

		WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Quotes/Page_AI Palette/h3_Consumer quotes'), 'Consumer quotes')

		WebUI.click(findTestObject('Trend Page/Trend Page Consumer Quotes/Page_AI Palette/Consumer Quotes dropdown'))

		WebUI.click(findTestObject('Trend Page/Trend Page Consumer Quotes/Page_AI Palette/All Checkbox'))

		WebUI.click(findTestObject('Trend Page/Trend Page Consumer Quotes/Page_AI Palette/SwitcSocial Data Checkbox'))

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

		WebUI.switchToWindowIndex(2)

		WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h4_Consumer Insight'),
				'Consumer Insight')

		WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Trend Growth'),
				'Trend Growth')

		WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Volume'), 'Volume')

		WebUI.executeJavaScript('window.scrollTo(5000, 80)', null)

		WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Driver'), 'Driver')

		WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend CN/Page_AI Palette/h3_Consumer quotes'),
				'Consumer quotes')

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

		WebUI.verifyElementText(findTestObject('Trend Page/Trend Page Consumer Insights/Trend SCN/Page_AI Palette/h3_Consumer quotes'),
				'Consumer quotes')

		WebUI.back()

		WebUI.switchToWindowIndex(0)
	}
}
