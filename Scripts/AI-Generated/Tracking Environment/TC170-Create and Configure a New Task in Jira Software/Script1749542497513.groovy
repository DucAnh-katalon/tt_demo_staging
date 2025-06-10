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

"Step 2: Click on label assigneeAvatar (assigneeAvatar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/label_assigneeAvatar"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards_backlog/label_assigneeAvatar', ['label_assigneeAvatar_internalHasText': label_assigneeAvatar_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC170/Step 2-Click on label assigneeAvatar assigneeAvatar.png')

"Step 3: Hover over link trueTestScrumBoard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/link_trueTestScrumBoard'))

// WebUI.takeScreenshot(reportLocation + '/TC170/Step 3-Hover over link trueTestScrumBoard.png')

"Step 4: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC170/Step 4-Click on button create.png')

"Step 5: Hover over div kip3118"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_kip3118'))

// WebUI.takeScreenshot(reportLocation + '/TC170/Step 5-Hover over div kip3118.png')

"Step 6: Click on div boardBacklog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_boardBacklog'))

// WebUI.takeScreenshot(reportLocation + '/TC170/Step 6-Click on div boardBacklog.png')

"Step 7: Click on div doneOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_doneOption'))

WebUI.takeScreenshot(reportLocation + '/TC170/Step 7-Click on div doneOption.png')

"Step 8: Click on input summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/input_summary'))

WebUI.takeScreenshot(reportLocation + '/TC170/Step 8-Click on input summary.png')

"Step 9: Enter input value in input summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/input_summary'), input_summary)

WebUI.takeScreenshot(reportLocation + '/TC170/Step 9-Enter input value in input summary.png')

"Step 10: Click on div userPickerInputContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_userPickerInputContainer'))

// WebUI.takeScreenshot(reportLocation + '/TC170/Step 10-Click on div userPickerInputContainer.png')

"Step 11: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC170/Step 11-Hover over div object.png')

"Step 12: Hover over span userName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/span_userName'))

// WebUI.takeScreenshot(reportLocation + '/TC170/Step 12-Hover over span userName.png')

"Step 13: Enter input value in input assignee"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/input_assignee'), input_assignee)

WebUI.takeScreenshot(reportLocation + '/TC170/Step 13-Enter input value in input assignee.png')

"Step 14: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC170/Step 14-Hover over div object.png')

"Step 15: Click on div assigneeOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_assigneeOption'))

WebUI.takeScreenshot(reportLocation + '/TC170/Step 15-Click on div assigneeOption.png')

"Step 16: Click on button create2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/button_create2'))

WebUI.takeScreenshot(reportLocation + '/TC170/Step 16-Click on button create2.png')

"Step 17: Hover over div accessibleCard2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/div_accessibleCard2'))

// WebUI.takeScreenshot(reportLocation + '/TC170/Step 17-Hover over div accessibleCard2.png')

"Step 18: Click on link view -> Navigate to page '/browse/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/link_view'))

WebUI.takeScreenshot(reportLocation + '/TC170/Step 18-Click on link view - Navigate to page browse.png')

"Step 19: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC170/Step 19-Click on button save.png')

"Step 20: Enter input value in div descriptionArea5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_descriptionArea'), div_descriptionArea5)

WebUI.takeScreenshot(reportLocation + '/TC170/Step 20-Enter input value in div descriptionArea5.png')

"Step 21: Click on p addConfiguration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/p_addConfiguration'))

// WebUI.takeScreenshot(reportLocation + '/TC170/Step 21-Click on p addConfiguration.png')

"Step 22: Click on div editorContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_editorContent'))

// WebUI.takeScreenshot(reportLocation + '/TC170/Step 22-Click on div editorContent.png')

"Step 23: Enter input value in div descriptionArea6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_descriptionArea'), div_descriptionArea6)

WebUI.takeScreenshot(reportLocation + '/TC170/Step 23-Enter input value in div descriptionArea6.png')

"Step 24: Click on div editorToolbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_editorToolbar'))

// WebUI.takeScreenshot(reportLocation + '/TC170/Step 24-Click on div editorToolbar.png')

"Step 25: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC170/Step 25-Click on button save.png')

"Step 26: Click on p dashboardConfigMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/p_dashboardConfigMessage'))

// WebUI.takeScreenshot(reportLocation + '/TC170/Step 26-Click on p dashboardConfigMessage.png')

"Step 27: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC170/Step 27-Click on button save.png')

"Step 28: Click on p dashboardConfigMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/p_dashboardConfigMessage'))

// WebUI.takeScreenshot(reportLocation + '/TC170/Step 28-Click on p dashboardConfigMessage.png')

"Step 29: Click on button save -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC170/Step 29-Click on button save - Navigate to page .png')

"Step 30: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC170-Create and Configure a New Task in Jira Software_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}