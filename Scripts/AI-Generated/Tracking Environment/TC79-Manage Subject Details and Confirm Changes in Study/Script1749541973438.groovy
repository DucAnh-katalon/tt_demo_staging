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

"Step 1: Navigate to /studies/*/subjects-list-study with params (studyId)"

TrueTestScripts.navigate("/studies/${studies_id}/subjects-list-study", ["studyId": subjects_list_study_studyId])

"Step 2: Click on div loadingIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_loadingIndicator'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 2-Click on div loadingIndicator.png')

"Step 3: Click on faIcon object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_object'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 3-Click on faIcon object.png')

"Step 4: Click on link edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/link_edit'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 4-Click on link edit.png')

"Step 5: Click on span subjectIndication"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/span_subjectIndication'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 5-Click on span subjectIndication.png')

"Step 6: Click on div subjectOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_subjectOptions'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 6-Click on div subjectOptions.png')

"Step 7: Click on button submitData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submitData'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 7-Click on button submitData.png')

"Step 8: Click on div subjectLanguage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_subjectLanguage'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 8-Click on div subjectLanguage.png')

"Step 9: Click on div languageOption2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_languageOption2'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 9-Click on div languageOption2.png')

"Step 10: Click on button submitData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submitData'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 10-Click on button submitData.png')

"Step 11: Click on crModalBody confirmationReason"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/crModalBody_confirmationReason'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 11-Click on crModalBody confirmationReason.png')

"Step 12: Select option with input value from select confirmationReason"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/select_confirmationReason'), select_confirmationReason)

WebUI.takeScreenshot(reportLocation + '/TC79/Step 12-Select option with input value from select confirmationReason.png')

"Step 13: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 13-Click on button save.png')

"Step 14: Click on span subjectIndication2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/span_subjectIndication'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 14-Click on span subjectIndication2.png')

"Step 15: Click on div subjectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_subjectOption'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 15-Click on div subjectOption.png')

"Step 16: Click on button submitData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submitData'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 16-Click on button submitData.png')

"Step 17: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 17-Click on button save.png')

"Step 18: Click on small fieldRequired"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/small_fieldRequired'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 18-Click on small fieldRequired.png')

"Step 19: Select option with input value from select changeReason"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/select_changeReason'), select_changeReason)

WebUI.takeScreenshot(reportLocation + '/TC79/Step 19-Select option with input value from select changeReason.png')

"Step 20: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 20-Click on button save.png')

"Step 21: Click on faIcon dismiss"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_dismiss'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 21-Click on faIcon dismiss.png')

"Step 22: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 22-Click on button confirm.png')

"Step 23: Click on faIcon object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_object2'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 23-Click on faIcon object2.png')

"Step 24: Click on link edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/link_edit'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 24-Click on link edit.png')

"Step 25: Click on faIcon object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_object3'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 25-Click on faIcon object3.png')

"Step 26: Click on faIcon editSubject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_editSubject'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 26-Click on faIcon editSubject.png')

"Step 27: Click on faIcon object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_object4'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 27-Click on faIcon object4.png')

"Step 28: Click on input subjectId3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_subjectId3'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 28-Click on input subjectId3.png')

"Step 29: Click on span subjectIndication3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/span_subjectIndication3'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 29-Click on span subjectIndication3.png')

"Step 30: Click on div subjectOption2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_subjectOption2'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 30-Click on div subjectOption2.png')

"Step 31: Click on div languageCombobox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_languageCombobox'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 31-Click on div languageCombobox.png')

"Step 32: Click on div languageOption3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_languageOption3'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 32-Click on div languageOption3.png')

"Step 33: Click on button submitData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submitData'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 33-Click on button submitData.png')

"Step 34: Select option with input value from select changeReason2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/select_changeReason2'), select_changeReason2)

WebUI.takeScreenshot(reportLocation + '/TC79/Step 34-Select option with input value from select changeReason2.png')

"Step 35: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 35-Click on button save.png')

"Step 36: Click on input subjectId3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_subjectId3'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 36-Click on input subjectId3.png')

"Step 37: Enter input value in input subjectId3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_subjectId3'), input_subjectId3)

WebUI.takeScreenshot(reportLocation + '/TC79/Step 37-Enter input value in input subjectId3.png')

"Step 38: Click on button submitData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submitData'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 38-Click on button submitData.png')

"Step 39: Select option with input value from select changeReason3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/select_changeReason3'), select_changeReason3)

WebUI.takeScreenshot(reportLocation + '/TC79/Step 39-Select option with input value from select changeReason3.png')

"Step 40: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 40-Click on button save.png')

"Step 41: Click on faIcon object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_object5'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 41-Click on faIcon object5.png')

"Step 42: Click on button crToast"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_crToast'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 42-Click on button crToast.png')

"Step 43: Click on dialog editSubject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/dialog_editSubject'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 43-Click on dialog editSubject.png')

"Step 44: Click on input subjectId3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_subjectId3'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 44-Click on input subjectId3.png')

"Step 45: Enter input value in input subjectId3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_subjectId3'), input_subjectId3_1)

WebUI.takeScreenshot(reportLocation + '/TC79/Step 45-Enter input value in input subjectId3.png')

"Step 46: Click on button submitData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submitData'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 46-Click on button submitData.png')

"Step 47: Select option with input value from select changeReason4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/select_changeReason4'), select_changeReason4)

WebUI.takeScreenshot(reportLocation + '/TC79/Step 47-Select option with input value from select changeReason4.png')

"Step 48: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 48-Click on button save.png')

"Step 49: Click on faIcon dismiss"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_dismiss'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 49-Click on faIcon dismiss.png')

"Step 50: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 50-Click on button confirm.png')

"Step 51: Click on faIcon object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_object'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 51-Click on faIcon object.png')

"Step 52: Click on link edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/link_edit'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 52-Click on link edit.png')

"Step 53: Click on div subjectDetailsLanguage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_subjectDetailsLanguage'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 53-Click on div subjectDetailsLanguage.png')

"Step 54: Click on div languageListbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_languageListbox'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 54-Click on div languageListbox.png')

"Step 55: Click on button submitData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submitData'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 55-Click on button submitData.png')

"Step 56: Select option with input value from select changeReason5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/select_changeReason5'), select_changeReason5)

WebUI.takeScreenshot(reportLocation + '/TC79/Step 56-Select option with input value from select changeReason5.png')

"Step 57: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 57-Click on button save.png')

"Step 58: Click on button crToastGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_crToastGroup'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 58-Click on button crToastGroup.png')

"Step 59: Click on faIcon object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_object4'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 59-Click on faIcon object4.png')

"Step 60: Click on button submitData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submitData'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 60-Click on button submitData.png')

"Step 61: Select option with input value from select changeReason6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/select_changeReason6'), select_changeReason6)

WebUI.takeScreenshot(reportLocation + '/TC79/Step 61-Select option with input value from select changeReason6.png')

"Step 62: Click on faIcon confirmationDismiss"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_confirmationDismiss'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 62-Click on faIcon confirmationDismiss.png')

"Step 63: Click on faIcon dismiss"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_dismiss'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 63-Click on faIcon dismiss.png')

"Step 64: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 64-Click on button confirm.png')

"Step 65: Click on button ecoaStudyWithTextForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_ecoaStudyWithTextForm'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 65-Click on button ecoaStudyWithTextForm.png')

"Step 66: Click on button testStudyForDcrquery -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_testStudyForDcrquery'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 66-Click on button testStudyForDcrquery - Navigate to page studiesdashboard.png')

"Step 67: Click on link studyLinks (subjects2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 67-Click on link studyLinks subjects2.png')

"Step 68: Click on link studyLinks (subjects2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_1, 'link_studyLinks_class': link_studyLinks_class_1, 'link_studyLinks_href_variable': link_studyLinks_href_variable_1, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 68-Click on link studyLinks subjects2.png')

"Step 69: Click on link studyLinks (subjects2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_2, 'link_studyLinks_class': link_studyLinks_class_2, 'link_studyLinks_href_variable': link_studyLinks_href_variable_2, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 69-Click on link studyLinks subjects2.png')

"Step 70: Click on td subjectId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/td_subjectId'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 70-Click on td subjectId.png')

"Step 71: Click on td subjectId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/td_subjectId'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 71-Click on td subjectId.png')

"Step 72: Click on td subjectId (subjectId2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_subjectId"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_subjectId', ['td_subjectId_tdNthChild': td_subjectId_tdNthChild, 'td_subjectId_tdNthOfType': td_subjectId_tdNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 72-Click on td subjectId subjectId2.png')

"Step 73: Click on button previousPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_previousPage'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 73-Click on button previousPage.png')

"Step 74: Click on button tableAction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_tableAction'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 74-Click on button tableAction.png')

"Step 75: Click on link edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_edit'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 75-Click on link edit.png')

"Step 76: Click on crModalFooter object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/crModalFooter_object'))

// WebUI.takeScreenshot(reportLocation + '/TC79/Step 76-Click on crModalFooter object.png')

"Step 77: Click on button submitData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submitData'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 77-Click on button submitData.png')

"Step 78: Click on input subjectId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectId'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 78-Click on input subjectId.png')

"Step 79: Enter input value in input subjectId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectId'), input_subjectId)

WebUI.takeScreenshot(reportLocation + '/TC79/Step 79-Enter input value in input subjectId.png')

"Step 80: Click on button submitData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submitData'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 80-Click on button submitData.png')

"Step 81: Select option with input value from select changeReason"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_changeReason'), select_changeReason_1)

WebUI.takeScreenshot(reportLocation + '/TC79/Step 81-Select option with input value from select changeReason.png')

"Step 82: Click on button save -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC79/Step 82-Click on button save - Navigate to page .png')

"Step 83: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC79-Manage Subject Details and Confirm Changes in Study_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}