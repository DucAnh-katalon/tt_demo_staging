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

"Step 1: Navigate to /katalon-studio/katalon-atg"

TrueTestScripts.navigate("/katalon-studio/katalon-atg")

"Step 2: Click on link pullRequests -> Navigate to page '/katalon-studio/katalon-atg/pulls'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg/link_pullRequests'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 2-Click on link pullRequests - Navigate to page katalon-studiokatalon-atgpulls.png')

"Step 3: Click on link closedPullRequests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pulls?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pulls/link_closedPullRequests'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 3-Click on link closedPullRequests.png')

"Step 4: Click on input searchIssues"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pulls?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pulls/input_searchIssues'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 4-Click on input searchIssues.png')

"Step 5: Click on link page2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pulls?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pulls/link_page2'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 5-Click on link page2.png')

"Step 6: Click on link pageNavigation (page3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pulls?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pulls/link_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pulls/link_pageNavigation', ['link_pageNavigation_aNthOfType': link_pageNavigation_aNthOfType, 'link_pageNavigation_internalLabel': link_pageNavigation_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 6-Click on link pageNavigation page3.png')

"Step 7: Click on link pageNavigation (page4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pulls?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pulls/link_pageNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pulls/link_pageNavigation', ['link_pageNavigation_aNthOfType': link_pageNavigation_aNthOfType_1, 'link_pageNavigation_internalLabel': link_pageNavigation_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 7-Click on link pageNavigation page4.png')

"Step 8: Click on link improveNamingProcess -> Navigate to page '/katalon-studio/katalon-atg/pull/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pulls?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pulls/link_improveNamingProcess'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 8-Click on link improveNamingProcess - Navigate to page katalon-studiokatalon-atgpull.png')

"Step 9: Click on link filesChanged4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull/link_filesChanged4'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 9-Click on link filesChanged4.png')

"Step 10: Click on link filesChanged4 -> Navigate to page '/katalon-studio/katalon-atg/pull/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull/link_filesChanged4'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 10-Click on link filesChanged4 - Navigate to page katalon-studiokatalon-atgpullfiles.png')

"Step 11: Click on td diffLineChange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/td_diffLineChange'))

// WebUI.takeScreenshot(reportLocation + '/TC117/Step 11-Click on td diffLineChange.png')

"Step 12: Click on td originalFileLine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/td_originalFileLine'))

// WebUI.takeScreenshot(reportLocation + '/TC117/Step 12-Click on td originalFileLine.png')

"Step 13: Click on link pullRequests -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/link_pullRequests'))

WebUI.takeScreenshot(reportLocation + '/TC117/Step 13-Click on link pullRequests - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC117-Review Closed Pull Requests and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}