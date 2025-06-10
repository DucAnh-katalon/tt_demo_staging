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

"Step 1: Navigate to /realms/katalon/protocol/openid-connect/auth with params (client id, code challenge, code challenge method, redirect uri, response type, scope, state)"

TrueTestScripts.navigate("/realms/katalon/protocol/openid-connect/auth", ["client_id": auth_client_id, "code_challenge": auth_code_challenge, "code_challenge_method": auth_code_challenge_method, "redirect_uri": auth_redirect_uri, "response_type": auth_response_type, "scope": auth_scope, "state": auth_state])

"Step 2: Click on label katalonAi"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/protocol/openid-connect/auth?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_protocol_openid_connect_auth/label_katalonAi'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 2-Click on label katalonAi.png')

"Step 3: Click on input continue -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/protocol/openid-connect/auth?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_protocol_openid_connect_auth/input_continue'))

WebUI.takeScreenshot(reportLocation + '/TC71/Step 3-Click on input continue - Navigate to page .png')

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC71-Authenticate using Katalon Protocol OpenID Connect_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}