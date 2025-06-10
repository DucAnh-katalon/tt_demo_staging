import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /studies/*/subjects-list-study/*/combined-view with params (studyId)"

TrueTestScripts.navigate("/studies/${studies_id}/subjects-list-study/${subjects_list_study_id}/combined-view", ["studyId": combined_view_studyId])

"Step 2: Click on div loadingIndicator -> Navigate to page '/studies/*/subjects-list-study'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/div_loadingIndicator'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 2-Click on div loadingIndicator - Navigate to page studiessubjects-list-study.png')

"Step 3: Click on td subjectId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/td_subjectId'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 3-Click on td subjectId.png')

"Step 4: Click on button viewData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_viewData'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 4-Click on button viewData.png')

"Step 5: Click on button studyActions (screeningDateTime)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_studyActions', ['button_studyActions_class': button_studyActions_class, 'button_studyActions_dataTestid': button_studyActions_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 5-Click on button studyActions screeningDateTime.png')

"Step 6: Click on button sessionData (sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData', ['button_sessionData_internalText': button_sessionData_internalText, 'button_sessionData_type': button_sessionData_type]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 6-Click on button sessionData sessions.png')

"Step 7: Click on button sessionData (data)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData', ['button_sessionData_internalText': button_sessionData_internalText_1, 'button_sessionData_type': button_sessionData_type_1]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 7-Click on button sessionData data.png')

"Step 8: Click on button previousPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_previousPage'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 8-Click on button previousPage.png')

"Step 9: Click on button subjectId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_subjectId'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 9-Click on button subjectId.png')

"Step 10: Click on td subjectId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/td_subjectId'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 10-Click on td subjectId2.png')

"Step 11: Click on button viewData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_viewData'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 11-Click on button viewData.png')

"Step 12: Click on button cycleScreeningForms (mrForm)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_cycleScreeningForms"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_cycleScreeningForms', ['button_cycleScreeningForms_buttonNthOfType': button_cycleScreeningForms_buttonNthOfType, 'button_cycleScreeningForms_class': button_cycleScreeningForms_class, 'button_cycleScreeningForms_dataTestid': button_cycleScreeningForms_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 12-Click on button cycleScreeningForms mrForm.png')

"Step 13: Click on button cycleScreeningForms (petForm)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_cycleScreeningForms"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_cycleScreeningForms', ['button_cycleScreeningForms_buttonNthOfType': button_cycleScreeningForms_buttonNthOfType_1, 'button_cycleScreeningForms_class': button_cycleScreeningForms_class_1, 'button_cycleScreeningForms_dataTestid': button_cycleScreeningForms_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 13-Click on button cycleScreeningForms petForm.png')

"Step 14: Click on button sessionData (sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData', ['button_sessionData_internalText': button_sessionData_internalText_2, 'button_sessionData_type': button_sessionData_type_2]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 14-Click on button sessionData sessions.png')

"Step 15: Click on button sessionData (data)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData', ['button_sessionData_internalText': button_sessionData_internalText_3, 'button_sessionData_type': button_sessionData_type_3]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 15-Click on button sessionData data.png')

"Step 16: Click on button cycleScreeningForms (cycle1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_cycleScreeningForms"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_cycleScreeningForms', ['button_cycleScreeningForms_buttonNthOfType': button_cycleScreeningForms_buttonNthOfType_2, 'button_cycleScreeningForms_class': button_cycleScreeningForms_class_2, 'button_cycleScreeningForms_dataTestid': button_cycleScreeningForms_dataTestid_2]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 16-Click on button cycleScreeningForms cycle1.png')

"Step 17: Click on button cycleScreeningForms (screening)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_cycleScreeningForms"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_cycleScreeningForms', ['button_cycleScreeningForms_buttonNthOfType': button_cycleScreeningForms_buttonNthOfType_3, 'button_cycleScreeningForms_class': button_cycleScreeningForms_class_3, 'button_cycleScreeningForms_dataTestid': button_cycleScreeningForms_dataTestid_3]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 17-Click on button cycleScreeningForms screening.png')

"Step 18: Click on button studyActions (petFormAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_studyActions', ['button_studyActions_class': button_studyActions_class_1, 'button_studyActions_dataTestid': button_studyActions_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 18-Click on button studyActions petFormAction.png')

"Step 19: Click on div loadingIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_loadingIndicator'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 19-Click on div loadingIndicator.png')

"Step 20: Click on button createSubject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_createSubject'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 20-Click on button createSubject.png')

"Step 21: Click on div subjectDetailsModalSiteInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_subjectDetailsModalSiteInput'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 21-Click on div subjectDetailsModalSiteInput.png')

"Step 22: Click on div listbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_listbox'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 22-Click on div listbox.png')

"Step 23: Click on input subjectId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_subjectId2'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 23-Click on input subjectId2.png')

"Step 24: Enter input value in input subjectId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_subjectId2'), input_subjectId2)

WebUI.takeScreenshot(reportLocation + '/TC78/Step 24-Enter input value in input subjectId2.png')

"Step 25: Click on button openCalendar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_openCalendar'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 25-Click on button openCalendar.png')

"Step 26: Click on div datePicker"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_datePicker'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 26-Click on div datePicker.png')

"Step 27: Click on button dateTimeSelection (dateTime)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_dateTimeSelection', ['button_dateTimeSelection_buttonNthOfType': button_dateTimeSelection_buttonNthOfType, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 27-Click on button dateTimeSelection dateTime.png')

"Step 28: Click on div languageDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_languageDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 28-Click on div languageDetails.png')

"Step 29: Click on div languageOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_languageOption'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 29-Click on div languageOption.png')

"Step 30: Click on div timezoneDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_timezoneDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 30-Click on div timezoneDetails.png')

"Step 31: Click on div timezoneOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_timezoneOption'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 31-Click on div timezoneOption.png')

"Step 32: Click on button submitData2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submitData2'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 32-Click on button submitData2.png')

"Step 33: Click on input subjectId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_subjectId2'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 33-Click on input subjectId2.png')

"Step 34: Enter input value in input subjectId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_subjectId2'), input_subjectId2_1)

WebUI.takeScreenshot(reportLocation + '/TC78/Step 34-Enter input value in input subjectId2.png')

"Step 35: Click on button submitData2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submitData2'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 35-Click on button submitData2.png')

"Step 36: Click on div subjectsHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_subjectsHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 36-Click on div subjectsHeader.png')

"Step 37: Click on input filterValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_filterValue'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 37-Click on input filterValue.png')

"Step 38: Enter input value in input filterValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_filterValue'), input_filterValue)

WebUI.takeScreenshot(reportLocation + '/TC78/Step 38-Enter input value in input filterValue.png')

"Step 39: Press key Enter on input filterValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_filterValue'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 39-Press key Enter on input filterValue.png')

"Step 40: Enter input value in input filterValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_filterValue'), input_filterValue_1)

WebUI.takeScreenshot(reportLocation + '/TC78/Step 40-Enter input value in input filterValue.png')

"Step 41: Press key Enter on input filterValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_filterValue'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 41-Press key Enter on input filterValue.png')

"Step 42: Enter input value in input filterValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_filterValue'), input_filterValue_2)

WebUI.takeScreenshot(reportLocation + '/TC78/Step 42-Enter input value in input filterValue.png')

"Step 43: Click on td subjectId3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/td_subjectId4'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 43-Click on td subjectId3.png')

"Step 44: Click on link startWorkflow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/link_startWorkflow'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 44-Click on link startWorkflow.png')

"Step 45: Click on link visitWorkflows (visitWorkflowPlay)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/link_visitWorkflows"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/link_visitWorkflows', ['link_visitWorkflows_appActivitiesTypeNthOfType': link_visitWorkflows_appActivitiesTypeNthOfType, 'link_visitWorkflows_dataTestid': link_visitWorkflows_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 45-Click on link visitWorkflows visitWorkflowPlay.png')

"Step 46: Click on input basicTextQuestion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_basicTextQuestion'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 46-Click on input basicTextQuestion.png')

"Step 47: Enter input value in input basicTextQuestion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_basicTextQuestion'), input_basicTextQuestion)

WebUI.takeScreenshot(reportLocation + '/TC78/Step 47-Enter input value in input basicTextQuestion.png')

"Step 48: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 48-Click on button submit.png')

"Step 49: Click on faIcon visitWorkflowBack"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_visitWorkflowBack'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 49-Click on faIcon visitWorkflowBack.png')

"Step 50: Click on link continueWorkflow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/link_continueWorkflow'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 50-Click on link continueWorkflow.png')

"Step 51: Click on faIcon visitWorkflowPlay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_visitWorkflowPlay'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 51-Click on faIcon visitWorkflowPlay.png')

"Step 52: Click on div basicTextQuestionLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_basicTextQuestionLabel'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 52-Click on div basicTextQuestionLabel.png')

"Step 53: Click on input basicTextQuestion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_basicTextQuestion'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 53-Click on input basicTextQuestion.png')

"Step 54: Enter input value in input basicTextQuestion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_basicTextQuestion'), input_basicTextQuestion_1)

WebUI.takeScreenshot(reportLocation + '/TC78/Step 54-Enter input value in input basicTextQuestion.png')

"Step 55: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 55-Click on button submit.png')

"Step 56: Click on link visitWorkflows (visitWorkflowPlay2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/link_visitWorkflows"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/link_visitWorkflows', ['link_visitWorkflows_appActivitiesTypeNthOfType': link_visitWorkflows_appActivitiesTypeNthOfType_1, 'link_visitWorkflows_dataTestid': link_visitWorkflows_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 56-Click on link visitWorkflows visitWorkflowPlay2.png')

"Step 57: Click on input basicTextQuestion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_basicTextQuestion'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 57-Click on input basicTextQuestion.png')

"Step 58: Enter input value in input basicTextQuestion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_basicTextQuestion'), input_basicTextQuestion_2)

WebUI.takeScreenshot(reportLocation + '/TC78/Step 58-Enter input value in input basicTextQuestion.png')

"Step 59: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 59-Click on button submit.png')

"Step 60: Click on faIcon visitWorkflowBack"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_visitWorkflowBack'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 60-Click on faIcon visitWorkflowBack.png')

"Step 61: Click on button viewData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_viewData'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 61-Click on button viewData.png')

"Step 62: Click on button sessionData (sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData', ['button_sessionData_internalText': button_sessionData_internalText_4, 'button_sessionData_type': button_sessionData_type_4]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 62-Click on button sessionData sessions.png')

"Step 63: Click on button sessionData (data)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData', ['button_sessionData_internalText': button_sessionData_internalText_5, 'button_sessionData_type': button_sessionData_type_5]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 63-Click on button sessionData data.png')

"Step 64: Click on button visitsTab"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_visitsTab'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 64-Click on button visitsTab.png')

"Step 65: Click on link startWorkflow2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/link_startWorkflow2'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 65-Click on link startWorkflow2.png')

"Step 66: Click on button cancelVisit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_cancelVisit'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 66-Click on button cancelVisit.png')

"Step 67: Click on link cancelVisitPopup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/link_cancelVisitPopup'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 67-Click on link cancelVisitPopup.png')

"Step 68: Click on link cancelVisitPopup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/link_cancelVisitPopup'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 68-Click on link cancelVisitPopup.png')

"Step 69: Click on button viewData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_viewData'))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 69-Click on button viewData.png')

"Step 70: Click on button sessionData (sessions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData', ['button_sessionData_internalText': button_sessionData_internalText_6, 'button_sessionData_type': button_sessionData_type_6]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 70-Click on button sessionData sessions.png')

"Step 71: Click on button sessionData (data)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_sessionData', ['button_sessionData_internalText': button_sessionData_internalText_7, 'button_sessionData_type': button_sessionData_type_7]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 71-Click on button sessionData data.png')

"Step 72: Click on button cycleScreeningForms (cycle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_cycleScreeningForms"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_cycleScreeningForms', ['button_cycleScreeningForms_buttonNthOfType': button_cycleScreeningForms_buttonNthOfType_4, 'button_cycleScreeningForms_class': button_cycleScreeningForms_class_4, 'button_cycleScreeningForms_dataTestid': button_cycleScreeningForms_dataTestid_4]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 72-Click on button cycleScreeningForms cycle.png')

"Step 73: Click on button cycleScreeningForms (screening2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_cycleScreeningForms"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_cycleScreeningForms', ['button_cycleScreeningForms_buttonNthOfType': button_cycleScreeningForms_buttonNthOfType_5, 'button_cycleScreeningForms_class': button_cycleScreeningForms_class_5, 'button_cycleScreeningForms_dataTestid': button_cycleScreeningForms_dataTestid_5]))

WebUI.takeScreenshot(reportLocation + '/TC78/Step 73-Click on button cycleScreeningForms screening2 - Navigate to page .png')

"Step 74: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC78-Manage Subjects and Workflows in Study Combined View_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}