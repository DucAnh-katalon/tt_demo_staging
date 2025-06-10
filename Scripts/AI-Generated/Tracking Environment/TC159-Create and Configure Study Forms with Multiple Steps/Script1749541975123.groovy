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

"Step 1: Navigate to /dashboard"

TrueTestScripts.navigate("/dashboard")

"Step 2: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 2-Click on button selectStudyOrOrganization.png')

"Step 3: Click on list quicklink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/list_quicklink'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 3-Click on list quicklink.png')

"Step 4: Click on link studies3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_studies3'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 4-Click on link studies3.png')

"Step 5: Click on button addForms"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addForms'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 5-Click on button addForms.png')

"Step 6: Click on input searchAll2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_searchAll2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 6-Click on input searchAll2.png')

"Step 7: Enter input value in input searchAll2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_searchAll2'), input_searchAll2)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 7-Enter input value in input searchAll2.png')

"Step 8: Press key Enter on input searchAll2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_searchAll2'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 8-Press key Enter on input searchAll2.png')

"Step 9: Enter input value in input searchAll2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_searchAll2'), input_searchAll2_1)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 9-Enter input value in input searchAll2.png')

"Step 10: Click on input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_object'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 10-Click on input object.png')

"Step 11: Click on input object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_object2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 11-Click on input object2.png')

"Step 12: Click on input object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_object3'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 12-Click on input object3.png')

"Step 13: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 13-Click on button save2.png')

"Step 14: Click on faIcon nextButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_nextButton'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 14-Click on faIcon nextButton.png')

"Step 15: Click on button addItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addItem'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 15-Click on button addItem.png')

"Step 16: Select option with input value from select idFormat"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_idFormat'), select_idFormat)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 16-Select option with input value from select idFormat.png')

"Step 17: Click on button addItem2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addItem2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 17-Click on button addItem2.png')

"Step 18: Select option with input value from select delimiter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_delimiter'), select_delimiter)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 18-Select option with input value from select delimiter.png')

"Step 19: Select option with input value from select idFormats"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_idFormats'), select_idFormats)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 19-Select option with input value from select idFormats.png')

"Step 20: Select option with input value from select countryItems"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_countryItems'), select_countryItems)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 20-Select option with input value from select countryItems.png')

"Step 21: Click on input minNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_minNumber'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 21-Click on input minNumber.png')

"Step 22: Enter input value in input minNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_minNumber'), input_minNumber)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 22-Enter input value in input minNumber.png')

"Step 23: Click on input maxNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_maxNumber'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 23-Click on input maxNumber.png')

"Step 24: Enter input value in input maxNumber -> Navigate to page '/studies/*/imaging-study-config'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_maxNumber'), input_maxNumber)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 24-Enter input value in input maxNumber - Navigate to page studiesimaging-study-config.png')

"Step 25: Click on p copyright2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/p_copyright2'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 25-Click on p copyright2.png')

"Step 26: Click on p copyright2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/p_copyright2'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 26-Click on p copyright2.png')

"Step 27: Click on faIcon nextButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_nextButton'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 27-Click on faIcon nextButton.png')

"Step 28: Click on input siteAssessmentSwitch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_siteAssessmentSwitch'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 28-Click on input siteAssessmentSwitch.png')

"Step 29: Click on span general"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/span_general'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 29-Click on span general.png')

"Step 30: Click on input numberExampleHelp (numberExampleHelp)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/input_numberExampleHelp"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/input_numberExampleHelp', ['input_numberExampleHelp_nth': input_numberExampleHelp_nth, 'input_numberExampleHelp_sectionNthOfType': input_numberExampleHelp_sectionNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 30-Click on input numberExampleHelp numberExampleHelp.png')

"Step 31: Enter input value in input numberExampleHelp (numberExampleHelp)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/input_numberExampleHelp"
WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/input_numberExampleHelp', ['input_numberExampleHelp_nth': input_numberExampleHelp_nth_1, 'input_numberExampleHelp_sectionNthOfType': input_numberExampleHelp_sectionNthOfType_1]), input_numberExampleHelp)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 31-Enter input value in input numberExampleHelp numberExampleHelp.png')

"Step 32: Click on section tatBusinessDays"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/section_tatBusinessDays'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 32-Click on section tatBusinessDays.png')

"Step 33: Click on input numberExampleHelp (numberExampleHelp2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/input_numberExampleHelp"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/input_numberExampleHelp', ['input_numberExampleHelp_nth': input_numberExampleHelp_nth_2, 'input_numberExampleHelp_sectionNthOfType': input_numberExampleHelp_sectionNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 33-Click on input numberExampleHelp numberExampleHelp2.png')

"Step 34: Enter input value in input numberExampleHelp (numberExampleHelp2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/input_numberExampleHelp"
WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/input_numberExampleHelp', ['input_numberExampleHelp_nth': input_numberExampleHelp_nth_3, 'input_numberExampleHelp_sectionNthOfType': input_numberExampleHelp_sectionNthOfType_3]), input_numberExampleHelp_1)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 34-Enter input value in input numberExampleHelp numberExampleHelp2.png')

"Step 35: Click on input numberExampleHelp (numberExampleHelp3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/input_numberExampleHelp"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/input_numberExampleHelp', ['input_numberExampleHelp_nth': input_numberExampleHelp_nth_4, 'input_numberExampleHelp_sectionNthOfType': input_numberExampleHelp_sectionNthOfType_4]))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 35-Click on input numberExampleHelp numberExampleHelp3.png')

"Step 36: Enter input value in input numberExampleHelp (numberExampleHelp3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/input_numberExampleHelp"
WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/input_numberExampleHelp', ['input_numberExampleHelp_nth': input_numberExampleHelp_nth_5, 'input_numberExampleHelp_sectionNthOfType': input_numberExampleHelp_sectionNthOfType_5]), input_numberExampleHelp_2)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 36-Enter input value in input numberExampleHelp numberExampleHelp3.png')

"Step 37: Click on button addModality"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_addModality'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 37-Click on button addModality.png')

"Step 38: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 38-Click on div object.png')

"Step 39: Click on input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 39-Click on input search.png')

"Step 40: Enter input value in input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_search'), input_search)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 40-Enter input value in input search.png')

"Step 41: Click on div optionMr"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_optionMr'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 41-Click on div optionMr.png')

"Step 42: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 42-Click on div object2.png')

"Step 43: Click on div optionBrain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_optionBrain'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 43-Click on div optionBrain.png')

"Step 44: Click on fieldset anatomy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/fieldset_anatomy'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 44-Click on fieldset anatomy.png')

"Step 45: Click on button save4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_save4'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 45-Click on button save4.png')

"Step 46: Click on span titleMr"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/span_titleMr'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 46-Click on span titleMr.png')

"Step 47: Click on button addForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_addForm'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 47-Click on button addForm.png')

"Step 48: Click on input radio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_radio'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 48-Click on input radio.png')

"Step 49: Click on button save5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_save5'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 49-Click on button save5.png')

"Step 50: Click on button addForm2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_addForm2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 50-Click on button addForm2.png')

"Step 51: Click on input radio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_radio'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 51-Click on input radio.png')

"Step 52: Click on button save5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_save5'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 52-Click on button save5.png')

"Step 53: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 53-Click on label object.png')

"Step 54: Click on label object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/label_object2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 54-Click on label object2.png')

"Step 55: Click on faIcon nextButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_nextButton'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 55-Click on faIcon nextButton.png')

"Step 56: Click on input subjectNumberFormat"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_subjectNumberFormat'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 56-Click on input subjectNumberFormat.png')

"Step 57: Enter input value in input subjectNumberFormat"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_subjectNumberFormat'), input_subjectNumberFormat)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 57-Enter input value in input subjectNumberFormat.png')

"Step 58: Click on input configure"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_configure'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 58-Click on input configure.png')

"Step 59: Click on input subjectNumberFormat2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_subjectNumberFormat2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 59-Click on input subjectNumberFormat2.png')

"Step 60: Enter input value in input subjectNumberFormat2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_subjectNumberFormat2'), input_subjectNumberFormat2)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 60-Enter input value in input subjectNumberFormat2.png')

"Step 61: Click on input required"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_required'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 61-Click on input required.png')

"Step 62: Click on input optional2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_optional2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 62-Click on input optional2.png')

"Step 63: Click on input showIntersex"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_showIntersex'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 63-Click on input showIntersex.png')

"Step 64: Click on input collectLaterEnrollment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_collectLaterEnrollment'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 64-Click on input collectLaterEnrollment.png')

"Step 65: Click on input collectLaterInclusion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_collectLaterInclusion'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 65-Click on input collectLaterInclusion.png')

"Step 66: Click on link addCustomState"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/link_addCustomState'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 66-Click on link addCustomState.png')

"Step 67: Click on input stateDisplayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_stateDisplayName'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 67-Click on input stateDisplayName.png')

"Step 68: Enter input value in input stateDisplayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_stateDisplayName'), input_stateDisplayName)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 68-Enter input value in input stateDisplayName.png')

"Step 69: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 69-Click on div object3.png')

"Step 70: Click on div activeSubjectIndication"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_activeSubjectIndication'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 70-Click on div activeSubjectIndication.png')

"Step 71: Click on label object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/label_object3'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 71-Click on label object3.png')

"Step 72: Click on p copyright2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/p_copyright2'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 72-Click on p copyright2.png')

"Step 73: Click on p copyright2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/p_copyright2'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 73-Click on p copyright2.png')

"Step 74: Click on faIcon nextButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_nextButton'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 74-Click on faIcon nextButton.png')

"Step 75: Click on button createSegment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_createSegment'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 75-Click on button createSegment.png')

"Step 76: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 76-Click on div object4.png')

"Step 77: Click on div baselineScreening"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_baselineScreening'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 77-Click on div baselineScreening.png')

"Step 78: Click on input segmentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_segmentName'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 78-Click on input segmentName.png')

"Step 79: Enter input value in input segmentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_segmentName'), input_segmentName)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 79-Enter input value in input segmentName.png')

"Step 80: Click on div subjectStateSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_subjectStateSelect'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 80-Click on div subjectStateSelect.png')

"Step 81: Click on div infoError"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_infoError'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 81-Click on div infoError.png')

"Step 82: Click on button addVisits"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_addVisits'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 82-Click on button addVisits.png')

"Step 83: Click on input visitLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_visitLabel'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 83-Click on input visitLabel.png')

"Step 84: Enter input value in input visitLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_visitLabel'), input_visitLabel)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 84-Enter input value in input visitLabel.png')

"Step 85: Click on div subjectStateSelect2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_subjectStateSelect2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 85-Click on div subjectStateSelect2.png')

"Step 86: Click on div anyDayOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_anyDayOption'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 86-Click on div anyDayOption.png')

"Step 87: Click on button createAndAddNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_createAndAddNew'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 87-Click on button createAndAddNew.png')

"Step 88: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 88-Click on button create.png')

"Step 89: Click on faIcon dismiss"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_dismiss'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 89-Click on faIcon dismiss.png')

"Step 90: Click on button confirm2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_confirm2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 90-Click on button confirm2.png')

"Step 91: Click on button addRead"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_addRead'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 91-Click on button addRead.png')

"Step 92: Click on div imgshSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_imgshSelect'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 92-Click on div imgshSelect.png')

"Step 93: Click on div bmwOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_bmwOption'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 93-Click on div bmwOption.png')

"Step 94: Click on input displayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_displayName'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 94-Click on input displayName.png')

"Step 95: Enter input value in input displayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_displayName'), input_displayName)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 95-Enter input value in input displayName.png')

"Step 96: Click on input displayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_displayName'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 96-Click on input displayName.png')

"Step 97: Enter input value in input displayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_displayName'), input_displayName_1)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 97-Enter input value in input displayName.png')

"Step 98: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 98-Click on button submit.png')

"Step 99: Click on button configure"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_configure'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 99-Click on button configure.png')

"Step 100: Click on div readTimingInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_readTimingInput'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 100-Click on div readTimingInput.png')

"Step 101: Click on div rollingReadOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_rollingReadOption'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 101-Click on div rollingReadOption.png')

"Step 102: Click on button save6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_save6'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 102-Click on button save6.png')

"Step 103: Click on faIcon object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 103-Click on faIcon object2.png')

"Step 104: Click on faIcon objects (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/faIcon_objects"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/faIcon_objects', ['faIcon_objects_class': faIcon_objects_class, 'faIcon_objects_nth': faIcon_objects_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 104-Click on faIcon objects object3.png')

"Step 105: Click on button addForm3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_addForm3'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 105-Click on button addForm3.png')

"Step 106: Click on input radio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_radio'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 106-Click on input radio.png')

"Step 107: Click on button attach"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_attach'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 107-Click on button attach.png')

"Step 108: Click on input generateReportCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_generateReportCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 108-Click on input generateReportCheckbox.png')

"Step 109: Click on button addRoles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_addRoles'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 109-Click on button addRoles.png')

"Step 110: Click on input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_object'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 110-Click on input object.png')

"Step 111: Click on div examActionBarContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_examActionBarContainer'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 111-Click on div examActionBarContainer.png')

"Step 112: Click on div examActionBarTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_examActionBarTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 112-Click on div examActionBarTitle.png')

"Step 113: Click on div examActionBarTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_examActionBarTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 113-Click on div examActionBarTitle.png')

"Step 114: Click on button save7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_save7'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 114-Click on button save7.png')

"Step 115: Click on div examActionBarTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_examActionBarTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 115-Click on div examActionBarTitle.png')

"Step 116: Click on div readCreation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_readCreation'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 116-Click on div readCreation.png')

"Step 117: Click on button save7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_save7'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 117-Click on button save7.png')

"Step 118: Click on faIcon object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_object4'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 118-Click on faIcon object4.png')

"Step 119: Click on faIcon nextButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_nextButton'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 119-Click on faIcon nextButton.png')

"Step 120: Click on button cancel2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_cancel2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 120-Click on button cancel2.png')

"Step 121: Click on faIcon object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_object5'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 121-Click on faIcon object5.png')

"Step 122: Click on link edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/link_edit'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 122-Click on link edit.png')

"Step 123: Click on button save8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_save8'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 123-Click on button save8.png')

"Step 124: Click on faIcon object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_object6'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 124-Click on faIcon object6.png')

"Step 125: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 125-Click on div object5.png')

"Step 126: Click on faIcon object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_object6'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 126-Click on faIcon object6.png')

"Step 127: Click on button configure2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_configure2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 127-Click on button configure2.png')

"Step 128: Click on button addForm3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_addForm3'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 128-Click on button addForm3.png')

"Step 129: Click on input radio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_radio'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 129-Click on input radio.png')

"Step 130: Click on button attach"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_attach'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 130-Click on button attach.png')

"Step 131: Click on button save7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_save7'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 131-Click on button save7.png')

"Step 132: Click on div readCreation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_readCreation'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 132-Click on div readCreation.png')

"Step 133: Click on div examActionBarContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_examActionBarContainer'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 133-Click on div examActionBarContainer.png')

"Step 134: Click on faIcon object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_object4'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 134-Click on faIcon object4.png')

"Step 135: Click on link add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/link_add'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 135-Click on link add.png')

"Step 136: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 136-Click on div object4.png')

"Step 137: Click on div onStudyTreatment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_onStudyTreatment'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 137-Click on div onStudyTreatment.png')

"Step 138: Click on input segmentName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_segmentName2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 138-Click on input segmentName2.png')

"Step 139: Enter input value in input segmentName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_segmentName2'), input_segmentName2)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 139-Enter input value in input segmentName2.png')

"Step 140: Click on input allowUnscheduledVisits"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_allowUnscheduledVisits'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 140-Click on input allowUnscheduledVisits.png')

"Step 141: Click on button addVisits"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_addVisits'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 141-Click on button addVisits.png')

"Step 142: Click on input visitLabel2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_visitLabel2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 142-Click on input visitLabel2.png')

"Step 143: Enter input value in input visitLabel2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_visitLabel2'), input_visitLabel2)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 143-Enter input value in input visitLabel2.png')

"Step 144: Click on div subjectStateSelect3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_subjectStateSelect3'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 144-Click on div subjectStateSelect3.png')

"Step 145: Click on div previousVisit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_previousVisit'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 145-Click on div previousVisit.png')

"Step 146: Click on input expectedTimeIncrement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_expectedTimeIncrement'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 146-Click on input expectedTimeIncrement.png')

"Step 147: Enter input value in input expectedTimeIncrement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_expectedTimeIncrement'), input_expectedTimeIncrement)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 147-Enter input value in input expectedTimeIncrement.png')

"Step 148: Click on div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_object6'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 148-Click on div object6.png')

"Step 149: Click on div optionWeeks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_optionWeeks'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 149-Click on div optionWeeks.png')

"Step 150: Click on div infoError2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_infoError2'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 150-Click on div infoError2.png')

"Step 151: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 151-Click on button create.png')

"Step 152: Click on button addRead2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_addRead'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 152-Click on button addRead2.png')

"Step 153: Click on label readType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/label_readType'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 153-Click on label readType.png')

"Step 154: Click on div imgshSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_imgshSelect'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 154-Click on div imgshSelect.png')

"Step 155: Click on div optionBmw"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_optionBmw'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 155-Click on div optionBmw.png')

"Step 156: Click on input displayName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_displayName2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 156-Click on input displayName2.png')

"Step 157: Enter input value in input displayName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_displayName2'), input_displayName2)

WebUI.takeScreenshot(reportLocation + '/TC159/Step 157-Enter input value in input displayName2.png')

"Step 158: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 158-Click on button submit.png')

"Step 159: Click on faIcon objects (object7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/faIcon_objects"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/faIcon_objects', ['faIcon_objects_class': faIcon_objects_class_1, 'faIcon_objects_nth': faIcon_objects_nth_1]))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 159-Click on faIcon objects object7.png')

"Step 160: Click on button addForm3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_addForm3'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 160-Click on button addForm3.png')

"Step 161: Click on input radio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_radio'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 161-Click on input radio.png')

"Step 162: Click on button attach"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_attach'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 162-Click on button attach.png')

"Step 163: Click on button save7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_save7'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 163-Click on button save7.png')

"Step 164: Click on div examActionBarTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_examActionBarTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 164-Click on div examActionBarTitle.png')

"Step 165: Click on div examActionBarTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_examActionBarTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 165-Click on div examActionBarTitle.png')

"Step 166: Click on div examActionBarTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_examActionBarTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 166-Click on div examActionBarTitle.png')

"Step 167: Click on div examActionBarTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_examActionBarTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 167-Click on div examActionBarTitle.png')

"Step 168: Click on faIcon object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_object4'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 168-Click on faIcon object4.png')

"Step 169: Click on faIcon objects (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/faIcon_objects"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/faIcon_objects', ['faIcon_objects_class': faIcon_objects_class_2, 'faIcon_objects_nth': faIcon_objects_nth_2]))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 169-Click on faIcon objects object8.png')

"Step 170: Click on button addForm3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_addForm3'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 170-Click on button addForm3.png')

"Step 171: Click on input radio2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/input_radio2'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 171-Click on input radio2.png')

"Step 172: Click on button attach"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_attach'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 172-Click on button attach.png')

"Step 173: Click on button save7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_save7'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 173-Click on button save7.png')

"Step 174: Click on div bmwConfiguration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/div_bmwConfiguration'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 174-Click on div bmwConfiguration.png')

"Step 175: Click on faIcon object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_object4'))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 175-Click on faIcon object4.png')

"Step 176: Click on faIcon nextButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/faIcon_nextButton'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 176-Click on faIcon nextButton.png')

"Step 177: Click on button discard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_discard'))

WebUI.takeScreenshot(reportLocation + '/TC159/Step 177-Click on button discard.png')

"Step 178: Click on div studySections (dataUpload)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/div_studySections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/div_studySections', ['div_studySections_dataTestid': div_studySections_dataTestid, 'div_studySections_divNthOfType': div_studySections_divNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 178-Click on div studySections dataUpload.png')

"Step 179: Click on div studySections (qualityControl2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/div_studySections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/div_studySections', ['div_studySections_dataTestid': div_studySections_dataTestid_1, 'div_studySections_divNthOfType': div_studySections_divNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 179-Click on div studySections qualityControl2.png')

"Step 180: Click on div studySections (visitSchedule) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/div_studySections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_imaging_study_config/div_studySections', ['div_studySections_dataTestid': div_studySections_dataTestid_2, 'div_studySections_divNthOfType': div_studySections_divNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC159/Step 180-Click on div studySections visitSchedule - Navigate to page .png')

"Step 181: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC159-Create and Configure Study Forms with Multiple Steps_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}