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

"Step 2: Click on button refreshPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/button_refreshPage'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 2-Click on button refreshPage.png')

"Step 3: Hover over link assets2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_assets2'))

// WebUI.takeScreenshot(reportLocation + '/TC122/Step 3-Hover over link assets2.png')

"Step 4: Click on link testObjects2 -> Navigate to page '/project/*/resources/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_testObjects2'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 4-Click on link testObjects2 - Navigate to page projectresourcestest-objects.png')

"Step 5: Hover over link viewTests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/resources/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_resources_test_objects/link_viewTests'))

// WebUI.takeScreenshot(reportLocation + '/TC122/Step 5-Hover over link viewTests.png')

"Step 6: Click on link testCases -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/resources/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_resources_test_objects/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 6-Click on link testCases - Navigate to page projectteststest-cases.png')

"Step 7: Click on link testCaseNavigation (navigateToTestCase3) -> Navigate to page '/project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation', ['link_testCaseNavigation_class': link_testCaseNavigation_class, 'link_testCaseNavigation_href_variable': link_testCaseNavigation_href_variable, 'link_testCaseNavigation_internalLabel': link_testCaseNavigation_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 7-Click on link testCaseNavigation navigateToTestCase3 - Navigate to page projectteststest-cases.png')

"Step 8: Click on textarea typeDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_typeDescription'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 8-Click on textarea typeDescription.png')

"Step 9: Enter input value in textarea typeDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_typeDescription'), textarea_typeDescription)

WebUI.takeScreenshot(reportLocation + '/TC122/Step 9-Enter input value in textarea typeDescription.png')

"Step 10: Create a new step and edit test case details"

createNewStepAndEditTestCaseDetails.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Click on div description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_descriptionSection'))

// WebUI.takeScreenshot(reportLocation + '/TC122/Step 11-Click on div description.png')

"Step 12: Click on button testCaseActions (steps2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions', ['button_testCaseActions_class': button_testCaseActions_class, 'button_testCaseActions_divNthOfType': button_testCaseActions_divNthOfType, 'button_testCaseActions_internalText': button_testCaseActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 12-Click on button testCaseActions steps2.png')

"Step 13: Click on div stepsScripts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_stepsScripts'))

// WebUI.takeScreenshot(reportLocation + '/TC122/Step 13-Click on div stepsScripts.png')

"Step 14: Click on button testCaseActions (scripts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions', ['button_testCaseActions_class': button_testCaseActions_class_1, 'button_testCaseActions_divNthOfType': button_testCaseActions_divNthOfType_1, 'button_testCaseActions_internalText': button_testCaseActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 14-Click on button testCaseActions scripts.png')

"Step 15: Click on button testCaseActions (steps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions', ['button_testCaseActions_class': button_testCaseActions_class_2, 'button_testCaseActions_divNthOfType': button_testCaseActions_divNthOfType_2, 'button_testCaseActions_internalText': button_testCaseActions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 15-Click on button testCaseActions steps.png')

"Step 16: Click on button testCaseActions (runHistory)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions', ['button_testCaseActions_class': button_testCaseActions_class_3, 'button_testCaseActions_divNthOfType': button_testCaseActions_divNthOfType_3, 'button_testCaseActions_internalText': button_testCaseActions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 16-Click on button testCaseActions runHistory.png')

"Step 17: Click on button testCaseActions (linkages)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions', ['button_testCaseActions_class': button_testCaseActions_class_4, 'button_testCaseActions_divNthOfType': button_testCaseActions_divNthOfType_4, 'button_testCaseActions_internalText': button_testCaseActions_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 17-Click on button testCaseActions linkages.png')

"Step 18: Click on button testCaseActions (changeHistory)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions', ['button_testCaseActions_class': button_testCaseActions_class_5, 'button_testCaseActions_divNthOfType': button_testCaseActions_divNthOfType_5, 'button_testCaseActions_internalText': button_testCaseActions_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 18-Click on button testCaseActions changeHistory.png')

"Step 19: Click on textarea typeDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_typeDescription'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 19-Click on textarea typeDescription.png')

"Step 20: Click on button quality"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_quality'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 20-Click on button quality.png')

"Step 21: Click on div preCondition"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_preCondition'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 21-Click on div preCondition.png')

"Step 22: Click on div assets2 -> Navigate to page '/project/*/resources'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_assets'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 22-Click on div assets2 - Navigate to page projectresources.png')

"Step 23: Click on div executionsLabel -> Navigate to page '/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/resources?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_resources/div_executionsLabel'))

WebUI.takeScreenshot(reportLocation + '/TC122/Step 23-Click on div executionsLabel - Navigate to page projectexecutions.png')

"Step 24: Click on div noTestRunDisplay -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_executions/div_noTestRunDisplay'))

// WebUI.takeScreenshot(reportLocation + '/TC122/Step 24-Click on div noTestRunDisplay - Navigate to page .png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC122-Refresh Project Overview and Edit Test Case_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}