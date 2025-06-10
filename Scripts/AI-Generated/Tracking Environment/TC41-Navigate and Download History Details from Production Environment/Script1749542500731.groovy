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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link production -> Navigate to page '/env/production/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_production'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 2-Click on link production - Navigate to page envproductionaut.png')

"Step 3: Click on div trafficCatalogItems"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut/div_trafficCatalogItems'))

// WebUI.takeScreenshot(reportLocation + '/TC41/Step 3-Click on div trafficCatalogItems.png')

"Step 4: Click on button historyDetails -> Navigate to page '/env/production/aut/*/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut/button_historyDetails'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 4-Click on button historyDetails - Navigate to page envproductionauthistory.png')

"Step 5: Click on link historyEntries (object) -> Navigate to page '/env/production/aut/*/history/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/link_historyEntries"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/link_historyEntries', ['link_historyEntries_href_variable': link_historyEntries_href_variable, 'link_historyEntries_internalText': link_historyEntries_internalText, 'link_historyEntries_trNthOfType': link_historyEntries_trNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 5-Click on link historyEntries object - Navigate to page envproductionauthistory.png')

"Step 6: Click on div collapsedFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/div_collapsedFlows'))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 6-Click on div collapsedFlows.png')

"Step 7: Click on button downloadFile (downloadTrackingPath)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_downloadFile"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_downloadFile', ['button_downloadFile_divNthOfType': button_downloadFile_divNthOfType, 'button_downloadFile_internalHasText': button_downloadFile_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 7-Click on button downloadFile downloadTrackingPath.png')

"Step 8: Click on span dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1', ['span_dynamicObject_trNthChild': span_dynamicObject_trNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 8-Click on span dynamicObject object.png')

"Step 9: Click on span dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1', ['span_dynamicObject_trNthChild': span_dynamicObject_trNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 9-Click on span dynamicObject object2.png')

"Step 10: Click on span dynamicObject (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1', ['span_dynamicObject_trNthChild': span_dynamicObject_trNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 10-Click on span dynamicObject object3.png')

"Step 11: Click on button viewFlow (viewFlow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_viewFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_viewFlow', ['button_viewFlow_trNthChild': button_viewFlow_trNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 11-Click on button viewFlow viewFlow.png')

"Step 12: Click on span dynamicObject (actionButton)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1', ['span_dynamicObject_trNthChild': span_dynamicObject_trNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 12-Click on span dynamicObject actionButton.png')

"Step 13: Click on td eyeArrow (eyeArrowDown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/td_eyeArrow"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/td_eyeArrow', ['td_eyeArrow_trNthChild': td_eyeArrow_trNthChild, 'td_eyeArrow_trNthOfType': td_eyeArrow_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC41/Step 13-Click on td eyeArrow eyeArrowDown.png')

"Step 14: Click on button viewFlow (viewFlow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_viewFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_viewFlow', ['button_viewFlow_trNthChild': button_viewFlow_trNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 14-Click on button viewFlow viewFlow2.png')

"Step 15: Click on td eyeArrow (eyeArrowDown)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/td_eyeArrow"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/td_eyeArrow', ['td_eyeArrow_trNthChild': td_eyeArrow_trNthChild_1, 'td_eyeArrow_trNthOfType': td_eyeArrow_trNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC41/Step 15-Click on td eyeArrow eyeArrowDown.png')

"Step 16: Click on span dynamicObject (actionButton2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1', ['span_dynamicObject_trNthChild': span_dynamicObject_trNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 16-Click on span dynamicObject actionButton2.png')

"Step 17: Click on span dynamicObject (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1', ['span_dynamicObject_trNthChild': span_dynamicObject_trNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 17-Click on span dynamicObject object4.png')

"Step 18: Click on span dynamicObject (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1', ['span_dynamicObject_trNthChild': span_dynamicObject_trNthChild_6]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 18-Click on span dynamicObject object5.png')

"Step 19: Click on button viewFlow (viewFlow3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_viewFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_viewFlow', ['button_viewFlow_trNthChild': button_viewFlow_trNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 19-Click on button viewFlow viewFlow3.png')

"Step 20: Click on button viewFlow (viewFlow4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_viewFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_viewFlow', ['button_viewFlow_trNthChild': button_viewFlow_trNthChild_3]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 20-Click on button viewFlow viewFlow4.png')

"Step 21: Click on span dynamicObject (action)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1', ['span_dynamicObject_trNthChild': span_dynamicObject_trNthChild_7]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 21-Click on span dynamicObject action.png')

"Step 22: Click on span dynamicObject (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject_1', ['span_dynamicObject_trNthChild': span_dynamicObject_trNthChild_8]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 22-Click on span dynamicObject object6.png')

"Step 23: Click on button viewFlow (viewFlow5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_viewFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_viewFlow', ['button_viewFlow_trNthChild': button_viewFlow_trNthChild_4]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 23-Click on button viewFlow viewFlow5.png')

"Step 24: Click on button viewFlow (viewFlow5) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_viewFlow"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_viewFlow', ['button_viewFlow_trNthChild': button_viewFlow_trNthChild_5]))

WebUI.takeScreenshot(reportLocation + '/TC41/Step 24-Click on button viewFlow viewFlow5 - Navigate to page .png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC41-Navigate and Download History Details from Production Environment_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}