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

"Step 2: Click on button refreshPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_overview/button_refreshPage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on button refreshPage.png')

"Step 3: Hover over link assets"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_overview/link_assets'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Hover over link assets.png')

"Step 4: Click on link testObjects -> Navigate to page 'project resource#project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_overview/link_testObjects'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on link testObjects - Navigate to page project resourceproject.png')

"Step 5: Hover over link tests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_resource/link_tests'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Hover over link tests.png')

"Step 6: Click on link testCases -> Navigate to page 'project management#project/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_resource/link_testCases'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link testCases - Navigate to page project managementproject.png')

"Step 7: Click on link navigateToTestCase -> Navigate to page 'project management#project/*/tests/test-cases/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/link_navigateToTestCase'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on link navigateToTestCase - Navigate to page project managementprojectteststest-cases.png')

"Step 8: Click on textarea typeDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/textarea_typeDescription'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on textarea typeDescription.png')

"Step 9: Enter input value in textarea typeDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_project_management/textarea_typeDescription'), textarea_typeDescription)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Enter input value in textarea typeDescription.png')

"Step 10: Click on button newStep"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/button_newStep'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on button newStep.png')

"Step 11: Enter input value in textarea editCell"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_project_management/textarea_editCell'), textarea_editCell)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Enter input value in textarea editCell.png')

"Step 12: Click on div dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_management/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_management/div_dynamicObject', ['div_dynamicObject_divNthChild': div_dynamicObject_divNthChild, 'div_dynamicObject_divNthOfType': div_dynamicObject_divNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on div dynamicObject object.png')

"Step 13: Enter input value in textarea editCell2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_project_management/textarea_editCell2'), textarea_editCell2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Enter input value in textarea editCell2.png')

"Step 14: Click on div dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_management/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_management/div_dynamicObject', ['div_dynamicObject_divNthChild': div_dynamicObject_divNthChild_1, 'div_dynamicObject_divNthOfType': div_dynamicObject_divNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on div dynamicObject object2.png')

"Step 15: Enter input value in textarea editCell3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_project_management/textarea_editCell3'), textarea_editCell3)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Enter input value in textarea editCell3.png')

"Step 16: Click on div description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/div_description'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on div description.png')

"Step 17: Click on button projectManagementActions (steps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementActions', ['button_projectManagementActions_class': button_projectManagementActions_class, 'button_projectManagementActions_internalText': button_projectManagementActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on button projectManagementActions steps.png')

"Step 18: Click on div steps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/div_steps'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on div steps.png')

"Step 19: Click on button projectManagementActions (scripts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementActions', ['button_projectManagementActions_class': button_projectManagementActions_class_1, 'button_projectManagementActions_internalText': button_projectManagementActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on button projectManagementActions scripts.png')

"Step 20: Click on button projectManagementActions (steps2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementActions', ['button_projectManagementActions_class': button_projectManagementActions_class_2, 'button_projectManagementActions_internalText': button_projectManagementActions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on button projectManagementActions steps2.png')

"Step 21: Click on button projectManagementActions (runHistory)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementActions', ['button_projectManagementActions_class': button_projectManagementActions_class_3, 'button_projectManagementActions_internalText': button_projectManagementActions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on button projectManagementActions runHistory.png')

"Step 22: Click on button projectManagementActions (linkages)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementActions', ['button_projectManagementActions_class': button_projectManagementActions_class_4, 'button_projectManagementActions_internalText': button_projectManagementActions_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on button projectManagementActions linkages.png')

"Step 23: Click on button projectManagementActions (changeHistory)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_management/button_projectManagementActions', ['button_projectManagementActions_class': button_projectManagementActions_class_5, 'button_projectManagementActions_internalText': button_projectManagementActions_internalText_5]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on button projectManagementActions changeHistory.png')

"Step 24: Click on textarea typeDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/textarea_typeDescription'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on textarea typeDescription.png')

"Step 25: Click on button quality"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/button_quality'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Click on button quality.png')

"Step 26: Click on div preCondition"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/div_preCondition'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Click on div preCondition.png')

"Step 27: Click on div assets -> Navigate to page 'project management#project/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/tests/test-cases/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/div_assets'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 27-Click on div assets - Navigate to page project managementproject.png')

"Step 28: Click on div executions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/div_executions'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 28-Click on div executions.png')

"Step 29: Click on div noTestRun -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'project/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_management/div_noTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 29-Click on div noTestRun - Navigate to page .png')

"Step 30: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Manage Test Cases and Project Overview Actions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}