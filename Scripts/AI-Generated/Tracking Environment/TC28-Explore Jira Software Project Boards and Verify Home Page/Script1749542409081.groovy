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

"Step 2: Click on link releases -> Navigate to page '/projects/KIP'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_releases'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 2-Click on link releases - Navigate to page projectsKIP.png')

"Step 3: Click on td description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/projects/KIP?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_projects_KIP/td_description'))

// WebUI.takeScreenshot(reportLocation + '/TC28/Step 3-Click on td description.png')

"Step 4: Click on td description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/projects/KIP?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_projects_KIP/td_description'))

// WebUI.takeScreenshot(reportLocation + '/TC28/Step 4-Click on td description.png')

"Step 5: Click on td description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/projects/KIP?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_projects_KIP/td_description'))

// WebUI.takeScreenshot(reportLocation + '/TC28/Step 5-Click on td description.png')

"Step 6: Click on button trueTestKanbanBoard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/projects/KIP?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_projects_KIP/button_trueTestKanbanBoard'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 6-Click on button trueTestKanbanBoard.png')

"Step 7: Hover over link timeline"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/projects/KIP?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_projects_KIP/link_timeline'))

// WebUI.takeScreenshot(reportLocation + '/TC28/Step 7-Hover over link timeline.png')

"Step 8: Click on link trueTestScrumBoard -> Navigate to page '/jira/software/c/projects/KIP/boards/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/projects/KIP?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_projects_KIP/link_trueTestScrumBoard'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 8-Click on link trueTestScrumBoard - Navigate to page jirasoftwarecprojectsKIPboards.png')

"Step 9: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 9-Click on button showMore.png')

"Step 10: Click on button showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 10-Click on button showMore.png')

"Step 11: Click on span errorMessages (enhanceUploadMechanism)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_errorMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_errorMessages', ['span_errorMessages_cardKip': span_errorMessages_cardKip, 'span_errorMessages_divNthOfType': span_errorMessages_divNthOfType, 'span_errorMessages_divNthOfType_1': span_errorMessages_divNthOfType_1, 'span_errorMessages_divNthOfType_2': span_errorMessages_divNthOfType_2, 'span_errorMessages_divNthOfType_3': span_errorMessages_divNthOfType_3, 'span_errorMessages_liNthOfType': span_errorMessages_liNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC28/Step 11-Click on span errorMessages enhanceUploadMechanism.png')

"Step 12: Click on div issueModal -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC28/Step 12-Click on div issueModal - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC28-Explore Jira Software Project Boards and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}