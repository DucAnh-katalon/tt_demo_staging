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

"Step 1: Navigate to /jira/software/c/projects/KIP/boards/* with params (assignee)"

TrueTestScripts.navigate("/jira/software/c/projects/KIP/boards/${boards_id}", ["assignee": boards_assignee])

"Step 2: Click on div inProgressStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_inProgressStatus'))

// WebUI.takeScreenshot(reportLocation + '/TC68/Step 2-Click on div inProgressStatus.png')

"Step 3: Click on label assigneeAvatars (unassigned)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars', ['label_assigneeAvatars_for': label_assigneeAvatars_for, 'label_assigneeAvatars_internalHasText': label_assigneeAvatars_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 3-Click on label assigneeAvatars unassigned.png')

"Step 4: Click on label assigneeAvatars (assigneeFilterAvatar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars', ['label_assigneeAvatars_for': label_assigneeAvatars_for_1, 'label_assigneeAvatars_internalHasText': label_assigneeAvatars_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 4-Click on label assigneeAvatars assigneeFilterAvatar.png')

"Step 5: Click on label assigneeAvatars (unassigned)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars', ['label_assigneeAvatars_for': label_assigneeAvatars_for_2, 'label_assigneeAvatars_internalHasText': label_assigneeAvatars_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 5-Click on label assigneeAvatars unassigned.png')

"Step 6: Click on label assigneeAvatars (assigneeAvatar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars', ['label_assigneeAvatars_for': label_assigneeAvatars_for_3, 'label_assigneeAvatars_internalHasText': label_assigneeAvatars_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 6-Click on label assigneeAvatars assigneeAvatar.png')

"Step 7: Click on label assigneeAvatars (assigneeAvatar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars', ['label_assigneeAvatars_for': label_assigneeAvatars_for_4, 'label_assigneeAvatars_internalHasText': label_assigneeAvatars_internalHasText_4]))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 7-Click on label assigneeAvatars assigneeAvatar.png')

"Step 8: Click on button showMore2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 8-Click on button showMore2.png')

"Step 9: Click on button ninhNguyen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_ninhNguyen2'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 9-Click on button ninhNguyen.png')

"Step 10: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_object4'))

// WebUI.takeScreenshot(reportLocation + '/TC68/Step 10-Click on div object4.png')

"Step 11: Click on button trueTestKanbanBoard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_trueTestKanbanBoard'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 11-Click on button trueTestKanbanBoard.png')

"Step 12: Hover over link timeline"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_timeline'))

// WebUI.takeScreenshot(reportLocation + '/TC68/Step 12-Hover over link timeline.png')

"Step 13: Click on link trueTestScrumBoard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_trueTestScrumBoard'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 13-Click on link trueTestScrumBoard.png')

"Step 14: Click on label assigneeAvatars (assigneeFilterAvatar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars', ['label_assigneeAvatars_for': label_assigneeAvatars_for_5, 'label_assigneeAvatars_internalHasText': label_assigneeAvatars_internalHasText_5]))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 14-Click on label assigneeAvatars assigneeFilterAvatar.png')

"Step 15: Click on div filterInstructions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_filterInstructions'))

// WebUI.takeScreenshot(reportLocation + '/TC68/Step 15-Click on div filterInstructions.png')

"Step 16: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 16-Click on button showMore.png')

"Step 17: Click on button participant (participantLaiPham)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_participant"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_participant', ['button_participant_id': button_participant_id, 'button_participant_internalHasText': button_participant_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 17-Click on button participant participantLaiPham.png')

"Step 18: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 18-Click on button showMore.png')

"Step 19: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 19-Click on button showMore.png')

"Step 20: Click on button ninhNguyen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_ninhNguyen2'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 20-Click on button ninhNguyen.png')

"Step 21: Click on button label"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_label'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 21-Click on button label.png')

"Step 22: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 22-Click on button showMore.png')

"Step 23: Click on label assigneeAvatars (assigneeFilterAvatar2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/label_assigneeAvatars', ['label_assigneeAvatars_for': label_assigneeAvatars_for_6, 'label_assigneeAvatars_internalHasText': label_assigneeAvatars_internalHasText_6]))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 23-Click on label assigneeAvatars assigneeFilterAvatar2.png')

"Step 24: Hover over button create2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_create2'))

// WebUI.takeScreenshot(reportLocation + '/TC68/Step 24-Hover over button create2.png')

"Step 25: Click on button kipActions (taskLink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_kipActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_kipActions', ['button_kipActions_class': button_kipActions_class, 'button_kipActions_divNthOfType': button_kipActions_divNthOfType, 'button_kipActions_nth': button_kipActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 25-Click on button kipActions taskLink.png')

"Step 26: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC68/Step 26-Click on div object5.png')

"Step 27: Hover over div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_object6'))

// WebUI.takeScreenshot(reportLocation + '/TC68/Step 27-Hover over div object6.png')

"Step 28: Click on button kipActions (taskLink)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_kipActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_kipActions', ['button_kipActions_class': button_kipActions_class_1, 'button_kipActions_divNthOfType': button_kipActions_divNthOfType_1, 'button_kipActions_nth': button_kipActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 28-Click on button kipActions taskLink.png')

"Step 29: Click on link addTrackingEnv"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_addTrackingEnv'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 29-Click on link addTrackingEnv.png')

"Step 30: Click on div issueModal4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC68/Step 30-Click on div issueModal4.png')

"Step 31: Hover over button createWorkItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_createWorkItem'))

// WebUI.takeScreenshot(reportLocation + '/TC68/Step 31-Hover over button createWorkItem.png')

"Step 32: Hover over button kip4885SupportAudit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_kip4885SupportAudit'))

// WebUI.takeScreenshot(reportLocation + '/TC68/Step 32-Hover over button kip4885SupportAudit.png')

"Step 33: Click on button kipActions (kipResolved)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_kipActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_kipActions', ['button_kipActions_class': button_kipActions_class_2, 'button_kipActions_divNthOfType': button_kipActions_divNthOfType_2, 'button_kipActions_nth': button_kipActions_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 33-Click on button kipActions kipResolved.png')

"Step 34: Click on link inlineCardResolvingView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_inlineCardResolvingView'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 34-Click on link inlineCardResolvingView.png')

"Step 35: Click on div issueDetailsModal -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC68/Step 35-Click on div issueDetailsModal - Navigate to page .png')

"Step 36: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC68-Interact with Jira Software Boards and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}