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

WebUI.takeScreenshot(reportLocation + '/TC44/Step 2-Click on link logExplorer - Navigate to page dlog-explorer.png')

"Step 3: Click on button namespace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_namespace'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 3-Click on button namespace.png')

"Step 4: Click on button aiWorkers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_aiWorkers'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 4-Click on button aiWorkers.png')

"Step 5: Click on button container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_container'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 5-Click on button container.png')

"Step 6: Enter input value in input container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/input_container'), input_container)

WebUI.takeScreenshot(reportLocation + '/TC44/Step 6-Enter input value in input container.png')

"Step 7: Press key Enter on input container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/input_container'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 7-Press key Enter on input container.png')

"Step 8: Click on button errorLogAction (errorLog)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_d_log_explorer/button_errorLogAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_d_log_explorer/button_errorLogAction', ['button_errorLogAction_trNthChild': button_errorLogAction_trNthChild, 'button_errorLogAction_trNthOfType': button_errorLogAction_trNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 8-Click on button errorLogAction errorLog.png')

"Step 9: Hover over button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_object'))

// WebUI.takeScreenshot(reportLocation + '/TC44/Step 9-Hover over button object.png')

"Step 10: Click on button object2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC44/Step 10-Click on button object2 - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC44-Explore Logs and Verify Navigation to Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}