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

WebUI.click(findTestObject('Theme Lens/Theme Maturity Phase/Page_AI Palette/Page_AI Palette/button_List View'))

WebUI.click(findTestObject('Theme Lens/Theme Maturity Phase/Page_AI Palette/Page_AI Palette/button_Themes'))

WebUI.click(findTestObject('Ingrdient Lens/Ing Maturity Phase/Page_AI Palette/button_Download list'))

WebUI.click(findTestObject('Theme Lens/Theme Maturity Phase/Page_AI Palette/span_Emerging'))

WebUI.click(findTestObject('Theme Lens/Theme Maturity Phase/Page_AI Palette/Emg(img1)'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementText(findTestObject('Theme Lens/Theme Maturity Phase/Page_AI Palette/h4_Theme Details'), 'Theme Details')
