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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.flipkart.com/')

WebUI.setText(findTestObject('Object Repository/Flipkart/Page_Online Shopping Site for Mobiles, Elec_b3f752/input_Get access to your Orders, Wishlist a_87b21b'), 
    '8755361202')

WebUI.click(findTestObject('Object Repository/Flipkart/Page_Online Shopping Site for Mobiles, Elec_b3f752/button_Request OTP'))

WebUI.click(findTestObject('Object Repository/Flipkart/Page_Online Shopping Site for Mobiles, Elec_b3f752/span_Resend code'))

WebUI.setText(findTestObject('Object Repository/Flipkart/Page_Online Shopping Site for Mobiles, Elec_b3f752/input_Get access to your Orders, Wishlist a_87b21b'), 
    '9')

WebUI.click(findTestObject('Object Repository/Flipkart/Page_Online Shopping Site for Mobiles, Elec_b3f752/img_Grocery__396cs4  _3exPp9'))

WebUI.click(findTestObject('Object Repository/Flipkart/Page_Mobile Phones Online at Best Prices in India/img__kJjFO0 _3DIhEh'))

WebUI.click(findTestObject('Object Repository/Flipkart/Page_Mobile Phones Online at Best Prices in India/button_RETRY'))

WebUI.click(findTestObject('Object Repository/Flipkart/Page_SAMSUNG Galaxy S21 FE 5G - Buy SAMSUNG_9c75cc/div_SAMSUNG Galaxy S21 FE 5G (Lavender, 128 GB)'))

WebUI.switchToWindowTitle('SAMSUNG Galaxy S21 FE 5G ( 128 GB Storage, 8 GB RAM ) Online at Best Price On Flipkart.com')

WebUI.click(findTestObject('Object Repository/Flipkart/Page_SAMSUNG Galaxy S21 FE 5G ( 128 GB Stor_98bf33/button_BUY NOW'))

WebUI.setText(findTestObject('Object Repository/Flipkart/Page_Flipkart.com Secure Payment Login  Sel_5edad1/input_Order confirmation email will be sent_02e29f'), 
    'abhir789@gmail.com')

WebUI.click(findTestObject('Object Repository/Flipkart/Page_Flipkart.com Secure Payment Login  Sel_5edad1/button_CONTINUE'))

WebUI.click(findTestObject('Object Repository/Flipkart/Page_Flipkart.com Secure Payment Login  Sel_5edad1/button_Accept  Continue'))

