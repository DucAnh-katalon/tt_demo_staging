import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 2: Click on div uploaderActionBar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_actionBar_1'))

// WebUI.takeScreenshot(reportLocation + '/TC157/Step 2-Click on div uploaderActionBar.png')

"Step 3: Select study or organization and apply a filter to the list"

selectStudyOrOrganizationAndApplyFilter.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on td studyProtocol -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/td_studyProtocol'))

// WebUI.takeScreenshot(reportLocation + '/TC157/Step 4-Click on td studyProtocol - Navigate to page studiesdashboard.png')

"Step 5: Click on link studyLinks (qualityControl)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 5-Click on link studyLinks qualityControl.png')

"Step 6: Click on div subjectDetails (subjectStatus2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_subjectDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_subjectDetails', ['div_subjectDetails_trNthChild': div_subjectDetails_trNthChild, 'div_subjectDetails_trNthOfType': div_subjectDetails_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC157/Step 6-Click on div subjectDetails subjectStatus2.png')

"Step 7: Select option with input value from select qcWorklistFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_qcWorklistFilter'), select_qcWorklistFilter)

WebUI.takeScreenshot(reportLocation + '/TC157/Step 7-Select option with input value from select qcWorklistFilter.png')

"Step 8: Click on input subjectIdFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectIdFilter'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 8-Click on input subjectIdFilter.png')

"Step 9: Enter input value in input subjectIdFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectIdFilter'), input_subjectIdFilter)

WebUI.takeScreenshot(reportLocation + '/TC157/Step 9-Enter input value in input subjectIdFilter.png')

"Step 10: Click on button apply3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply3'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 10-Click on button apply3.png')

"Step 11: Click on td visitDetails (visit2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_visitDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_visitDetails', ['td_visitDetails_trNthChild': td_visitDetails_trNthChild, 'td_visitDetails_trNthOfType': td_visitDetails_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC157/Step 11-Click on td visitDetails visit2.png')

"Step 12: Select option with input value from select qcWorklistFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_qcWorklistFilter'), select_qcWorklistFilter_1)

WebUI.takeScreenshot(reportLocation + '/TC157/Step 12-Select option with input value from select qcWorklistFilter.png')

"Step 13: Click on input visitFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectIdFilter'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 13-Click on input visitFilter.png')

"Step 14: Enter input value in input visitFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectIdFilter'), input_visitFilter)

WebUI.takeScreenshot(reportLocation + '/TC157/Step 14-Enter input value in input visitFilter.png')

"Step 15: Click on button apply4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply4'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 15-Click on button apply4.png')

"Step 16: Click on faIcon object14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object14'))

// WebUI.takeScreenshot(reportLocation + '/TC157/Step 16-Click on faIcon object14.png')

"Step 17: Click on link openWorkitems (openQcWorkitem)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_openWorkitems"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_openWorkitems', ['link_openWorkitems_dataTestid': link_openWorkitems_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 17-Click on link openWorkitems openQcWorkitem.png')

"Step 18: Click on button taskManagement (onHold)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_taskManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_taskManagement', ['button_taskManagement_class': button_taskManagement_class, 'button_taskManagement_dataTestid': button_taskManagement_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 18-Click on button taskManagement onHold.png')

"Step 19: Click on textarea enter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_enter'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 19-Click on textarea enter.png')

"Step 20: Enter input value in textarea enter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_enter'), textarea_enter)

WebUI.takeScreenshot(reportLocation + '/TC157/Step 20-Enter input value in textarea enter.png')

"Step 21: Click on div save -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_save'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 21-Click on div save - Navigate to page dashboard.png')

"Step 22: Click on div actionbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_actionbar'))

// WebUI.takeScreenshot(reportLocation + '/TC157/Step 22-Click on div actionbar.png')

"Step 23: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 23-Click on button selectStudyOrOrganization.png')

"Step 24: Click on button studyActions (dontDelEditAutoStudy) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 24-Click on button studyActions dontDelEditAutoStudy - Navigate to page studiesdashboard.png')

"Step 25: Click on link studyLinks (qualityControl)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_1, 'link_studyLinks_class': link_studyLinks_class_1, 'link_studyLinks_href_variable': link_studyLinks_href_variable_1, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC157/Step 25-Click on link studyLinks qualityControl.png')

"Step 26: Click on div qualityControlWorkList -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_qualityControlWorkList'))

// WebUI.takeScreenshot(reportLocation + '/TC157/Step 26-Click on div qualityControlWorkList - Navigate to page .png')

"Step 27: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC157-Filter and Manage Quality Control Worklist_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}