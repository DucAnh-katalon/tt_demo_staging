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

"Step 1: Navigate to /o/*/*/auth/oauthchooseaccount with params (client id, code challenge, code challenge method, ddm, flowName, nonce, o2v, redirect uri, response type, scope, service, state)"

TrueTestScripts.navigate("/o/${o_id}/${path_param_3}/auth/oauthchooseaccount", ["client_id": oauthchooseaccount_client_id, "code_challenge": oauthchooseaccount_code_challenge, "code_challenge_method": oauthchooseaccount_code_challenge_method, "ddm": oauthchooseaccount_ddm, "flowName": oauthchooseaccount_flowName, "nonce": oauthchooseaccount_nonce, "o2v": oauthchooseaccount_o2v, "redirect_uri": oauthchooseaccount_redirect_uri, "response_type": oauthchooseaccount_response_type, "scope": oauthchooseaccount_scope, "service": oauthchooseaccount_service, "state": oauthchooseaccount_state])

"Step 2: Click on div object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/o/.*/.*/auth/oauthchooseaccount?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_o_auth_oauthchooseaccount/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on div object - Navigate to page .png')

"Step 3: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-OAuth Account Selection and Home Page Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}