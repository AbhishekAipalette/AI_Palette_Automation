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

WebUI.click(findTestObject('Object Repository/Trend Pillar/Page_AI Palette/button_Trend Pillar'))

WebUI.click(findTestObject('Object Repository/Trend Pillar/Page_AI Palette/button_Create new Pillar'))

WebUI.setText(findTestObject('Object Repository/Trend Pillar/Page_AI Palette/input_Pillar Name_PillarName'), GlobalVariable.pillarProduct)

WebUI.setText(findTestObject('Object Repository/Trend Pillar/Page_AI Palette/input__mui-22'), GlobalVariable.country)

WebUI.sendKeys(findTestObject('Trend Pillar/Page_AI Palette/input__mui-22'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Trend Pillar/Page_AI Palette/input__mui-22'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Trend Pillar/Page_AI Palette/input__mui-24'), GlobalVariable.category)

WebUI.sendKeys(findTestObject('Trend Pillar/Page_AI Palette/input__mui-24'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Trend Pillar/Page_AI Palette/input__mui-24'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Trend Pillar/Page_AI Palette/ProductButton'))

WebUI.click(findTestObject('Object Repository/Trend Pillar/Page_AI Palette/button_Proceed'))

WebUI.click(findTestObject('Object Repository/Trend Pillar/Page_AI Palette/label_Acai'))

WebUI.click(findTestObject('Object Repository/Trend Pillar/Page_AI Palette/label_Acerola'))

WebUI.click(findTestObject('Object Repository/Trend Pillar/Page_AI Palette/span_Adzuki Bean'))

WebUI.click(findTestObject('Object Repository/Trend Pillar/Page_AI Palette/label_Agar Agar'))

WebUI.click(findTestObject('Object Repository/Trend Pillar/Page_AI Palette/button_Save Pillar'))

WebUI.click(findTestObject('Trend Pillar/Page_AI Palette/button_Products'))

WebUI.takeScreenshot('Documents/pillarProduct.png')

WebUI.delay(5)

/*WebUI.setText(findTestObject('Trend Pillar/Page_AI Palette/Page_AI Palette/input__mui-18'), GlobalVariable.pillar)*/
WebUI.click(findTestObject('Trend Pillar/Page_AI Palette/Page_AI Palette/td_Action_MuiTableCell-root MuiTableCell-body MuiTableCell-sizeMedium css-1d3rm87'))

WebUI.takeScreenshot('Documents/pillarProduct1.png')

WebUI.closeBrowser()

