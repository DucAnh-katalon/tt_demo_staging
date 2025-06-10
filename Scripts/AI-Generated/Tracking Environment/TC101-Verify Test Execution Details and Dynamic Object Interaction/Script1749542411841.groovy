import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.clickMultipleDynamicObjects
import truetest.Tracking_Environment.common.interactWithDynamicObjects
import truetest.Tracking_Environment.common.viewTestExecutionDetails
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /env/staging/aut/*/history/*"

TrueTestScripts.navigate("/env/staging/aut/${aut_id}/history/${history_id}")

"Step 2: Click on div collapsedParams2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/div_collapsedParams2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 2-Click on div collapsedParams2.png')

"Step 3: Interact with several dynamic objects by clicking on them"

clickMultipleDynamicObjects.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Access and view details of test execution multiple times."

viewTestExecutionDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 5: Click on pre testExecutionDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC101/Step 5-Click on pre testExecutionDetails.png')

"Step 6: Click on pre testExecutionDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC101/Step 6-Click on pre testExecutionDetails.png')

"Step 7: Interact with dynamic objects in the application"

interactWithDynamicObjects.execute(data_path_2, Integer.valueOf(index_2))

"Step 8: Click on pre testExecutionDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC101/Step 8-Click on pre testExecutionDetails.png')

"Step 9: Click on pre testExecutionDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC101/Step 9-Click on pre testExecutionDetails.png')

"Step 10: Click on pre testExecutionDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC101/Step 10-Click on pre testExecutionDetails.png')

"Step 11: Click on pre testExecutionDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC101/Step 11-Click on pre testExecutionDetails.png')

"Step 12: Click on span dynamicObject (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC101/Step 12-Click on span dynamicObject object8.png')

"Step 13: Click on span dynamicObject (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_1, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC101/Step 13-Click on span dynamicObject object8.png')

"Step 14: Click on pre testExecutionDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC101/Step 14-Click on pre testExecutionDetails.png')

"Step 15: Click on div collapsedFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/div_collapsedFlows2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 15-Click on div collapsedFlows2.png')

"Step 16: Click on span dynamicObject (false)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_2, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC101/Step 16-Click on span dynamicObject false.png')

"Step 17: Click on span dynamicObject (false)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_3, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType_3]))

// WebUI.takeScreenshot(reportLocation + '/TC101/Step 17-Click on span dynamicObject false.png')

"Step 18: Click on pre testExecutionDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC101/Step 18-Click on pre testExecutionDetails.png')

"Step 19: Click on pre testExecutionDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC101/Step 19-Click on pre testExecutionDetails.png')

"Step 20: Click on link history2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/link_history2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 20-Click on link history2.png')

"Step 21: Click on div collapsedFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/div_collapsedFlows'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 21-Click on div collapsedFlows.png')

"Step 22: Click on link history2 -> Navigate to page '/env/staging/aut/*/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/link_history2'))

WebUI.takeScreenshot(reportLocation + '/TC101/Step 22-Click on link history2 - Navigate to page envstagingauthistory.png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC101-Verify Test Execution Details and Dynamic Object Interaction_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}