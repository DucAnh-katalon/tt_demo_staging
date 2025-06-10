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

"Step 2: Click on div recentPushes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg/div_recentPushes'))

// WebUI.takeScreenshot(reportLocation + '/TC74/Step 2-Click on div recentPushes.png')

"Step 3: Click on link compareAndPullRequest -> Navigate to page '/katalon-studio/katalon-atg/compare/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg/link_compareAndPullRequest'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 3-Click on link compareAndPullRequest - Navigate to page katalon-studiokatalon-atgcompare.png')

"Step 4: Enter input value in input pullRequestTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/compare/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_compare/input_pullRequestTitle'), input_pullRequestTitle)

WebUI.takeScreenshot(reportLocation + '/TC74/Step 4-Enter input value in input pullRequestTitle.png')

"Step 5: Click on summary baseRef"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/compare/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_compare/summary_baseRef'))

// WebUI.takeScreenshot(reportLocation + '/TC74/Step 5-Click on summary baseRef.png')

"Step 6: Enter input value in input findBranch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/compare/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_compare/input_findBranch'), input_findBranch)

WebUI.takeScreenshot(reportLocation + '/TC74/Step 6-Enter input value in input findBranch.png')

"Step 7: Click on link release"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/compare/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_compare/link_release'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 7-Click on link release.png')

"Step 8: Click on input pullRequestTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/compare/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_compare/input_pullRequestTitle'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 8-Click on input pullRequestTitle.png')

"Step 9: Click on input pullRequestTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/compare/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_compare/input_pullRequestTitle'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 9-Click on input pullRequestTitle.png')

"Step 10: Enter input value in input pullRequestTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/compare/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_compare/input_pullRequestTitle'), input_pullRequestTitle_1)

WebUI.takeScreenshot(reportLocation + '/TC74/Step 10-Enter input value in input pullRequestTitle.png')

"Step 11: Click on button createPullRequest -> Navigate to page '/katalon-studio/katalon-atg/pull/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/compare/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_compare/button_createPullRequest'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 11-Click on button createPullRequest - Navigate to page katalon-studiokatalon-atgpull.png')

"Step 12: Click on link qualityAutonomousTestGeneration -> Navigate to page '/katalon-studio/katalon-atg/actions/runs/*/job/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull/link_qualityAutonomousTestGeneration'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 12-Click on link qualityAutonomousTestGeneration - Navigate to page katalon-studiokatalon-atgactionsrunsjob.png')

"Step 13: Click on span importError"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/actions/runs/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_actions_runs_job/span_importError'))

// WebUI.takeScreenshot(reportLocation + '/TC74/Step 13-Click on span importError.png')

"Step 14: Click on span importError"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/actions/runs/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_actions_runs_job/span_importError'))

// WebUI.takeScreenshot(reportLocation + '/TC74/Step 14-Click on span importError.png')

"Step 15: Click on link pullRequests -> Navigate to page '/katalon-studio/katalon-atg/pulls'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/actions/runs/.*/job/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_actions_runs_job/link_pullRequests'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 15-Click on link pullRequests - Navigate to page katalon-studiokatalon-atgpulls.png')

"Step 16: Click on link revertHtmlExtension -> Navigate to page '/katalon-studio/katalon-atg/pull/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pulls?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pulls/link_revertHtmlExtension'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 16-Click on link revertHtmlExtension - Navigate to page katalon-studiokatalon-atgpull.png')

"Step 17: Click on link filesChanged3 -> Navigate to page '/katalon-studio/katalon-atg/pull/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull/link_filesChanged3'))

WebUI.takeScreenshot(reportLocation + '/TC74/Step 17-Click on link filesChanged3 - Navigate to page katalon-studiokatalon-atgpullfiles.png')

"Step 18: Click on span originalFileLine -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_originalFileLine'))

// WebUI.takeScreenshot(reportLocation + '/TC74/Step 18-Click on span originalFileLine - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC74-Create and Manage Pull Requests in Katalon Studio_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}