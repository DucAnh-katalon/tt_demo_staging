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

"Step 3: Click on span dontDelEditAutoStudy -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_dontDelEditAutoStudy'))

// WebUI.takeScreenshot(reportLocation + '/TC164/Step 3-Click on span dontDelEditAutoStudy - Navigate to page studiesdashboard.png')

"Step 4: Click on link studyLinks (imageReads)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 4-Click on link studyLinks imageReads.png')

"Step 5: Select option with input value from select readWorklistFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_readWorklistFilter'), select_readWorklistFilter)

WebUI.takeScreenshot(reportLocation + '/TC164/Step 5-Select option with input value from select readWorklistFilter.png')

"Step 6: Click on input readWorklistFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_readWorklistFilter'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 6-Click on input readWorklistFilter.png')

"Step 7: Click on input readWorklistFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_readWorklistFilter'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 7-Click on input readWorklistFilter.png')

"Step 8: Enter input value in input readWorklistFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_readWorklistFilter'), input_readWorklistFilter)

WebUI.takeScreenshot(reportLocation + '/TC164/Step 8-Enter input value in input readWorklistFilter.png')

"Step 9: Click on button applyFilter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_applyFilter2'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 9-Click on button applyFilter2.png')

"Step 10: Click on faIcon object17"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object17'))

// WebUI.takeScreenshot(reportLocation + '/TC164/Step 10-Click on faIcon object17.png')

"Step 11: Click on link openWorkitems (view5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_openWorkitems"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_openWorkitems', ['link_openWorkitems_dataTestid': link_openWorkitems_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 11-Click on link openWorkitems view5.png')

"Step 12: Click on textarea addNote"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_addNote'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 12-Click on textarea addNote.png')

"Step 13: Enter input value in textarea addNote"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_addNote'), textarea_addNote)

WebUI.takeScreenshot(reportLocation + '/TC164/Step 13-Enter input value in textarea addNote.png')

"Step 14: Click on button saveNote"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_saveNote'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 14-Click on button saveNote.png')

"Step 15: Click on button complete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_complete2'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 15-Click on button complete2.png')

"Step 16: Click on div readFormError"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_readFormError'))

// WebUI.takeScreenshot(reportLocation + '/TC164/Step 16-Click on div readFormError.png')

"Step 17: Click on appReadWorkitem object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/appReadWorkitem_object'))

// WebUI.takeScreenshot(reportLocation + '/TC164/Step 17-Click on appReadWorkitem object.png')

"Step 18: Click on button complete2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_complete2'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 18-Click on button complete2.png')

"Step 19: Click on div avatar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_avatar'))

// WebUI.takeScreenshot(reportLocation + '/TC164/Step 19-Click on div avatar.png')

"Step 20: Click on appReadWorkitem object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/appReadWorkitem_object'))

// WebUI.takeScreenshot(reportLocation + '/TC164/Step 20-Click on appReadWorkitem object2.png')

"Step 21: Click on div headerDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_headerDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC164/Step 21-Click on div headerDetails.png')

"Step 22: Click on faIcon object18"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object18'))

// WebUI.takeScreenshot(reportLocation + '/TC164/Step 22-Click on faIcon object18.png')

"Step 23: Select option with input value from select filter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_filter2'), select_filter2)

WebUI.takeScreenshot(reportLocation + '/TC164/Step 23-Select option with input value from select filter2.png')

"Step 24: Click on div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_object6'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 24-Click on div object6.png')

"Step 25: Click on div completedOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_completedOption'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 25-Click on div completedOption.png')

"Step 26: Click on button applyFilter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_applyFilter2'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 26-Click on button applyFilter2.png')

"Step 27: Select option with input value from select filter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_filter2'), select_filter2_1)

WebUI.takeScreenshot(reportLocation + '/TC164/Step 27-Select option with input value from select filter2.png')

"Step 28: Click on input subjectFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectFilter'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 28-Click on input subjectFilter.png')

"Step 29: Enter input value in input subjectFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectFilter'), input_subjectFilter)

WebUI.takeScreenshot(reportLocation + '/TC164/Step 29-Enter input value in input subjectFilter.png')

"Step 30: Click on button applyFilter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_applyFilter3'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 30-Click on button applyFilter3.png')

"Step 31: Click on appReadWorkitemTableStatus status -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/appReadWorkitemTableStatus_status'))

// WebUI.takeScreenshot(reportLocation + '/TC164/Step 31-Click on appReadWorkitemTableStatus status - Navigate to page dashboard.png')

"Step 32: Click on div actionbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_actionbar'))

// WebUI.takeScreenshot(reportLocation + '/TC164/Step 32-Click on div actionbar.png')

"Step 33: Select study and view subject details"

selectStudyAndViewSubjectDetails.execute(data_path_1, Integer.valueOf(index_1))

"Step 34: Select option with input value from select qcFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_qcFilter'), select_qcFilter)

WebUI.takeScreenshot(reportLocation + '/TC164/Step 34-Select option with input value from select qcFilter.png')

"Step 35: Click on input subjectIdFilter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectIdFilter2'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 35-Click on input subjectIdFilter2.png')

"Step 36: Enter input value in input subjectIdFilter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectIdFilter2'), input_subjectIdFilter2)

WebUI.takeScreenshot(reportLocation + '/TC164/Step 36-Enter input value in input subjectIdFilter2.png')

"Step 37: Click on button apply3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply3'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 37-Click on button apply3.png')

"Step 38: Click on td subjectId5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/td_subjectId5'))

// WebUI.takeScreenshot(reportLocation + '/TC164/Step 38-Click on td subjectId5.png')

"Step 39: Click on td subjectId5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/td_subjectId5'))

// WebUI.takeScreenshot(reportLocation + '/TC164/Step 39-Click on td subjectId5.png')

"Step 40: Click on button taskManagement (takeTask)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_taskManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_taskManagement', ['button_taskManagement_class': button_taskManagement_class, 'button_taskManagement_dataTestid': button_taskManagement_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 40-Click on button taskManagement takeTask.png')

"Step 41: Click on button qcComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_qcComment'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 41-Click on button qcComment.png')

"Step 42: Click on textarea qcComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_qcComment'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 42-Click on textarea qcComment.png')

"Step 43: Enter input value in textarea qcComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_qcComment'), textarea_qcComment)

WebUI.takeScreenshot(reportLocation + '/TC164/Step 43-Enter input value in textarea qcComment.png')

"Step 44: Click on textarea qcComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_qcComment'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 44-Click on textarea qcComment.png')

"Step 45: Enter input value in textarea qcComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_qcComment'), textarea_qcComment_1)

WebUI.takeScreenshot(reportLocation + '/TC164/Step 45-Enter input value in textarea qcComment.png')

"Step 46: Click on textarea qcComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_qcComment'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 46-Click on textarea qcComment.png')

"Step 47: Enter input value in textarea qcComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_qcComment'), textarea_qcComment_2)

WebUI.takeScreenshot(reportLocation + '/TC164/Step 47-Enter input value in textarea qcComment.png')

"Step 48: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 48-Click on button save2.png')

"Step 49: Click on button taskSummary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_taskSummary'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 49-Click on button taskSummary.png')

"Step 50: Click on div qcComments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_qcComments'))

// WebUI.takeScreenshot(reportLocation + '/TC164/Step 50-Click on div qcComments.png')

"Step 51: Click on button qualityControlForms"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_qualityControlForms'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 51-Click on button qualityControlForms.png')

"Step 52: Click on button pass"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_pass'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 52-Click on button pass.png')

"Step 53: Select option with input value from select qcFilter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_qcFilter2'), select_qcFilter2)

WebUI.takeScreenshot(reportLocation + '/TC164/Step 53-Select option with input value from select qcFilter2.png')

"Step 54: Click on div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_object7'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 54-Click on div object7.png')

"Step 55: Click on div completedOption2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_completedOption2'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 55-Click on div completedOption2.png')

"Step 56: Click on button apply3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply3'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 56-Click on button apply3.png')

"Step 57: Select option with input value from select qcFilter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_qcFilter2'), select_qcFilter2_1)

WebUI.takeScreenshot(reportLocation + '/TC164/Step 57-Select option with input value from select qcFilter2.png')

"Step 58: Click on input subjectIdFilter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectIdFilter3'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 58-Click on input subjectIdFilter3.png')

"Step 59: Enter input value in input subjectIdFilter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectIdFilter3'), input_subjectIdFilter3)

WebUI.takeScreenshot(reportLocation + '/TC164/Step 59-Enter input value in input subjectIdFilter3.png')

"Step 60: Click on button apply4 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply4'))

WebUI.takeScreenshot(reportLocation + '/TC164/Step 60-Click on button apply4 - Navigate to page .png')

"Step 61: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC164-Filter and Complete Workitems in Studies Dashboard_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}