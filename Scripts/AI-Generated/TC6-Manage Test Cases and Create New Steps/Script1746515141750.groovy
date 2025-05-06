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

"Step 2: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_home_overview/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Hover over div object.png')

"Step 3: Click on link testCases -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_home_overview/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link testCases - Navigate to page projectteststest-cases.png')

"Step 4: Click on link navigateToTest (navigateToTc0801) -> Navigate to page '/project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_navigateToTest"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_navigateToTest', ['link_navigateToTest_class': link_navigateToTest_class, 'link_navigateToTest_href_variable': link_navigateToTest_href_variable, 'link_navigateToTest_internalLabel': link_navigateToTest_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on link navigateToTest navigateToTc0801 - Navigate to page projectteststest-cases.png')

"Step 5: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on div object.png')

"Step 6: Click on button scriptsSteps (scripts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_scriptsSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_scriptsSteps', ['button_scriptsSteps_internalText': button_scriptsSteps_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on button scriptsSteps scripts.png')

"Step 7: Click on button scriptsSteps (steps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_scriptsSteps"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/button_scriptsSteps', ['button_scriptsSteps_internalText': button_scriptsSteps_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on button scriptsSteps steps.png')

"Step 8: Click on button newStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/button_newStep'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on button newStep.png')

"Step 9: Click on div dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class, 'div_dynamicObject_divNthChild': div_dynamicObject_divNthChild]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on div dynamicObject object2.png')

"Step 10: Click on div dynamicObject (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class_1, 'div_dynamicObject_divNthChild': div_dynamicObject_divNthChild_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on div dynamicObject object3.png')

"Step 11: Click on div dynamicObject (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/div_dynamicObject', ['div_dynamicObject_class': div_dynamicObject_class_2, 'div_dynamicObject_divNthChild': div_dynamicObject_divNthChild_2]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Click on div dynamicObject object4.png')

"Step 12: Click on div draftManual"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/div_draftManual'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on div draftManual.png')

"Step 13: Click on link katalonCloud -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/link_katalonCloud'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Click on link katalonCloud - Navigate to page projectteststest-cases.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Manage Test Cases and Create New Steps_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}