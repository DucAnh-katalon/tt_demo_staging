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

"Step 1: Navigate to /login"

TrueTestScripts.navigate("/login")

"Step 2: Click on div welcomeMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login/div_welcomeMessage'))

// WebUI.takeScreenshot(reportLocation + '/TC105/Step 2-Click on div welcomeMessage.png')

"Step 3: Click on link signInWithGitHub -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login/link_signInWithGitHub'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 3-Click on link signInWithGitHub - Navigate to page .png')

"Step 4: Click on link logExplorer -> Navigate to page '/d/*/log-explorer'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_logExplorer'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 4-Click on link logExplorer - Navigate to page dlog-explorer.png')

"Step 5: Click on button cluster"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_cluster'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 5-Click on button cluster.png')

"Step 6: Click on button katalonEksClusterQa"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_katalonEksClusterQa'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 6-Click on button katalonEksClusterQa.png')

"Step 7: Click on button namespace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_namespace'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 7-Click on button namespace.png')

"Step 8: Enter input value in input namespace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/input_namespace'), input_namespace)

WebUI.takeScreenshot(reportLocation + '/TC105/Step 8-Enter input value in input namespace.png')

"Step 9: Press key Enter on input namespace"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/input_namespace'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 9-Press key Enter on input namespace.png')

"Step 10: Click on button namespace2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_namespace2'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 10-Click on button namespace2.png')

"Step 11: Click on button aiWorkers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_aiWorkers'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 11-Click on button aiWorkers.png')

"Step 12: Click on button container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_container'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 12-Click on button container.png')

"Step 13: Press key Enter on input container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/input_container'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 13-Press key Enter on input container.png')

"Step 14: Click on button container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/button_container'))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 14-Click on button container.png')

"Step 15: Enter input value in input container"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/input_container'), input_container)

WebUI.takeScreenshot(reportLocation + '/TC105/Step 15-Enter input value in input container.png')

"Step 16: Press key Enter on input container -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-explorer?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_d_log_explorer/input_container'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC105/Step 16-Press key Enter on input container - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC105-Sign in and navigate to DLog Explorer with cluster actions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}