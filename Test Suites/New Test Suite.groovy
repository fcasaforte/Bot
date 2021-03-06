import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.SetupTestCase
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.TearDownTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext as TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext




/**
 * Some methods below are samples for using SetUp/TearDown in a test suite.
 */

/**
 * Setup test suite environment.
 */
@SetUp(skipped = true) // Please change skipped to be false to activate this method.
def setUp() {
	// Put your code here.
	
	//println testCaseContext.getTestCaseStatus()
}

/**
 * Clean test suites environment.
 */
@TearDown(skipped = true) // Please change skipped to be false to activate this method.
def tearDown() {
	// Put your code here.
}

/**
 * Run before each test case starts.
 */
@SetupTestCase(skipped = true) // Please change skipped to be false to activate this method.
def setupTestCase() {
	// Put your code here.
}

/**
 * Run after each test case ends.
 */
@TearDownTestCase(skipped = true) // Please change skipped to be false to activate this method.
def tearDownTestCase(TestCaseContext testCaseContext) {
	// Put your code here.
}	
/*	def reporterAfterTestCase(TestCaseContext testCaseContext) {
		WebUI.comment(’>>>>>>>>>>>>>>>> Start: reporterAfterTestCase() <<<<<<<<<<<<<<<<<’)
		def status = testCaseContext.getTestCaseStatus()GlobalVariable.testsTotal++
		if (status == ‘FAILED’) {
		GlobalVariable.testSuiteStatus = ‘FAILED’
		GlobalVariable.testsFailed++
		}
		if (status == ‘PASSED’){
		GlobalVariable.testsPassed++
		}
		if (status == ‘ERROR’){
		GlobalVariable.testSuiteStatus = ‘ERROR’
		GlobalVariable.testsError++
		}
		WebUI.comment(’>>>>>>>>>>>>>>>> End: reporterAfterTestCase() <<<<<<<<<<<<<<<<<’)
		}
		
		
	
	
	
	  
	//println testCaseContext.getTestCaseId()
	println testCaseContext.getTestCaseStatus()
		
//	public static void reportResult(String TestProject,String TestPlan,String Testcase,String Build,String Notes,String Result) throws TestLinkAPIException{
//	TestLinkAPIClient api=new TestLinkAPIClient(DEVKEY, URL);
//	api.reportTestCaseResult(TestProject, TestPlan, Testcase, Build, Notes, Result);
//	}
		
}
	


/**
 * References:
 * Groovy tutorial page: http://docs.groovy-lang.org/next/html/documentation/
 */