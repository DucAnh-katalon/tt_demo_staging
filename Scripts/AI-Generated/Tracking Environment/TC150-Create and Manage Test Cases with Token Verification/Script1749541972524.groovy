import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.createItemAndCheckToken
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /project/*/plans"

TrueTestScripts.navigate("/project/${project_id}/plans")

"Step 2: Click on span sync"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/span_sync'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 2-Click on span sync.png')

"Step 3: Click on button today"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/button_today'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 3-Click on button today.png')

"Step 4: Click on button openClear (clear2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/button_openClear"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/button_openClear', ['button_openClear_class': button_openClear_class, 'button_openClear_class_1': button_openClear_class_1, 'button_openClear_internalLabel': button_openClear_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 4-Click on button openClear clear2.png')

"Step 5: Click on list plans"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/list_plans'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 5-Click on list plans.png')

"Step 6: Click on button openClear (open3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/button_openClear"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/button_openClear', ['button_openClear_class': button_openClear_class_1, 'button_openClear_class_1': button_openClear_class_1_1, 'button_openClear_internalLabel': button_openClear_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 6-Click on button openClear open3.png')

"Step 7: Click on list plans"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/list_plans'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 7-Click on list plans.png')

"Step 8: Click on button open2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/button_open2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 8-Click on button open2.png')

"Step 9: Hover over button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/button_submit'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 9-Hover over button submit.png')

"Step 10: Click on item team (platformAgileProjectTeam)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/item_team"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/item_team', ['item_team_id': item_team_id]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 10-Click on item team platformAgileProjectTeam.png')

"Step 11: Click on span sync"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/span_sync'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 11-Click on span sync.png')

"Step 12: Click on button openClear (clear2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/button_openClear"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/button_openClear', ['button_openClear_class': button_openClear_class_2, 'button_openClear_class_1': button_openClear_class_1_2, 'button_openClear_internalLabel': button_openClear_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 12-Click on button openClear clear2.png')

"Step 13: Click on span sync"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/span_sync'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 13-Click on span sync.png')

"Step 14: Hover over button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/button_submit'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 14-Hover over button submit.png')

"Step 15: Click on button today"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/button_today'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 15-Click on button today.png')

"Step 16: Hover over button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/button_submit'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 16-Hover over button submit.png')

"Step 17: Click on button today"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/button_today'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 17-Click on button today.png')

"Step 18: Click on list plans"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/list_plans'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 18-Click on list plans.png')

"Step 19: Click on div plans"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/div_plans'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 19-Click on div plans.png')

"Step 20: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 20-Hover over div object.png')

"Step 21: Click on link testCases -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 21-Click on link testCases - Navigate to page projectteststest-cases.png')

"Step 22: Hover over link tests4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_tests4'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 22-Hover over link tests4.png')

"Step 23: Hover over link testCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_testCases'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 23-Hover over link testCases.png')

"Step 24: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 24-Click on button create.png')

"Step 25: Click on item folder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_folder2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 25-Click on item folder2.png')

"Step 26: Click on button createFolder (createFolder)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_createFolder"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_createFolder', ['button_createFolder_internalLabel': button_createFolder_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 26-Click on button createFolder createFolder.png')

"Step 27: Click on button clearFilters"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_clearFilters'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 27-Click on button clearFilters.png')

"Step 28: Hover over button clearFilters2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_clearFilters2'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 28-Hover over button clearFilters2.png')

"Step 29: Click on span create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_create'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 29-Click on span create.png')

"Step 30: Click on item testCaseManagement (testCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCaseManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCaseManagement', ['item_testCaseManagement_internalLabel': item_testCaseManagement_internalLabel, 'item_testCaseManagement_spanNthOfType': item_testCaseManagement_spanNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 30-Click on item testCaseManagement testCase.png')

"Step 31: Click on button cancel2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_cancel2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 31-Click on button cancel2.png')

"Step 32: Hover over div navigateToPostGa4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_navigateToPostGa4'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 32-Hover over div navigateToPostGa4.png')

"Step 33: Hover over div name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_name'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 33-Hover over div name.png')

"Step 34: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 34-Click on button create.png')

"Step 35: Click on item folder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_folder2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 35-Click on item folder2.png')

"Step 36: Click on button cancel2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_cancel2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 36-Click on button cancel2.png')

"Step 37: Hover over span object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 37-Hover over span object3.png')

"Step 38: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 38-Click on button create.png')

"Step 39: Hover over span object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_object4'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 39-Hover over span object4.png')

"Step 40: Click on item testCaseManagement (importTestCases)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCaseManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCaseManagement', ['item_testCaseManagement_internalLabel': item_testCaseManagement_internalLabel_1, 'item_testCaseManagement_spanNthOfType': item_testCaseManagement_spanNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 40-Click on item testCaseManagement importTestCases.png')

"Step 41: Click on button createFolder (createFolder)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_createFolder"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_createFolder', ['button_createFolder_internalLabel': button_createFolder_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 41-Click on button createFolder createFolder.png')

"Step 42: Click on button actionMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_actionMenu'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 42-Click on button actionMenu.png')

"Step 43: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 43-Click on div object5.png')

"Step 44: Click on link testCaseNavigation (navigateTo4) -> Navigate to page '/project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation', ['link_testCaseNavigation_class': link_testCaseNavigation_class, 'link_testCaseNavigation_href_variable': link_testCaseNavigation_href_variable, 'link_testCaseNavigation_internalLabel': link_testCaseNavigation_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 44-Click on link testCaseNavigation navigateTo4 - Navigate to page projectteststest-cases.png')

"Step 45: Click on link katalonCloud2 -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_katalonCloud2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 45-Click on link katalonCloud2 - Navigate to page projectteststest-cases.png')

"Step 46: Click on div filterOptions (filterTableByType)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_filterOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_filterOptions', ['div_filterOptions_divNthOfType': div_filterOptions_divNthOfType, 'div_filterOptions_internalLabel': div_filterOptions_internalLabel, 'div_filterOptions_role': div_filterOptions_role]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 46-Click on div filterOptions filterTableByType.png')

"Step 47: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 47-Click on div object5.png')

"Step 48: Click on div filterOptions (filterByAuthor)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_filterOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_filterOptions', ['div_filterOptions_divNthOfType': div_filterOptions_divNthOfType_1, 'div_filterOptions_internalLabel': div_filterOptions_internalLabel_1, 'div_filterOptions_role': div_filterOptions_role_1]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 48-Click on div filterOptions filterByAuthor.png')

"Step 49: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 49-Click on div object5.png')

"Step 50: Click on div filterOptions (filterTableByType)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_filterOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_filterOptions', ['div_filterOptions_divNthOfType': div_filterOptions_divNthOfType_2, 'div_filterOptions_internalLabel': div_filterOptions_internalLabel_2, 'div_filterOptions_role': div_filterOptions_role_2]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 50-Click on div filterOptions filterTableByType.png')

"Step 51: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 51-Click on div object5.png')

"Step 52: Click on div object18"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_object18'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 52-Click on div object18.png')

"Step 53: Click on div filterOptions (filterTableStatus)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_filterOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_filterOptions', ['div_filterOptions_divNthOfType': div_filterOptions_divNthOfType_3, 'div_filterOptions_internalLabel': div_filterOptions_internalLabel_3, 'div_filterOptions_role': div_filterOptions_role_3]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 53-Click on div filterOptions filterTableStatus.png')

"Step 54: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 54-Click on div object5.png')

"Step 55: Hover over div status"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_status'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 55-Hover over div status.png')

"Step 56: Hover over button sort"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_sort'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 56-Hover over button sort.png')

"Step 57: Click on div customized"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_customized'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 57-Click on div customized.png')

"Step 58: Click on link testCaseNavigation (verifyUserConfusion) -> Navigate to page '/project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation', ['link_testCaseNavigation_class': link_testCaseNavigation_class_1, 'link_testCaseNavigation_href_variable': link_testCaseNavigation_href_variable_1, 'link_testCaseNavigation_internalLabel': link_testCaseNavigation_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 58-Click on link testCaseNavigation verifyUserConfusion - Navigate to page projectteststest-cases.png')

"Step 59: Click on link postGa4 -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_postGa4'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 59-Click on link postGa4 - Navigate to page projectteststest-cases.png')

"Step 60: Hover over span object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 60-Hover over span object5.png')

"Step 61: Click on item postGa43"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_postGa43'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 61-Click on item postGa43.png')

"Step 62: Hover over link testCloud"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_testCloud'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 62-Hover over link testCloud.png')

"Step 63: Click on span create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_create'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 63-Click on span create.png')

"Step 64: Click on item testCaseManagement (testCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCaseManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCaseManagement', ['item_testCaseManagement_internalLabel': item_testCaseManagement_internalLabel_2, 'item_testCaseManagement_spanNthOfType': item_testCaseManagement_spanNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 64-Click on item testCaseManagement testCase.png')

"Step 65: Hover over link navigateToVerifyRecursiveSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_navigateToVerifyRecursiveSearch'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 65-Hover over link navigateToVerifyRecursiveSearch.png')

"Step 66: Click on button create2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_create2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 66-Click on button create2.png')

"Step 67: Click on item folder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_folder2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 67-Click on item folder2.png')

"Step 68: Click on button cancel2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_cancel2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 68-Click on button cancel2.png')

"Step 69: Hover over link tests5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_tests5'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 69-Hover over link tests5.png')

"Step 70: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 70-Click on button create.png')

"Step 71: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 71-Click on div object5.png')

"Step 72: Click on div testCasePopover"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_testCasePopover'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 72-Click on div testCasePopover.png')

"Step 73: Click on div testsTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_testsTestCases'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 73-Click on div testsTestCases.png')

"Step 74: Click on item testCases (postGa44)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCases', ['item_testCases_id': item_testCases_id, 'item_testCases_muiTreeView': item_testCases_muiTreeView]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 74-Click on item testCases postGa44.png')

"Step 75: Click on button actionMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_actionMenu'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 75-Click on button actionMenu.png')

"Step 76: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 76-Click on div object5.png')

"Step 77: Click on link toolbar -> Navigate to page '/project/*/home/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_toolbar'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 77-Click on link toolbar - Navigate to page projecthomeoverview.png')

"Step 78: Click on div projectOverview (testsOverview)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_home_overview/div_projectOverview"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_home_overview/div_projectOverview', ['div_projectOverview_divNthChild': div_projectOverview_divNthChild, 'div_projectOverview_divNthOfType': div_projectOverview_divNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 78-Click on div projectOverview testsOverview.png')

"Step 79: Click on link tests6 -> Navigate to page '/project/*/tests/test-cases'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_tests6'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 79-Click on link tests6 - Navigate to page projectteststest-cases.png')

"Step 80: Hover over div object19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_object19'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 80-Hover over div object19.png')

"Step 81: Hover over link testCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_testCases'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 81-Hover over link testCases.png')

"Step 82: Click on span create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_create'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 82-Click on span create.png')

"Step 83: Click on item folder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_folder2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 83-Click on item folder2.png')

"Step 84: Click on button cancel2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_cancel2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 84-Click on button cancel2.png')

"Step 85: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 85-Click on button create.png')

"Step 86: Click on item testCaseManagement (testCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCaseManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCaseManagement', ['item_testCaseManagement_internalLabel': item_testCaseManagement_internalLabel_3, 'item_testCaseManagement_spanNthOfType': item_testCaseManagement_spanNthOfType_3]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 86-Click on item testCaseManagement testCase.png')

"Step 87: Click on button cancel2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_cancel2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 87-Click on button cancel2.png')

"Step 88: Hover over link allRepositories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_allRepositories'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 88-Hover over link allRepositories.png')

"Step 89: Click on item postGa (postGa42)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_postGa"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_postGa', ['item_postGa_id': item_postGa_id, 'item_postGa_muiTreeView': item_postGa_muiTreeView]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 89-Click on item postGa postGa42.png')

"Step 90: Click on span create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_create'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 90-Click on span create.png')

"Step 91: Click on item folder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_folder2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 91-Click on item folder2.png')

"Step 92: Click on item folder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_folder2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 92-Click on item folder2.png')

"Step 93: Hover over link verifyNonRecursiveFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_verifyNonRecursiveFilter'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 93-Hover over link verifyNonRecursiveFilter.png')

"Step 94: Click on button create2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_create2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 94-Click on button create2.png')

"Step 95: Click on item testCaseManagement (testCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCaseManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCaseManagement', ['item_testCaseManagement_internalLabel': item_testCaseManagement_internalLabel_4, 'item_testCaseManagement_spanNthOfType': item_testCaseManagement_spanNthOfType_4]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 95-Click on item testCaseManagement testCase.png')

"Step 96: Click on button cancel2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_cancel2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 96-Click on button cancel2.png')

"Step 97: Hover over input checkbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/input_checkbox'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 97-Hover over input checkbox.png')

"Step 98: Click on item testWebhook (testWebhook)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testWebhook"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testWebhook', ['item_testWebhook_id': item_testWebhook_id, 'item_testWebhook_muiTreeView': item_testWebhook_muiTreeView]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 98-Click on item testWebhook testWebhook.png')

"Step 99: Click on item katalonCloud"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_katalonCloud'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 99-Click on item katalonCloud.png')

"Step 100: Click on div treeViewIcon2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_treeViewIcon2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 100-Click on div treeViewIcon2.png')

"Step 101: Click on item postGa45"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_postGa43'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 101-Click on item postGa45.png')

"Step 102: Click on item testCases (postGa46)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCases', ['item_testCases_id': item_testCases_id_1, 'item_testCases_muiTreeView': item_testCases_muiTreeView_1]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 102-Click on item testCases postGa46.png')

"Step 103: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 103-Click on button create.png')

"Step 104: Click on item testCaseManagement (testCase)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCaseManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCaseManagement', ['item_testCaseManagement_internalLabel': item_testCaseManagement_internalLabel_5, 'item_testCaseManagement_spanNthOfType': item_testCaseManagement_spanNthOfType_5]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 104-Click on item testCaseManagement testCase.png')

"Step 105: Click on item katalonCloud2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_katalonCloud2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 105-Click on item katalonCloud2.png')

"Step 106: Click on button cancel2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_cancel2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 106-Click on button cancel2.png')

"Step 107: Click on link verifyUserConfusion2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_verifyUserConfusion2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 107-Click on link verifyUserConfusion2.png')

"Step 108: Hover over div navigateToPostGa4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_navigateToPostGa4'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 108-Hover over div navigateToPostGa4.png')

"Step 109: Click on div selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_selectAllRows'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 109-Click on div selectAllRows.png')

"Step 110: Click on input selectAllRows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/input_selectAllRows'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 110-Click on input selectAllRows.png')

"Step 111: Click on span itemsSelected"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_itemsSelected'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 111-Click on span itemsSelected.png')

"Step 112: Click on div navigateToPostGa42"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_navigateToPostGa42'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 112-Click on div navigateToPostGa42.png')

"Step 113: Click on input addTestCase2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/input_addTestCase2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 113-Click on input addTestCase2.png')

"Step 114: Click on input addTestCase2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/input_addTestCase2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 114-Click on input addTestCase2.png')

"Step 115: Enter input value in input addTestCase2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/input_addTestCase2'), input_addTestCase2)

WebUI.takeScreenshot(reportLocation + '/TC150/Step 115-Enter input value in input addTestCase2.png')

"Step 116: Click on button add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_add'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 116-Click on button add.png')

"Step 117: Hover over div navigateToPostGa4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_navigateToPostGa4'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 117-Hover over div navigateToPostGa4.png')

"Step 118: Hover over input checkbox2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/input_checkbox2'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 118-Hover over input checkbox2.png')

"Step 119: Click on item postGa (postGa47)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_postGa"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_postGa', ['item_postGa_id': item_postGa_id_1, 'item_postGa_muiTreeView': item_postGa_muiTreeView_1]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 119-Click on item postGa postGa47.png')

"Step 120: Click on div dateTime"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_dateTime'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 120-Click on div dateTime.png')

"Step 121: Click on input addTestCase2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/input_addTestCase2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 121-Click on input addTestCase2.png')

"Step 122: Enter input value in input addTestCase2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/input_addTestCase2'), input_addTestCase2_1)

WebUI.takeScreenshot(reportLocation + '/TC150/Step 122-Enter input value in input addTestCase2.png')

"Step 123: Click on button add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_add'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 123-Click on button add.png')

"Step 124: Click on button actionMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_actionMenu'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 124-Click on button actionMenu.png')

"Step 125: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 125-Click on div object5.png')

"Step 126: Click on div object20"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_testCasePopover'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 126-Click on div object20.png')

"Step 127: Click on item testCases (postGa48)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCases"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testCases', ['item_testCases_id': item_testCases_id_2, 'item_testCases_muiTreeView': item_testCases_muiTreeView_2]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 127-Click on item testCases postGa48.png')

"Step 128: Click on item postGa49"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_postGa49'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 128-Click on item postGa49.png')

"Step 129: Click on button actionMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_actionMenu'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 129-Click on button actionMenu.png')

"Step 130: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 130-Click on div object5.png')

"Step 131: Hover over input checkbox3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/input_checkbox3'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 131-Hover over input checkbox3.png')

"Step 132: Click on item testWebhook (testWebhook2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testWebhook"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_testWebhook', ['item_testWebhook_id': item_testWebhook_id_1, 'item_testWebhook_muiTreeView': item_testWebhook_muiTreeView_1]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 132-Click on item testWebhook testWebhook2.png')

"Step 133: Click on item testBranch2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_testBranch2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 133-Click on item testBranch2.png')

"Step 134: Click on item ciSamples (ciSamples2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_ciSamples"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_ciSamples', ['item_ciSamples_id': item_ciSamples_id, 'item_ciSamples_muiTreeView': item_ciSamples_muiTreeView]))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 134-Click on item ciSamples ciSamples2.png')

"Step 135: Click on div treeViewIcon3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_treeViewIcon3'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 135-Click on div treeViewIcon3.png')

"Step 136: Click on div accessTokenError2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_accessTokenError2'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 136-Click on div accessTokenError2.png')

"Step 137: Hover over div name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_name'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 137-Hover over div name.png')

"Step 138: Click on item mainTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_mainTestCases'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 138-Click on item mainTestCases.png')

"Step 139: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 139-Click on button create.png')

"Step 140: Click on item folder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_folder'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 140-Click on item folder.png')

"Step 141: Click on span createFolder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_createFolder'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 141-Click on span createFolder.png')

"Step 142: Click on div createFolder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_createFolder'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 142-Click on div createFolder.png')

"Step 143: Click on div createFolder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_createFolder'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 143-Click on div createFolder.png')

"Step 144: Click on div errorMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_errorMessage'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 144-Click on div errorMessage.png')

"Step 145: Click on span createFolder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_createFolder'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 145-Click on span createFolder.png')

"Step 146: Hover over span tokenError"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_tokenError'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 146-Hover over span tokenError.png')

"Step 147: Click on item postGa410"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_postGa410'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 147-Click on item postGa410.png')

"Step 148: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 148-Click on button create.png')

"Step 149: Click on item folder2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_folder2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 149-Click on item folder2.png')

"Step 150: Click on span createFolder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_createFolder'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 150-Click on span createFolder.png')

"Step 151: Hover over link navigateToTestCase5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_navigateToTestCase5'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 151-Hover over link navigateToTestCase5.png')

"Step 152: Hover over button admin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_admin'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 152-Hover over button admin.png')

"Step 153: Create a new item and check token status"

createItemAndCheckToken.execute(data_path_0, Integer.valueOf(index_0))

"Step 154: Hover over link allRepositories"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/link_allRepositories'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 154-Hover over link allRepositories.png')

"Step 155: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 155-Click on button create.png')

"Step 156: Click on item folder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_folder'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 156-Click on item folder.png')

"Step 157: Click on button checkToken"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_checkToken'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 157-Click on button checkToken.png')

"Step 158: Click on span object6"

WebUI.switchToWindowTitle('User Settings - name TestOps')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_object6'))

WebUI.switchToWindowIndex(0)

WebUI.takeScreenshot(reportLocation + '/TC150/Step 158-Click on span object6.png')

"Step 159: Click on div tokenError"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/div_tokenError'))

// WebUI.takeScreenshot(reportLocation + '/TC150/Step 159-Click on div tokenError.png')

"Step 160: Click on button cancel2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_cancel2'))

WebUI.takeScreenshot(reportLocation + '/TC150/Step 160-Click on button cancel2 - Navigate to page .png')

"Step 161: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC150-Create and Manage Test Cases with Token Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}