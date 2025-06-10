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

"Step 2: Click on div quicklinkList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_quicklinkList'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on div quicklinkList.png')

"Step 3: Select study or organization and navigate to dashboard"

selectStudyAndNavigateToDashboard.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on crIcon subjects"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/crIcon_subjects'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on crIcon subjects.png')

"Step 5: Click on div dashboardSections (forms)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': div_dashboardSections_class, 'div_dashboardSections_dataTestid': div_dashboardSections_dataTestid, 'div_dashboardSections_divNthOfType': div_dashboardSections_divNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on div dashboardSections forms.png')

"Step 6: Click on div dashboardSections (visitSchedule)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': div_dashboardSections_class_1, 'div_dashboardSections_dataTestid': div_dashboardSections_dataTestid_1, 'div_dashboardSections_divNthOfType': div_dashboardSections_divNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on div dashboardSections visitSchedule.png')

"Step 7: Click on div dataNotificationAndRules -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_dataNotificationAndRules'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on div dataNotificationAndRules - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Navigate to Studies Dashboard and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}