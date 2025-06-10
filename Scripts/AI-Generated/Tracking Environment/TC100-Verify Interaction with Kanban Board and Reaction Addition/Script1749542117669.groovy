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

"Step 1: Navigate to /browse/* with params (focusedCommentId)"

TrueTestScripts.navigate("/browse/${browse_id}", ["focusedCommentId": browse_focusedCommentId])

"Step 2: Click on link allWork"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_allWork'))

WebUI.takeScreenshot(reportLocation + '/TC100/Step 2-Click on link allWork.png')

"Step 3: Click on link backToProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_backToProject'))

WebUI.takeScreenshot(reportLocation + '/TC100/Step 3-Click on link backToProject.png')

"Step 4: Click on link kanbanBoard -> Navigate to page '/jira/software/c/projects/KIP/boards/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_kanbanBoard'))

WebUI.takeScreenshot(reportLocation + '/TC100/Step 4-Click on link kanbanBoard - Navigate to page jirasoftwarecprojectsKIPboards.png')

"Step 5: Click on span trueTestPocDetails (projectName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails', ['span_trueTestPocDetails_cardKip': span_trueTestPocDetails_cardKip, 'span_trueTestPocDetails_divNthOfType': span_trueTestPocDetails_divNthOfType, 'span_trueTestPocDetails_divNthOfType_1': span_trueTestPocDetails_divNthOfType_1, 'span_trueTestPocDetails_liNthOfType': span_trueTestPocDetails_liNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC100/Step 5-Click on span trueTestPocDetails projectName.png')

"Step 6: Click on div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_issueModal5'))

// WebUI.takeScreenshot(reportLocation + '/TC100/Step 6-Click on div object7.png')

"Step 7: Click on span trueTestPocDetails (trueTestPoc4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails', ['span_trueTestPocDetails_cardKip': span_trueTestPocDetails_cardKip_1, 'span_trueTestPocDetails_divNthOfType': span_trueTestPocDetails_divNthOfType_1, 'span_trueTestPocDetails_divNthOfType_1': span_trueTestPocDetails_divNthOfType_1_1, 'span_trueTestPocDetails_liNthOfType': span_trueTestPocDetails_liNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC100/Step 7-Click on span trueTestPocDetails trueTestPoc4.png')

"Step 8: Click on span trueTestPocDetails (projectName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails', ['span_trueTestPocDetails_cardKip': span_trueTestPocDetails_cardKip_2, 'span_trueTestPocDetails_divNthOfType': span_trueTestPocDetails_divNthOfType_2, 'span_trueTestPocDetails_divNthOfType_1': span_trueTestPocDetails_divNthOfType_1_2, 'span_trueTestPocDetails_liNthOfType': span_trueTestPocDetails_liNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC100/Step 8-Click on span trueTestPocDetails projectName.png')

"Step 9: Click on button addReaction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_addReaction'))

WebUI.takeScreenshot(reportLocation + '/TC100/Step 9-Click on button addReaction.png')

"Step 10: Click on button reactWithClap"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_reactWithClap'))

WebUI.takeScreenshot(reportLocation + '/TC100/Step 10-Click on button reactWithClap.png')

"Step 11: Click on p comment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/p_comment'))

// WebUI.takeScreenshot(reportLocation + '/TC100/Step 11-Click on p comment.png')

"Step 12: Click on p comment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/p_comment'))

// WebUI.takeScreenshot(reportLocation + '/TC100/Step 12-Click on p comment.png')

"Step 13: Click on p comment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/p_comment'))

// WebUI.takeScreenshot(reportLocation + '/TC100/Step 13-Click on p comment.png')

"Step 14: Click on div issueDetailsModal2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_issueModal5'))

// WebUI.takeScreenshot(reportLocation + '/TC100/Step 14-Click on div issueDetailsModal2.png')

"Step 15: Click on span trueTestPocDetails (trueTestPoc4) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails', ['span_trueTestPocDetails_cardKip': span_trueTestPocDetails_cardKip_3, 'span_trueTestPocDetails_divNthOfType': span_trueTestPocDetails_divNthOfType_3, 'span_trueTestPocDetails_divNthOfType_1': span_trueTestPocDetails_divNthOfType_1_3, 'span_trueTestPocDetails_liNthOfType': span_trueTestPocDetails_liNthOfType_3]))

// WebUI.takeScreenshot(reportLocation + '/TC100/Step 15-Click on span trueTestPocDetails trueTestPoc4 - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC100-Verify Interaction with Kanban Board and Reaction Addition_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}