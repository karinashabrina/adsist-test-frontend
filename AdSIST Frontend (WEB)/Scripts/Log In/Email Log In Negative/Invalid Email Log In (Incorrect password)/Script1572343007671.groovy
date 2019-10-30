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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://staging.adsist.ai')

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('Homepage/btn homepage login'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Login/btn meruadoresude login'))

WebUI.waitForPageLoad(2)

WebUI.sendKeys(findTestObject('Login/field login email'), 'karina.shabrina@yahoo.com')

WebUI.sendKeys(findTestObject('Login/field login password'), '12345678')

WebUI.click(findTestObject('Login/btn login'))

WebUI.waitForPageLoad(3)

WebUI.verifyElementVisible(findTestObject('Login/txt alert login failed'))

WebUI.closeBrowser()
