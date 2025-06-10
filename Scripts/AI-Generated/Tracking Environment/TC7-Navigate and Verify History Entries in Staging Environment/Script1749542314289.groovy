import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /env/staging/aut/*/history"

TrueTestScripts.navigate("/env/staging/aut/${aut_id}/history")

"Step 2: Click on link historyEntries (history) -> Navigate to page '/env/staging/aut/*/history/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/link_historyEntries"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/link_historyEntries', ['link_historyEntries_href_variable': link_historyEntries_href_variable, 'link_historyEntries_internalText': link_historyEntries_internalText, 'link_historyEntries_trNthOfType': link_historyEntries_trNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on link historyEntries history - Navigate to page envstagingauthistory.png')

"Step 3: Click on div collapsedFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/div_collapsedFlows'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on div collapsedFlows.png')

"Step 4: Click on div collapsedParams"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/div_collapsedParams'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on div collapsedParams.png')

"Step 5: Click on pre object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on pre object.png')

"Step 6: Click on pre object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on pre object.png')

"Step 7: Click on pre object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/pre_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on pre object.png')

"Step 8: Click on span dynamicObject (uuid) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Click on span dynamicObject uuid - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Navigate and Verify History Entries in Staging Environment_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}