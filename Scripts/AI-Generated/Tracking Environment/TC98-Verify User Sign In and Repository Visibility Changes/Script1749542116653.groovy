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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link signIn -> Navigate to page '/login'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 2-Click on link signIn - Navigate to page login.png')

"Step 3: Click on input username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login/input_username'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 3-Click on input username.png')

"Step 4: Enter input value in input username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_login/input_username'), input_username)

WebUI.takeScreenshot(reportLocation + '/TC98/Step 4-Enter input value in input username.png')

"Step 5: Click on input signIn -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login/input_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 5-Click on input signIn - Navigate to page .png')

"Step 6: Hover over button javaListConversionGuide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_home/button_javaListConversionGuide'))

// WebUI.takeScreenshot(reportLocation + '/TC98/Step 6-Hover over button javaListConversionGuide.png')

"Step 7: Click on link ducanh2505Vaes -> Navigate to page '/*/VAEs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_ducanh2505Vaes'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 7-Click on link ducanh2505Vaes - Navigate to page VAEs.png')

"Step 8: Click on link settings -> Navigate to page '/*/VAEs/settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs/link_settings'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 8-Click on link settings - Navigate to page VAEssettings.png')

"Step 9: Click on button changeVisibility"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs_settings/button_changeVisibility'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 9-Click on button changeVisibility.png')

"Step 10: Click on button changeVisibility2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs_settings/button_changeVisibility2'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 10-Click on button changeVisibility2.png')

"Step 11: Click on button makePublic"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs_settings/button_makePublic'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 11-Click on button makePublic.png')

"Step 12: Click on button confirmReadEffects"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs_settings/button_confirmReadEffects'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 12-Click on button confirmReadEffects.png')

"Step 13: Click on button makeRepositoryPublic"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs_settings/button_makeRepositoryPublic'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 13-Click on button makeRepositoryPublic.png')

"Step 14: Click on link code -> Navigate to page '/*/VAEs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs/settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs_settings/link_code'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 14-Click on link code - Navigate to page VAEs.png')

"Step 15: Click on link issues -> Navigate to page '/*/VAEs/issues'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs/link_issues'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 15-Click on link issues - Navigate to page VAEsissues.png')

"Step 16: Click on link openIssues"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs/issues?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs_issues/link_openIssues'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 16-Click on link openIssues.png')

"Step 17: Click on link code -> Navigate to page '/*/VAEs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs/issues?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs_issues/link_code'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 17-Click on link code - Navigate to page VAEs.png')

"Step 18: Click on link refreshAtWill"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs/link_refreshAtWill'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 18-Click on link refreshAtWill.png')

"Step 19: Click on div name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs/div_name'))

// WebUI.takeScreenshot(reportLocation + '/TC98/Step 19-Click on div name.png')

"Step 20: Click on link pdfDirectory -> Navigate to page '/*/VAEs/tree/main/pdf'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs/link_pdfDirectory'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 20-Click on link pdfDirectory - Navigate to page VAEstreemainpdf.png')

"Step 21: Click on div nameCell"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs/tree/main/pdf?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs_tree_main_pdf/div_nameCell'))

// WebUI.takeScreenshot(reportLocation + '/TC98/Step 21-Click on div nameCell.png')

"Step 22: Click on link mainPdf -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs/tree/main/pdf?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs_tree_main_pdf/link_mainPdf'))

WebUI.takeScreenshot(reportLocation + '/TC98/Step 22-Click on link mainPdf - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC98-Verify User Sign In and Repository Visibility Changes_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}