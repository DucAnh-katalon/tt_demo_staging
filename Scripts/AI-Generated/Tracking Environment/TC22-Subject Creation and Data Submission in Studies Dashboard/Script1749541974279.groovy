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

WebUI.takeScreenshot(reportLocation + '/TC22/Step 2-Click on button selectStudyOrOrganization.png')

"Step 3: Click on button studyActions (dontDelEditAutoStd) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 3-Click on button studyActions dontDelEditAutoStd - Navigate to page studiesdashboard.png')

"Step 4: Click on link studyLinks (studyConfiguration)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 4-Click on link studyLinks studyConfiguration.png')

"Step 5: Click on div qualityControl2 -> Navigate to page '/studies/*/imaging-study-config'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_qualityControl2'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 5-Click on div qualityControl2 - Navigate to page studiesimaging-study-config.png')

"Step 6: Click on link dontDelEditAutoStd -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/link_dontDelEditAutoStd'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 6-Click on link dontDelEditAutoStd - Navigate to page studiesdashboard.png')

"Step 7: Click on link studyLinks (subjects2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_1, 'link_studyLinks_class': link_studyLinks_class_1, 'link_studyLinks_href_variable': link_studyLinks_href_variable_1, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 7-Click on link studyLinks subjects2.png')

"Step 8: Click on faIcon navigation (nextPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/faIcon_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/faIcon_navigation', ['faIcon_navigation_class': faIcon_navigation_class, 'faIcon_navigation_dataTestid': faIcon_navigation_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 8-Click on faIcon navigation nextPage.png')

"Step 9: Click on faIcon navigation (previousPage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/faIcon_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/faIcon_navigation', ['faIcon_navigation_class': faIcon_navigation_class_1, 'faIcon_navigation_dataTestid': faIcon_navigation_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 9-Click on faIcon navigation previousPage.png')

"Step 10: Click on button createSubject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_createSubject'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 10-Click on button createSubject.png')

"Step 11: Click on div subjectDetailsModalSiteInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_subjectDetailsModalSiteInput'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 11-Click on div subjectDetailsModalSiteInput.png')

"Step 12: Click on div subjectDetailsModalSiteInputOverlay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_subjectDetailsModalSiteInputOverlay'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 12-Click on div subjectDetailsModalSiteInputOverlay.png')

"Step 13: Click on input subjectDetailsModalSubjectId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectDetailsModalSubjectId'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 13-Click on input subjectDetailsModalSubjectId.png')

"Step 14: Enter input value in input subjectDetailsModalSubjectId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectDetailsModalSubjectId'), input_subjectDetailsModalSubjectId)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 14-Enter input value in input subjectDetailsModalSubjectId.png')

"Step 15: Click on faIcon openCalendar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 15-Click on faIcon openCalendar2.png')

"Step 16: Click on button dateTimeSelection (dateTime2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 16-Click on button dateTimeSelection dateTime2.png')

"Step 17: Click on faIcon openCalendar3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar3'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 17-Click on faIcon openCalendar3.png')

"Step 18: Click on button dateTimeSelection (dateTime3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_1, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 18-Click on button dateTimeSelection dateTime3.png')

"Step 19: Click on faIcon openCalendar4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar4'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 19-Click on faIcon openCalendar4.png')

"Step 20: Click on button dateTimeSelection (dateTime4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_2, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 20-Click on button dateTimeSelection dateTime4.png')

"Step 21: Click on button submitData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submitData'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 21-Click on button submitData.png')

"Step 22: Click on input subjectsOverviewTableFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectsOverviewTableFilter'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 22-Click on input subjectsOverviewTableFilter.png')

"Step 23: Enter input value in input subjectsOverviewTableFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectsOverviewTableFilter'), input_subjectsOverviewTableFilter)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 23-Enter input value in input subjectsOverviewTableFilter.png')

"Step 24: Click on button applyFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_applyFilter'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 24-Click on button applyFilter.png')

"Step 25: Click on td country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/td_country'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 25-Click on td country.png')

"Step 26: Click on faIcon object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object3'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 26-Click on faIcon object3.png')

"Step 27: Click on faIcon object4 -> Navigate to page '/studies/*/subjects-list-study/*/combined-view'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object4'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 27-Click on faIcon object4 - Navigate to page studiessubjects-list-studycombined-view.png')

"Step 28: Click on main subjectsListView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/main_subjectsListView'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 28-Click on main subjectsListView.png')

"Step 29: Click on faIcon previousPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/faIcon_previousPage'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 29-Click on faIcon previousPage.png')

"Step 30: Click on td country"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/td_country'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 30-Click on td country.png')

"Step 31: Click on faIcon visitSchedule (visitSchedule2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study_combined_view/faIcon_visitSchedule"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study_combined_view/faIcon_visitSchedule', ['faIcon_visitSchedule_nth': faIcon_visitSchedule_nth, 'faIcon_visitSchedule_thNthOfType': faIcon_visitSchedule_thNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 31-Click on faIcon visitSchedule visitSchedule2.png')

"Step 32: Click on link openUploader2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/link_openUploader2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 32-Click on link openUploader2.png')

"Step 33: Click on button selectFiles"

WebUI.switchToWindowTitle('Upload Task')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/button_selectFiles'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 33-Click on button selectFiles.png')

"Step 34: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 34-Click on button next.png')

"Step 35: Click on item questionnaireTypes (questionnaire)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study_combined_view/item_questionnaireTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study_combined_view/item_questionnaireTypes', ['item_questionnaireTypes_liNthOfType': item_questionnaireTypes_liNthOfType, 'item_questionnaireTypes_nth': item_questionnaireTypes_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 35-Click on item questionnaireTypes questionnaire.png')

"Step 36: Click on input radioYes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/input_radioYes'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 36-Click on input radioYes.png')

"Step 37: Click on input comments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/input_comments'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 37-Click on input comments.png')

"Step 38: Enter input value in input comments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/input_comments'), input_comments)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 38-Enter input value in input comments.png')

"Step 39: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/button_next'))

WebUI.switchToWindowIndex(0)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 39-Click on button next.png')

"Step 40: Click on header subjectTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/combined-view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_combined_view/header_subjectTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 40-Click on header subjectTitle.png')

"Step 41: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-Subject Creation and Data Submission in Studies Dashboard_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}