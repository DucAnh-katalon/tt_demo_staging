import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.clickDynamicObjectsMultipleTimes
import truetest.Tracking_Environment.common.clickMultipleDynamicObjects
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link staging -> Navigate to page '/env/staging'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_staging'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 2-Click on link staging - Navigate to page envstaging.png')

"Step 3: Click on link staging"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging/link_staging'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 3-Click on link staging.png')

"Step 4: Click on nav staging"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging/nav_staging'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 4-Click on nav staging.png')

"Step 5: Click on link staging"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging/link_staging'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 5-Click on link staging.png')

"Step 6: Click on b trueTestInternal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging/b_trueTestInternal'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 6-Click on b trueTestInternal.png')

"Step 7: Click on link jobId -> Navigate to page '/env/staging/aut/*/history/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging/link_jobId'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 7-Click on link jobId - Navigate to page envstagingauthistory.png')

"Step 8: Click on div collapsedParams2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/div_collapsedParams2'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 8-Click on div collapsedParams2.png')

"Step 9: Click on dynamic objects multiple times"

clickDynamicObjectsMultipleTimes.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on pre object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 10-Click on pre object2.png')

"Step 11: Interact with several dynamic objects by clicking on them"

clickMultipleDynamicObjects.execute(data_path_1, Integer.valueOf(index_1))

"Step 12: Click on div environmentHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/div_environmentHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 12-Click on div environmentHeader.png')

"Step 13: Click on link history2 -> Navigate to page '/env/staging/aut/*/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/link_history2'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 13-Click on link history2 - Navigate to page envstagingauthistory.png')

"Step 14: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/td_object'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 14-Click on td object.png')

"Step 15: Click on link historyEntries (ca24978)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/link_historyEntries"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/link_historyEntries', ['link_historyEntries_href_variable': link_historyEntries_href_variable, 'link_historyEntries_internalText': link_historyEntries_internalText, 'link_historyEntries_trNthOfType': link_historyEntries_trNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 15-Click on link historyEntries ca24978.png')

"Step 16: Click on link historyEntries (ca24978) -> Navigate to page '/env/staging/aut/*/history/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/link_historyEntries"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/link_historyEntries', ['link_historyEntries_href_variable': link_historyEntries_href_variable_1, 'link_historyEntries_internalText': link_historyEntries_internalText_1, 'link_historyEntries_trNthOfType': link_historyEntries_trNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 16-Click on link historyEntries ca24978 - Navigate to page envstagingauthistory.png')

"Step 17: Click on div collapsedParams3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/div_collapsedParams3'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 17-Click on div collapsedParams3.png')

"Step 18: Click on pre object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 18-Click on pre object3.png')

"Step 19: Click on span dynamicObject (dateTime)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 19-Click on span dynamicObject dateTime.png')

"Step 20: Click on span dynamicObject (dateTime)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_1, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 20-Click on span dynamicObject dateTime.png')

"Step 21: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 21-Click on html object.png')

"Step 22: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 22-Click on html object.png')

"Step 23: Click on html object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 23-Click on html object - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Navigate and Interact with Dynamic Objects in Staging Environment_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}