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

"Step 1: Navigate to /gateway with params (siteUID, studyUID, uploadType)"

TrueTestScripts.navigate("/gateway", ["siteUID": gateway_siteUID, "studyUID": gateway_studyUID, "uploadType": gateway_uploadType])

"Step 2: Click on button selectFiles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/button_selectFiles'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 2-Click on button selectFiles.png')

"Step 3: Click on button next -> Navigate to page '/studies/*/data-uploader/*/upload'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 3-Click on button next - Navigate to page studiesdata-uploaderupload.png')

"Step 4: Click on button continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/data-uploader/.*/upload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_data_uploader_upload/button_continue'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 4-Click on button continue.png')

"Step 5: Click on span modalityEdtfCt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/data-uploader/.*/upload?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_data_uploader_upload/span_modalityEdtfCt'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 5-Click on span modalityEdtfCt.png')

"Step 6: Click on link imgUp6 -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/data-uploader/.*/upload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_data_uploader_upload/link_imgUp6'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 6-Click on link imgUp6 - Navigate to page studiesdashboard.png')

"Step 7: Click on button siteAdmin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteAdmin'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 7-Click on button siteAdmin.png')

"Step 8: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 8-Click on link logout - Navigate to page dashboard.png')

"Step 9: Click on button administration2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration2'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 9-Click on button administration2.png')

"Step 10: Click on button libraries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_libraries'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 10-Click on button libraries.png')

"Step 11: Click on link forms -> Navigate to page '/forms'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_forms'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 11-Click on link forms - Navigate to page forms.png')

"Step 12: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/forms?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_forms/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 12-Click on button selectStudyOrOrganization.png')

"Step 13: Click on button imgUp6 -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/forms?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_forms/button_imgUp6'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 13-Click on button imgUp6 - Navigate to page studiesdashboard.png')

"Step 14: Click on link studyLinks (studyConfiguration)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 14-Click on link studyLinks studyConfiguration.png')

"Step 15: Click on button edit -> Navigate to page '/studies/*/imaging-study-config'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_edit'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 15-Click on button edit - Navigate to page studiesimaging-study-config.png')

"Step 16: Click on html page"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/html_page'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 16-Click on html page.png')

"Step 17: Click on faIcon object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_object'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 17-Click on faIcon object.png')

"Step 18: Click on link formProperties (editFormProperties)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/link_formProperties"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/link_formProperties', ['link_formProperties_internalHasText': link_formProperties_internalHasText, 'link_formProperties_liNthOfType': link_formProperties_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 18-Click on link formProperties editFormProperties.png')

"Step 19: Click on button cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_cancel'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 19-Click on button cancel.png')

"Step 20: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 20-Click on button confirm.png')

"Step 21: Click on faIcon object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_object'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 21-Click on faIcon object.png')

"Step 22: Click on link formProperties (formDesigner)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/link_formProperties"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/link_formProperties', ['link_formProperties_internalHasText': link_formProperties_internalHasText_1, 'link_formProperties_liNthOfType': link_formProperties_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 22-Click on link formProperties formDesigner.png')

"Step 23: Click on appFormCanvas object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/appFormCanvas_object'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 23-Click on appFormCanvas object.png')

"Step 24: Click on div question2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_question2'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 24-Click on div question2.png')

"Step 25: Click on input optional"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_optional'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 25-Click on input optional.png')

"Step 26: Click on html page"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/html_page'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 26-Click on html page.png')

"Step 27: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 27-Click on button save.png')

"Step 28: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 28-Click on button save2.png')

"Step 29: Click on div qualityControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_qualityControl'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 29-Click on div qualityControl.png')

"Step 30: Click on button publish"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_publish'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 30-Click on button publish.png')

"Step 31: Click on dialog studyConfigPublishSummary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/dialog_studyConfigPublishSummary'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 31-Click on dialog studyConfigPublishSummary.png')

"Step 32: Click on dialog studyConfigPublishSummary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/dialog_studyConfigPublishSummary'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 32-Click on dialog studyConfigPublishSummary.png')

"Step 33: Click on dialog studyConfigPublishSummary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/dialog_studyConfigPublishSummary'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 33-Click on dialog studyConfigPublishSummary.png')

"Step 34: Click on dialog studyConfigPublishSummary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/dialog_studyConfigPublishSummary'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 34-Click on dialog studyConfigPublishSummary.png')

"Step 35: Click on button publishConfiguration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_publishConfiguration'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 35-Click on button publishConfiguration.png')

"Step 36: Click on div defineFormsPresentation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_defineFormsPresentation'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 36-Click on div defineFormsPresentation.png')

"Step 37: Click on div defineFormsPresentation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_defineFormsPresentation'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 37-Click on div defineFormsPresentation.png')

"Step 38: Click on div defineFormsPresentation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_defineFormsPresentation'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 38-Click on div defineFormsPresentation.png')

"Step 39: Click on button save3 -> Navigate to page '/studyservice'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_save3'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 39-Click on button save3 - Navigate to page studyservice.png')

"Step 40: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studyservice?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studyservice/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 40-Click on link home - Navigate to page dashboard.png')

"Step 41: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 41-Click on button selectStudyOrOrganization.png')

"Step 42: Click on button studyActions (imgUp6) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 42-Click on button studyActions imgUp6 - Navigate to page studiesdashboard.png')

"Step 43: Click on link studyLinks (subjects3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_1, 'link_studyLinks_class': link_studyLinks_class_1, 'link_studyLinks_href_variable': link_studyLinks_href_variable_1, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 43-Click on link studyLinks subjects3.png')

"Step 44: Click on div subjectsData -> Navigate to page '/studies/*/subjects-list-study'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_subjectsData'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 44-Click on div subjectsData - Navigate to page studiessubjects-list-study.png')

"Step 45: Click on html subjectsList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/html_subjectsList'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 45-Click on html subjectsList.png')

"Step 46: Click on button createSubject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_createSubject'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 46-Click on button createSubject.png')

"Step 47: Click on div siteInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_siteInput'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 47-Click on div siteInput.png')

"Step 48: Click on div option111"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_option111'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 48-Click on div option111.png')

"Step 49: Click on crModalBody studyDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/crModalBody_studyDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 49-Click on crModalBody studyDetails.png')

"Step 50: Click on input subjectId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_subjectId'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 50-Click on input subjectId.png')

"Step 51: Enter input value in input subjectId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_subjectId'), input_subjectId)

WebUI.takeScreenshot(reportLocation + '/TC52/Step 51-Enter input value in input subjectId.png')

"Step 52: Click on crModalBody studyDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/crModalBody_studyDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 52-Click on crModalBody studyDetails.png')

"Step 53: Click on div birthMonthInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_birthMonthInput'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 53-Click on div birthMonthInput.png')

"Step 54: Click on div optionJul"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_optionJul'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 54-Click on div optionJul.png')

"Step 55: Click on div yearOfBirthInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_yearOfBirthInput'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 55-Click on div yearOfBirthInput.png')

"Step 56: Click on div optionDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_optionDate'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 56-Click on div optionDate.png')

"Step 57: Click on span genderInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/span_genderInput'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 57-Click on span genderInput.png')

"Step 58: Click on div optionFemale"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_optionFemale'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 58-Click on div optionFemale.png')

"Step 59: Click on crModalBody studyDetails2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/crModalBody_studyDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC52/Step 59-Click on crModalBody studyDetails2.png')

"Step 60: Click on faIcon openCalendar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_openCalendar'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 60-Click on faIcon openCalendar.png')

"Step 61: Click on button dateTimeSelection (dateSelection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_subjects_list_study/button_dateTimeSelection', ['button_dateTimeSelection_buttonNthOfType': button_dateTimeSelection_buttonNthOfType, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 61-Click on button dateTimeSelection dateSelection.png')

"Step 62: Click on button submitData -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submitData'))

WebUI.takeScreenshot(reportLocation + '/TC52/Step 62-Click on button submitData - Navigate to page .png')

"Step 63: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC52-Upload Study Data and Manage Forms_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}