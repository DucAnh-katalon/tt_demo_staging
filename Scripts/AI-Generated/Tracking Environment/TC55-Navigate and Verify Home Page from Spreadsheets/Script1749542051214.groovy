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

// WebUI.takeScreenshot(reportLocation + '/TC55/Step 2-Click on div object.png')

"Step 3: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC55/Step 3-Click on div object.png')

"Step 4: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC55/Step 4-Click on div object.png')

"Step 5: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC55/Step 5-Click on div object2.png')

"Step 6: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC55/Step 6-Click on div object2.png')

"Step 7: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC55/Step 7-Click on div object2.png')

"Step 8: Click on span stepInstructions (testSteps) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/span_stepInstructions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_spreadsheets_d_edit/span_stepInstructions', ['span_stepInstructions_internalLabel': span_stepInstructions_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC55/Step 8-Click on span stepInstructions testSteps - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC55-Navigate and Verify Home Page from Spreadsheets_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}