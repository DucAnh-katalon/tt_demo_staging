import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.selectStudyAndNavigateToDashboard
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /dashboard"

TrueTestScripts.navigate("/dashboard")

"Step 2: Click on list quicklink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/list_quicklink'))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 2-Click on list quicklink.png')

"Step 3: Select study or organization and navigate to dashboard"

selectStudyAndNavigateToDashboard.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on div dashboardSections (subjects)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': div_dashboardSections_class, 'div_dashboardSections_dataTestid': div_dashboardSections_dataTestid, 'div_dashboardSections_divNthOfType': div_dashboardSections_divNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 4-Click on div dashboardSections subjects.png')

"Step 5: Click on div dashboardSections (visitSchedule)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': div_dashboardSections_class_1, 'div_dashboardSections_dataTestid': div_dashboardSections_dataTestid_1, 'div_dashboardSections_divNthOfType': div_dashboardSections_divNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 5-Click on div dashboardSections visitSchedule.png')

"Step 6: Click on div dataNotificationAndRules"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_dataNotificationAndRules'))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 6-Click on div dataNotificationAndRules.png')

"Step 7: Click on div dashboardSections (dataUpload)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': div_dashboardSections_class_2, 'div_dashboardSections_dataTestid': div_dashboardSections_dataTestid_2, 'div_dashboardSections_divNthOfType': div_dashboardSections_divNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 7-Click on div dashboardSections dataUpload.png')

"Step 8: Click on faIcon qualityControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_qualityControl'))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 8-Click on faIcon qualityControl.png')

"Step 9: Click on div dashboardSections (forms)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': div_dashboardSections_class_3, 'div_dashboardSections_dataTestid': div_dashboardSections_dataTestid_3, 'div_dashboardSections_divNthOfType': div_dashboardSections_divNthOfType_3]))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 9-Click on div dashboardSections forms.png')

"Step 10: Click on div dashboardSections (sites)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': div_dashboardSections_class_4, 'div_dashboardSections_dataTestid': div_dashboardSections_dataTestid_4, 'div_dashboardSections_divNthOfType': div_dashboardSections_divNthOfType_4]))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 10-Click on div dashboardSections sites.png')

"Step 11: Click on div dashboardSections (siteAssessment)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': div_dashboardSections_class_5, 'div_dashboardSections_dataTestid': div_dashboardSections_dataTestid_5, 'div_dashboardSections_divNthOfType': div_dashboardSections_divNthOfType_5]))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 11-Click on div dashboardSections siteAssessment.png')

"Step 12: Click on div dashboardSections (subjects)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': div_dashboardSections_class_6, 'div_dashboardSections_dataTestid': div_dashboardSections_dataTestid_6, 'div_dashboardSections_divNthOfType': div_dashboardSections_divNthOfType_6]))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 12-Click on div dashboardSections subjects.png')

"Step 13: Click on div dashboardSections (sites)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': div_dashboardSections_class_7, 'div_dashboardSections_dataTestid': div_dashboardSections_dataTestid_7, 'div_dashboardSections_divNthOfType': div_dashboardSections_divNthOfType_7]))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 13-Click on div dashboardSections sites.png')

"Step 14: Click on faIcon visitSchedule2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_visitSchedule2'))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 14-Click on faIcon visitSchedule2.png')

"Step 15: Click on div dashboardSections (forms)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': div_dashboardSections_class_8, 'div_dashboardSections_dataTestid': div_dashboardSections_dataTestid_8, 'div_dashboardSections_divNthOfType': div_dashboardSections_divNthOfType_8]))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 15-Click on div dashboardSections forms.png')

"Step 16: Click on div dashboardSections (visitSchedule)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': div_dashboardSections_class_9, 'div_dashboardSections_dataTestid': div_dashboardSections_dataTestid_9, 'div_dashboardSections_divNthOfType': div_dashboardSections_divNthOfType_9]))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 16-Click on div dashboardSections visitSchedule.png')

"Step 17: Click on div dashboardSections (sites2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': div_dashboardSections_class_10, 'div_dashboardSections_dataTestid': div_dashboardSections_dataTestid_10, 'div_dashboardSections_divNthOfType': div_dashboardSections_divNthOfType_10]))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 17-Click on div dashboardSections sites2.png')

"Step 18: Click on div dashboardSections (forms)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': div_dashboardSections_class_11, 'div_dashboardSections_dataTestid': div_dashboardSections_dataTestid_11, 'div_dashboardSections_divNthOfType': div_dashboardSections_divNthOfType_11]))

// WebUI.takeScreenshot(reportLocation + '/TC156/Step 18-Click on div dashboardSections forms.png')

"Step 19: Click on faIcon backLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_backLink'))

WebUI.takeScreenshot(reportLocation + '/TC156/Step 19-Click on faIcon backLink.png')

"Step 20: Click on button confirm -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC156/Step 20-Click on button confirm - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC156-Access Dashboard and Verify Data Notifications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}