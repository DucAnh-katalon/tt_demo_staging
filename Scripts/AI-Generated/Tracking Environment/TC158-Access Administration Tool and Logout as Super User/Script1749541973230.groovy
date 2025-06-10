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

"Step 2: Click on button clarioApps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_clarioApps'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 2-Click on button clarioApps.png')

"Step 3: Click on link administrationTool -> Navigate to page '/gssoadmin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_administrationTool'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 3-Click on link administrationTool - Navigate to page gssoadmin.png')

"Step 4: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 4-Click on button superUser.png')

"Step 5: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 5-Click on link logout - Navigate to page dashboard.png')

"Step 6: Click on button clarioApps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_clarioApps'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 6-Click on button clarioApps.png')

"Step 7: Click on link administrationTool -> Navigate to page '/gssoadmin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_administrationTool'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 7-Click on link administrationTool - Navigate to page gssoadmin.png')

"Step 8: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 8-Click on button superUser.png')

"Step 9: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 9-Click on link logout - Navigate to page dashboard.png')

"Step 10: Click on button clarioApps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_clarioApps'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 10-Click on button clarioApps.png')

"Step 11: Click on link administrationTool -> Navigate to page '/gssoadmin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_administrationTool'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 11-Click on link administrationTool - Navigate to page gssoadmin.png')

"Step 12: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 12-Click on button superUser.png')

"Step 13: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 13-Click on link logout - Navigate to page dashboard.png')

"Step 14: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 14-Click on button selectStudyOrOrganization.png')

"Step 15: Click on button clarioApps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_clarioApps'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 15-Click on button clarioApps.png')

"Step 16: Click on link administrationTool -> Navigate to page '/gssoadmin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_administrationTool'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 16-Click on link administrationTool - Navigate to page gssoadmin.png')

"Step 17: Click on link companyLogo -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/link_companyLogo'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 17-Click on link companyLogo - Navigate to page dashboard.png')

"Step 18: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 18-Click on button superUser.png')

"Step 19: Click on link logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 19-Click on link logout.png')

"Step 20: Click on button clarioApps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_clarioApps'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 20-Click on button clarioApps.png')

"Step 21: Click on link administrationTool -> Navigate to page '/gssoadmin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_administrationTool'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 21-Click on link administrationTool - Navigate to page gssoadmin.png')

"Step 22: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 22-Click on button superUser.png')

"Step 23: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 23-Click on link logout - Navigate to page dashboard.png')

"Step 24: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 24-Click on button close.png')

"Step 25: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 25-Click on button selectStudyOrOrganization.png')

"Step 26: Click on button noSkipVisit -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_noSkipVisit'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 26-Click on button noSkipVisit - Navigate to page studiesdashboard.png')

"Step 27: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 27-Click on button close.png')

"Step 28: Click on link qualityControl3 -> Navigate to page '/studies/*/qc-worklist'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_qualityControl3'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 28-Click on link qualityControl3 - Navigate to page studiesqc-worklist.png')

"Step 29: Click on button superUserActions (testTrueTest)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_qc_worklist/button_superUserActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_qc_worklist/button_superUserActions', ['button_superUserActions_internalHasText': button_superUserActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 29-Click on button superUserActions testTrueTest.png')

"Step 30: Click on link logout2 -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/link_logout2'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 30-Click on link logout2 - Navigate to page dashboard.png')

"Step 31: Click on button clarioApps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_clarioApps'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 31-Click on button clarioApps.png')

"Step 32: Click on link administrationTool -> Navigate to page '/gssoadmin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_administrationTool'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 32-Click on link administrationTool - Navigate to page gssoadmin.png')

"Step 33: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 33-Click on button superUser.png')

"Step 34: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 34-Click on link logout - Navigate to page dashboard.png')

"Step 35: Click on button clarioApps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_clarioApps'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 35-Click on button clarioApps.png')

"Step 36: Click on link administrationTool2 -> Navigate to page '/gssoadmin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_administrationTool2'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 36-Click on link administrationTool2 - Navigate to page gssoadmin.png')

"Step 37: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 37-Click on button superUser.png')

"Step 38: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 38-Click on link logout - Navigate to page dashboard.png')

"Step 39: Click on button clarioApps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_clarioApps'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 39-Click on button clarioApps.png')

"Step 40: Click on link administrationTool -> Navigate to page '/gssoadmin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_administrationTool'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 40-Click on link administrationTool - Navigate to page gssoadmin.png')

"Step 41: Click on button superUser -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC158/Step 41-Click on button superUser - Navigate to page .png')

"Step 42: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC158-Access Administration Tool and Logout as Super User_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}