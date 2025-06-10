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

"Step 2: Hover over link tests2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_tests2'))

// WebUI.takeScreenshot(reportLocation + '/TC31/Step 2-Hover over link tests2.png')

"Step 3: Click on link testCases2 -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_testCases2'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 3-Click on link testCases2 - Navigate to page projectteststest-cases.png')

"Step 4: Click on link testCaseNavigation (navigateToTest2) -> Navigate to page '/project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation', ['link_testCaseNavigation_class': link_testCaseNavigation_class, 'link_testCaseNavigation_href_variable': link_testCaseNavigation_href_variable, 'link_testCaseNavigation_internalLabel': link_testCaseNavigation_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 4-Click on link testCaseNavigation navigateToTest2 - Navigate to page projectteststest-cases.png')

"Step 5: Click on button regenerateSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_regenerateSteps'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 5-Click on button regenerateSteps.png')

"Step 6: Click on button cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_cancel2'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 6-Click on button cancel.png')

"Step 7: Click on button testCaseActions (scripts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions', ['button_testCaseActions_class': button_testCaseActions_class, 'button_testCaseActions_divNthOfType': button_testCaseActions_divNthOfType, 'button_testCaseActions_internalText': button_testCaseActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 7-Click on button testCaseActions scripts.png')

"Step 8: Click on button testCaseActions (steps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions', ['button_testCaseActions_class': button_testCaseActions_class_1, 'button_testCaseActions_divNthOfType': button_testCaseActions_divNthOfType_1, 'button_testCaseActions_internalText': button_testCaseActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 8-Click on button testCaseActions steps.png')

"Step 9: Click on div preCondition"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_preCondition'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 9-Click on div preCondition.png')

"Step 10: Click on div object4 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_object4'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 10-Click on div object4 - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC31-Navigate and Verify Test Case Navigation and Actions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}