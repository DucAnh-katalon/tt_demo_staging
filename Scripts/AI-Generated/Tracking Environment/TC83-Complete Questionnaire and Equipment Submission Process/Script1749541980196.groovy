import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.accessAdministrationAndFilterStudyLinks
import truetest.Tracking_Environment.common.filterSiteManagementByText
import truetest.Tracking_Environment.common.reviewActionsWithScannerDevice
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

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 2-Click on list quicklink3.png')

"Step 3: Click on div globalDashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_globalDashboard'))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 3-Click on div globalDashboard.png')

"Step 4: Click on span projectName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_projectName'))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 4-Click on span projectName2.png')

"Step 5: Filter site management options using text input."

filterSiteManagementByText.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on span study2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_study2'))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 6-Click on span study2.png')

"Step 7: Click on button startQuestionnaire"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_startQuestionnaire'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 7-Click on button startQuestionnaire.png')

"Step 8: Click on faIcon openTimepicker3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openTimepicker3'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 8-Click on faIcon openTimepicker3.png')

"Step 9: Click on button ok2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_ok2'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 9-Click on button ok2.png')

"Step 10: Click on input object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_object2'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 10-Click on input object2.png')

"Step 11: Enter input value in input object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_object2'), input_object2)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 11-Enter input value in input object2.png')

"Step 12: Click on faIcon openCalendar11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar11'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 12-Click on faIcon openCalendar11.png')

"Step 13: Click on button dateTimeSelection (dateSelection4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 13-Click on button dateTimeSelection dateSelection4.png')

"Step 14: Click on faIcon openCalendar12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar12'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 14-Click on faIcon openCalendar12.png')

"Step 15: Click on button dateTimeSelection (dateSelection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_1, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 15-Click on button dateTimeSelection dateSelection.png')

"Step 16: Click on span arrow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_arrow'))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 16-Click on span arrow.png')

"Step 17: Click on div optionYes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_optionYes'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 17-Click on div optionYes.png')

"Step 18: Click on div wafListSingleComp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_wafListSingleComp'))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 18-Click on div wafListSingleComp.png')

"Step 19: Click on span ngSelectArrow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_ngSelectArrow'))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 19-Click on span ngSelectArrow.png')

"Step 20: Click on div optionNo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_optionNo'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 20-Click on div optionNo.png')

"Step 21: Click on button numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_numberField'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 21-Click on button numberField.png')

"Step 22: Click on button numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_numberField'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 22-Click on button numberField.png')

"Step 23: Click on button numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_numberField'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 23-Click on button numberField.png')

"Step 24: Click on button numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_numberField'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 24-Click on button numberField.png')

"Step 25: Click on button numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_numberField'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 25-Click on button numberField.png')

"Step 26: Click on button numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_numberField'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 26-Click on button numberField.png')

"Step 27: Click on button numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_numberField'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 27-Click on button numberField.png')

"Step 28: Click on button numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_numberField'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 28-Click on button numberField.png')

"Step 29: Click on input numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_numberField'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 29-Click on input numberField.png')

"Step 30: Click on input numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_numberField'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 30-Click on input numberField.png')

"Step 31: Enter input value in input numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_numberField'), input_numberField)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 31-Enter input value in input numberField.png')

"Step 32: Click on div numberField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_numberField'))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 32-Click on div numberField.png')

"Step 33: Click on button submitQuestionnaire"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submitQuestionnaire'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 33-Click on button submitQuestionnaire.png')

"Step 34: Click on button addNewEquipment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_addNewEquipment2'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 34-Click on button addNewEquipment2.png')

"Step 35: Click on button addNew2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_addNew2'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 35-Click on button addNew2.png')

"Step 36: Click on input equipmentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_equipmentName'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 36-Click on input equipmentName.png')

"Step 37: Enter input value in input equipmentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_equipmentName'), input_equipmentName)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 37-Enter input value in input equipmentName.png')

"Step 38: Press key Tab on input equipmentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_equipmentName'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 38-Press key Tab on input equipmentName.png')

"Step 39: Enter input value in input softwareVersion2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_softwareVersion2'), input_softwareVersion2)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 39-Enter input value in input softwareVersion2.png')

"Step 40: Click on input manufacturer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_manufacturer'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 40-Click on input manufacturer.png')

"Step 41: Enter input value in input manufacturer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_manufacturer'), input_manufacturer)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 41-Enter input value in input manufacturer.png')

"Step 42: Click on faIcon openCalendar8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar8'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 42-Click on faIcon openCalendar8.png')

"Step 43: Click on button dateTimeSelection (dateTime8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_2, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 43-Click on button dateTimeSelection dateTime8.png')

"Step 44: Click on input model"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_model'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 44-Click on input model.png')

"Step 45: Enter input value in input model"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_model'), input_model)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 45-Enter input value in input model.png')

"Step 46: Click on input softwareVersionComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_softwareVersionComment'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 46-Click on input softwareVersionComment.png')

"Step 47: Enter input value in input softwareVersionComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_softwareVersionComment'), input_softwareVersionComment)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 47-Enter input value in input softwareVersionComment.png')

"Step 48: Click on input serialNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_serialNumber'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 48-Click on input serialNumber.png')

"Step 49: Enter input value in input serialNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_serialNumber'), input_serialNumber)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 49-Enter input value in input serialNumber.png')

"Step 50: Click on faIcon openCalendar9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar9'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 50-Click on faIcon openCalendar9.png')

"Step 51: Click on button dateTimeSelection (dateTime9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_3, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 51-Click on button dateTimeSelection dateTime9.png')

"Step 52: Click on input updatePurpose"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_updatePurpose'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 52-Click on input updatePurpose.png')

"Step 53: Enter input value in input updatePurpose"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_updatePurpose'), input_updatePurpose)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 53-Enter input value in input updatePurpose.png')

"Step 54: Click on button openCalendar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_openCalendar2'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 54-Click on button openCalendar2.png')

"Step 55: Click on button dateTimeSelection (dateSelection5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_4, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 55-Click on button dateTimeSelection dateSelection5.png')

"Step 56: Click on input radio15T"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radio15T'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 56-Click on input radio15T.png')

"Step 57: Click on input radioCanUploadScannerProtocolYes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioCanUploadScannerProtocolYes'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 57-Click on input radioCanUploadScannerProtocolYes.png')

"Step 58: Click on input radioMobileScannerYes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioMobileScannerYes'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 58-Click on input radioMobileScannerYes.png')

"Step 59: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 59-Click on button next3.png')

"Step 60: Click on input deviceLocation2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_deviceLocation2'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 60-Click on input deviceLocation2.png')

"Step 61: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 61-Click on button next3.png')

"Step 62: Click on input checkbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_checkbox'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 62-Click on input checkbox.png')

"Step 63: Select option with input value from select position"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_position'), select_position)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 63-Select option with input value from select position.png')

"Step 64: Click on input modalityExperience"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_modalityExperience'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 64-Click on input modalityExperience.png')

"Step 65: Enter input value in input modalityExperience"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_modalityExperience'), input_modalityExperience)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 65-Enter input value in input modalityExperience.png')

"Step 66: Click on input clinicalTrialExperience"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_clinicalTrialExperience'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 66-Click on input clinicalTrialExperience.png')

"Step 67: Enter input value in input clinicalTrialExperience"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_clinicalTrialExperience'), input_clinicalTrialExperience)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 67-Enter input value in input clinicalTrialExperience.png')

"Step 68: Click on button add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_add'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 68-Click on button add.png')

"Step 69: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 69-Click on button next3.png')

"Step 70: Click on faIcon openTimepicker4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openTimepicker4'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 70-Click on faIcon openTimepicker4.png')

"Step 71: Click on button ok2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_ok2'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 71-Click on button ok2.png')

"Step 72: Click on input object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_object3'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 72-Click on input object3.png')

"Step 73: Enter input value in input object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_object3'), input_object3)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 73-Enter input value in input object3.png')

"Step 74: Click on faIcon openCalendar13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar13'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 74-Click on faIcon openCalendar13.png')

"Step 75: Click on button dateTimeSelection (dateSelection4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_5, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_5]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 75-Click on button dateTimeSelection dateSelection4.png')

"Step 76: Click on faIcon openCalendar14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar14'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 76-Click on faIcon openCalendar14.png')

"Step 77: Click on button dateTimeSelection (dateSelection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_6, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 77-Click on button dateTimeSelection dateSelection.png')

"Step 78: Click on div ngSelectContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_ngSelectContainer'))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 78-Click on div ngSelectContainer.png')

"Step 79: Click on div optionNo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_optionNo2'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 79-Click on div optionNo2.png')

"Step 80: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 80-Click on div object2.png')

"Step 81: Click on div input"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_input'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 81-Click on div input.png')

"Step 82: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 82-Click on div object3.png')

"Step 83: Click on button complete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_complete'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 83-Click on button complete.png')

"Step 84: Click on button addNewEquipment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_addNewEquipment2'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 84-Click on button addNewEquipment2.png')

"Step 85: Click on input selectSiteDevice"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_selectSiteDevice'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 85-Click on input selectSiteDevice.png')

"Step 86: Click on button continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_continue'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 86-Click on button continue.png')

"Step 87: Click on input radioCanUploadScannerProtocolYes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioCanUploadScannerProtocolYes'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 87-Click on input radioCanUploadScannerProtocolYes.png')

"Step 88: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 88-Click on button next3.png')

"Step 89: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 89-Click on button next3.png')

"Step 90: Click on input checkbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_checkbox'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 90-Click on input checkbox.png')

"Step 91: Select option with input value from select position"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_position'), select_position_1)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 91-Select option with input value from select position.png')

"Step 92: Click on button add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_add'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 92-Click on button add.png')

"Step 93: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 93-Click on button next3.png')

"Step 94: Click on faIcon openTimepicker4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openTimepicker4'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 94-Click on faIcon openTimepicker4.png')

"Step 95: Click on button ok2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_ok2'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 95-Click on button ok2.png')

"Step 96: Click on input object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_object3'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 96-Click on input object3.png')

"Step 97: Enter input value in input object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_object3'), input_object3_1)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 97-Enter input value in input object3.png')

"Step 98: Click on faIcon openCalendar13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar13'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 98-Click on faIcon openCalendar13.png')

"Step 99: Click on button dateTimeSelection (dateTime10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_7, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_7]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 99-Click on button dateTimeSelection dateTime10.png')

"Step 100: Click on button openCalendar3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_openCalendar3'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 100-Click on button openCalendar3.png')

"Step 101: Click on button dateTimeSelection (dateSelection)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_8, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_8]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 101-Click on button dateTimeSelection dateSelection.png')

"Step 102: Click on div ngSelectContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_ngSelectContainer'))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 102-Click on div ngSelectContainer.png')

"Step 103: Click on div optionNo3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_optionNo3'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 103-Click on div optionNo3.png')

"Step 104: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_object4'))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 104-Click on div object4.png')

"Step 105: Click on button complete"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_complete'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 105-Click on button complete.png')

"Step 106: Click on button submit6 -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit6'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 106-Click on button submit6 - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 107: Click on button siteServiceRoles (demoSite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles', ['button_siteServiceRoles_internalHasText': button_siteServiceRoles_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 107-Click on button siteServiceRoles demoSite.png')

"Step 108: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 108-Click on link logout - Navigate to page dashboard.png')

"Step 109: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 109-Click on button close.png')

"Step 110: Click on span projectName2 -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_projectName'))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 110-Click on span projectName2 - Navigate to page studiesdashboard.png')

"Step 111: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 111-Click on button close.png')

"Step 112: Access administration and filter study links"

accessAdministrationAndFilterStudyLinks.execute(data_path_1, Integer.valueOf(index_1))

"Step 113: Click on button apply2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply2'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 113-Click on button apply2.png')

"Step 114: Click on td studyInfo (study3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyInfo', ['td_studyInfo_tdNthChild': td_studyInfo_tdNthChild, 'td_studyInfo_tdNthOfType': td_studyInfo_tdNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 114-Click on td studyInfo study3.png')

"Step 115: Click on button open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_open'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 115-Click on button open.png')

"Step 116: Click on input scanner"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_scanner'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 116-Click on input scanner.png')

"Step 117: Click on faIcon object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object10'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 117-Click on faIcon object10.png')

"Step 118: Click on button reviewActions (reviewed)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_reviewActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_reviewActions', ['button_reviewActions_buttonNthOfType': button_reviewActions_buttonNthOfType, 'button_reviewActions_dataTestid': button_reviewActions_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 118-Click on button reviewActions reviewed.png')

"Step 119: Click on textarea comment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_comment'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 119-Click on textarea comment.png')

"Step 120: Enter input value in textarea comment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_comment'), textarea_comment)

WebUI.takeScreenshot(reportLocation + '/TC83/Step 120-Enter input value in textarea comment.png')

"Step 121: Click on button ok3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_ok3'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 121-Click on button ok3.png')

"Step 122: Select scanner device and submit review comments."

reviewActionsWithScannerDevice.execute(data_path_2, Integer.valueOf(index_2))

"Step 123: Click on button siteServiceRoles (imgSiteServiceUser)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles', ['button_siteServiceRoles_internalHasText': button_siteServiceRoles_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 123-Click on button siteServiceRoles imgSiteServiceUser.png')

"Step 124: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 124-Click on link logout - Navigate to page dashboard.png')

"Step 125: Click on span projectNames (projectName3) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/span_projectNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/span_projectNames', ['span_projectNames_trNthChild': span_projectNames_trNthChild, 'span_projectNames_trNthOfType': span_projectNames_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 125-Click on span projectNames projectName3 - Navigate to page studiesdashboard.png')

"Step 126: Click on link studyLinks (mySite3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 126-Click on link studyLinks mySite3.png')

"Step 127: Click on button siteManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteManagement'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 127-Click on button siteManagement.png')

"Step 128: Click on span studyDetails (principalInvestigator)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_studyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_studyDetails', ['span_studyDetails_tdNthChild': span_studyDetails_tdNthChild, 'span_studyDetails_tdNthOfType': span_studyDetails_tdNthOfType, 'span_studyDetails_trNthChild': span_studyDetails_trNthChild, 'span_studyDetails_trNthOfType': span_studyDetails_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC83/Step 128-Click on span studyDetails principalInvestigator.png')

"Step 129: Click on button siteAndModalityActions (siteUsers)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAndModalityActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAndModalityActions', ['button_siteAndModalityActions_internalText': button_siteAndModalityActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 129-Click on button siteAndModalityActions siteUsers.png')

"Step 130: Click on button siteAndModalityActions (modalities)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAndModalityActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAndModalityActions', ['button_siteAndModalityActions_internalText': button_siteAndModalityActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 130-Click on button siteAndModalityActions modalities.png')

"Step 131: Click on button startQuestionnaire"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_startQuestionnaire'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 131-Click on button startQuestionnaire.png')

"Step 132: Click on faIcon object11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object11'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 132-Click on faIcon object11.png')

"Step 133: Click on button addNewEquipment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_addNewEquipment2'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 133-Click on button addNewEquipment2.png')

"Step 134: Click on faIcon object12 -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object12'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 134-Click on faIcon object12 - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 135: Click on button siteServiceRoles (demoSite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles', ['button_siteServiceRoles_internalHasText': button_siteServiceRoles_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 135-Click on button siteServiceRoles demoSite.png')

"Step 136: Click on link logout -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC83/Step 136-Click on link logout - Navigate to page .png')

"Step 137: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC83-Complete Questionnaire and Equipment Submission Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}