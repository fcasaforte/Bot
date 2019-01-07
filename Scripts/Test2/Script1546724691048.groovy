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

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.RestRequestObjectBuilder
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
 
String endpoint = "https://hooks.slack.com/services/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"
String requestMethod = "POST"
 

TestObjectProperty header2 = new TestObjectProperty("Content-Type", ConditionType.EQUALS, "application/json")
//TestObjectProperty header3 = new TestObjectProperty("Accept", ConditionType.EQUALS, "application/json")
ArrayList defaultHeaders = Arrays.asList(header2)
 
String body = '{"text":"TEST"}'
 
/**
* POST requests
* @return
*/

RequestObject ro = new RequestObject("objectId")
ro.setRestUrl(endpoint)
ro.setHttpHeaderProperties(defaultHeaders)
ro.setRestRequestMethod("POST")
ro.setBodyContent(new HttpTextBodyContent(body))
 
//ResponseObject respObj = WS.sendRequest(ro)
ResponseObject respObj = WS.sendRequest(ro)




