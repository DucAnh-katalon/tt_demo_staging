import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.selectStudyAndViewSubjectDetails
import truetest.Tracking_Environment.common.selectStudyOrOrganizationAndApplyFilter
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

"Step 2: Select study or organization and apply a filter to the list"

selectStudyOrOrganizationAndApplyFilter.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on td studyProtocol2 -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/td_studyProtocol2'))

// WebUI.takeScreenshot(reportLocation + '/TC85/Step 3-Click on td studyProtocol2 - Navigate to page studiesdashboard.png')

"Step 4: Click on link qualityControl3 -> Navigate to page '/studies/*/qc-worklist'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_qualityControl3'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 4-Click on link qualityControl3 - Navigate to page studiesqc-worklist.png')

"Step 5: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 5-Click on link home - Navigate to page dashboard.png')

"Step 6: Click on div globalDashboard2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_globalDashboard'))

// WebUI.takeScreenshot(reportLocation + '/TC85/Step 6-Click on div globalDashboard2.png')

"Step 7: Select study and view subject details"

selectStudyAndViewSubjectDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 8: Select option with input value from select filter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_filter'), select_filter)

WebUI.takeScreenshot(reportLocation + '/TC85/Step 8-Select option with input value from select filter.png')

"Step 9: Click on input subjectId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectId2'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 9-Click on input subjectId2.png')

"Step 10: Enter input value in input subjectId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectId2'), input_subjectId2)

WebUI.takeScreenshot(reportLocation + '/TC85/Step 10-Enter input value in input subjectId2.png')

"Step 11: Click on button apply3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply3'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 11-Click on button apply3.png')

"Step 12: Click on td siteSubjectIds (subjectId22)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_siteSubjectIds"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_siteSubjectIds', ['td_siteSubjectIds_tdNthChild': td_siteSubjectIds_tdNthChild, 'td_siteSubjectIds_tdNthOfType': td_siteSubjectIds_tdNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC85/Step 12-Click on td siteSubjectIds subjectId22.png')

"Step 13: Click on td siteSubjectIds (subjectId22)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_siteSubjectIds"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_siteSubjectIds', ['td_siteSubjectIds_tdNthChild': td_siteSubjectIds_tdNthChild_1, 'td_siteSubjectIds_tdNthOfType': td_siteSubjectIds_tdNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC85/Step 13-Click on td siteSubjectIds subjectId22.png')

"Step 14: Click on link viewMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_viewMore'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 14-Click on link viewMore.png')

"Step 15: Click on button taskManagement (takeTask)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_taskManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_taskManagement', ['button_taskManagement_class': button_taskManagement_class, 'button_taskManagement_dataTestid': button_taskManagement_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 15-Click on button taskManagement takeTask.png')

"Step 16: Click on button taskManagement (openViewer)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_taskManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_taskManagement', ['button_taskManagement_class': button_taskManagement_class_1, 'button_taskManagement_dataTestid': button_taskManagement_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 16-Click on button taskManagement openViewer.png')

"Step 17: Click on button qcComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_qcComment'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 17-Click on button qcComment.png')

"Step 18: Click on textarea addQcComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_addQcComment'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 18-Click on textarea addQcComment.png')

"Step 19: Enter input value in textarea addQcComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_addQcComment'), textarea_addQcComment)

WebUI.takeScreenshot(reportLocation + '/TC85/Step 19-Enter input value in textarea addQcComment.png')

"Step 20: Click on textarea addQcComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_addQcComment'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 20-Click on textarea addQcComment.png')

"Step 21: Enter input value in textarea addQcComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_addQcComment'), textarea_addQcComment_1)

WebUI.takeScreenshot(reportLocation + '/TC85/Step 21-Enter input value in textarea addQcComment.png')

"Step 22: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 22-Click on button save2.png')

"Step 23: Click on button taskSummary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_taskSummary'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 23-Click on button taskSummary.png')

"Step 24: Click on div qcCommentsBaseline"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_qcComments'))

// WebUI.takeScreenshot(reportLocation + '/TC85/Step 24-Click on div qcCommentsBaseline.png')

"Step 25: Click on button qualityControlForms"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_qualityControlForms'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 25-Click on button qualityControlForms.png')

"Step 26: Click on button pass -> Navigate to page '/studies/*/qc-worklist'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_pass'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 26-Click on button pass - Navigate to page studiesqc-worklist.png')

"Step 27: Click on button superUserActions (scrSuperUser)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_qc_worklist/button_superUserActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_qc_worklist/button_superUserActions', ['button_superUserActions_internalHasText': button_superUserActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 27-Click on button superUserActions scrSuperUser.png')

"Step 28: Click on link logout2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/link_logout2'))

WebUI.takeScreenshot(reportLocation + '/TC85/Step 28-Click on link logout2 - Navigate to page .png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC85-Manage Quality Control Comments and Tasks_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}