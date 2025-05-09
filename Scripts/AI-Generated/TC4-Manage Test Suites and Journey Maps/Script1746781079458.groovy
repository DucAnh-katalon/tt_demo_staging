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

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Hover over link tests.png')

"Step 3: Click on link testSuites -> Navigate to page '/project/*/tests/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_home_overview/link_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link testSuites - Navigate to page projectteststest-suites.png')

"Step 4: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests_test_suites/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Hover over div object.png')

"Step 5: Click on link testCases -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_suites/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on link testCases - Navigate to page projectteststest-cases.png')

"Step 6: Hover over link tests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests_test_cases/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Hover over link tests.png')

"Step 7: Click on link testSuites -> Navigate to page '/project/*/tests/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/link_testSuites'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on link testSuites - Navigate to page projectteststest-suites.png')

"Step 8: Click on link navigateToRegressionGa -> Navigate to page '/project/*/tests/test-suites/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_suites/link_navigateToRegressionGa'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on link navigateToRegressionGa - Navigate to page projectteststest-suites.png')

"Step 9: Click on button addTestCase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_suites/button_addTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on button addTestCase.png')

"Step 10: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_suites/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on button object.png')

"Step 11: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_suites/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on div object2.png')

"Step 12: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_suites/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on div object3.png')

"Step 13: Click on button testSuiteActions (addToTestSuite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_suites/button_testSuiteActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_suites/button_testSuiteActions', ['button_testSuiteActions_class': button_testSuiteActions_class, 'button_testSuiteActions_internalText': button_testSuiteActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on button testSuiteActions addToTestSuite.png')

"Step 14: Click on button testSuiteManagement (duplicate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_suites/button_testSuiteManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_suites/button_testSuiteManagement', ['button_testSuiteManagement_class': button_testSuiteManagement_class, 'button_testSuiteManagement_internalLabel': button_testSuiteManagement_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Click on button testSuiteManagement duplicate.png')

"Step 15: Click on button testSuiteActions (cancel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_suites/button_testSuiteActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_suites/button_testSuiteActions', ['button_testSuiteActions_class': button_testSuiteActions_class_1, 'button_testSuiteActions_internalText': button_testSuiteActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Click on button testSuiteActions cancel.png')

"Step 16: Click on button testSuiteManagement (delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_suites/button_testSuiteManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_suites/button_testSuiteManagement', ['button_testSuiteManagement_class': button_testSuiteManagement_class_1, 'button_testSuiteManagement_internalLabel': button_testSuiteManagement_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Click on button testSuiteManagement delete.png')

"Step 17: Click on button testSuiteActions (cancel)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_suites/button_testSuiteActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_suites/button_testSuiteActions', ['button_testSuiteActions_class': button_testSuiteActions_class_2, 'button_testSuiteActions_internalText': button_testSuiteActions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 17-Click on button testSuiteActions cancel.png')

"Step 18: Click on link katalonCloud -> Navigate to page '/project/*/tests/test-suites'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-suites/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_suites/link_katalonCloud'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 18-Click on link katalonCloud - Navigate to page projectteststest-suites.png')

"Step 19: Hover over link tests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests_test_suites/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 19-Hover over link tests.png')

"Step 20: Click on link journeyMaps -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-suites?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_suites/link_journeyMaps'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 20-Click on link journeyMaps - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Manage Test Suites and Journey Maps_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}