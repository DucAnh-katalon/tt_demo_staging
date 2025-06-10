import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.navigateToTestCaseAndAddDescription
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

"Step 2: Hover over link assets"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_assets'))

// WebUI.takeScreenshot(reportLocation + '/TC32/Step 2-Hover over link assets.png')

"Step 3: Click on link testObjects"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_testObjects'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 3-Click on link testObjects.png')

"Step 4: Click on link environments -> Navigate to page '/project/*/resources/environments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_environments'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 4-Click on link environments - Navigate to page projectresourcesenvironments.png')

"Step 5: Hover over link tests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/resources/environments?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_resources_environments/link_tests'))

// WebUI.takeScreenshot(reportLocation + '/TC32/Step 5-Hover over link tests.png')

"Step 6: Click on link testCases -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/resources/environments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_resources_environments/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 6-Click on link testCases - Navigate to page projectteststest-cases.png')

"Step 7: Enter input value in input addTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/input_addTestCase'), input_addTestCase)

WebUI.takeScreenshot(reportLocation + '/TC32/Step 7-Enter input value in input addTestCase.png')

"Step 8: Click on button add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_add'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 8-Click on button add.png')

"Step 9: Navigate to test case and add description and steps"

navigateToTestCaseAndAddDescription.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Enter input value in textarea manualEditor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_manualEditor'), textarea_manualEditor)

WebUI.takeScreenshot(reportLocation + '/TC32/Step 10-Enter input value in textarea manualEditor.png')

"Step 11: Click on div testCaseDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_descriptionSection'))

// WebUI.takeScreenshot(reportLocation + '/TC32/Step 11-Click on div testCaseDescription.png')

"Step 12: Click on button regenerateSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_regenerateSteps'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 12-Click on button regenerateSteps.png')

"Step 13: Click on button saveOverwrite (save)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_saveOverwrite"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_saveOverwrite', ['button_saveOverwrite_class': button_saveOverwrite_class, 'button_saveOverwrite_dataTestid': button_saveOverwrite_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 13-Click on button saveOverwrite save.png')

"Step 14: Click on button saveOverwrite (overwrite) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_saveOverwrite"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_saveOverwrite', ['button_saveOverwrite_class': button_saveOverwrite_class_1, 'button_saveOverwrite_dataTestid': button_saveOverwrite_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 14-Click on button saveOverwrite overwrite - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC32-Add and Save New Test Case with Description and Steps_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}