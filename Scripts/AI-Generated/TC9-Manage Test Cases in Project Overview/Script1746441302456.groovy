import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /project/*/home/overview with params (filter)"

TrueTestScripts.navigate("/project/${project_id}/home/overview", ["filter": overview_filter])

"Step 2: Hover over link tests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_home_overview/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Hover over link tests.png')

"Step 3: Click on link testCases -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_home_overview/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on link testCases - Navigate to page projectteststest-cases.png')

"Step 4: Click on link navigateToTest -> Navigate to page '/project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/link_navigateToTest'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on link navigateToTest - Navigate to page projectteststest-cases.png')

"Step 5: Click on button regenerateSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/button_regenerateSteps'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on button regenerateSteps.png')

"Step 6: Click on button cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/button_cancel'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on button cancel.png')

"Step 7: Click on button testComponents (scripts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_testComponents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_testComponents', ['button_testComponents_internalText': button_testComponents_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Click on button testComponents scripts.png')

"Step 8: Click on button testComponents (steps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_testComponents"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_testComponents', ['button_testComponents_internalText': button_testComponents_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on button testComponents steps.png')

"Step 9: Click on div preConditionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/div_preConditionButton'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on div preConditionButton.png')

"Step 10: Click on div object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on div object - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Manage Test Cases in Project Overview_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}