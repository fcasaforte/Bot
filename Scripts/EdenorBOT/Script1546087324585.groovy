import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.edenor.com.ar/cms/SP/CLI/home.html')

WebUI.waitForElementClickable(findTestObject('Object Repository/BOT/Page_Edenor Clientes/img'), 0)

WebUI.click(findTestObject('Object Repository/BOT/Page_Edenor Clientes/img'))

WebUI.waitForElementPresent(findTestObject('Object Repository/BOT/Page_Edenor Clientes/div_Hola soy el asistente virt'), 
    0)

WebUI.setText(findTestObject('Object Repository/BOT/Page_Edenor Clientes/input_Hola_wdrgy-wc-shellinput'), 'Hola')

WebUI.click(findTestObject('Object Repository/BOT/Page_Edenor Clientes/img_edenor_wdrgy-console-icon'))

WebUI.verifyElementPresent(findTestObject('Object Repository/BOT/Page_Edenor Clientes/p_Hola Espero que ests muy bie'), 
    0)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/BOT/Page_Edenor Clientes/input_Resolv tu consulta_wdrgy'), 'Informacion')

WebUI.click(findTestObject('Object Repository/BOT/Page_Edenor Clientes/img_Resolv tu consulta_wdrgy-c'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Object Repository/BOT/Page_Edenor Clientes/p_MIDE es la nueva forma de co'), 
    0)

WebUI.setText(findTestObject('Object Repository/BOT/Page_Edenor Clientes/input_Resolv tu consulta_wdrgy'), 'Gracias')

WebUI.click(findTestObject('Object Repository/BOT/Page_Edenor Clientes/img_Resolv tu consulta_wdrgy-c'))

WebUI.delay(5)

