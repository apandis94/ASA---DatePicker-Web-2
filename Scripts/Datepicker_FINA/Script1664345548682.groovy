import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

Mobile.startExistingApplication('com.vq.mbrochuregp.client.android')

Mobile.tap(findTestObject('Object Repository/FINA/Daftar'), 0)

Mobile.tap(findTestObject('Object Repository/FINA/date picker'), 0)

Mobile.tap(findTestObject('Object Repository/FINA/date'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.sendKeys(findTestObject('FINA/date'), '01', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/FINA/month'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.sendKeys(findTestObject('FINA/month'), 'Jan', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/FINA/year'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.sendKeys(findTestObject('FINA/year'), '1992', FailureHandling.CONTINUE_ON_FAILURE)

