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

"Step 1: Navigate to /jira/software/c/projects/KIP/boards/*/backlog"

TrueTestScripts.navigate("/jira/software/c/projects/KIP/boards/${boards_id}/backlog")

"Step 2: Click on label assigneeAvatar (assigneeAvatar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/label_assigneeAvatar"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/label_assigneeAvatar', ['label_assigneeAvatar_internalHasText': label_assigneeAvatar_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 2-Click on label assigneeAvatar assigneeAvatar.png')

"Step 3: Click on label assigneeAvatar (assigneeAvatar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/label_assigneeAvatar"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/label_assigneeAvatar', ['label_assigneeAvatar_internalHasText': label_assigneeAvatar_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 3-Click on label assigneeAvatar assigneeAvatar.png')

"Step 4: Click on label assigneeAvatar (assigneeAvatar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/label_assigneeAvatar"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/label_assigneeAvatar', ['label_assigneeAvatar_internalHasText': label_assigneeAvatar_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 4-Click on label assigneeAvatar assigneeAvatar.png')

"Step 5: Click on button changeStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/button_changeStatus'))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 5-Click on button changeStatus.png')

"Step 6: Hover over button newChangeStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/button_newChangeStatus'))

// WebUI.takeScreenshot(reportLocation + '/TC178/Step 6-Hover over button newChangeStatus.png')

"Step 7: Click on div readyForTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_readyForTest'))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 7-Click on div readyForTest.png')

"Step 8: Click on button editAssignee (editAssignee)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/button_editAssignee"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/button_editAssignee', ['button_editAssignee_class': button_editAssignee_class, 'button_editAssignee_dataTestid': button_editAssignee_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 8-Click on button editAssignee editAssignee.png')

"Step 9: Click on div options (option)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/div_options"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/div_options', ['div_options_option': div_options_option, 'div_options_reactSelect': div_options_reactSelect]))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 9-Click on div options option.png')

"Step 10: Click on label assigneeAvatar (assigneeAvatar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/label_assigneeAvatar"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/label_assigneeAvatar', ['label_assigneeAvatar_internalHasText': label_assigneeAvatar_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 10-Click on label assigneeAvatar assigneeAvatar.png')

"Step 11: Click on label assigneeAvatar (assigneeAvatar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/label_assigneeAvatar"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/label_assigneeAvatar', ['label_assigneeAvatar_internalHasText': label_assigneeAvatar_internalHasText_4]))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 11-Click on label assigneeAvatar assigneeAvatar.png')

"Step 12: Click on label assigneeAvatar (assigneeAvatar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/label_assigneeAvatar"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/label_assigneeAvatar', ['label_assigneeAvatar_internalHasText': label_assigneeAvatar_internalHasText_5]))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 12-Click on label assigneeAvatar assigneeAvatar.png')

"Step 13: Click on button epic"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/button_epic'))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 13-Click on button epic.png')

"Step 14: Click on div sessionizeDataFlowModel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_sessionizeDataFlowModel'))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 14-Click on div sessionizeDataFlowModel.png')

"Step 15: Click on div softwareBacklogHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_softwareBacklogHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC178/Step 15-Click on div softwareBacklogHeader.png')

"Step 16: Click on button editAssignee (editAssignee2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/button_editAssignee"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/button_editAssignee', ['button_editAssignee_class': button_editAssignee_class_1, 'button_editAssignee_dataTestid': button_editAssignee_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 16-Click on button editAssignee editAssignee2.png')

"Step 17: Enter input value in input searchAssignee"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/input_searchAssignee'), input_searchAssignee)

WebUI.takeScreenshot(reportLocation + '/TC178/Step 17-Enter input value in input searchAssignee.png')

"Step 18: Hover over div searchResults"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_searchResults'))

// WebUI.takeScreenshot(reportLocation + '/TC178/Step 18-Hover over div searchResults.png')

"Step 19: Click on div options (option2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/div_options"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/div_options', ['div_options_option': div_options_option_1, 'div_options_reactSelect': div_options_reactSelect_1]))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 19-Click on div options option2.png')

"Step 20: Click on link tableSessionize (createTableSessionize)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/link_tableSessionize"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/link_tableSessionize', ['link_tableSessionize_dataTestid': link_tableSessionize_dataTestid, 'link_tableSessionize_divNthOfType': link_tableSessionize_divNthOfType, 'link_tableSessionize_divNthOfType_1': link_tableSessionize_divNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 20-Click on link tableSessionize createTableSessionize.png')

"Step 21: Click on span addDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/span_addDescription'))

// WebUI.takeScreenshot(reportLocation + '/TC178/Step 21-Click on span addDescription.png')

"Step 22: Enter input value in div descriptionArea"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_descriptionArea'), div_descriptionArea)

WebUI.takeScreenshot(reportLocation + '/TC178/Step 22-Enter input value in div descriptionArea.png')

"Step 23: Click on div resizeHandle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_resizeHandle'))

// WebUI.takeScreenshot(reportLocation + '/TC178/Step 23-Click on div resizeHandle.png')

"Step 24: Hover over span ahaIntegration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/span_ahaIntegration'))

// WebUI.takeScreenshot(reportLocation + '/TC178/Step 24-Hover over span ahaIntegration.png')

"Step 25: Click on link currentIssue -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/link_currentIssue'))

WebUI.takeScreenshot(reportLocation + '/TC178/Step 25-Click on link currentIssue - Navigate to page .png')

"Step 26: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC178-Manage Jira Software Project Tasks and Assignees_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}