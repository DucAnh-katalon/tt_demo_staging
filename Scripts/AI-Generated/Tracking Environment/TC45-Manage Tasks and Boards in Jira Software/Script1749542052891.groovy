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

WebUI.takeScreenshot(reportLocation + '/TC45/Step 2-Click on label assigneeAvatar assigneeAvatar.png')

"Step 3: Click on link updateTrafficAnalyzer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/link_updateTrafficAnalyzer'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 3-Click on link updateTrafficAnalyzer.png')

"Step 4: Hover over button apps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/button_apps'))

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 4-Hover over button apps.png')

"Step 5: Click on button copyLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/button_copyLink'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 5-Click on button copyLink.png')

"Step 6: Hover over link backlog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/link_backlog'))

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 6-Hover over link backlog.png')

"Step 7: Click on link trueTestKanbanBoard -> Navigate to page '/jira/software/c/projects/KIP/boards/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/link_trueTestKanbanBoard'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 7-Click on link trueTestKanbanBoard - Navigate to page jirasoftwarecprojectsKIPboards.png')

"Step 8: Click on button trueTestKanbanBoard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_trueTestKanbanBoard'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 8-Click on button trueTestKanbanBoard.png')

"Step 9: Hover over span technicalFeatureDebt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/span_technicalFeatureDebt'))

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 9-Hover over span technicalFeatureDebt.png')

"Step 10: Click on link customerPocs (customerPocs3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/link_customerPocs"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/link_customerPocs', ['link_customerPocs_href_variable': link_customerPocs_href_variable, 'link_customerPocs_id': link_customerPocs_id, 'link_customerPocs_reactSelect': link_customerPocs_reactSelect]))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 10-Click on link customerPocs customerPocs3.png')

"Step 11: Click on span trueTestPocDetails (betaUserSupport)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails', ['span_trueTestPocDetails_cardKip': span_trueTestPocDetails_cardKip, 'span_trueTestPocDetails_divNthOfType': span_trueTestPocDetails_divNthOfType, 'span_trueTestPocDetails_divNthOfType_1': span_trueTestPocDetails_divNthOfType_1, 'span_trueTestPocDetails_liNthOfType': span_trueTestPocDetails_liNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 11-Click on span trueTestPocDetails betaUserSupport.png')

"Step 12: Click on link appAssociates"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_appAssociates'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 12-Click on link appAssociates.png')

"Step 13: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 13-Click on div object2.png')

"Step 14: Click on link calendar -> Navigate to page '/jira/software/c/projects/KIP/boards/*/calendar'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_calendar'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 14-Click on link calendar - Navigate to page jirasoftwarecprojectsKIPboardscalendar.png')

"Step 15: Click on button customerPocsBoard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/calendar?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_calendar/button_customerPocsBoard'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 15-Click on button customerPocsBoard.png')

"Step 16: Hover over link timeline"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/calendar?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_calendar/link_timeline'))

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 16-Hover over link timeline.png')

"Step 17: Click on link trueTestScrumBoard -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/calendar?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_calendar/link_trueTestScrumBoard'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 17-Click on link trueTestScrumBoard - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC45-Manage Tasks and Boards in Jira Software_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}