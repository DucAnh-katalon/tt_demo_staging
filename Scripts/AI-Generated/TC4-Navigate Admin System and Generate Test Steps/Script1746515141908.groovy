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

"Step 1: Navigate to /admin/system/general"

TrueTestScripts.navigate("/admin/system/general")

"Step 2: Click on link katalonLogo -> Navigate to page '/project/*/home/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/admin/system/general?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_admin_system_general/link_katalonLogo'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on link katalonLogo - Navigate to page projecthomeoverview.png')

"Step 3: Click on button admin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_home_overview/button_admin'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on button admin.png')

"Step 4: Click on div home"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_home_overview/div_home'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on div home.png')

"Step 5: Hover over link tests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_home_overview/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Hover over link tests.png')

"Step 6: Click on link testCases -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_home_overview/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on link testCases - Navigate to page projectteststest-cases.png')

"Step 7: Click on link navigateToTest (navigateToTest) -> Navigate to page '/project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_navigateToTest"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_navigateToTest', ['link_navigateToTest_class': link_navigateToTest_class, 'link_navigateToTest_href_variable': link_navigateToTest_href_variable, 'link_navigateToTest_internalLabel': link_navigateToTest_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on link navigateToTest navigateToTest - Navigate to page projectteststest-cases.png')

"Step 8: Click on button generateSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/button_generateSteps'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on button generateSteps.png')

"Step 9: Click on button saveOverwrite (save)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_saveOverwrite"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_saveOverwrite', ['button_saveOverwrite_class': button_saveOverwrite_class, 'button_saveOverwrite_dataTestid': button_saveOverwrite_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on button saveOverwrite save.png')

"Step 10: Click on link home -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on link home - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Navigate Admin System and Generate Test Steps_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}