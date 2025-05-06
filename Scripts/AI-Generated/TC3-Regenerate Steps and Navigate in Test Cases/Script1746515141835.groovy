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

"Step 2: Hover over link tests2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_home_overview/link_tests2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Hover over link tests2.png')

"Step 3: Click on link testCases2 -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_home_overview/link_testCases2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link testCases2 - Navigate to page projectteststest-cases.png')

"Step 4: Click on link navigateToTest (navigateToTest2) -> Navigate to page '/project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_navigateToTest"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_navigateToTest', ['link_navigateToTest_class': link_navigateToTest_class, 'link_navigateToTest_href_variable': link_navigateToTest_href_variable, 'link_navigateToTest_internalLabel': link_navigateToTest_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on link navigateToTest navigateToTest2 - Navigate to page projectteststest-cases.png')

"Step 5: Click on button regenerateSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/button_regenerateSteps'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on button regenerateSteps.png')

"Step 6: Click on button cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/button_cancel'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on button cancel.png')

"Step 7: Click on button scriptsSteps (scripts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_scriptsSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_scriptsSteps', ['button_scriptsSteps_internalText': button_scriptsSteps_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on button scriptsSteps scripts.png')

"Step 8: Click on button scriptsSteps (steps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_scriptsSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_scriptsSteps', ['button_scriptsSteps_internalText': button_scriptsSteps_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on button scriptsSteps steps.png')

"Step 9: Click on div preConditionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/div_preConditionButton'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on div preConditionButton.png')

"Step 10: Click on div object5 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on div object5 - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Regenerate Steps and Navigate in Test Cases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}