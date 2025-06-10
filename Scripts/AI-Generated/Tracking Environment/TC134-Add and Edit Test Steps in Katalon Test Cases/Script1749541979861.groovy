import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.addStepsToTestCaseAndEditDetails
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /project/*/tests/test-cases/*"

TrueTestScripts.navigate("/project/${project_id}/tests/test-cases/${test_cases_id}")

"Step 2: Click on link katalonCloud2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_katalonCloud2'))

WebUI.takeScreenshot(reportLocation + '/TC134/Step 2-Click on link katalonCloud2.png')

"Step 3: Add new steps to a test case and edit details"

addStepsToTestCaseAndEditDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on div newStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_newStep'))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 4-Click on div newStep.png')

"Step 5: Click on button newStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_newStep'))

WebUI.takeScreenshot(reportLocation + '/TC134/Step 5-Click on button newStep.png')

"Step 6: Click on div testSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_testSteps'))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 6-Click on div testSteps.png')

"Step 7: Click on div testCaseDetails (object9)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 7-Click on div testCaseDetails object9.png')

"Step 8: Click on div testCaseDetails (object10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_1, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_1, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_1, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 8-Click on div testCaseDetails object10.png')

"Step 9: Click on button newStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_newStep'))

WebUI.takeScreenshot(reportLocation + '/TC134/Step 9-Click on button newStep.png')

"Step 10: Click on div testCaseDetails (object11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_2, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_2, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_2, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 10-Click on div testCaseDetails object11.png')

"Step 11: Enter input value in textarea manualEditor2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_manualEditor2'), textarea_manualEditor2)

WebUI.takeScreenshot(reportLocation + '/TC134/Step 11-Enter input value in textarea manualEditor2.png')

"Step 12: Click on div testCaseDetails (object12)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_3, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_3, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_3, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_3]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 12-Click on div testCaseDetails object12.png')

"Step 13: Click on div testCaseDetails (object13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_4, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_4, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_4, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_4]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 13-Click on div testCaseDetails object13.png')

"Step 14: Click on div testCaseDetails (object13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_5, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_5, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_5, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_5]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 14-Click on div testCaseDetails object13.png')

"Step 15: Click on div testCaseDetails (object13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_6, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_6, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_6, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_6]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 15-Click on div testCaseDetails object13.png')

"Step 16: Enter input value in textarea manualEditor3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_manualEditor3'), textarea_manualEditor3)

WebUI.takeScreenshot(reportLocation + '/TC134/Step 16-Enter input value in textarea manualEditor3.png')

"Step 17: Click on button newStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_newStep'))

WebUI.takeScreenshot(reportLocation + '/TC134/Step 17-Click on button newStep.png')

"Step 18: Click on div testCaseDetails (testCaseCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_7, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_7, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_7, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_7]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 18-Click on div testCaseDetails testCaseCell.png')

"Step 19: Click on div testCaseDetails (testCaseCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_8, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_8, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_8, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_8]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 19-Click on div testCaseDetails testCaseCell.png')

"Step 20: Click on div testCaseDetails (testCaseCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_9, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_9, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_9, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_9]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 20-Click on div testCaseDetails testCaseCell.png')

"Step 21: Click on div testCaseDetails (testCaseCell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_10, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_10, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_10, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_10]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 21-Click on div testCaseDetails testCaseCell.png')

"Step 22: Click on textarea manualEditorEditCell"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_manualEditorEditCell'))

WebUI.takeScreenshot(reportLocation + '/TC134/Step 22-Click on textarea manualEditorEditCell.png')

"Step 23: Enter input value in textarea manualEditorEditCell"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_manualEditorEditCell'), textarea_manualEditorEditCell)

WebUI.takeScreenshot(reportLocation + '/TC134/Step 23-Enter input value in textarea manualEditorEditCell.png')

"Step 24: Click on div testCaseDetails (object14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_11, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_11, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_11, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_11]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 24-Click on div testCaseDetails object14.png')

"Step 25: Click on button newStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_newStep'))

WebUI.takeScreenshot(reportLocation + '/TC134/Step 25-Click on button newStep.png')

"Step 26: Click on div testCaseDetails (object15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_12, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_12, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_12, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_12]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 26-Click on div testCaseDetails object15.png')

"Step 27: Click on div testCaseDetails (object15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_13, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_13, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_13, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_13]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 27-Click on div testCaseDetails object15.png')

"Step 28: Click on div testCaseDetails (object15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_14, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_14, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_14, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_14]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 28-Click on div testCaseDetails object15.png')

"Step 29: Click on div testCaseDetails (object16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_15, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_15, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_15, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_15]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 29-Click on div testCaseDetails object16.png')

"Step 30: Click on div testCaseDetails (object16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_16, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_16, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_16, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_16]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 30-Click on div testCaseDetails object16.png')

"Step 31: Click on div testCaseDetails (object15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_17, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_17, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_17, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_17]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 31-Click on div testCaseDetails object15.png')

"Step 32: Click on div testCaseDetails (object15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_18, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_18, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_18, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_18]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 32-Click on div testCaseDetails object15.png')

"Step 33: Click on div testCaseDetails (object16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_19, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_19, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_19, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_19]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 33-Click on div testCaseDetails object16.png')

"Step 34: Click on div testCaseDetails (object16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_20, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_20, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_20, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_20]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 34-Click on div testCaseDetails object16.png')

"Step 35: Click on div testCaseDetails (object17)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_21, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_21, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_21, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_21]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 35-Click on div testCaseDetails object17.png')

"Step 36: Click on div testCaseDetails (object17)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_22, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_22, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_22, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_22]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 36-Click on div testCaseDetails object17.png')

"Step 37: Click on div newStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_newStep'))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 37-Click on div newStep.png')

"Step 38: Click on div testCaseDetails (object15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_23, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_23, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_23, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_23]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 38-Click on div testCaseDetails object15.png')

"Step 39: Click on div testCaseDetails (object15)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_24, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_24, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_24, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_24]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 39-Click on div testCaseDetails object15.png')

"Step 40: Click on textarea manualEditor4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_manualEditor4'))

WebUI.takeScreenshot(reportLocation + '/TC134/Step 40-Click on textarea manualEditor4.png')

"Step 41: Click on div testCaseDetails (object16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_25, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_25, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_25, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_25]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 41-Click on div testCaseDetails object16.png')

"Step 42: Click on div testCaseDetails (object16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_26, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_26, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_26, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_26]))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 42-Click on div testCaseDetails object16.png')

"Step 43: Click on button newStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_newStep'))

WebUI.takeScreenshot(reportLocation + '/TC134/Step 43-Click on button newStep.png')

"Step 44: Enter input value in textarea manualEditor2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_manualEditor2'), textarea_manualEditor2_1)

WebUI.takeScreenshot(reportLocation + '/TC134/Step 44-Enter input value in textarea manualEditor2.png')

"Step 45: Click on div preCondition"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_preCondition'))

WebUI.takeScreenshot(reportLocation + '/TC134/Step 45-Click on div preCondition.png')

"Step 46: Click on button newStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_newStep'))

WebUI.takeScreenshot(reportLocation + '/TC134/Step 46-Click on button newStep.png')

"Step 47: Enter input value in textarea manualEditor3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_manualEditor3'), textarea_manualEditor3_1)

WebUI.takeScreenshot(reportLocation + '/TC134/Step 47-Enter input value in textarea manualEditor3.png')

"Step 48: Click on div draftManual -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_draftManual'))

// WebUI.takeScreenshot(reportLocation + '/TC134/Step 48-Click on div draftManual - Navigate to page .png')

"Step 49: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC134-Add and Edit Test Steps in Katalon Test Cases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}