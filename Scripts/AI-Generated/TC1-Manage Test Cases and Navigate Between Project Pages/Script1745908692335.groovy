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

"Step 1: Navigate to project/*/home/overview with params (filter)"

TrueTestScripts.navigate("project/${project_id}/home/overview", ["filter": overview_filter])

"Step 2: Hover over link tests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_overview/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Hover over link tests.png')

"Step 3: Click on link testCases -> Navigate to page 'project management#project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_overview/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link testCases - Navigate to page project managementproject.png')

"Step 4: Click on link navigateToTestCase -> Navigate to page 'project management#project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/link_navigateToTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on link navigateToTestCase - Navigate to page project managementprojectteststest-cases.png')

"Step 5: Click on textarea description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/textarea_description'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on textarea description.png')

"Step 6: Enter input value in textarea description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_project_management/textarea_description'), textarea_description)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Enter input value in textarea description.png')

"Step 7: Click on button projectManagementOptions (scripts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementOptions', ['button_projectManagementOptions_internalText': button_projectManagementOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button projectManagementOptions scripts.png')

"Step 8: Click on button projectManagementOptions (steps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementOptions', ['button_projectManagementOptions_internalText': button_projectManagementOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button projectManagementOptions steps.png')

"Step 9: Click on button newStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/button_newStep'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button newStep.png')

"Step 10: Click on button newStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/button_newStep'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button newStep.png')

"Step 11: Click on link tests -> Navigate to page 'project management#project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on link tests - Navigate to page project managementproject.png')

"Step 12: Click on link tests2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/link_tests2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on link tests2.png')

"Step 13: Click on link katalonLogo -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/link_katalonLogo'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on link katalonLogo - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Manage Test Cases and Navigate Between Project Pages_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}