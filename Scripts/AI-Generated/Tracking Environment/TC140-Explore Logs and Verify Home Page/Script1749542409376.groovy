import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to / with params (orgId)"

TrueTestScripts.navigate("/", ["orgId": var_orgId])

"Step 2: Click on link logExplorer -> Navigate to page '/d/*/log-explorer'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_logExplorer'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 2-Click on link logExplorer - Navigate to page dlog-explorer.png')

"Step 3: Click on button container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_container'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 3-Click on button container.png')

"Step 4: Enter input value in input container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/input_container'), input_container)

WebUI.takeScreenshot(reportLocation + '/TC140/Step 4-Enter input value in input container.png')

"Step 5: Press key Enter on input container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/input_container'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 5-Press key Enter on input container.png')

"Step 6: Click on button container2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_container2'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 6-Click on button container2.png')

"Step 7: Click on input container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/input_container'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 7-Click on input container.png')

"Step 8: Enter input value in input container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/input_container'), input_container_1)

WebUI.takeScreenshot(reportLocation + '/TC140/Step 8-Enter input value in input container.png')

"Step 9: Press key Enter on input container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/input_container'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 9-Press key Enter on input container.png')

"Step 10: Click on button errorLogAction (errorAction)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_d_log_explorer/button_errorLogAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_d_log_explorer/button_errorLogAction', ['button_errorLogAction_trNthChild': button_errorLogAction_trNthChild, 'button_errorLogAction_trNthOfType': button_errorLogAction_trNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 10-Click on button errorLogAction errorAction.png')

"Step 11: Click on button infoAction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_infoAction'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 11-Click on button infoAction.png')

"Step 12: Click on button infoAction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_infoAction'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 12-Click on button infoAction.png')

"Step 13: Click on button infoAction -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_infoAction'))

WebUI.takeScreenshot(reportLocation + '/TC140/Step 13-Click on button infoAction - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC140-Explore Logs and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}