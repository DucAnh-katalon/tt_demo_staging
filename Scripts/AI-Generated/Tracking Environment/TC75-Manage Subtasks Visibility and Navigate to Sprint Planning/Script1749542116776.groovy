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

"Step 1: Navigate to /jira/software/c/projects/KIP/boards/*/backlog with params (assignee)"

TrueTestScripts.navigate("/jira/software/c/projects/KIP/boards/${boards_id}/backlog", ["assignee": backlog_assignee])

"Step 2: Click on button showSubtasks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/button_showSubtasks'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 2-Click on button showSubtasks.png')

"Step 3: Click on button hideSubtasks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/button_hideSubtasks'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 3-Click on button hideSubtasks.png')

"Step 4: Click on button showSubtasks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/button_showSubtasks'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 4-Click on button showSubtasks.png')

"Step 5: Click on button hideSubtasks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/button_hideSubtasks'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 5-Click on button hideSubtasks.png')

"Step 6: Click on div accessibleCard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_accessibleCard'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 6-Click on div accessibleCard.png')

"Step 7: Hover over button actions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/button_actions'))

// WebUI.takeScreenshot(reportLocation + '/TC75/Step 7-Hover over button actions.png')

"Step 8: Click on button closeModal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/button_closeModal'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 8-Click on button closeModal.png')

"Step 9: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/span_object'))

// WebUI.takeScreenshot(reportLocation + '/TC75/Step 9-Click on span object.png')

"Step 10: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/span_object'))

// WebUI.takeScreenshot(reportLocation + '/TC75/Step 10-Click on span object.png')

"Step 11: Click on div sprintPlanning"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_sprintPlanning'))

// WebUI.takeScreenshot(reportLocation + '/TC75/Step 11-Click on div sprintPlanning.png')

"Step 12: Click on div sprintPlanning"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_sprintPlanning'))

// WebUI.takeScreenshot(reportLocation + '/TC75/Step 12-Click on div sprintPlanning.png')

"Step 13: Click on div sprintPlanning"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_sprintPlanning'))

// WebUI.takeScreenshot(reportLocation + '/TC75/Step 13-Click on div sprintPlanning.png')

"Step 14: Click on div sprintPlanning"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_sprintPlanning'))

// WebUI.takeScreenshot(reportLocation + '/TC75/Step 14-Click on div sprintPlanning.png')

"Step 15: Click on div sprintPlanning"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_sprintPlanning'))

// WebUI.takeScreenshot(reportLocation + '/TC75/Step 15-Click on div sprintPlanning.png')

"Step 16: Click on link tableSessionize (dontTreatIframe)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/link_tableSessionize"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/link_tableSessionize', ['link_tableSessionize_dataTestid': link_tableSessionize_dataTestid, 'link_tableSessionize_divNthOfType': link_tableSessionize_divNthOfType, 'link_tableSessionize_divNthOfType_1': link_tableSessionize_divNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 16-Click on link tableSessionize dontTreatIframe.png')

"Step 17: Click on link trueTestPoc -> Navigate to page '/browse/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/link_trueTestPoc'))

WebUI.takeScreenshot(reportLocation + '/TC75/Step 17-Click on link trueTestPoc - Navigate to page browse.png')

"Step 18: Click on code object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/code_object'))

// WebUI.takeScreenshot(reportLocation + '/TC75/Step 18-Click on code object - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC75-Manage Subtasks Visibility and Navigate to Sprint Planning_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}