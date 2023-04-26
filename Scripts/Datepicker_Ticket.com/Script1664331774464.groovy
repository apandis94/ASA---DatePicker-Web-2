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

WebUI.navigateToUrl('https://www.tiket.com/')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Tiket.com/img'))

WebUI.scrollToElement(findTestObject('Tiket.com/h4_Pilihan Kami Untukmu'), 0)

WebUI.click(findTestObject('Tiket.com/checkin_date'))

String sysym = WebUI.getText(findTestObject('Tiket.com/month_year'))

String sysMonth = sysym.split(' ')[0]

String sysYear = sysym.split(' ')[1]

println(((sysMonth + '****') + sysYear) + '****')

String date1 = start_date

String vdate = date1.split('-')[0]

String vmonth = date1.split('-')[1]

String vyear = date1.split('-')[2]

while (!(sysMonth.equals(vmonth)) || !(sysYear.equals(vyear))) {
    WebUI.click(findTestObject('Object Repository/Tiket.com/next_button'))

    sysym = WebUI.getText(findTestObject('Tiket.com/month_year'))

    sysMonth = (sysym.split(' ')[0])

    sysYear = (sysym.split(' ')[1])
}

System.print(((((((sysMonth + '****') + sysYear) + '****') + vmonth) + '****') + vyear) + '****')

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> el = driver.findElements(By.xpath('//div[@class=\'day-mod-container\']'))

for (WebElement date : el) {
    System.print(date.getText() + '**')

    if (date.getText().equals(vdate)) {
        date.click()

        break
    }
}



