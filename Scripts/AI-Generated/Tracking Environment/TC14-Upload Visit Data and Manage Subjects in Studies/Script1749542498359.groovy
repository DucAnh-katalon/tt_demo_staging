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

WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Click on button selectStudyOrOrganization.png')

"Step 3: Click on list quicklink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/list_quicklink'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on list quicklink.png')

"Step 4: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Click on button selectStudyOrOrganization.png')

"Step 5: Click on button scrSuperUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_scrSuperUser'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on button scrSuperUser.png')

"Step 6: Click on link logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Click on link logout.png')

"Step 7: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Click on button selectStudyOrOrganization.png')

"Step 8: Click on button studyActions (object) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Click on button studyActions object - Navigate to page studiesdashboard.png')

"Step 9: Click on link subjects -> Navigate to page '/studies/*/subjects-list-study'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_subjects'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Click on link subjects - Navigate to page studiessubjects-list-study.png')

"Step 10: Click on link object -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 10-Click on link object - Navigate to page studiesdashboard.png')

"Step 11: Click on link uploader -> Navigate to page '/studies/*/data-uploader'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_uploader'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 11-Click on link uploader - Navigate to page studiesdata-uploader.png')

"Step 12: Click on main object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_data_uploader/main_object'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 12-Click on main object.png')

"Step 13: Click on button createUnscheduledVisit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_data_uploader/button_createUnscheduledVisit'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 13-Click on button createUnscheduledVisit.png')

"Step 14: Select option with input value from select selectVisitPhase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_data_uploader/select_selectVisitPhase'), select_selectVisitPhase)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 14-Select option with input value from select selectVisitPhase.png')

"Step 15: Select option with input value from select selectSite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_data_uploader/select_selectSite'), select_selectSite)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 15-Select option with input value from select selectSite.png')

"Step 16: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_data_uploader/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 16-Click on div object.png')

"Step 17: Click on faIcon object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_data_uploader/faIcon_object'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 17-Click on faIcon object.png')

"Step 18: Click on link dynamicObject (object) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_data_uploader/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_data_uploader/link_dynamicObject', ['link_dynamicObject_internalText': link_dynamicObject_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 18-Click on link dynamicObject object - Navigate to page studiesdashboard.png')

"Step 19: Click on link studyLinks (subjects2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 19-Click on link studyLinks subjects2.png')

"Step 20: Click on td subjectId (subjectId2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_subjectId"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_subjectId', ['td_subjectId_tdNthChild': td_subjectId_tdNthChild, 'td_subjectId_tdNthOfType': td_subjectId_tdNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 20-Click on td subjectId subjectId2.png')

"Step 21: Click on faIcon visitSchedule"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_visitSchedule'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 21-Click on faIcon visitSchedule.png')

"Step 22: Click on link openUploader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_openUploader'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 22-Click on link openUploader.png')

"Step 23: Click on div subjectAndStudyInfo"

// WebUI.switchToWindowTitle('Upload Task')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_subjectAndStudyInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 23-Click on div subjectAndStudyInfo.png')

"Step 24: Click on button openCalendar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_openCalendar'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 24-Click on button openCalendar.png')

"Step 25: Click on div subjectAndStudyInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_subjectAndStudyInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 25-Click on div subjectAndStudyInfo.png')

"Step 26: Click on div subjectAndStudyInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_subjectAndStudyInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 26-Click on div subjectAndStudyInfo.png')

"Step 27: Click on div subjectId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_subjectId'))

// WebUI.switchToWindowIndex(0)

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 27-Click on div subjectId.png')

"Step 28: Click on faIcon visitSchedule"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_visitSchedule'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 28-Click on faIcon visitSchedule.png')

"Step 29: Click on link openUploader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_openUploader'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 29-Click on link openUploader.png')

"Step 30: Click on faIcon openCalendar"

WebUI.switchToWindowTitle('Upload Task')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 30-Click on faIcon openCalendar.png')

"Step 31: Click on button dateTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_selectDate'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 31-Click on button dateTime.png')

"Step 32: Click on button selectFiles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_selectFiles'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 32-Click on button selectFiles.png')

"Step 33: Click on button selectFolder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_selectFolder'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 33-Click on button selectFolder.png')

"Step 34: Click on button selectFiles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_selectFiles'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 34-Click on button selectFiles.png')

"Step 35: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 35-Click on button next.png')

"Step 36: Click on input yesRadioGroup4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_yesRadioGroup4'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 36-Click on input yesRadioGroup4.png')

"Step 37: Click on input yesRadioGroup5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_yesRadioGroup5'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 37-Click on input yesRadioGroup5.png')

"Step 38: Click on textarea comments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_comments'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 38-Click on textarea comments.png')

"Step 39: Enter input value in textarea comments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_comments'), textarea_comments)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 39-Enter input value in textarea comments.png')

"Step 40: Click on item questionnaires (questionnaireMr)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/item_questionnaires"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/item_questionnaires', ['item_questionnaires_liNthOfType': item_questionnaires_liNthOfType, 'item_questionnaires_nth': item_questionnaires_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 40-Click on item questionnaires questionnaireMr.png')

"Step 41: Click on input radioNo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioNo'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 41-Click on input radioNo.png')

"Step 42: Click on label radioNo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/label_radioNo'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 42-Click on label radioNo.png')

"Step 43: Click on input radioNo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioNo2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 43-Click on input radioNo2.png')

"Step 44: Click on textarea comments2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_comments2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 44-Click on textarea comments2.png')

"Step 45: Enter input value in textarea comments2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_comments2'), textarea_comments2)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 45-Enter input value in textarea comments2.png')

"Step 46: Click on item questionnaires (questionnaireCt)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/item_questionnaires"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/item_questionnaires', ['item_questionnaires_liNthOfType': item_questionnaires_liNthOfType_1, 'item_questionnaires_nth': item_questionnaires_nth_1]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 46-Click on item questionnaires questionnaireCt.png')

"Step 47: Click on input radioYes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioYes'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 47-Click on input radioYes.png')

"Step 48: Click on label radioNo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/label_radioNo2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 48-Click on label radioNo2.png')

"Step 49: Click on input radioNo3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioNo3'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 49-Click on input radioNo3.png')

"Step 50: Click on input radioYes2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioYes2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 50-Click on input radioYes2.png')

"Step 51: Enter input value in input radioYes2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioYes2'), input_radioYes2)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 51-Enter input value in input radioYes2.png')

"Step 52: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 52-Click on button next.png')

"Step 53: Click on div uploadCompleted -> Navigate to page '/studies/*/subjects-list-study/*/combined-view'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_uploadCompleted'))

// WebUI.switchToWindowIndex(0)

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 53-Click on div uploadCompleted - Navigate to page studiessubjects-list-studycombined-view.png')

"Step 54: Click on faIcon previousPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/faIcon_previousPage'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 54-Click on faIcon previousPage.png')

"Step 55: Click on td subjectId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/td_subjectId'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 55-Click on td subjectId.png')

"Step 56: Click on faIcon visitSchedule (visitSchedule)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study_combined_view/faIcon_visitSchedule"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study_combined_view/faIcon_visitSchedule', ['faIcon_visitSchedule_nth': faIcon_visitSchedule_nth, 'faIcon_visitSchedule_thNthOfType': faIcon_visitSchedule_thNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 56-Click on faIcon visitSchedule visitSchedule.png')

"Step 57: Click on link openUploader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/link_openUploader2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 57-Click on link openUploader.png')

"Step 58: Click on faIcon openCalendar"

WebUI.switchToWindowTitle('Upload Task')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/faIcon_openCalendar'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 58-Click on faIcon openCalendar.png')

"Step 59: Click on button dateTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/button_dateTime'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 59-Click on button dateTime.png')

"Step 60: Click on button selectFiles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/button_selectFiles'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 60-Click on button selectFiles.png')

"Step 61: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 61-Click on button next.png')

"Step 62: Click on input yesRadio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/input_yesRadio'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 62-Click on input yesRadio.png')

"Step 63: Click on input yesRadio2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/input_yesRadio2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 63-Click on input yesRadio2.png')

"Step 64: Click on textarea comments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/textarea_comments'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 64-Click on textarea comments.png')

"Step 65: Enter input value in textarea comments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/textarea_comments'), textarea_comments_1)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 65-Enter input value in textarea comments.png')

"Step 66: Click on item questionnaireTypes (mr)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study_combined_view/item_questionnaireTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study_combined_view/item_questionnaireTypes', ['item_questionnaireTypes_liNthOfType': item_questionnaireTypes_liNthOfType, 'item_questionnaireTypes_nth': item_questionnaireTypes_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 66-Click on item questionnaireTypes mr.png')

"Step 67: Click on input yesNoRadio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/input_yesNoRadio'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 67-Click on input yesNoRadio.png')

"Step 68: Click on label yes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/label_yes'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 68-Click on label yes.png')

"Step 69: Click on input yesRadio3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/input_yesRadio3'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 69-Click on input yesRadio3.png')

"Step 70: Click on textarea comments2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/textarea_comments2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 70-Click on textarea comments2.png')

"Step 71: Enter input value in textarea comments2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/textarea_comments2'), textarea_comments2_1)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 71-Enter input value in textarea comments2.png')

"Step 72: Click on item questionnaireTypes (ct)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study_combined_view/item_questionnaireTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study_combined_view/item_questionnaireTypes', ['item_questionnaireTypes_liNthOfType': item_questionnaireTypes_liNthOfType_1, 'item_questionnaireTypes_nth': item_questionnaireTypes_nth_1]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 72-Click on item questionnaireTypes ct.png')

"Step 73: Click on input yesRadio4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/input_yesRadio4'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 73-Click on input yesRadio4.png')

"Step 74: Click on label yes2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/label_yes2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 74-Click on label yes2.png')

"Step 75: Click on input yesRadio5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/input_yesRadio5'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 75-Click on input yesRadio5.png')

"Step 76: Click on input yesRadio6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/input_yesRadio6'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 76-Click on input yesRadio6.png')

"Step 77: Enter input value in input yesRadio6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/input_yesRadio6'), input_yesRadio6)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 77-Enter input value in input yesRadio6.png')

"Step 78: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/button_next'))

WebUI.switchToWindowIndex(0)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 78-Click on button next.png')

"Step 79: Click on faIcon previousPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/faIcon_previousPage'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 79-Click on faIcon previousPage.png')

"Step 80: Click on td subjectId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/td_subjectId2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 80-Click on td subjectId2.png')

"Step 81: Click on faIcon previousPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/faIcon_previousPage'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 81-Click on faIcon previousPage.png')

"Step 82: Click on td subjectId -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/td_subjectId'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 82-Click on td subjectId - Navigate to page .png')

"Step 83: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Upload Visit Data and Manage Subjects in Studies_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}