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

"Step 1: Navigate to /env/staging/aut/*"

TrueTestScripts.navigate("/env/staging/aut/${aut_id}")

"Step 2: Click on span historyDetails -> Navigate to page '/env/staging/aut/*/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/span_historyDetails'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 2-Click on span historyDetails - Navigate to page envstagingauthistory.png')

"Step 3: Click on td object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/td_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 3-Click on td object2.png')

"Step 4: Click on td object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/td_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 4-Click on td object2.png')

"Step 5: Click on td object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/td_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 5-Click on td object2.png')

"Step 6: Click on td object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/td_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 6-Click on td object2.png')

"Step 7: Click on td object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/td_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 7-Click on td object2.png')

"Step 8: Click on link historyEntries (history3) -> Navigate to page '/env/staging/aut/*/history/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/link_historyEntries"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/link_historyEntries', ['link_historyEntries_href_variable': link_historyEntries_href_variable, 'link_historyEntries_internalText': link_historyEntries_internalText, 'link_historyEntries_trNthOfType': link_historyEntries_trNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 8-Click on link historyEntries history3 - Navigate to page envstagingauthistory.png')

"Step 9: Click on html object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC24/Step 9-Click on html object2.png')

"Step 10: Click on div collapsedFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/div_collapsedFlows'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 10-Click on div collapsedFlows.png')

"Step 11: Click on button viewFlow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/button_viewFlow'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 11-Click on button viewFlow.png')

"Step 12: Click on button downloadActions (downloadGraph)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/button_downloadActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/button_downloadActions', ['button_downloadActions_divNthOfType': button_downloadActions_divNthOfType, 'button_downloadActions_internalHasText': button_downloadActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 12-Click on button downloadActions downloadGraph.png')

"Step 13: Click on button downloadActions (downloadTrackingPath) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/button_downloadActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/button_downloadActions', ['button_downloadActions_divNthOfType': button_downloadActions_divNthOfType_1, 'button_downloadActions_internalHasText': button_downloadActions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 13-Click on button downloadActions downloadTrackingPath - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC24-View and Download History Details in Staging Environment_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}