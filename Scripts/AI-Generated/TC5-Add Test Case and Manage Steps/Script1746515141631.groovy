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

"Step 2: Hover over link assets"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_home_overview/link_assets'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Hover over link assets.png')

"Step 3: Click on link testObjects"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_home_overview/link_testObjects'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on link testObjects.png')

"Step 4: Click on link environments -> Navigate to page '/project/*/resources/environments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_home_overview/link_environments'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on link environments - Navigate to page projectresourcesenvironments.png')

"Step 5: Hover over link tests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/resources/environments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_resources_environments/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Hover over link tests.png')

"Step 6: Click on link testCases -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/resources/environments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_resources_environments/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on link testCases - Navigate to page projectteststest-cases.png')

"Step 7: Enter input value in input addTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_project_tests_test_cases/input_addTestCase'), input_addTestCase)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Enter input value in input addTestCase.png')

"Step 8: Click on button add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/button_add'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on button add.png')

"Step 9: Click on link navigateToTest (navigateToTesst1) -> Navigate to page '/project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_navigateToTest"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_navigateToTest', ['link_navigateToTest_class': link_navigateToTest_class, 'link_navigateToTest_href_variable': link_navigateToTest_href_variable, 'link_navigateToTest_internalLabel': link_navigateToTest_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on link navigateToTest navigateToTesst1 - Navigate to page projectteststest-cases.png')

"Step 10: Click on textarea typeDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/textarea_typeDescription'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on textarea typeDescription.png')

"Step 11: Enter input value in textarea typeDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_project_tests_test_cases/textarea_typeDescription'), textarea_typeDescription)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Enter input value in textarea typeDescription.png')

"Step 12: Click on button scriptsSteps (scripts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_scriptsSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_scriptsSteps', ['button_scriptsSteps_internalText': button_scriptsSteps_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on button scriptsSteps scripts.png')

"Step 13: Click on button scriptsSteps (steps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_scriptsSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_scriptsSteps', ['button_scriptsSteps_internalText': button_scriptsSteps_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on button scriptsSteps steps.png')

"Step 14: Click on button newStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/button_newStep'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on button newStep.png')

"Step 15: Enter input value in textarea manualEditor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_project_tests_test_cases/textarea_manualEditor'), textarea_manualEditor)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Enter input value in textarea manualEditor.png')

"Step 16: Click on div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/div_object6'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on div object6.png')

"Step 17: Click on button regenerateSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/button_regenerateSteps'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on button regenerateSteps.png')

"Step 18: Click on button saveOverwrite (save)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_saveOverwrite"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_saveOverwrite', ['button_saveOverwrite_class': button_saveOverwrite_class, 'button_saveOverwrite_dataTestid': button_saveOverwrite_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 18-Click on button saveOverwrite save.png')

"Step 19: Click on button saveOverwrite (overwrite) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_saveOverwrite"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_saveOverwrite', ['button_saveOverwrite_class': button_saveOverwrite_class_1, 'button_saveOverwrite_dataTestid': button_saveOverwrite_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 19-Click on button saveOverwrite overwrite - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Add Test Case and Manage Steps_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}