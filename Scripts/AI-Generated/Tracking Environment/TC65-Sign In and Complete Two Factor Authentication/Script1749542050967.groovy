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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link signIn -> Navigate to page '/login'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 2-Click on link signIn - Navigate to page login.png')

"Step 3: Click on form login"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login/form_login'))

// WebUI.takeScreenshot(reportLocation + '/TC65/Step 3-Click on form login.png')

"Step 4: Click on input username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login/input_username'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 4-Click on input username.png')

"Step 5: Click on input username"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login/input_username'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 5-Click on input username.png')

"Step 6: Click on div loginForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login/div_loginForm'))

// WebUI.takeScreenshot(reportLocation + '/TC65/Step 6-Click on div loginForm.png')

"Step 7: Click on input signIn -> Navigate to page '/sessions/two-factor/app'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login/input_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 7-Click on input signIn - Navigate to page sessionstwo-factorapp.png')

"Step 8: Click on input authenticationCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/sessions/two-factor/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_sessions_two_factor_app/input_authenticationCode'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 8-Click on input authenticationCode.png')

"Step 9: Press key Enter on input authenticationCode -> Navigate to page '/sessions/trusted-device'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/sessions/two-factor/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_sessions_two_factor_app/input_authenticationCode'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 9-Press key Enter on input authenticationCode - Navigate to page sessionstrusted-device.png')

"Step 10: Click on input askMeLater -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/sessions/trusted-device?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_sessions_trusted_device/input_askMeLater'))

WebUI.takeScreenshot(reportLocation + '/TC65/Step 10-Click on input askMeLater - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC65-Sign In and Complete Two Factor Authentication_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}