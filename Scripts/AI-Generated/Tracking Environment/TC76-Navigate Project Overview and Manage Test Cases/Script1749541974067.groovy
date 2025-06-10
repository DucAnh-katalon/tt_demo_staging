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

"Step 2: Click on div plans -> Navigate to page '/project/*/plans'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/div_plans'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 2-Click on div plans - Navigate to page projectplans.png')

"Step 3: Click on button open2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/button_open2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 3-Click on button open2.png')

"Step 4: Click on item team (team2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/item_team"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/item_team', ['item_team_id': item_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 4-Click on item team team2.png')

"Step 5: Click on button openClear (clear2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/button_openClear"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/button_openClear', ['button_openClear_class': button_openClear_class, 'button_openClear_class_1': button_openClear_class_1, 'button_openClear_internalLabel': button_openClear_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 5-Click on button openClear clear2.png')

"Step 6: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC76/Step 6-Hover over div object.png')

"Step 7: Click on link testCases -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 7-Click on link testCases - Navigate to page projectteststest-cases.png')

"Step 8: Hover over link navigateToTestCase2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_navigateToTestCase2'))

// WebUI.takeScreenshot(reportLocation + '/TC76/Step 8-Hover over link navigateToTestCase2.png')

"Step 9: Click on item postGa (postGa4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_postGa"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_postGa', ['item_postGa_id': item_postGa_id, 'item_postGa_muiTreeView': item_postGa_muiTreeView]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 9-Click on item postGa postGa4.png')

"Step 10: Click on link testCaseNavigation (visualTestingToggle) -> Navigate to page '/project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation', ['link_testCaseNavigation_class': link_testCaseNavigation_class, 'link_testCaseNavigation_href_variable': link_testCaseNavigation_href_variable, 'link_testCaseNavigation_internalLabel': link_testCaseNavigation_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 10-Click on link testCaseNavigation visualTestingToggle - Navigate to page projectteststest-cases.png')

"Step 11: Click on link katalonCloud2 -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_katalonCloud2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 11-Click on link katalonCloud2 - Navigate to page projectteststest-cases.png')

"Step 12: Click on item postGa (postGa42)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_postGa"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_postGa', ['item_postGa_id': item_postGa_id_1, 'item_postGa_muiTreeView': item_postGa_muiTreeView_1]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 12-Click on item postGa postGa42.png')

"Step 13: Click on link testCaseNavigation (verifyUserConfusion) -> Navigate to page '/project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation', ['link_testCaseNavigation_class': link_testCaseNavigation_class_1, 'link_testCaseNavigation_href_variable': link_testCaseNavigation_href_variable_1, 'link_testCaseNavigation_internalLabel': link_testCaseNavigation_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 13-Click on link testCaseNavigation verifyUserConfusion - Navigate to page projectteststest-cases.png')

"Step 14: Click on link postGa4 -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_postGa4'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 14-Click on link postGa4 - Navigate to page projectteststest-cases.png')

"Step 15: Click on item testWebhook (testWebhook)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testWebhook"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testWebhook', ['item_testWebhook_id': item_testWebhook_id, 'item_testWebhook_muiTreeView': item_testWebhook_muiTreeView]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 15-Click on item testWebhook testWebhook.png')

"Step 16: Click on div treeViewIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_treeViewIcon'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 16-Click on div treeViewIcon.png')

"Step 17: Hover over link assets"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_assets'))

// WebUI.takeScreenshot(reportLocation + '/TC76/Step 17-Hover over link assets.png')

"Step 18: Hover over link testData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_testData'))

// WebUI.takeScreenshot(reportLocation + '/TC76/Step 18-Hover over link testData.png')

"Step 19: Click on item commonTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_commonTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 19-Click on item commonTestCases.png')

"Step 20: Click on item commonTestCases2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_commonTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 20-Click on item commonTestCases2.png')

"Step 21: Click on item commonTestCases3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_commonTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 21-Click on item commonTestCases3.png')

"Step 22: Click on div treeView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_treeView'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 22-Click on div treeView.png')

"Step 23: Click on div filterOptions (filterByAuthor)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_filterOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_filterOptions', ['div_filterOptions_divNthOfType': div_filterOptions_divNthOfType, 'div_filterOptions_internalLabel': div_filterOptions_internalLabel, 'div_filterOptions_role': div_filterOptions_role]))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 23-Click on div filterOptions filterByAuthor.png')

"Step 24: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC76/Step 24-Click on div object5.png')

"Step 25: Click on input recentlyUpdatedCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/input_recentlyUpdatedCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 25-Click on input recentlyUpdatedCheckbox.png')

"Step 26: Click on button clearFilters"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_clearFilters'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 26-Click on button clearFilters.png')

"Step 27: Click on div accessTokenErrors (personalAccessTokenError)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_accessTokenErrors"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_accessTokenErrors', ['div_accessTokenErrors_class': div_accessTokenErrors_class, 'div_accessTokenErrors_nth': div_accessTokenErrors_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC76/Step 27-Click on div accessTokenErrors personalAccessTokenError.png')

"Step 28: Click on div accessTokenErrors (accessTokenError)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_accessTokenErrors"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_accessTokenErrors', ['div_accessTokenErrors_class': div_accessTokenErrors_class_1, 'div_accessTokenErrors_nth': div_accessTokenErrors_nth_1]))

// WebUI.takeScreenshot(reportLocation + '/TC76/Step 28-Click on div accessTokenErrors accessTokenError.png')

"Step 29: Hover over link navigateToTc1VerifySuccessfulLogin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_navigateToTc1VerifySuccessfulLogin'))

// WebUI.takeScreenshot(reportLocation + '/TC76/Step 29-Hover over link navigateToTc1VerifySuccessfulLogin.png')

"Step 30: Click on item testBranch1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_testBranch1'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 30-Click on item testBranch1.png')

"Step 31: Hover over span commonTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_commonTestCases'))

// WebUI.takeScreenshot(reportLocation + '/TC76/Step 31-Hover over span commonTestCases.png')

"Step 32: Hover over div name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_name'))

// WebUI.takeScreenshot(reportLocation + '/TC76/Step 32-Hover over div name.png')

"Step 33: Click on span create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_create'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 33-Click on span create.png')

"Step 34: Click on item folder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_folder'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 34-Click on item folder.png')

"Step 35: Click on button cancel2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_cancel2'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 35-Click on button cancel2.png')

"Step 36: Click on button checkToken"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_checkToken'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 36-Click on button checkToken.png')

"Step 37: Click on span createFolder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_createFolder'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 37-Click on span createFolder.png')

"Step 38: Click on div assets -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_assets'))

WebUI.takeScreenshot(reportLocation + '/TC76/Step 38-Click on div assets - Navigate to page .png')

"Step 39: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC76-Navigate Project Overview and Manage Test Cases_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}