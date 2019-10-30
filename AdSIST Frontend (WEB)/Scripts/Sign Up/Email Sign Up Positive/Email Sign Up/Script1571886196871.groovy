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
import com.kms.katalon.core.testdata.InternalData as InternalData

InternalData data = findTestData('Email List')

for (def index : (0..data.getRowNumbers() - 1)) {
    WebUI.openBrowser('https://staging.adsist.ai')

    WebUI.waitForPageLoad(3)

    WebUI.verifyElementVisible(findTestObject('Homepage/btn big imasuguhajimeru'))

    WebUI.click(findTestObject('Homepage/btn imasuguhajimeru'))

    WebUI.verifyElementVisible(findTestObject('Sign Up/txt sign up'))

    WebUI.click(findTestObject('Sign Up/btn meruadoresutouroku'))

    WebUI.sendKeys(findTestObject('Sign Up/field input email'), data.internallyGetValue('NewUserEmail', index))

    WebUI.click(findTestObject('Sign Up/btn soushin'))

    WebUI.waitForPageLoad(0)

    WebUI.verifyElementVisible(findTestObject('Sign Up/txt email sent'))
}

