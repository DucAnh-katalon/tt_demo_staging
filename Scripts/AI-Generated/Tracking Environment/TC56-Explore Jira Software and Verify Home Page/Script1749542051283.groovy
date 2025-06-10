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

"Step 2: Click on input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 2-Click on input search.png')

"Step 3: Enter input value in input searchJira"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/input_searchJira'), input_searchJira)

WebUI.takeScreenshot(reportLocation + '/TC56/Step 3-Enter input value in input searchJira.png')

"Step 4: Click on link recentlyViewed -> Navigate to page '/browse/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*/backlog?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards_backlog/link_recentlyViewed'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 4-Click on link recentlyViewed - Navigate to page browse.png')

"Step 5: Click on input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 5-Click on input search.png')

"Step 6: Click on div issueDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_issueDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 6-Click on div issueDetails.png')

"Step 7: Click on link issueResolvedView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_issueResolvedView'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 7-Click on link issueResolvedView.png')

"Step 8: Click on button switchToTrueTestScrumBoard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_switchToTrueTestScrumBoard'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 8-Click on button switchToTrueTestScrumBoard.png')

"Step 9: Hover over link backlog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_backlog'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 9-Hover over link backlog.png')

"Step 10: Click on link customerPocs -> Navigate to page '/jira/software/c/projects/KIP/boards/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_customerPocs'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 10-Click on link customerPocs - Navigate to page jirasoftwarecprojectsKIPboards.png')

"Step 11: Click on span trueTestPocDetails (trueTestPoc2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails', ['span_trueTestPocDetails_cardKip': span_trueTestPocDetails_cardKip, 'span_trueTestPocDetails_divNthOfType': span_trueTestPocDetails_divNthOfType, 'span_trueTestPocDetails_divNthOfType_1': span_trueTestPocDetails_divNthOfType_1, 'span_trueTestPocDetails_liNthOfType': span_trueTestPocDetails_liNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 11-Click on span trueTestPocDetails trueTestPoc2.png')

"Step 12: Click on div mediaCardBlanket"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_mediaCardBlanket'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 12-Click on div mediaCardBlanket.png')

"Step 13: Click on span trueTestPocDetails (trueTestPoc2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails', ['span_trueTestPocDetails_cardKip': span_trueTestPocDetails_cardKip_1, 'span_trueTestPocDetails_divNthOfType': span_trueTestPocDetails_divNthOfType_1, 'span_trueTestPocDetails_divNthOfType_1': span_trueTestPocDetails_divNthOfType_1_1, 'span_trueTestPocDetails_liNthOfType': span_trueTestPocDetails_liNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 13-Click on span trueTestPocDetails trueTestPoc2.png')

"Step 14: Click on div issueModal3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 14-Click on div issueModal3.png')

"Step 15: Click on span trueTestPocDetails (trueTestPoc3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_trueTestPocDetails', ['span_trueTestPocDetails_cardKip': span_trueTestPocDetails_cardKip_2, 'span_trueTestPocDetails_divNthOfType': span_trueTestPocDetails_divNthOfType_2, 'span_trueTestPocDetails_divNthOfType_1': span_trueTestPocDetails_divNthOfType_1_2, 'span_trueTestPocDetails_liNthOfType': span_trueTestPocDetails_liNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 15-Click on span trueTestPocDetails trueTestPoc3.png')

"Step 16: Click on span moreInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/span_moreInfo'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 16-Click on span moreInfo.png')

"Step 17: Click on button showMoreComments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_showMoreComments'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 17-Click on button showMoreComments.png')

"Step 18: Click on link inlineCard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_inlineCard'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 18-Click on link inlineCard.png')

"Step 19: Hover over button copyLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_copyLink'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 19-Hover over button copyLink.png')

"Step 20: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 20-Click on div object3.png')

"Step 21: Click on p issueComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/p_issueComment'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 21-Click on p issueComment.png')

"Step 22: Click on p issueComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/p_issueComment'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 22-Click on p issueComment.png')

"Step 23: Click on p issueComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/p_issueComment'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 23-Click on p issueComment.png')

"Step 24: Click on p issueComment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/p_issueComment2'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 24-Click on p issueComment2.png')

"Step 25: Click on p issueComment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/p_issueComment2'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 25-Click on p issueComment2.png')

"Step 26: Click on p issueComment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/p_issueComment2'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 26-Click on p issueComment2.png')

"Step 27: Click on p issueComment3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/p_issueComment3'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 27-Click on p issueComment3.png')

"Step 28: Click on p issueComment3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/p_issueComment3'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 28-Click on p issueComment3.png')

"Step 29: Click on p issueComment3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/p_issueComment3'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 29-Click on p issueComment3.png')

"Step 30: Click on link dynamicTestObjectVariable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/link_dynamicTestObjectVariable'))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 30-Click on link dynamicTestObjectVariable.png')

"Step 31: Click on link sampleIssues (missingSampleValue) -> Navigate to page '/browse/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/link_sampleIssues"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/link_sampleIssues', ['link_sampleIssues_divNthOfType': link_sampleIssues_divNthOfType, 'link_sampleIssues_divNthOfType_1': link_sampleIssues_divNthOfType_1, 'link_sampleIssues_internalHasText': link_sampleIssues_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC56/Step 31-Click on link sampleIssues missingSampleValue - Navigate to page browse.png')

"Step 32: Click on image description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/image_description'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 32-Click on image description.png')

"Step 33: Click on image mediaViewer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/image_mediaViewer'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 33-Click on image mediaViewer.png')

"Step 34: Click on image mediaViewer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/image_mediaViewer'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 34-Click on image mediaViewer.png')

"Step 35: Click on image mediaViewer -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/image_mediaViewer'))

// WebUI.takeScreenshot(reportLocation + '/TC56/Step 35-Click on image mediaViewer - Navigate to page .png')

"Step 36: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC56-Explore Jira Software and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}