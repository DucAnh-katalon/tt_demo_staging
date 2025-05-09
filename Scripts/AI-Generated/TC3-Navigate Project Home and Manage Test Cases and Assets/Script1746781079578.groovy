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

"Step 2: Click on div plans -> Navigate to page '/project/*/plans'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_home_overview/div_plans'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on div plans - Navigate to page projectplans.png')

"Step 3: Click on button open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_plans/button_open'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on button open.png')

"Step 4: Click on item team2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_plans/item_team2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on item team2.png')

"Step 5: Click on button clearOpen (clear)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_plans/button_clearOpen"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_plans/button_clearOpen', ['button_clearOpen_class': button_clearOpen_class, 'button_clearOpen_class_1': button_clearOpen_class_1, 'button_clearOpen_internalLabel': button_clearOpen_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on button clearOpen clear.png')

"Step 6: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_plans/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Hover over div object.png')

"Step 7: Click on link testCases -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_plans/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on link testCases - Navigate to page projectteststest-cases.png')

"Step 8: Hover over link navigateTo4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests_test_cases/link_navigateTo4'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Hover over link navigateTo4.png')

"Step 9: Click on item postGa4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/item_postGa4'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on item postGa4.png')

"Step 10: Click on link navigationTests (navigateToVisualTesting) -> Navigate to page '/project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_navigationTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_navigationTests', ['link_navigationTests_class': link_navigationTests_class, 'link_navigationTests_internalLabel': link_navigationTests_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on link navigationTests navigateToVisualTesting - Navigate to page projectteststest-cases.png')

"Step 11: Click on link dynamicObject (katalonCloud) -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_dynamicObject', ['link_dynamicObject_internalText': link_dynamicObject_internalText, 'link_dynamicObject_liNthOfType': link_dynamicObject_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on link dynamicObject katalonCloud - Navigate to page projectteststest-cases.png')

"Step 12: Click on item postGa42"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/item_postGa42'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on item postGa42.png')

"Step 13: Click on link navigationTests (navigateToUserConfusion) -> Navigate to page '/project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_navigationTests"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_navigationTests', ['link_navigationTests_class': link_navigationTests_class_1, 'link_navigationTests_internalLabel': link_navigationTests_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on link navigationTests navigateToUserConfusion - Navigate to page projectteststest-cases.png')

"Step 14: Click on link dynamicObject (postGa4) -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/link_dynamicObject', ['link_dynamicObject_internalText': link_dynamicObject_internalText_1, 'link_dynamicObject_liNthOfType': link_dynamicObject_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on link dynamicObject postGa4 - Navigate to page projectteststest-cases.png')

"Step 15: Click on item testWebhook"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/item_testWebhook'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on item testWebhook.png')

"Step 16: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on div object.png')

"Step 17: Hover over link assets"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests_test_cases/link_assets'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Hover over link assets.png')

"Step 18: Hover over link testData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests_test_cases/link_testData'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 18-Hover over link testData.png')

"Step 19: Click on item commonTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/item_commonTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 19-Click on item commonTestCases.png')

"Step 20: Click on item commonTestCases2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/item_commonTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 20-Click on item commonTestCases2.png')

"Step 21: Click on item commonTestCases3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/item_commonTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 21-Click on item commonTestCases3.png')

"Step 22: Click on div treeViewIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/div_treeViewIcon'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 22-Click on div treeViewIcon.png')

"Step 23: Click on div filterByAuthor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/div_filterByAuthor'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 23-Click on div filterByAuthor.png')

"Step 24: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 24-Click on div backdrop.png')

"Step 25: Click on input recentlyUpdated"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/input_recentlyUpdated'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 25-Click on input recentlyUpdated.png')

"Step 26: Click on button clearFilters"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/button_clearFilters'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 26-Click on button clearFilters.png')

"Step 27: Click on div accessTokenError (accessTokenError)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/div_accessTokenError"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/div_accessTokenError', ['div_accessTokenError_class': div_accessTokenError_class, 'div_accessTokenError_nth': div_accessTokenError_nth]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 27-Click on div accessTokenError accessTokenError.png')

"Step 28: Click on div accessTokenError (accessTokenError2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_tests_test_cases/div_accessTokenError"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_tests_test_cases/div_accessTokenError', ['div_accessTokenError_class': div_accessTokenError_class_1, 'div_accessTokenError_nth': div_accessTokenError_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 28-Click on div accessTokenError accessTokenError2.png')

"Step 29: Hover over link navigateToTc1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests_test_cases/link_navigateToTc1'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 29-Hover over link navigateToTc1.png')

"Step 30: Click on item testBranch1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/item_testBranch1'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 30-Click on item testBranch1.png')

"Step 31: Hover over span commonTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests_test_cases/span_commonTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 31-Hover over span commonTestCases.png')

"Step 32: Hover over div nameHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_tests_test_cases/div_nameHeader'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 32-Hover over div nameHeader.png')

"Step 33: Click on span createButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/span_createButton'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 33-Click on span createButton.png')

"Step 34: Click on item folder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/item_folder'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 34-Click on item folder.png')

"Step 35: Click on button cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/button_cancel'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 35-Click on button cancel.png')

"Step 36: Click on button checkToken"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/button_checkToken'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 36-Click on button checkToken.png')

"Step 37: Click on span createFolder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/span_createFolder'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 37-Click on span createFolder.png')

"Step 38: Click on div assets -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_test_cases/div_assets'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 38-Click on div assets - Navigate to page .png')

"Step 39: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Navigate Project Home and Manage Test Cases and Assets_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}