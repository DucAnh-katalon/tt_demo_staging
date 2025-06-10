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

"Step 1: Navigate to /spreadsheets/d/*/edit with params (gid)"

TrueTestScripts.navigate("/spreadsheets/d/${d_id}/edit", ["gid": edit_gid])

"Step 2: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC93/Step 2-Click on div object.png')

"Step 3: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC93/Step 3-Click on div object.png')

"Step 4: Click on div textEditors (richTextEditor)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_textEditors"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_textEditors', ['div_textEditors_internalLabel': div_textEditors_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 4-Click on div textEditors richTextEditor.png')

"Step 5: Click on div comparisonResults (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_comparisonResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_comparisonResults', ['div_comparisonResults_id': div_comparisonResults_id]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 5-Click on div comparisonResults object3.png')

"Step 6: Click on div comparisonResults (rlProject)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_comparisonResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_comparisonResults', ['div_comparisonResults_id': div_comparisonResults_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 6-Click on div comparisonResults rlProject.png')

"Step 7: Click on div comparisonResults (rlStagingMap)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_comparisonResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_comparisonResults', ['div_comparisonResults_id': div_comparisonResults_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 7-Click on div comparisonResults rlStagingMap.png')

"Step 8: Click on div comparisonResults (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_comparisonResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_comparisonResults', ['div_comparisonResults_id': div_comparisonResults_id_3]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 8-Click on div comparisonResults object4.png')

"Step 9: Click on div comparisonResults (comparedResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_comparisonResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_comparisonResults', ['div_comparisonResults_id': div_comparisonResults_id_4]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 9-Click on div comparisonResults comparedResults.png')

"Step 10: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC93/Step 10-Click on div object2.png')

"Step 11: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC93/Step 11-Click on div object2.png')

"Step 12: Click on span stepInstructions (testSteps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/span_stepInstructions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/span_stepInstructions', ['span_stepInstructions_internalLabel': span_stepInstructions_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 12-Click on span stepInstructions testSteps.png')

"Step 13: Click on div textEditors (h1Editor)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_textEditors"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_textEditors', ['div_textEditors_internalLabel': div_textEditors_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 13-Click on div textEditors h1Editor.png')

"Step 14: Click on span stepInstructions (testSteps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/span_stepInstructions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/span_stepInstructions', ['span_stepInstructions_internalLabel': span_stepInstructions_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 14-Click on span stepInstructions testSteps.png')

"Step 15: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC93/Step 15-Click on div object.png')

"Step 16: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC93/Step 16-Click on div object.png')

"Step 17: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC93/Step 17-Click on div object.png')

"Step 18: Click on div scrollable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_scrollable'))

// WebUI.takeScreenshot(reportLocation + '/TC93/Step 18-Click on div scrollable.png')

"Step 19: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC93/Step 19-Click on div object.png')

"Step 20: Click on div comparisonResults (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_comparisonResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_comparisonResults', ['div_comparisonResults_id': div_comparisonResults_id_5]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 20-Click on div comparisonResults object5.png')

"Step 21: Click on div comparisonResults (comparedResults2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_comparisonResults"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/div_comparisonResults', ['div_comparisonResults_id': div_comparisonResults_id_6]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 21-Click on div comparisonResults comparedResults2.png')

"Step 22: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC93/Step 22-Click on div object.png')

"Step 23: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC93/Step 23-Click on div object.png')

"Step 24: Click on span stepInstructions (stepInstructions) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/span_stepInstructions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/span_stepInstructions', ['span_stepInstructions_internalLabel': span_stepInstructions_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC93/Step 24-Click on span stepInstructions stepInstructions - Navigate to page .png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC93-Navigate and Verify Home Page after Multiple Interactions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}