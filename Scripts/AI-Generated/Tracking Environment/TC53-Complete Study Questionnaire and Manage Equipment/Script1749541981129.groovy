import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.accessAdministrationAndFilterStudyLinks
import truetest.Tracking_Environment.common.reviewActionsWithScannerDevice
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

"Step 2: Click on list quicklink3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/list_quicklink'))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 2-Click on list quicklink3.png')

"Step 3: Click on span projectName -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_projectName'))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 3-Click on span projectName - Navigate to page studiesdashboard.png')

"Step 4: Click on link studyLinks (mySite3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 4-Click on link studyLinks mySite3.png')

"Step 5: Click on button siteManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteManagement'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 5-Click on button siteManagement.png')

"Step 6: Click on td studyDetails (studySite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyDetails', ['td_studyDetails_tdNthChild': td_studyDetails_tdNthChild, 'td_studyDetails_tdNthOfType': td_studyDetails_tdNthOfType, 'td_studyDetails_trNthChild': td_studyDetails_trNthChild, 'td_studyDetails_trNthOfType': td_studyDetails_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 6-Click on td studyDetails studySite.png')

"Step 7: Click on button startQuestionnaire"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_startQuestionnaire'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 7-Click on button startQuestionnaire.png')

"Step 8: Click on input tiredRadio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_tiredRadio'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 8-Click on input tiredRadio.png')

"Step 9: Click on faIcon openCalendar6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar6'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 9-Click on faIcon openCalendar6.png')

"Step 10: Click on button dateTimeSelection (dateSelection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 10-Click on button dateTimeSelection dateSelection.png')

"Step 11: Click on input comments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_comments'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 11-Click on input comments.png')

"Step 12: Enter input value in input comments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_comments'), input_comments)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 12-Enter input value in input comments.png')

"Step 13: Click on span list1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_list1'))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 13-Click on span list1.png')

"Step 14: Click on div option1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_option1'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 14-Click on div option1.png')

"Step 15: Click on input text1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_text1'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 15-Click on input text1.png')

"Step 16: Enter input value in input text1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_text1'), input_text1)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 16-Enter input value in input text1.png')

"Step 17: Click on button object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object3'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 17-Click on button object3.png')

"Step 18: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 18-Click on button object4.png')

"Step 19: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 19-Click on button object4.png')

"Step 20: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 20-Click on button object4.png')

"Step 21: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 21-Click on button object4.png')

"Step 22: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 22-Click on button object4.png')

"Step 23: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 23-Click on button object4.png')

"Step 24: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 24-Click on button object4.png')

"Step 25: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 25-Click on button object4.png')

"Step 26: Click on faIcon openCalendar7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar7'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 26-Click on faIcon openCalendar7.png')

"Step 27: Click on button dateTimeSelection (dateSelection2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_1, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 27-Click on button dateTimeSelection dateSelection2.png')

"Step 28: Click on faIcon openTimepicker"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openTimepicker'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 28-Click on faIcon openTimepicker.png')

"Step 29: Click on button ok2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_ok2'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 29-Click on button ok2.png')

"Step 30: Click on input yes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_yes'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 30-Click on input yes.png')

"Step 31: Click on button object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object5'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 31-Click on button object5.png')

"Step 32: Click on button object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object6'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 32-Click on button object6.png')

"Step 33: Click on button object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object6'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 33-Click on button object6.png')

"Step 34: Click on button object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object6'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 34-Click on button object6.png')

"Step 35: Click on button object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object6'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 35-Click on button object6.png')

"Step 36: Click on button object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object6'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 36-Click on button object6.png')

"Step 37: Click on input no"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_no'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 37-Click on input no.png')

"Step 38: Click on input no2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_no2'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 38-Click on input no2.png')

"Step 39: Click on input  2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input__2'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 39-Click on input  2.png')

"Step 40: Click on textarea object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_object'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 40-Click on textarea object.png')

"Step 41: Enter input value in textarea object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_object'), textarea_object)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 41-Enter input value in textarea object.png')

"Step 42: Click on input abc"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_abc'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 42-Click on input abc.png')

"Step 43: Click on input a"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_a'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 43-Click on input a.png')

"Step 44: Click on textarea object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_object2'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 44-Click on textarea object2.png')

"Step 45: Enter input value in textarea object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_object2'), textarea_object2)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 45-Enter input value in textarea object2.png')

"Step 46: Click on input radioGroupQuestion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioGroupQuestion'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 46-Click on input radioGroupQuestion.png')

"Step 47: Click on button submitQuestionnaire"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submitQuestionnaire'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 47-Click on button submitQuestionnaire.png')

"Step 48: Click on button addNewEquipment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_addNewEquipment2'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 48-Click on button addNewEquipment2.png')

"Step 49: Click on button addNew2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_addNew2'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 49-Click on button addNew2.png')

"Step 50: Click on input equipmentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_equipmentName'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 50-Click on input equipmentName.png')

"Step 51: Enter input value in input equipmentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_equipmentName'), input_equipmentName)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 51-Enter input value in input equipmentName.png')

"Step 52: Press key Tab on input equipmentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_equipmentName'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 52-Press key Tab on input equipmentName.png')

"Step 53: Enter input value in input softwareVersion2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_softwareVersion2'), input_softwareVersion2)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 53-Enter input value in input softwareVersion2.png')

"Step 54: Press key Tab on input softwareVersion2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_softwareVersion2'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 54-Press key Tab on input softwareVersion2.png')

"Step 55: Enter input value in input manufacturer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_manufacturer'), input_manufacturer)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 55-Enter input value in input manufacturer.png')

"Step 56: Click on faIcon openCalendar8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar8'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 56-Click on faIcon openCalendar8.png')

"Step 57: Click on button dateTimeSelection (dateSelection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_2, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 57-Click on button dateTimeSelection dateSelection.png')

"Step 58: Click on input model"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_model'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 58-Click on input model.png')

"Step 59: Enter input value in input model"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_model'), input_model)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 59-Enter input value in input model.png')

"Step 60: Click on input softwareVersionComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_softwareVersionComment'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 60-Click on input softwareVersionComment.png')

"Step 61: Enter input value in input softwareVersionComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_softwareVersionComment'), input_softwareVersionComment)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 61-Enter input value in input softwareVersionComment.png')

"Step 62: Click on input serialNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_serialNumber'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 62-Click on input serialNumber.png')

"Step 63: Enter input value in input serialNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_serialNumber'), input_serialNumber)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 63-Enter input value in input serialNumber.png')

"Step 64: Click on faIcon openCalendar9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar9'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 64-Click on faIcon openCalendar9.png')

"Step 65: Click on button dateTimeSelection (dateTime6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_3, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 65-Click on button dateTimeSelection dateTime6.png')

"Step 66: Click on input updatePurpose"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_updatePurpose'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 66-Click on input updatePurpose.png')

"Step 67: Enter input value in input updatePurpose"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_updatePurpose'), input_updatePurpose)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 67-Enter input value in input updatePurpose.png')

"Step 68: Click on input radio15T"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radio15T'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 68-Click on input radio15T.png')

"Step 69: Click on input radioCanUploadScannerProtocolYes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioCanUploadScannerProtocolYes'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 69-Click on input radioCanUploadScannerProtocolYes.png')

"Step 70: Click on input radioMobileScannerYes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioMobileScannerYes'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 70-Click on input radioMobileScannerYes.png')

"Step 71: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 71-Click on button next3.png')

"Step 72: Click on faIcon openCalendar5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar5'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 72-Click on faIcon openCalendar5.png')

"Step 73: Click on button dateTimeSelection (dateSelection3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_4, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 73-Click on button dateTimeSelection dateSelection3.png')

"Step 74: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 74-Click on button next3.png')

"Step 75: Click on button addNewLocation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_addNewLocation'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 75-Click on button addNewLocation.png')

"Step 76: Click on input equipmentLocationName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_equipmentLocationName'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 76-Click on input equipmentLocationName.png')

"Step 77: Enter input value in input equipmentLocationName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_equipmentLocationName'), input_equipmentLocationName)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 77-Enter input value in input equipmentLocationName.png')

"Step 78: Click on input address1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_address1'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 78-Click on input address1.png')

"Step 79: Enter input value in input address1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_address1'), input_address1)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 79-Enter input value in input address1.png')

"Step 80: Press key Tab on input address1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_address1'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 80-Press key Tab on input address1.png')

"Step 81: Enter input value in input address2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_address2'), input_address2)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 81-Enter input value in input address2.png')

"Step 82: Press key Tab on input address2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_address2'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 82-Press key Tab on input address2.png')

"Step 83: Enter input value in input address3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_address3'), input_address3)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 83-Enter input value in input address3.png')

"Step 84: Press key Tab on input address3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_address3'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 84-Press key Tab on input address3.png')

"Step 85: Enter input value in input address4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_address4'), input_address4)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 85-Enter input value in input address4.png')

"Step 86: Click on input postalCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_postalCode'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 86-Click on input postalCode.png')

"Step 87: Enter input value in input postalCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_postalCode'), input_postalCode)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 87-Enter input value in input postalCode.png')

"Step 88: Select option with input value from select address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_address'), select_address)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 88-Select option with input value from select address.png')

"Step 89: Click on input city"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_city'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 89-Click on input city.png')

"Step 90: Enter input value in input city"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_city'), input_city)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 90-Enter input value in input city.png')

"Step 91: Press key Tab on input city"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_city'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 91-Press key Tab on input city.png')

"Step 92: Enter input value in input state"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_state'), input_state)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 92-Enter input value in input state.png')

"Step 93: Click on button addLocation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_addLocation'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 93-Click on button addLocation.png')

"Step 94: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 94-Click on button next3.png')

"Step 95: Click on button addNewTechnologist"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_addNewTechnologist'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 95-Click on button addNewTechnologist.png')

"Step 96: Click on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_firstName'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 96-Click on input firstName.png')

"Step 97: Enter input value in input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_firstName'), input_firstName)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 97-Enter input value in input firstName.png')

"Step 98: Press key Tab on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_firstName'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 98-Press key Tab on input firstName.png')

"Step 99: Enter input value in input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_lastName'), input_lastName)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 99-Enter input value in input lastName.png')

"Step 100: Press key Tab on input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_lastName'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 100-Press key Tab on input lastName.png')

"Step 101: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 101-Enter input value in input email.png')

"Step 102: Select option with input value from select position"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_position'), select_position)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 102-Select option with input value from select position.png')

"Step 103: Click on input modalityExperience"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_modalityExperience'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 103-Click on input modalityExperience.png')

"Step 104: Enter input value in input modalityExperience"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_modalityExperience'), input_modalityExperience)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 104-Enter input value in input modalityExperience.png')

"Step 105: Click on input clinicalTrialExperience"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_clinicalTrialExperience'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 105-Click on input clinicalTrialExperience.png')

"Step 106: Enter input value in input clinicalTrialExperience"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_clinicalTrialExperience'), input_clinicalTrialExperience)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 106-Enter input value in input clinicalTrialExperience.png')

"Step 107: Click on button add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_add'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 107-Click on button add.png')

"Step 108: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 108-Click on button next3.png')

"Step 109: Click on input notVeryWell"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_notVeryWell'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 109-Click on input notVeryWell.png')

"Step 110: Click on label notEvaluable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/label_notEvaluable'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 110-Click on label notEvaluable.png')

"Step 111: Click on textarea object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_object3'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 111-Click on textarea object3.png')

"Step 112: Enter input value in textarea object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_object3'), textarea_object3)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 112-Enter input value in textarea object3.png')

"Step 113: Click on button object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object7'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 113-Click on button object7.png')

"Step 114: Click on faIcon openCalendar10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar10'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 114-Click on faIcon openCalendar10.png')

"Step 115: Click on button dateTimeSelection (dateTime7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_5, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_5]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 115-Click on button dateTimeSelection dateTime7.png')

"Step 116: Click on faIcon openTimepicker2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openTimepicker2'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 116-Click on faIcon openTimepicker2.png')

"Step 117: Click on button ok2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_ok2'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 117-Click on button ok2.png')

"Step 118: Click on input yes2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_yes2'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 118-Click on input yes2.png')

"Step 119: Click on button object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object8'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 119-Click on button object8.png')

"Step 120: Click on input no3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_no3'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 120-Click on input no3.png')

"Step 121: Click on input notSure"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_notSure'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 121-Click on input notSure.png')

"Step 122: Click on input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_object'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 122-Click on input object.png')

"Step 123: Click on textarea object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_object4'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 123-Click on textarea object4.png')

"Step 124: Enter input value in textarea object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_object4'), textarea_object4)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 124-Enter input value in textarea object4.png')

"Step 125: Click on input cde"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_cde'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 125-Click on input cde.png')

"Step 126: Click on input c"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_c'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 126-Click on input c.png')

"Step 127: Click on textarea object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_object5'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 127-Click on textarea object5.png')

"Step 128: Enter input value in textarea object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_object5'), textarea_object5)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 128-Enter input value in textarea object5.png')

"Step 129: Click on input radioGroupQuestion2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioGroupQuestion2'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 129-Click on input radioGroupQuestion2.png')

"Step 130: Click on button complete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_complete'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 130-Click on button complete.png')

"Step 131: Click on button submit6 -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit6'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 131-Click on button submit6 - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 132: Click on button siteServiceRoles (demoSite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles', ['button_siteServiceRoles_internalHasText': button_siteServiceRoles_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 132-Click on button siteServiceRoles demoSite.png')

"Step 133: Click on link logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 133-Click on link logout.png')

"Step 134: Select study or organization and apply a filter to the list"

selectStudyOrOrganizationAndApplyFilter.execute(data_path_0, Integer.valueOf(index_0))

"Step 135: Click on span studyProtocol"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_studyProtocol2'))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 135-Click on span studyProtocol.png')

"Step 136: Access administration and filter study links"

accessAdministrationAndFilterStudyLinks.execute(data_path_1, Integer.valueOf(index_1))

"Step 137: Enter input value in input textFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_textFilter'), input_textFilter)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 137-Enter input value in input textFilter.png')

"Step 138: Click on td studyInfo (study)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyInfo', ['td_studyInfo_tdNthChild': td_studyInfo_tdNthChild, 'td_studyInfo_tdNthOfType': td_studyInfo_tdNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 138-Click on td studyInfo study.png')

"Step 139: Click on input scannerDevice (scannerDevice)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/input_scannerDevice"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/input_scannerDevice', ['input_scannerDevice_id': input_scannerDevice_id]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 139-Click on input scannerDevice scannerDevice.png')

"Step 140: Click on button reviewActions (createQuery3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_reviewActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_reviewActions', ['button_reviewActions_buttonNthOfType': button_reviewActions_buttonNthOfType, 'button_reviewActions_dataTestid': button_reviewActions_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 140-Click on button reviewActions createQuery3.png')

"Step 141: Select option with input value from select typeValue3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_typeValue3'), select_typeValue3)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 141-Select option with input value from select typeValue3.png')

"Step 142: Click on button submit7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit7'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 142-Click on button submit7.png')

"Step 143: Enter input value in div rejectingDevice -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_rejectingDevice'), div_rejectingDevice)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 143-Enter input value in div rejectingDevice - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 144: Click on button siteServiceRoles (imgSiteServiceUser)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles', ['button_siteServiceRoles_internalHasText': button_siteServiceRoles_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 144-Click on button siteServiceRoles imgSiteServiceUser.png')

"Step 145: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 145-Click on link logout - Navigate to page dashboard.png')

"Step 146: Click on span projectName -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_projectName'))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 146-Click on span projectName - Navigate to page studiesdashboard.png')

"Step 147: Click on link studyLinks (mySite3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_1, 'link_studyLinks_class': link_studyLinks_class_1, 'link_studyLinks_href_variable': link_studyLinks_href_variable_1, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 147-Click on link studyLinks mySite3.png')

"Step 148: Click on button siteManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteManagement'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 148-Click on button siteManagement.png')

"Step 149: Click on td study2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/td_study2'))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 149-Click on td study2.png')

"Step 150: Click on button modalityOpsUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_modalityOpsUser'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 150-Click on button modalityOpsUser.png')

"Step 151: Click on input updatePurpose"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_updatePurpose'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 151-Click on input updatePurpose.png')

"Step 152: Enter input value in input updatePurpose"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_updatePurpose'), input_updatePurpose_1)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 152-Enter input value in input updatePurpose.png')

"Step 153: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 153-Click on button next3.png')

"Step 154: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 154-Click on button next3.png')

"Step 155: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 155-Click on button next3.png')

"Step 156: Click on button complete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_complete'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 156-Click on button complete.png')

"Step 157: Click on button submit6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit6'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 157-Click on button submit6.png')

"Step 158: Click on textarea comment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_comment'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 158-Click on textarea comment.png')

"Step 159: Enter input value in textarea comment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_comment'), textarea_comment)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 159-Enter input value in textarea comment.png')

"Step 160: Click on button ok3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_ok3'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 160-Click on button ok3.png')

"Step 161: Click on button viewQueries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_viewQueries'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 161-Click on button viewQueries.png')

"Step 162: Click on div open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_open'))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 162-Click on div open.png')

"Step 163: Click on textarea typeHere3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_typeHere3'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 163-Click on textarea typeHere3.png')

"Step 164: Enter input value in textarea typeHere3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_typeHere3'), textarea_typeHere3)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 164-Enter input value in textarea typeHere3.png')

"Step 165: Click on button submit8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit8'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 165-Click on button submit8.png')

"Step 166: Click on faIcon viewQueryList -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_viewQueryList'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 166-Click on faIcon viewQueryList - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 167: Click on button siteServiceRoles (demoSite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles', ['button_siteServiceRoles_internalHasText': button_siteServiceRoles_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 167-Click on button siteServiceRoles demoSite.png')

"Step 168: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 168-Click on link logout - Navigate to page dashboard.png')

"Step 169: Click on span projectName -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_projectName'))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 169-Click on span projectName - Navigate to page studiesdashboard.png')

"Step 170: Click on button administration2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_administration2'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 170-Click on button administration2.png')

"Step 171: Click on link studyLinks (sites)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks_1', ['link_studyLinks_aTitle': link_studyLinks_aTitle_2, 'link_studyLinks_href_variable': link_studyLinks_href_variable_2, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 171-Click on link studyLinks sites.png')

"Step 172: Click on button siteManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteManagement'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 172-Click on button siteManagement.png')

"Step 173: Click on span study"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_study'))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 173-Click on span study.png')

"Step 174: Click on button viewQueries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_viewQueries'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 174-Click on button viewQueries.png')

"Step 175: Click on div responded"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_open'))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 175-Click on div responded.png')

"Step 176: Click on button action2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_action2'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 176-Click on button action2.png')

"Step 177: Select option with input value from select actionType2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_actionType2'), select_actionType2)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 177-Select option with input value from select actionType2.png')

"Step 178: Click on textarea typeHere4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_typeHere4'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 178-Click on textarea typeHere4.png')

"Step 179: Enter input value in textarea typeHere4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_typeHere4'), textarea_typeHere4)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 179-Enter input value in textarea typeHere4.png')

"Step 180: Click on textarea typeHere4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_typeHere4'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 180-Click on textarea typeHere4.png')

"Step 181: Enter input value in textarea typeHere4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_typeHere4'), textarea_typeHere4_1)

WebUI.takeScreenshot(reportLocation + '/TC53/Step 181-Enter input value in textarea typeHere4.png')

"Step 182: Click on button submit8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit8'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 182-Click on button submit8.png')

"Step 183: Click on faIcon viewQueryList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_viewQueryList'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 183-Click on faIcon viewQueryList.png')

"Step 184: Select scanner device and submit review comments."

reviewActionsWithScannerDevice.execute(data_path_2, Integer.valueOf(index_2))

"Step 185: Click on button siteServiceRoles (imgSiteServiceUser)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles', ['button_siteServiceRoles_internalHasText': button_siteServiceRoles_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 185-Click on button siteServiceRoles imgSiteServiceUser.png')

"Step 186: Click on link logout -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC53/Step 186-Click on link logout - Navigate to page .png')

"Step 187: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC53-Complete Study Questionnaire and Manage Equipment_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}