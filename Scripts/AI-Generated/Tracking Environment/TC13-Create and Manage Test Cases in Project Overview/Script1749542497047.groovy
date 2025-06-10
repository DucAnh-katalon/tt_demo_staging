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

"Step 1: Navigate to /project/*/home/overview with params (filter)"

TrueTestScripts.navigate("/project/${project_id}/home/overview", ["filter": overview_filter])

"Step 2: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 2-Hover over div object.png')

"Step 3: Click on link testCases -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 3-Click on link testCases - Navigate to page projectteststest-cases.png')

"Step 4: Click on link testCaseNavigation (navigateToTestCase) -> Navigate to page '/project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation', ['link_testCaseNavigation_class': link_testCaseNavigation_class, 'link_testCaseNavigation_href_variable': link_testCaseNavigation_href_variable, 'link_testCaseNavigation_internalLabel': link_testCaseNavigation_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on link testCaseNavigation navigateToTestCase - Navigate to page projectteststest-cases.png')

"Step 5: Click on div testCaseSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_testCaseSteps'))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 5-Click on div testCaseSteps.png')

"Step 6: Click on button testCaseActions (scripts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions', ['button_testCaseActions_class': button_testCaseActions_class, 'button_testCaseActions_divNthOfType': button_testCaseActions_divNthOfType, 'button_testCaseActions_internalText': button_testCaseActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6-Click on button testCaseActions scripts.png')

"Step 7: Click on button testCaseActions (steps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions', ['button_testCaseActions_class': button_testCaseActions_class_1, 'button_testCaseActions_divNthOfType': button_testCaseActions_divNthOfType_1, 'button_testCaseActions_internalText': button_testCaseActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7-Click on button testCaseActions steps.png')

"Step 8: Click on button newStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_newStep'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 8-Click on button newStep.png')

"Step 9: Click on div testCaseDetails (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 9-Click on div testCaseDetails object.png')

"Step 10: Click on div testCaseDetails (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_1, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_1, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_1, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 10-Click on div testCaseDetails object2.png')

"Step 11: Click on div testCaseDetails (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': div_testCaseDetails_class_2, 'div_testCaseDetails_divNthChild': div_testCaseDetails_divNthChild_2, 'div_testCaseDetails_divNthChild_1': div_testCaseDetails_divNthChild_1_2, 'div_testCaseDetails_divNthOfType': div_testCaseDetails_divNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 11-Click on div testCaseDetails object3.png')

"Step 12: Click on div draftStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_draftManual'))

// WebUI.takeScreenshot(reportLocation + '/TC13/Step 12-Click on div draftStatus.png')

"Step 13: Click on link katalonCloud -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_katalonCloud'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 13-Click on link katalonCloud - Navigate to page projectteststest-cases.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Create and Manage Test Cases in Project Overview_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}