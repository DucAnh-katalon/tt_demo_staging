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

WebUI.takeScreenshot(reportLocation + '/TC58/Step 2-Click on link production - Navigate to page envproductionaut.png')

"Step 3: Click on button historyDetails -> Navigate to page '/env/production/aut/*/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut/button_historyDetails'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 3-Click on button historyDetails - Navigate to page envproductionauthistory.png')

"Step 4: Click on link historyEntries (history) -> Navigate to page '/env/production/aut/*/history/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/link_historyEntries"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/link_historyEntries', ['link_historyEntries_href_variable': link_historyEntries_href_variable, 'link_historyEntries_internalText': link_historyEntries_internalText, 'link_historyEntries_trNthOfType': link_historyEntries_trNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 4-Click on link historyEntries history - Navigate to page envproductionauthistory.png')

"Step 5: Click on div collapsedParams2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/div_collapsedParams2'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 5-Click on div collapsedParams2.png')

"Step 6: Click on link staging -> Navigate to page '/env/staging/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/link_staging'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 6-Click on link staging - Navigate to page envstagingaut.png')

"Step 7: Click on button historyDetails -> Navigate to page '/env/staging/aut/*/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/button_historyDetails'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 7-Click on button historyDetails - Navigate to page envstagingauthistory.png')

"Step 8: Click on td object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/td_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 8-Click on td object3.png')

"Step 9: Click on link historyEntries (history4) -> Navigate to page '/env/staging/aut/*/history/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/link_historyEntries"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/link_historyEntries', ['link_historyEntries_href_variable': link_historyEntries_href_variable_1, 'link_historyEntries_internalText': link_historyEntries_internalText_1, 'link_historyEntries_trNthOfType': link_historyEntries_trNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 9-Click on link historyEntries history4 - Navigate to page envstagingauthistory.png')

"Step 10: Click on div collapsedFlows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/div_collapsedFlows'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 10-Click on div collapsedFlows.png')

"Step 11: Click on div collapsedParams"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/div_collapsedParams'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 11-Click on div collapsedParams.png')

"Step 12: Click on button downloadActions (downloadListTokenizeFile)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/button_downloadActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/button_downloadActions', ['button_downloadActions_divNthOfType': button_downloadActions_divNthOfType, 'button_downloadActions_internalHasText': button_downloadActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 12-Click on button downloadActions downloadListTokenizeFile.png')

"Step 13: Click on span dynamicObject (dateTime)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 13-Click on span dynamicObject dateTime.png')

"Step 14: Click on span dynamicObject (dateTime)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_1, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 14-Click on span dynamicObject dateTime.png')

"Step 15: Click on span dynamicObject (dateTime)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_2, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 15-Click on span dynamicObject dateTime.png')

"Step 16: Click on span dynamicObject (dateTime)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_3, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType_3]))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 16-Click on span dynamicObject dateTime.png')

"Step 17: Click on link history2 -> Navigate to page '/env/staging/aut/*/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/link_history2'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 17-Click on link history2 - Navigate to page envstagingauthistory.png')

"Step 18: Click on p dateTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/p_dateTime'))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 18-Click on p dateTime.png')

"Step 19: Click on p dateTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/p_dateTime'))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 19-Click on p dateTime.png')

"Step 20: Click on p dateTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/p_dateTime'))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 20-Click on p dateTime.png')

"Step 21: Click on link staging -> Navigate to page '/env/production'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/link_staging'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 21-Click on link staging - Navigate to page envproduction.png')

"Step 22: Click on link jobId -> Navigate to page '/env/production/aut/*/history/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production/link_jobId'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 22-Click on link jobId - Navigate to page envproductionauthistory.png')

"Step 23: Click on div collapseHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/div_collapseHeader'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 23-Click on div collapseHeader.png')

"Step 24: Click on pre object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/pre_object'))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 24-Click on pre object.png')

"Step 25: Click on span dynamicObject (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_4, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType_4]))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 25-Click on span dynamicObject object7.png')

"Step 26: Click on div params"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/div_params'))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 26-Click on div params.png')

"Step 27: Click on button downloadFile (downloadListTokenizeFile)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_downloadFile"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_downloadFile', ['button_downloadFile_divNthOfType': button_downloadFile_divNthOfType, 'button_downloadFile_internalHasText': button_downloadFile_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 27-Click on button downloadFile downloadListTokenizeFile.png')

"Step 28: Click on button downloadFile (downloadListTokenizeFile)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_downloadFile"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/button_downloadFile', ['button_downloadFile_divNthOfType': button_downloadFile_divNthOfType_1, 'button_downloadFile_internalHasText': button_downloadFile_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 28-Click on button downloadFile downloadListTokenizeFile.png')

"Step 29: Click on div collapseHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/div_collapseHeader'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 29-Click on div collapseHeader.png')

"Step 30: Click on span dynamicObject (uuid)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_5, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType_5]))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 30-Click on span dynamicObject uuid.png')

"Step 31: Click on span dynamicObject (uuid)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_6, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType_6]))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 31-Click on span dynamicObject uuid.png')

"Step 32: Click on pre object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/pre_object'))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 32-Click on pre object2.png')

"Step 33: Click on div collapseHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/div_collapseHeader'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 33-Click on div collapseHeader.png')

"Step 34: Click on link history2 -> Navigate to page '/env/production/aut/*/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/link_history2'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 34-Click on link history2 - Navigate to page envproductionauthistory.png')

"Step 35: Click on link historyEntries (history3) -> Navigate to page '/env/production/aut/*/history/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/link_historyEntries"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/link_historyEntries', ['link_historyEntries_href_variable': link_historyEntries_href_variable_2, 'link_historyEntries_internalText': link_historyEntries_internalText_2, 'link_historyEntries_trNthOfType': link_historyEntries_trNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 35-Click on link historyEntries history3 - Navigate to page envproductionauthistory.png')

"Step 36: Click on div collapseHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/div_collapseHeader'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 36-Click on div collapseHeader.png')

"Step 37: Click on link history2 -> Navigate to page '/env/production/aut/*/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/link_history2'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 37-Click on link history2 - Navigate to page envproductionauthistory.png')

"Step 38: Click on link historyEntries (history4) -> Navigate to page '/env/production/aut/*/history/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/link_historyEntries"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/link_historyEntries', ['link_historyEntries_href_variable': link_historyEntries_href_variable_3, 'link_historyEntries_internalText': link_historyEntries_internalText_3, 'link_historyEntries_trNthOfType': link_historyEntries_trNthOfType_3]))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 38-Click on link historyEntries history4 - Navigate to page envproductionauthistory.png')

"Step 39: Click on html productionAutHistory"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/html_productionAutHistory'))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 39-Click on html productionAutHistory.png')

"Step 40: Click on div collapsedParams2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/div_collapsedParams2'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 40-Click on div collapsedParams2.png')

"Step 41: Click on pre object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/pre_object'))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 41-Click on pre object3.png')

"Step 42: Click on span dynamicObject (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_7, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType_7]))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 42-Click on span dynamicObject object8.png')

"Step 43: Click on span dynamicObject (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': span_dynamicObject_spanNthChild_8, 'span_dynamicObject_spanNthOfType': span_dynamicObject_spanNthOfType_8]))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 43-Click on span dynamicObject object8.png')

"Step 44: Click on div collapsedFlows2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/div_collapsedFlows2'))

WebUI.takeScreenshot(reportLocation + '/TC58/Step 44-Click on div collapsedFlows2.png')

"Step 45: Click on td finishedRule (newFinishedRule)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/td_finishedRule"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_production_aut_history/td_finishedRule', ['td_finishedRule_trNthChild': td_finishedRule_trNthChild, 'td_finishedRule_trNthOfType': td_finishedRule_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 45-Click on td finishedRule newFinishedRule.png')

"Step 46: Click on pre codeBlock -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production_aut_history/pre_object'))

// WebUI.takeScreenshot(reportLocation + '/TC58/Step 46-Click on pre codeBlock - Navigate to page .png')

"Step 47: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC58-Access Production Environment History and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}