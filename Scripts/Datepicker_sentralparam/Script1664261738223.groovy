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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.29.42/SentralParam/')

WebUI.setText(findTestObject('Object Repository/Sentral Parameter/input_Username_txtusername'), 'itproject')

WebUI.setText(findTestObject('Sentral Parameter/input_Password_txtpassword'), '123456')

WebUI.click(findTestObject('Object Repository/Sentral Parameter/input_Password_btnlogin'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Sentral Parameter/b_Biaya Admin'))

WebUI.click(findTestObject('Object Repository/Sentral Parameter/a_Insert Biaya Admin'))

WebUI.click(findTestObject('Object Repository/Sentral Parameter/a_Detail  Edit'))

WebUI.scrollToElement(findTestObject('Sentral Parameter/label_Start  End Berlaku'), 0)

WebUI.click(findTestObject('Sentral Parameter/input_Start  End Berlaku_startBerlaku'))

String date1 = start_date

String vdate = date1.split('-')[0]

String vmonth = date1.split('-')[1]

String vyear = date1.split('-')[2]

WebUI.selectOptionByLabel(findTestObject('Sentral Parameter/select_Month'), vmonth, false)

WebUI.selectOptionByLabel(findTestObject('Sentral Parameter/select_Year'), vyear, false)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> el = driver.findElements(By.xpath('//a[@class=\'ui-state-default\']'))

for (WebElement e : el) {
    System.print(e.getText() + '**')
	if (e.getText().equals(vdate)){
		e.click()
		break;
	}
}

