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

"Step 1: Navigate to /dashboard"

TrueTestScripts.navigate("/dashboard")

"Step 2: Click on list quicklink2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/list_quicklink'))

// WebUI.takeScreenshot(reportLocation + '/TC17/Step 2-Click on list quicklink2.png')

"Step 3: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 3-Click on button selectStudyOrOrganization.png')

"Step 4: Click on list quicklink2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/list_quicklink'))

// WebUI.takeScreenshot(reportLocation + '/TC17/Step 4-Click on list quicklink2.png')

"Step 5: Click on button clarioApps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_clarioApps'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 5-Click on button clarioApps.png')

"Step 6: Click on link administrationTool -> Navigate to page '/gssoadmin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_administrationTool'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 6-Click on link administrationTool - Navigate to page gssoadmin.png')

"Step 7: Click on button clarioApps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/button_clarioApps'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 7-Click on button clarioApps.png')

"Step 8: Click on link studies"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/link_studies'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 8-Click on link studies.png')

"Step 9: Click on div sites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/div_sites'))

// WebUI.takeScreenshot(reportLocation + '/TC17/Step 9-Click on div sites.png')

"Step 10: Click on div siteAssessment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/div_siteAssessment'))

// WebUI.takeScreenshot(reportLocation + '/TC17/Step 10-Click on div siteAssessment.png')

"Step 11: Click on div sites2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/div_sites2'))

// WebUI.takeScreenshot(reportLocation + '/TC17/Step 11-Click on div sites2.png')

"Step 12: Click on faIcon object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/faIcon_object'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 12-Click on faIcon object.png')

"Step 13: Click on button confirm -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 13-Click on button confirm - Navigate to page dashboard.png')

"Step 14: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 14-Click on button next.png')

"Step 15: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 15-Click on button next.png')

"Step 16: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 16-Click on button next.png')

"Step 17: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 17-Click on button next.png')

"Step 18: Click on button finish -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_finish'))

WebUI.takeScreenshot(reportLocation + '/TC17/Step 18-Click on button finish - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC17-Navigate and Confirm Studies Administration Tool Actions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}