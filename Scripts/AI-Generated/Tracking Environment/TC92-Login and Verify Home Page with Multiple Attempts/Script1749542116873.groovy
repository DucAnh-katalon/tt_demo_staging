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

"Step 1: Navigate to /vn-en/login"

TrueTestScripts.navigate("/vn-en/login")

"Step 2: Click on input password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/vn-en/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_vn_en_login/input_password'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 2-Click on input password.png')

"Step 3: Click on input emailOrMobile"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/vn-en/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_vn_en_login/input_emailOrMobile'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 3-Click on input emailOrMobile.png')

"Step 4: Click on button signIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/vn-en/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_vn_en_login/button_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 4-Click on button signIn.png')

"Step 5: Click on input userLoginId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/vn-en/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_vn_en_login/input_userLoginId'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 5-Click on input userLoginId.png')

"Step 6: Click on input password2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/vn-en/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_vn_en_login/input_password2'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 6-Click on input password2.png')

"Step 7: Click on button signIn2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/vn-en/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_vn_en_login/button_signIn2'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 7-Click on button signIn2.png')

"Step 8: Click on input userLoginId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/vn-en/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_vn_en_login/input_userLoginId2'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 8-Click on input userLoginId2.png')

"Step 9: Click on div signInError"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/vn-en/login?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_vn_en_login/div_signInError'))

// WebUI.takeScreenshot(reportLocation + '/TC92/Step 9-Click on div signInError.png')

"Step 10: Click on input password3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/vn-en/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_vn_en_login/input_password3'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 10-Click on input password3.png')

"Step 11: Click on button signIn2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/vn-en/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_vn_en_login/button_signIn2'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 11-Click on button signIn2.png')

"Step 12: Click on input userLoginId3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/vn-en/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_vn_en_login/input_userLoginId3'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 12-Click on input userLoginId3.png')

"Step 13: Click on input password4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/vn-en/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_vn_en_login/input_password4'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 13-Click on input password4.png')

"Step 14: Click on button signIn2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/vn-en/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_vn_en_login/button_signIn2'))

WebUI.takeScreenshot(reportLocation + '/TC92/Step 14-Click on button signIn2 - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC92-Login and Verify Home Page with Multiple Attempts_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}