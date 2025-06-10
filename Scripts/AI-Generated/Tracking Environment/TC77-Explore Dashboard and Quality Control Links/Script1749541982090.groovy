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

"Step 2: Click on link studies2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_studies2'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 2-Click on link studies2.png')

"Step 3: Click on div dashboardSections (sites)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dashboardSections', ['div_dashboardSections_dataTestid': div_dashboardSections_dataTestid]))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 3-Click on div dashboardSections sites.png')

"Step 4: Click on div dataUploadSections (siteAssessment)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dataUploadSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dataUploadSections', ['div_dataUploadSections_dataTestid': div_dataUploadSections_dataTestid]))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 4-Click on div dataUploadSections siteAssessment.png')

"Step 5: Click on div dashboardSections (forms)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dashboardSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dashboardSections', ['div_dashboardSections_dataTestid': div_dashboardSections_dataTestid_1]))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 5-Click on div dashboardSections forms.png')

"Step 6: Click on div dataUploadSections (visitSchedule)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dataUploadSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dataUploadSections', ['div_dataUploadSections_dataTestid': div_dataUploadSections_dataTestid_1]))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 6-Click on div dataUploadSections visitSchedule.png')

"Step 7: Click on div dataUploadSections (dataNotificationAndRules)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dataUploadSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dataUploadSections', ['div_dataUploadSections_dataTestid': div_dataUploadSections_dataTestid_2]))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 7-Click on div dataUploadSections dataNotificationAndRules.png')

"Step 8: Click on div dataUploadSections (dataUpload)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dataUploadSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dataUploadSections', ['div_dataUploadSections_dataTestid': div_dataUploadSections_dataTestid_3]))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 8-Click on div dataUploadSections dataUpload.png')

"Step 9: Click on div dataUploadSections (dataUpload2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dataUploadSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dataUploadSections', ['div_dataUploadSections_dataTestid': div_dataUploadSections_dataTestid_4]))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 9-Click on div dataUploadSections dataUpload2.png')

"Step 10: Click on div qualityControl -> Navigate to page '/studies/*/imaging-study-config'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_qualityControl'))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 10-Click on div qualityControl - Navigate to page studiesimaging-study-config.png')

"Step 11: Click on link studyLink -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/link_studyLink'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 11-Click on link studyLink - Navigate to page studiesdashboard.png')

"Step 12: Click on link studyLinks (subjects4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_href_variable': link_studyLinks_href_variable]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 12-Click on link studyLinks subjects4.png')

"Step 13: Click on link studyLinks (subjects4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_1, 'link_studyLinks_href_variable': link_studyLinks_href_variable_1]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 13-Click on link studyLinks subjects4.png')

"Step 14: Click on link studyLinks (subjects4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_2, 'link_studyLinks_href_variable': link_studyLinks_href_variable_2]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 14-Click on link studyLinks subjects4.png')

"Step 15: Click on faIcon actionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_actionButton'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 15-Click on faIcon actionButton.png')

"Step 16: Click on faIcon toastButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_toastButton'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 16-Click on faIcon toastButton.png')

"Step 17: Click on faIcon actionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_actionButton'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 17-Click on faIcon actionButton.png')

"Step 18: Click on link studyConfiguration2 -> Navigate to page '/studies/*/imaging-study-config'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_studyConfiguration2'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 18-Click on link studyConfiguration2 - Navigate to page studiesimaging-study-config.png')

"Step 19: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 19-Click on link home - Navigate to page dashboard.png')

"Step 20: Click on link qualityControlLinks (qualityControl)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks', ['link_qualityControlLinks_aTitle': link_qualityControlLinks_aTitle]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 20-Click on link qualityControlLinks qualityControl.png')

"Step 21: Click on faIcon tableHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_tableHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 21-Click on faIcon tableHeader.png')

"Step 22: Click on link openWorkItems (openQcWorkitem)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_openWorkItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_openWorkItems', ['link_openWorkItems_dataTestid': link_openWorkItems_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 22-Click on link openWorkItems openQcWorkitem.png')

"Step 23: Click on faIcon headerIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_headerIcon'))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 23-Click on faIcon headerIcon.png')

"Step 24: Click on faIcon tableAction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_tableAction'))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 24-Click on faIcon tableAction.png')

"Step 25: Click on link openWorkItems (openQcWorkitem2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_openWorkItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_openWorkItems', ['link_openWorkItems_dataTestid': link_openWorkItems_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 25-Click on link openWorkItems openQcWorkitem2.png')

"Step 26: Click on div openStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_openStatus'))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 26-Click on div openStatus.png')

"Step 27: Click on div examDiagnosticQualityFail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_examDiagnosticQualityFail'))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 27-Click on div examDiagnosticQualityFail.png')

"Step 28: Click on span sponsorRecipientTest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_sponsorRecipientTest'))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 28-Click on span sponsorRecipientTest.png')

"Step 29: Click on div studyCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_studyCode'))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 29-Click on div studyCode.png')

"Step 30: Click on button openViewer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_openViewer'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 30-Click on button openViewer.png')

"Step 31: Click on button openViewer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_openViewer'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 31-Click on button openViewer.png')

"Step 32: Click on button openViewer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_openViewer'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 32-Click on button openViewer.png')

"Step 33: Click on button openViewer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_openViewer'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 33-Click on button openViewer.png')

"Step 34: Click on button openViewer -> Navigate to page '/qc-worklist/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_openViewer'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 34-Click on button openViewer - Navigate to page qc-worklist.png')

"Step 35: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_qc_worklist/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 35-Click on link home - Navigate to page dashboard.png')

"Step 36: Click on button administration3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration3'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 36-Click on button administration3.png')

"Step 37: Click on link sites4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_sites4'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 37-Click on link sites4.png')

"Step 38: Click on span siteName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_siteName'))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 38-Click on span siteName.png')

"Step 39: Click on td study"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/td_study'))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 39-Click on td study.png')

"Step 40: Click on button siteUsers -> Navigate to page '/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_siteUsers'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 40-Click on button siteUsers - Navigate to page siteservice-servicesite-assessments.png')

"Step 41: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_siteservice_service_site_assessments/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 41-Click on link home - Navigate to page dashboard.png')

"Step 42: Click on button development3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_development3'))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 42-Click on button development3.png')

"Step 43: Click on link templateLinks (modfedPage1) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks', ['link_templateLinks_aTitle': link_templateLinks_aTitle]))

WebUI.takeScreenshot(reportLocation + '/TC77/Step 43-Click on link templateLinks modfedPage1 - Navigate to page .png')

"Step 44: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC77-Explore Dashboard and Quality Control Links_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}