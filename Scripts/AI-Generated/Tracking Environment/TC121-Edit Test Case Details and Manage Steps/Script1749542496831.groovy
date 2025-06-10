import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.createNewStepAndEditTestCaseDetails
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /project/*/home/overview with params (filter)"

TrueTestScripts.navigate("/project/${project_id}/home/overview", ["filter": overview_filter])

"Step 2: Click on div projectOverview (executions)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_home_overview/div_projectOverview"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_home_overview/div_projectOverview', ['div_projectOverview_divNthChild': div_projectOverview_divNthChild, 'div_projectOverview_divNthOfType': div_projectOverview_divNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC121/Step 2-Click on div projectOverview executions.png')

"Step 3: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC121/Step 3-Hover over div object.png')

"Step 4: Click on link testCases3 -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_testCases3'))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 4-Click on link testCases3 - Navigate to page projectteststest-cases.png')

"Step 5: Click on link testCaseNavigation (navigateToTestCase3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation', ['link_testCaseNavigation_class': link_testCaseNavigation_class, 'link_testCaseNavigation_href_variable': link_testCaseNavigation_href_variable, 'link_testCaseNavigation_internalLabel': link_testCaseNavigation_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 5-Click on link testCaseNavigation navigateToTestCase3.png')

"Step 6: Create a new step and edit test case details"

createNewStepAndEditTestCaseDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 7: Click on div testCaseSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_testCaseSteps'))

// WebUI.takeScreenshot(reportLocation + '/TC121/Step 7-Click on div testCaseSteps.png')

"Step 8: Click on div stepsScripts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_stepsScripts'))

// WebUI.takeScreenshot(reportLocation + '/TC121/Step 8-Click on div stepsScripts.png')

"Step 9: Click on button testCaseActions (scripts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions', ['button_testCaseActions_class': button_testCaseActions_class, 'button_testCaseActions_divNthOfType': button_testCaseActions_divNthOfType, 'button_testCaseActions_internalText': button_testCaseActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 9-Click on button testCaseActions scripts.png')

"Step 10: Click on div descriptionSection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_descriptionSection'))

// WebUI.takeScreenshot(reportLocation + '/TC121/Step 10-Click on div descriptionSection.png')

"Step 11: Click on button testCaseActions (steps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions', ['button_testCaseActions_class': button_testCaseActions_class_1, 'button_testCaseActions_divNthOfType': button_testCaseActions_divNthOfType_1, 'button_testCaseActions_internalText': button_testCaseActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 11-Click on button testCaseActions steps.png')

"Step 12: Click on button moveTo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_moveTo'))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 12-Click on button moveTo.png')

"Step 13: Click on span object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 13-Click on span object2.png')

"Step 14: Click on textarea description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_description'))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 14-Click on textarea description.png')

"Step 15: Click on span aiServiceDisabled"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_aiServiceDisabled'))

// WebUI.takeScreenshot(reportLocation + '/TC121/Step 15-Click on span aiServiceDisabled.png')

"Step 16: Click on label description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/label_description'))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 16-Click on label description.png')

"Step 17: Click on textarea description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_description'))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 17-Click on textarea description.png')

"Step 18: Enter input value in textarea description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_description'), textarea_description)

WebUI.takeScreenshot(reportLocation + '/TC121/Step 18-Enter input value in textarea description.png')

"Step 19: Click on div draftManual"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_draftManual'))

// WebUI.takeScreenshot(reportLocation + '/TC121/Step 19-Click on div draftManual.png')

"Step 20: Click on div preCondition"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_preCondition'))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 20-Click on div preCondition.png')

"Step 21: Click on div testStepsDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_descriptionSection'))

// WebUI.takeScreenshot(reportLocation + '/TC121/Step 21-Click on div testStepsDescription.png')

"Step 22: Click on textarea preCondition"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_preCondition'))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 22-Click on textarea preCondition.png')

"Step 23: Click on link home2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_home2'))

WebUI.takeScreenshot(reportLocation + '/TC121/Step 23-Click on link home2 - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC121-Edit Test Case Details and Manage Steps_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}