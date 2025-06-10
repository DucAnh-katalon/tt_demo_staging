import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.clickMultipleDynamicObjects
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

"Step 2: Click on div collapsedFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/div_collapsedFlows'))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 2-Click on div collapsedFlows.png')

"Step 3: Click on button viewFlow (viewFlow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/button_viewFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/button_viewFlow', ['button_viewFlow_trNthChild': button_viewFlow_trNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 3-Click on button viewFlow viewFlow2.png')

"Step 4: Click on button downloadActions (downloadTrackingPath)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/button_downloadActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/button_downloadActions', ['button_downloadActions_divNthOfType': button_downloadActions_divNthOfType, 'button_downloadActions_internalHasText': button_downloadActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 4-Click on button downloadActions downloadTrackingPath.png')

"Step 5: Click on button viewFlow (viewFlow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/button_viewFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/button_viewFlow', ['button_viewFlow_trNthChild': button_viewFlow_trNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 5-Click on button viewFlow viewFlow2.png')

"Step 6: Click on span dynamicObject (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject_1', ['span_dynamicObject_trNthChild': span_dynamicObject_trNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 6-Click on span dynamicObject object3.png')

"Step 7: Click on div collapsedParams"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/div_collapsedParams'))

WebUI.takeScreenshot(reportLocation + '/TC57/Step 7-Click on div collapsedParams.png')

"Step 8: Click on pre testExecutionDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC57/Step 8-Click on pre testExecutionDetails.png')

"Step 9: Click on pre testExecutionDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC57/Step 9-Click on pre testExecutionDetails.png')

"Step 10: Interact with several dynamic objects by clicking on them"

clickMultipleDynamicObjects.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Click on span dynamicObject (namingTestCaseWithGptEnabled)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC57/Step 11-Click on span dynamicObject namingTestCaseWithGptEnabled.png')

"Step 12: Click on span dynamicObject (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_1, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC57/Step 12-Click on span dynamicObject object4.png')

"Step 13: Click on pre jsonResponse"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC57/Step 13-Click on pre jsonResponse.png')

"Step 14: Click on pre jsonResponse"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC57/Step 14-Click on pre jsonResponse.png')

"Step 15: Click on span dynamicObject (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_2, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC57/Step 15-Click on span dynamicObject object5.png')

"Step 16: Click on span dynamicObject (object5) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_3, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType_3]))

// WebUI.takeScreenshot(reportLocation + '/TC57/Step 16-Click on span dynamicObject object5 - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC57-View and Interact with Test Execution History_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}