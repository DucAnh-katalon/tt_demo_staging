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

"Step 1: Navigate to /sessions/selector with params (client id, code challenge, code challenge method, redirect uri, response type, scope)"

TrueTestScripts.navigate("/sessions/selector", ["client_id": selector_client_id, "code_challenge": selector_code_challenge, "code_challenge_method": selector_code_challenge_method, "redirect_uri": selector_redirect_uri, "response_type": selector_response_type, "scope": selector_scope])

"Step 2: Click on link authorize -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/sessions/selector?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_sessions_selector/link_authorize'))

WebUI.takeScreenshot(reportLocation + '/TC172/Step 2-Click on link authorize - Navigate to page .png')

"Step 3: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC172-Authorize Session and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}