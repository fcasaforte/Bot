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
import com.kms.katalon.core.testobject.RequestObject 
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent //for text in body 
import com.kms.katalon.core.testobject.impl.HttpFileBodyContent //for file in body
import com.kms.katalon.core.testobject.impl.HttpFormDataBodyContent //for form data body
import com.kms.katalon.core.testobject.impl.HttpUrlEncodedBodyContent //for URL encoded text bodysetBodyContent(new HttpTextBodyContent(your_text))

String endpoint = "https://hooks.slack.com/services/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"
String body = '{"text": "PASS"}'
RequestObject slackMessage = findTestObject("SlackWSO")
slackMessage.setRestRequestMethod("POST")
slackMessage.setRestUrl(endpoint)
slackMessage.setBodyContent(new HttpTextBodyContent(body, "application/json"))
WS.sendRequest(slackMessage)

