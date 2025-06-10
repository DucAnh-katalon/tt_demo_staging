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

"Step 2: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 2-Click on button selectStudyOrOrganization.png')

"Step 3: Click on button studyActions (regressionStudy) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 3-Click on button studyActions regressionStudy - Navigate to page studiesdashboard.png')

"Step 4: Click on link qualityControl3 -> Navigate to page '/studies/*/qc-worklist'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_qualityControl3'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 4-Click on link qualityControl3 - Navigate to page studiesqc-worklist.png')

"Step 5: Click on button continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/button_continue'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 5-Click on button continue.png')

"Step 6: Click on button superUserActions (superUser2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_qc_worklist/button_superUserActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_qc_worklist/button_superUserActions', ['button_superUserActions_internalHasText': button_superUserActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 6-Click on button superUserActions superUser2.png')

"Step 7: Click on link logout2 -> Navigate to page '/gateway'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/link_logout2'))

WebUI.takeScreenshot(reportLocation + '/TC54/Step 7-Click on link logout2 - Navigate to page gateway.png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC54-Perform Quality Control Actions on Studies_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}