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

"Step 2: Click on link studies4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_studies4'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 2-Click on link studies4.png')

"Step 3: Click on button addForms"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addForms'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 3-Click on button addForms.png')

"Step 4: Click on input searchAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_searchAll'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 4-Click on input searchAll.png')

"Step 5: Enter input value in input searchAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_searchAll'), input_searchAll)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 5-Enter input value in input searchAll.png')

"Step 6: Press key Enter on input searchAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_searchAll'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 6-Press key Enter on input searchAll.png')

"Step 7: Enter input value in input searchAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_searchAll'), input_searchAll_1)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 7-Enter input value in input searchAll.png')

"Step 8: Click on input searchAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_searchAll'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 8-Click on input searchAll.png')

"Step 9: Click on input searchAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_searchAll'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 9-Click on input searchAll.png')

"Step 10: Enter input value in input searchAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_searchAll'), input_searchAll_2)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 10-Enter input value in input searchAll.png')

"Step 11: Press key Enter on input searchAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_searchAll'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 11-Press key Enter on input searchAll.png')

"Step 12: Enter input value in input searchAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_searchAll'), input_searchAll_3)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 12-Enter input value in input searchAll.png')

"Step 13: Click on input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_object'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 13-Click on input object.png')

"Step 14: Click on input object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_object2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 14-Click on input object2.png')

"Step 15: Click on input object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_object3'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 15-Click on input object3.png')

"Step 16: Click on button save2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 16-Click on button save2.png')

"Step 17: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 17-Click on button object2.png')

"Step 18: Click on button addItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addItem'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 18-Click on button addItem.png')

"Step 19: Select option with input value from select idFormat"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_idFormat'), select_idFormat)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 19-Select option with input value from select idFormat.png')

"Step 20: Click on button addItem2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addItem2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 20-Click on button addItem2.png')

"Step 21: Select option with input value from select delimiter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_delimiter'), select_delimiter)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 21-Select option with input value from select delimiter.png')

"Step 22: Select option with input value from select idFormats"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_idFormats'), select_idFormats)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 22-Select option with input value from select idFormats.png')

"Step 23: Select option with input value from select countryItems"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_countryItems'), select_countryItems)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 23-Select option with input value from select countryItems.png')

"Step 24: Click on input minNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_minNumber'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 24-Click on input minNumber.png')

"Step 25: Enter input value in input minNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_minNumber'), input_minNumber)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 25-Enter input value in input minNumber.png')

"Step 26: Click on input maxNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_maxNumber'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 26-Click on input maxNumber.png')

"Step 27: Enter input value in input maxNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_maxNumber'), input_maxNumber)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 27-Enter input value in input maxNumber.png')

"Step 28: Click on button object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_object3'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 28-Click on button object3.png')

"Step 29: Click on label general"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/label_general'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 29-Click on label general.png')

"Step 30: Click on details general"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/details_general'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 30-Click on details general.png')

"Step 31: Click on span general"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_general'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 31-Click on span general.png')

"Step 32: Click on input numberFields (number)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/input_numberFields"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/input_numberFields', ['input_numberFields_nth': input_numberFields_nth, 'input_numberFields_sectionNthOfType': input_numberFields_sectionNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 32-Click on input numberFields number.png')

"Step 33: Enter input value in input numberFields (number)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/input_numberFields"
WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/input_numberFields', ['input_numberFields_nth': input_numberFields_nth_1, 'input_numberFields_sectionNthOfType': input_numberFields_sectionNthOfType_1]), input_numberFields)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 33-Enter input value in input numberFields number.png')

"Step 34: Click on input numberFields (numberHelp)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/input_numberFields"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/input_numberFields', ['input_numberFields_nth': input_numberFields_nth_2, 'input_numberFields_sectionNthOfType': input_numberFields_sectionNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 34-Click on input numberFields numberHelp.png')

"Step 35: Enter input value in input numberFields (numberHelp)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/input_numberFields"
WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/input_numberFields', ['input_numberFields_nth': input_numberFields_nth_3, 'input_numberFields_sectionNthOfType': input_numberFields_sectionNthOfType_3]), input_numberFields_1)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 35-Enter input value in input numberFields numberHelp.png')

"Step 36: Click on input numberFields (helpNumber)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/input_numberFields"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/input_numberFields', ['input_numberFields_nth': input_numberFields_nth_4, 'input_numberFields_sectionNthOfType': input_numberFields_sectionNthOfType_4]))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 36-Click on input numberFields helpNumber.png')

"Step 37: Enter input value in input numberFields (helpNumber)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/input_numberFields"
WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/input_numberFields', ['input_numberFields_nth': input_numberFields_nth_5, 'input_numberFields_sectionNthOfType': input_numberFields_sectionNthOfType_5]), input_numberFields_2)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 37-Enter input value in input numberFields helpNumber.png')

"Step 38: Click on button addModality"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addModality'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 38-Click on button addModality.png')

"Step 39: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 39-Click on div object.png')

"Step 40: Click on input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 40-Click on input search.png')

"Step 41: Enter input value in input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_search'), input_search)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 41-Enter input value in input search.png')

"Step 42: Click on div optionMr"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_optionMr'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 42-Click on div optionMr.png')

"Step 43: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 43-Click on div object2.png')

"Step 44: Click on div optionBrain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_optionBrain'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 44-Click on div optionBrain.png')

"Step 45: Click on crModalBody modalityDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/crModalBody_modalityDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 45-Click on crModalBody modalityDetails.png')

"Step 46: Click on button save3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save3'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 46-Click on button save3.png')

"Step 47: Click on details mrDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/details_mrDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 47-Click on details mrDetails.png')

"Step 48: Click on summary object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/summary_object'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 48-Click on summary object.png')

"Step 49: Click on button addForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addForm'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 49-Click on button addForm.png')

"Step 50: Click on input radio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_radio'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 50-Click on input radio.png')

"Step 51: Click on button save4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save4'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 51-Click on button save4.png')

"Step 52: Click on button addForm2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addForm2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 52-Click on button addForm2.png')

"Step 53: Click on input radio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_radio'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 53-Click on input radio.png')

"Step 54: Click on button save4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save4'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 54-Click on button save4.png')

"Step 55: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 55-Click on label object.png')

"Step 56: Click on label object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/label_object2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 56-Click on label object2.png')

"Step 57: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 57-Click on button object2.png')

"Step 58: Click on div subjectNumberFormat"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_subjectNumberFormat'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 58-Click on div subjectNumberFormat.png')

"Step 59: Click on div subjectNumberFormatInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_subjectNumberFormatInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 59-Click on div subjectNumberFormatInfo.png')

"Step 60: Click on input subjectNumberFormat"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_subjectNumberFormat'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 60-Click on input subjectNumberFormat.png')

"Step 61: Enter input value in input subjectNumberFormat"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_subjectNumberFormat'), input_subjectNumberFormat)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 61-Enter input value in input subjectNumberFormat.png')

"Step 62: Click on input configure"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_configure'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 62-Click on input configure.png')

"Step 63: Click on input subjectNumberFormat2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_subjectNumberFormat2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 63-Click on input subjectNumberFormat2.png')

"Step 64: Enter input value in input subjectNumberFormat2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_subjectNumberFormat2'), input_subjectNumberFormat2)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 64-Enter input value in input subjectNumberFormat2.png')

"Step 65: Click on input required"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_required'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 65-Click on input required.png')

"Step 66: Click on input optionalGender"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_optionalGender'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 66-Click on input optionalGender.png')

"Step 67: Click on input showIntersex"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_showIntersex'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 67-Click on input showIntersex.png')

"Step 68: Click on link addCustomState"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_addCustomState'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 68-Click on link addCustomState.png')

"Step 69: Click on input stateDisplayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_stateDisplayName'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 69-Click on input stateDisplayName.png')

"Step 70: Enter input value in input stateDisplayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_stateDisplayName'), input_stateDisplayName)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 70-Enter input value in input stateDisplayName.png')

"Step 71: Click on div semantics"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_semantics'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 71-Click on div semantics.png')

"Step 72: Click on div activeSubjectIndication"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_activeSubjectIndication'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 72-Click on div activeSubjectIndication.png')

"Step 73: Click on label dateOfDosing"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/label_dateOfDosing'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 73-Click on label dateOfDosing.png')

"Step 74: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 74-Click on button object2.png')

"Step 75: Click on button createExam"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_createExam'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 75-Click on button createExam.png')

"Step 76: Click on div modality"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_modality'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 76-Click on div modality.png')

"Step 77: Click on input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 77-Click on input search.png')

"Step 78: Enter input value in input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_search'), input_search_1)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 78-Enter input value in input search.png')

"Step 79: Click on div mrOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_mrOption'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 79-Click on div mrOption.png')

"Step 80: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 80-Click on div object3.png')

"Step 81: Click on div optionBrain2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_optionBrain2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 81-Click on div optionBrain2.png')

"Step 82: Click on button save5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save5'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 82-Click on button save5.png')

"Step 83: Click on link addSegment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_addSegment'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 83-Click on link addSegment.png')

"Step 84: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 84-Click on div object4.png')

"Step 85: Click on div optionBaselineScreening"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_optionBaselineScreening'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 85-Click on div optionBaselineScreening.png')

"Step 86: Click on input segmentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_segmentName'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 86-Click on input segmentName.png')

"Step 87: Enter input value in input segmentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_segmentName'), input_segmentName)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 87-Enter input value in input segmentName.png')

"Step 88: Click on button addVisits"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addVisits'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 88-Click on button addVisits.png')

"Step 89: Click on input visitLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_visitLabel'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 89-Click on input visitLabel.png')

"Step 90: Enter input value in input visitLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_visitLabel'), input_visitLabel)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 90-Enter input value in input visitLabel.png')

"Step 91: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 91-Click on div object5.png')

"Step 92: Click on div optionAnyDay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_optionAnyDay'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 92-Click on div optionAnyDay.png')

"Step 93: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 93-Click on button create.png')

"Step 94: Click on link addSegment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_addSegment'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 94-Click on link addSegment.png')

"Step 95: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 95-Click on div object4.png')

"Step 96: Click on div optionOnStudyTreatment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_optionOnStudyTreatment'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 96-Click on div optionOnStudyTreatment.png')

"Step 97: Click on input segmentName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_segmentName2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 97-Click on input segmentName2.png')

"Step 98: Enter input value in input segmentName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_segmentName2'), input_segmentName2)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 98-Enter input value in input segmentName2.png')

"Step 99: Click on input allowUnscheduledVisits"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_allowUnscheduledVisits'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 99-Click on input allowUnscheduledVisits.png')

"Step 100: Click on button addVisits"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addVisits'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 100-Click on button addVisits.png')

"Step 101: Click on input visitLabel2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_visitLabel2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 101-Click on input visitLabel2.png')

"Step 102: Enter input value in input visitLabel2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_visitLabel2'), input_visitLabel2)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 102-Enter input value in input visitLabel2.png')

"Step 103: Click on div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_object6'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 103-Click on div object6.png')

"Step 104: Click on div previousVisitOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_previousVisitOption'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 104-Click on div previousVisitOption.png')

"Step 105: Click on input expectedTimeIncrement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_expectedTimeIncrement'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 105-Click on input expectedTimeIncrement.png')

"Step 106: Enter input value in input expectedTimeIncrement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_expectedTimeIncrement'), input_expectedTimeIncrement)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 106-Enter input value in input expectedTimeIncrement.png')

"Step 107: Click on div select"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_select'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 107-Click on div select.png')

"Step 108: Click on div weeksOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_weeksOption'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 108-Click on div weeksOption.png')

"Step 109: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 109-Click on button create.png')

"Step 110: Click on button addRead"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addRead'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 110-Click on button addRead.png')

"Step 111: Click on div addReadType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_addReadType'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 111-Click on div addReadType.png')

"Step 112: Click on div bmwOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_bmwOption'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 112-Click on div bmwOption.png')

"Step 113: Click on input displayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_displayName'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 113-Click on input displayName.png')

"Step 114: Enter input value in input displayName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_displayName'), input_displayName)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 114-Enter input value in input displayName.png')

"Step 115: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 115-Click on button submit.png')

"Step 116: Click on button addRead2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addRead2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 116-Click on button addRead2.png')

"Step 117: Click on div addReadType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_addReadType'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 117-Click on div addReadType.png')

"Step 118: Click on div bmwOption2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_bmwOption2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 118-Click on div bmwOption2.png')

"Step 119: Click on input displayName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_displayName2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 119-Click on input displayName2.png')

"Step 120: Enter input value in input displayName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_displayName2'), input_displayName2)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 120-Enter input value in input displayName2.png')

"Step 121: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 121-Click on button submit.png')

"Step 122: Click on button configure"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_configure'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 122-Click on button configure.png')

"Step 123: Click on div readTimingInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_readTimingInput'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 123-Click on div readTimingInput.png')

"Step 124: Click on div optionRollingRead"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_optionRollingRead'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 124-Click on div optionRollingRead.png')

"Step 125: Click on button save6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save6'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 125-Click on button save6.png')

"Step 126: Click on faIcon object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 126-Click on faIcon object5.png')

"Step 127: Click on faIcon dynamicObject (object6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/faIcon_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/faIcon_dynamicObject', ['faIcon_dynamicObject_divNthOfType': faIcon_dynamicObject_divNthOfType, 'faIcon_dynamicObject_nth': faIcon_dynamicObject_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 127-Click on faIcon dynamicObject object6.png')

"Step 128: Click on button addForm3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addForm3'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 128-Click on button addForm3.png')

"Step 129: Click on input radio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_radio'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 129-Click on input radio.png')

"Step 130: Click on button attach"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_attach'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 130-Click on button attach.png')

"Step 131: Click on button save7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save7'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 131-Click on button save7.png')

"Step 132: Click on faIcon object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_object7'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 132-Click on faIcon object7.png')

"Step 133: Click on faIcon dynamicObject (object8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/faIcon_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/faIcon_dynamicObject', ['faIcon_dynamicObject_divNthOfType': faIcon_dynamicObject_divNthOfType_1, 'faIcon_dynamicObject_nth': faIcon_dynamicObject_nth_1]))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 133-Click on faIcon dynamicObject object8.png')

"Step 134: Click on button addForm3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addForm3'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 134-Click on button addForm3.png')

"Step 135: Click on input radio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_radio'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 135-Click on input radio.png')

"Step 136: Click on button attach"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_attach'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 136-Click on button attach.png')

"Step 137: Click on button save7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save7'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 137-Click on button save7.png')

"Step 138: Click on faIcon object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_object7'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 138-Click on faIcon object7.png')

"Step 139: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 139-Click on button object4.png')

"Step 140: Click on faIcon object9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_object9'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 140-Click on faIcon object9.png')

"Step 141: Click on div dataUploadSections (dataUpload3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dataUploadSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/div_dataUploadSections', ['div_dataUploadSections_dataTestid': div_dataUploadSections_dataTestid]))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 141-Click on div dataUploadSections dataUpload3.png')

"Step 142: Click on button addForm4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addForm4'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 142-Click on button addForm4.png')

"Step 143: Click on input radio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_radio'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 143-Click on input radio.png')

"Step 144: Click on button save8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save8'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 144-Click on button save8.png')

"Step 145: Click on button addForm5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addForm4'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 145-Click on button addForm5.png')

"Step 146: Click on input radio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_radio'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 146-Click on input radio.png')

"Step 147: Click on button save8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save8'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 147-Click on button save8.png')

"Step 148: Click on button addForm6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addForm6'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 148-Click on button addForm6.png')

"Step 149: Click on input radio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_radio'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 149-Click on input radio.png')

"Step 150: Click on button save8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save8'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 150-Click on button save8.png')

"Step 151: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 151-Click on button object4.png')

"Step 152: Click on button addForm7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_addForm7'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 152-Click on button addForm7.png')

"Step 153: Click on input radio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_radio'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 153-Click on input radio.png')

"Step 154: Click on button save8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save8'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 154-Click on button save8.png')

"Step 155: Select option with input value from select comboboxFormOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_comboboxFormOptions'), select_comboboxFormOptions)

WebUI.takeScreenshot(reportLocation + '/TC84/Step 155-Select option with input value from select comboboxFormOptions.png')

"Step 156: Click on input addToReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_addToReport'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 156-Click on input addToReport.png')

"Step 157: Click on button save9 -> Navigate to page '/studies/*/imaging-study-config'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save9'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 157-Click on button save9 - Navigate to page studiesimaging-study-config.png')

"Step 158: Click on p copyright"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/p_copyright2'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 158-Click on p copyright.png')

"Step 159: Click on p copyright"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/p_copyright2'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 159-Click on p copyright.png')

"Step 160: Click on button publish"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_publish'))

// WebUI.takeScreenshot(reportLocation + '/TC84/Step 160-Click on button publish.png')

"Step 161: Click on button publishConfiguration2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/imaging-study-config?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_imaging_study_config/button_publishConfiguration2'))

WebUI.takeScreenshot(reportLocation + '/TC84/Step 161-Click on button publishConfiguration2 - Navigate to page .png')

"Step 162: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC84-Add Forms and Configure Study Parameters_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}