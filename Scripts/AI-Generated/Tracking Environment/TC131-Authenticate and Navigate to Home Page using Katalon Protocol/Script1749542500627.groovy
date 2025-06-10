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

"Step 2: Click on link back -> Navigate to page '/realms/katalon/login-actions/authenticate'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/protocol/openid-connect/auth?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_protocol_openid_connect_auth/link_back'))

WebUI.takeScreenshot(reportLocation + '/TC131/Step 2-Click on link back - Navigate to page realmskatalonlogin-actionsauthenticate.png')

"Step 3: Click on link continueWithEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/login-actions/authenticate?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_login_actions_authenticate/link_continueWithEmail'))

WebUI.takeScreenshot(reportLocation + '/TC131/Step 3-Click on link continueWithEmail.png')

"Step 4: Login into Application"

TrueTestScripts.login()

"Step 5: Click on link continueWithEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/login-actions/authenticate?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_login_actions_authenticate/link_continueWithEmail'))

WebUI.takeScreenshot(reportLocation + '/TC131/Step 5-Click on link continueWithEmail.png')

"Step 6: Click on div loginWithEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/login-actions/authenticate?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_login_actions_authenticate/div_loginWithEmail'))

// WebUI.takeScreenshot(reportLocation + '/TC131/Step 6-Click on div loginWithEmail.png')

"Step 7: Login into Application"

TrueTestScripts.login()

"Step 8: Click on link continueWithEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/login-actions/authenticate?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_login_actions_authenticate/link_continueWithEmail'))

WebUI.takeScreenshot(reportLocation + '/TC131/Step 8-Click on link continueWithEmail.png')

"Step 9: Login into Application"

TrueTestScripts.login()

"Step 10: Click on label katalonAi"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/login-actions/authenticate?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_login_actions_authenticate/label_katalonAi'))

WebUI.takeScreenshot(reportLocation + '/TC131/Step 10-Click on label katalonAi.png')

"Step 11: Click on input continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/login-actions/authenticate?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_login_actions_authenticate/input_continue'))

WebUI.takeScreenshot(reportLocation + '/TC131/Step 11-Click on input continue.png')

"Step 12: Click on input continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/login-actions/authenticate?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_login_actions_authenticate/input_continue'))

WebUI.takeScreenshot(reportLocation + '/TC131/Step 12-Click on input continue.png')

"Step 13: Click on input continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/login-actions/authenticate?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_login_actions_authenticate/input_continue'))

WebUI.takeScreenshot(reportLocation + '/TC131/Step 13-Click on input continue.png')

"Step 14: Click on label katalonAi"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/login-actions/authenticate?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_login_actions_authenticate/label_katalonAi'))

WebUI.takeScreenshot(reportLocation + '/TC131/Step 14-Click on label katalonAi.png')

"Step 15: Click on input continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/login-actions/authenticate?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_login_actions_authenticate/input_continue'))

WebUI.takeScreenshot(reportLocation + '/TC131/Step 15-Click on input continue.png')

"Step 16: Click on input continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/login-actions/authenticate?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_login_actions_authenticate/input_continue'))

WebUI.takeScreenshot(reportLocation + '/TC131/Step 16-Click on input continue.png')

"Step 17: Click on input continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/login-actions/authenticate?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_login_actions_authenticate/input_continue'))

WebUI.takeScreenshot(reportLocation + '/TC131/Step 17-Click on input continue.png')

"Step 18: Click on label katalonAi2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/realms/katalon/login-actions/authenticate?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_realms_katalon_login_actions_authenticate/label_katalonAi'))

WebUI.takeScreenshot(reportLocation + '/TC131/Step 18-Click on label katalonAi2 - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC131-Authenticate and Navigate to Home Page using Katalon Protocol_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}