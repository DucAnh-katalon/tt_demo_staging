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

"Step 1: Navigate to /browse/*"

TrueTestScripts.navigate("/browse/${browse_id}")

"Step 2: Click on link timeline -> Navigate to page '/jira/software/c/projects/KIP/boards/*/timeline'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_timeline'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 2-Click on link timeline - Navigate to page jirasoftwarecprojectsKIPboardstimeline.png')

"Step 3: Click on button trueTestKanbanBoard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/timeline?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_timeline/button_trueTestKanbanBoard'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 3-Click on button trueTestKanbanBoard.png')

"Step 4: Hover over link timeline"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/timeline?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_timeline/link_timeline'))

// WebUI.takeScreenshot(reportLocation + '/TC116/Step 4-Hover over link timeline.png')

"Step 5: Click on link trueTestScrumBoard -> Navigate to page '/jira/software/c/projects/KIP/boards/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/timeline?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_timeline/link_trueTestScrumBoard'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 5-Click on link trueTestScrumBoard - Navigate to page jirasoftwarecprojectsKIPboards.png')

"Step 6: Click on label assigneeAvatars (assigneeFilterAvatar3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars', ['label_assigneeAvatars_for': label_assigneeAvatars_for, 'label_assigneeAvatars_internalHasText': label_assigneeAvatars_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 6-Click on label assigneeAvatars assigneeFilterAvatar3.png')

"Step 7: Click on label assigneeAvatars (assigneeFilterAvatar4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars', ['label_assigneeAvatars_for': label_assigneeAvatars_for_1, 'label_assigneeAvatars_internalHasText': label_assigneeAvatars_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 7-Click on label assigneeAvatars assigneeFilterAvatar4.png')

"Step 8: Click on section taskList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/section_taskList'))

// WebUI.takeScreenshot(reportLocation + '/TC116/Step 8-Click on section taskList.png')

"Step 9: Click on div swimlaneContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_swimlaneContent'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 9-Click on div swimlaneContent.png')

"Step 10: Click on div swimlaneContents (swimlaneContent2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_swimlaneContents"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_swimlaneContents', ['div_swimlaneContents_class': div_swimlaneContents_class, 'div_swimlaneContents_divNthChild': div_swimlaneContents_divNthChild, 'div_swimlaneContents_divNthOfType': div_swimlaneContents_divNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 10-Click on div swimlaneContents swimlaneContent2.png')

"Step 11: Click on div swimlaneContents (updateUi)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_swimlaneContents"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_swimlaneContents', ['div_swimlaneContents_class': div_swimlaneContents_class_1, 'div_swimlaneContents_divNthChild': div_swimlaneContents_divNthChild_1, 'div_swimlaneContents_divNthOfType': div_swimlaneContents_divNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 11-Click on div swimlaneContents updateUi.png')

"Step 12: Click on div swimlaneContents (kip5057Phase2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_swimlaneContents"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_swimlaneContents', ['div_swimlaneContents_class': div_swimlaneContents_class_2, 'div_swimlaneContents_divNthChild': div_swimlaneContents_divNthChild_2, 'div_swimlaneContents_divNthOfType': div_swimlaneContents_divNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 12-Click on div swimlaneContents kip5057Phase2.png')

"Step 13: Click on div workItems2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_workItems2'))

// WebUI.takeScreenshot(reportLocation + '/TC116/Step 13-Click on div workItems2.png')

"Step 14: Click on div workItemsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_workItemsButton'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 14-Click on div workItemsButton.png')

"Step 15: Click on div swimlaneContents (swimlaneContent3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_swimlaneContents"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_swimlaneContents', ['div_swimlaneContents_class': div_swimlaneContents_class_3, 'div_swimlaneContents_divNthChild': div_swimlaneContents_divNthChild_3, 'div_swimlaneContents_divNthOfType': div_swimlaneContents_divNthOfType_3]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 15-Click on div swimlaneContents swimlaneContent3.png')

"Step 16: Click on div object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_object8'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 16-Click on div object8.png')

"Step 17: Click on div swimlaneContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_object8'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 17-Click on div swimlaneContent4.png')

"Step 18: Click on div swimlaneContents (object9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_swimlaneContents"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_swimlaneContents', ['div_swimlaneContents_class': div_swimlaneContents_class_4, 'div_swimlaneContents_divNthChild': div_swimlaneContents_divNthChild_4, 'div_swimlaneContents_divNthOfType': div_swimlaneContents_divNthOfType_4]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 18-Click on div swimlaneContents object9.png')

"Step 19: Click on button trueTestScrumBoard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_trueTestScrumBoard'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 19-Click on button trueTestScrumBoard.png')

"Step 20: Hover over button trueTestScrumBoard2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_trueTestScrumBoard2'))

// WebUI.takeScreenshot(reportLocation + '/TC116/Step 20-Hover over button trueTestScrumBoard2.png')

"Step 21: Click on link customerPocs (customerPocs2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/link_customerPocs"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/link_customerPocs', ['link_customerPocs_href_variable': link_customerPocs_href_variable, 'link_customerPocs_id': link_customerPocs_id, 'link_customerPocs_reactSelect': link_customerPocs_reactSelect]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 21-Click on link customerPocs customerPocs2.png')

"Step 22: Click on span trueTestPocDetails (projectName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails', ['span_trueTestPocDetails_cardKip': span_trueTestPocDetails_cardKip, 'span_trueTestPocDetails_divNthOfType': span_trueTestPocDetails_divNthOfType, 'span_trueTestPocDetails_divNthOfType_1': span_trueTestPocDetails_divNthOfType_1, 'span_trueTestPocDetails_liNthOfType': span_trueTestPocDetails_liNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC116/Step 22-Click on span trueTestPocDetails projectName.png')

"Step 23: Click on link sampleIssues (issueFieldSummary) -> Navigate to page '/browse/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/link_sampleIssues"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/link_sampleIssues', ['link_sampleIssues_divNthOfType': link_sampleIssues_divNthOfType, 'link_sampleIssues_divNthOfType_1': link_sampleIssues_divNthOfType_1, 'link_sampleIssues_internalHasText': link_sampleIssues_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 23-Click on link sampleIssues issueFieldSummary - Navigate to page browse.png')

"Step 24: Click on link axisBankGoogleSheets"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_axisBankGoogleSheets'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 24-Click on link axisBankGoogleSheets.png')

"Step 25: Click on button customerPocsBoard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_customerPocsBoard'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 25-Click on button customerPocsBoard.png')

"Step 26: Hover over link timeline2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_timeline2'))

// WebUI.takeScreenshot(reportLocation + '/TC116/Step 26-Hover over link timeline2.png')

"Step 27: Click on link trueTestScrumBoard -> Navigate to page '/jira/software/c/projects/KIP/boards/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_trueTestScrumBoard'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 27-Click on link trueTestScrumBoard - Navigate to page jirasoftwarecprojectsKIPboards.png')

"Step 28: Click on label assigneeAvatars (assigneeFilterAvatar4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars', ['label_assigneeAvatars_for': label_assigneeAvatars_for_2, 'label_assigneeAvatars_internalHasText': label_assigneeAvatars_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 28-Click on label assigneeAvatars assigneeFilterAvatar4.png')

"Step 29: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 29-Click on button showMore.png')

"Step 30: Click on div todoSection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_todoSection'))

// WebUI.takeScreenshot(reportLocation + '/TC116/Step 30-Click on div todoSection.png')

"Step 31: Click on div swimlaneContents (swimlaneContent5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_swimlaneContents"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/div_swimlaneContents', ['div_swimlaneContents_class': div_swimlaneContents_class_5, 'div_swimlaneContents_divNthChild': div_swimlaneContents_divNthChild_5, 'div_swimlaneContents_divNthOfType': div_swimlaneContents_divNthOfType_5]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 31-Click on div swimlaneContents swimlaneContent5.png')

"Step 32: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 32-Click on button showMore.png')

"Step 33: Click on button kipActions (kip5057)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_kipActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_kipActions', ['button_kipActions_class': button_kipActions_class, 'button_kipActions_divNthOfType': button_kipActions_divNthOfType, 'button_kipActions_nth': button_kipActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 33-Click on button kipActions kip5057.png')

"Step 34: Click on link addTrackingEnv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_addTrackingEnv'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 34-Click on link addTrackingEnv.png')

"Step 35: Click on link pullRequestOpen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_pullRequestOpen'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 35-Click on link pullRequestOpen.png')

"Step 36: Click on link createDbEntity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_createDbEntity'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 36-Click on link createDbEntity.png')

"Step 37: Click on div developmentDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_developmentDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC116/Step 37-Click on div developmentDetails.png')

"Step 38: Click on div issueModal5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_issueModal5'))

// WebUI.takeScreenshot(reportLocation + '/TC116/Step 38-Click on div issueModal5.png')

"Step 39: Click on input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 39-Click on input search.png')

"Step 40: Click on label assigneeAvatars (assigneeFilterAvatar4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars', ['label_assigneeAvatars_for': label_assigneeAvatars_for_3, 'label_assigneeAvatars_internalHasText': label_assigneeAvatars_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 40-Click on label assigneeAvatars assigneeFilterAvatar4.png')

"Step 41: Click on label assigneeAvatars (assigneeFilterAvatar4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars', ['label_assigneeAvatars_for': label_assigneeAvatars_for_4, 'label_assigneeAvatars_internalHasText': label_assigneeAvatars_internalHasText_4]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 41-Click on label assigneeAvatars assigneeFilterAvatar4.png')

"Step 42: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 42-Click on button showMore.png')

"Step 43: Click on button ninhNguyen2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_ninhNguyen2'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 43-Click on button ninhNguyen2.png')

"Step 44: Hover over button showMoreAssignee"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_showMoreAssignee'))

// WebUI.takeScreenshot(reportLocation + '/TC116/Step 44-Hover over button showMoreAssignee.png')

"Step 45: Click on button participant (trungRockyNgo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_participant"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_participant', ['button_participant_id': button_participant_id, 'button_participant_internalHasText': button_participant_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 45-Click on button participant trungRockyNgo.png')

"Step 46: Click on div projects"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_projects'))

// WebUI.takeScreenshot(reportLocation + '/TC116/Step 46-Click on div projects.png')

"Step 47: Hover over button kipCard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_kipCard'))

// WebUI.takeScreenshot(reportLocation + '/TC116/Step 47-Hover over button kipCard.png')

"Step 48: Hover over button kip49153"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_kip49153'))

// WebUI.takeScreenshot(reportLocation + '/TC116/Step 48-Hover over button kip49153.png')

"Step 49: Click on button kipActions (swimlaneLink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_kipActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_kipActions', ['button_kipActions_class': button_kipActions_class_1, 'button_kipActions_divNthOfType': button_kipActions_divNthOfType_1, 'button_kipActions_nth': button_kipActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 49-Click on button kipActions swimlaneLink.png')

"Step 50: Hover over link allWork"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_allWork'))

// WebUI.takeScreenshot(reportLocation + '/TC116/Step 50-Hover over link allWork.png')

"Step 51: Click on div everythingElseButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_swimlaneContent'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 51-Click on div everythingElseButton.png')

"Step 52: Click on button enhanceUploadMechanism -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_enhanceUploadMechanism'))

WebUI.takeScreenshot(reportLocation + '/TC116/Step 52-Click on button enhanceUploadMechanism - Navigate to page .png')

"Step 53: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC116-Explore Jira Software Boards and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}