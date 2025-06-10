import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /browse/*"

TrueTestScripts.navigate("/browse/${browse_id}")

"Step 2: Click on link activeSprints -> Navigate to page '/jira/software/c/projects/KIP/boards/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_activeSprints'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 2-Click on link activeSprints - Navigate to page jirasoftwarecprojectsKIPboards.png')

"Step 3: Click on div readyForTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_readyForTest'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 3-Click on div readyForTest.png')

"Step 4: Click on div epic"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_epic'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 4-Click on div epic.png')

"Step 5: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 5-Click on button showMore.png')

"Step 6: Hover over button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_object'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 6-Hover over button object.png')

"Step 7: Click on button participant (laiPham)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_participant"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_participant', ['button_participant_id': button_participant_id, 'button_participant_internalHasText': button_participant_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 7-Click on button participant laiPham.png')

"Step 8: Click on div tt2025S5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_tt2025S5'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 8-Click on div tt2025S5.png')

"Step 9: Click on span errorMessages (missingSampleValue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_errorMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_errorMessages', ['span_errorMessages_cardKip': span_errorMessages_cardKip, 'span_errorMessages_divNthOfType': span_errorMessages_divNthOfType, 'span_errorMessages_divNthOfType_1': span_errorMessages_divNthOfType_1, 'span_errorMessages_divNthOfType_2': span_errorMessages_divNthOfType_2, 'span_errorMessages_divNthOfType_3': span_errorMessages_divNthOfType_3, 'span_errorMessages_liNthOfType': span_errorMessages_liNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 9-Click on span errorMessages missingSampleValue.png')

"Step 10: Click on button allActivity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_allActivity'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 10-Click on button allActivity.png')

"Step 11: Click on div issueModal2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_issueModal5'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 11-Click on div issueModal2.png')

"Step 12: Click on link activeSprints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_activeSprints'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 12-Click on link activeSprints.png')

"Step 13: Hover over link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_reports'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 13-Hover over link reports.png')

"Step 14: Hover over div workItems"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_workItems'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 14-Hover over div workItems.png')

"Step 15: Hover over button taskDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_taskDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 15-Hover over button taskDetails.png')

"Step 16: Hover over button selectItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_selectItem'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 16-Hover over button selectItem.png')

"Step 17: Click on button kipActions (kip49152)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_kipActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_kipActions', ['button_kipActions_class': button_kipActions_class, 'button_kipActions_divNthOfType': button_kipActions_divNthOfType, 'button_kipActions_nth': button_kipActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 17-Click on button kipActions kip49152.png')

"Step 18: Click on button changeStatus2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_changeStatus2'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 18-Click on button changeStatus2.png')

"Step 19: Click on span storyPoints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/span_storyPoints'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 19-Click on span storyPoints.png')

"Step 20: Click on td statusToDo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/td_statusToDo'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 20-Click on td statusToDo.png')

"Step 21: Click on span storyPoints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/span_storyPoints'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 21-Click on span storyPoints.png')

"Step 22: Click on span storyPoints"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/span_storyPoints'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 22-Click on span storyPoints.png')

"Step 23: Click on div unassignedItems (unassigned)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_unassignedItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_unassignedItems', ['div_unassignedItems_class': div_unassignedItems_class, 'div_unassignedItems_nth': div_unassignedItems_nth, 'div_unassignedItems_role': div_unassignedItems_role]))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 23-Click on div unassignedItems unassigned.png')

"Step 24: Click on div assigneeOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_assigneeOption'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 24-Click on div assigneeOption.png')

"Step 25: Click on div unassignedItems (unassigned2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_unassignedItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_unassignedItems', ['div_unassignedItems_class': div_unassignedItems_class_1, 'div_unassignedItems_nth': div_unassignedItems_nth_1, 'div_unassignedItems_role': div_unassignedItems_role_1]))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 25-Click on div unassignedItems unassigned2.png')

"Step 26: Click on div assigneeOption2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_assigneeOption2'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 26-Click on div assigneeOption2.png')

"Step 27: Click on span summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/span_summary'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 27-Click on span summary.png')

"Step 28: Enter input value in input summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/input_summary'), input_summary)

WebUI.takeScreenshot(reportLocation + '/TC42/Step 28-Enter input value in input summary.png')

"Step 29: Press key Enter on input summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/input_summary'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 29-Press key Enter on input summary.png')

"Step 30: Click on div issueDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_issueModal5'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 30-Click on div issueDetails.png')

"Step 31: Click on button trueTestScrumBoard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_trueTestScrumBoard'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 31-Click on button trueTestScrumBoard.png')

"Step 32: Hover over link backlog2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_backlog2'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 32-Hover over link backlog2.png')

"Step 33: Click on link customerPocs (customerPocs2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/link_customerPocs"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/link_customerPocs', ['link_customerPocs_href_variable': link_customerPocs_href_variable, 'link_customerPocs_id': link_customerPocs_id, 'link_customerPocs_reactSelect': link_customerPocs_reactSelect]))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 33-Click on link customerPocs customerPocs2.png')

"Step 34: Click on span trueTestPocDetails (projectName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails', ['span_trueTestPocDetails_cardKip': span_trueTestPocDetails_cardKip, 'span_trueTestPocDetails_divNthOfType': span_trueTestPocDetails_divNthOfType, 'span_trueTestPocDetails_divNthOfType_1': span_trueTestPocDetails_divNthOfType_1, 'span_trueTestPocDetails_liNthOfType': span_trueTestPocDetails_liNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 34-Click on span trueTestPocDetails projectName.png')

"Step 35: Click on span trueTestPocDetails (trueTestPoc)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails', ['span_trueTestPocDetails_cardKip': span_trueTestPocDetails_cardKip_1, 'span_trueTestPocDetails_divNthOfType': span_trueTestPocDetails_divNthOfType_1, 'span_trueTestPocDetails_divNthOfType_1': span_trueTestPocDetails_divNthOfType_1_1, 'span_trueTestPocDetails_liNthOfType': span_trueTestPocDetails_liNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 35-Click on span trueTestPocDetails trueTestPoc.png')

"Step 36: Click on div jiraIssueHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_jiraIssueHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC42/Step 36-Click on div jiraIssueHeader.png')

"Step 37: Click on button close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC42/Step 37-Click on button close - Navigate to page .png')

"Step 38: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC42-Manage Jira Software Tasks and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}