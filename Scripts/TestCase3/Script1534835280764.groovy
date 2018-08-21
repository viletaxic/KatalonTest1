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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.sap.com/saml2/idp/sso/accounts.sap.com')

WebUI.setText(findTestObject('Object Repository/TestCase3/Page_SAP Cloud Platform Iniciar ses/input_j_username'), 'marc.vilardell.caellas@everis.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TestCase3/Page_SAP Cloud Platform Iniciar ses/input_j_password'), 
    'sfxhQGHezBRPWNWIR+yeVA==')

WebUI.click(findTestObject('Object Repository/TestCase3/Page_SAP Cloud Platform Iniciar ses/button_Iniciar sesin'))

WebUI.setEncryptedText(findTestObject('Object Repository/TestCase3/Page_SAP Cloud Platform Iniciar ses/input_j_password'), 
    'sfxhQGHezBRPWNWIR+yeVA==')

WebUI.setText(findTestObject('Object Repository/TestCase3/Page_SAP Cloud Platform Iniciar ses/input_j_username'), 'marc.vilardell.caellas.st@everis.com')

WebUI.click(findTestObject('Object Repository/TestCase3/Page_SAP Cloud Platform Iniciar ses/button_Iniciar sesin'))

WebUI.closeBrowser()

