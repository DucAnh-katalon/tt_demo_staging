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

"Step 2: Click on link login"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_login'))

WebUI.takeScreenshot(reportLocation + '/TC91/Step 2-Click on link login.png')

"Step 3: Enter input value in input password2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_home/input_password2'), input_password2)

WebUI.takeScreenshot(reportLocation + '/TC91/Step 3-Enter input value in input password2.png')

"Step 4: Press key Enter on input password2 -> Navigate to page '/login/device-based/regular/login'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_home/input_password2'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC91/Step 4-Press key Enter on input password2 - Navigate to page logindevice-basedregularlogin.png')

"Step 5: Click on div logIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login/device-based/regular/login?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login_device_based_regular_login/div_logIn'))

// WebUI.takeScreenshot(reportLocation + '/TC91/Step 5-Click on div logIn.png')

"Step 6: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login/device-based/regular/login?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login_device_based_regular_login/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC91/Step 6-Click on div object.png')

"Step 7: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login/device-based/regular/login?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login_device_based_regular_login/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC91/Step 7-Click on div object.png')

"Step 8: Click on link login"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login/device-based/regular/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login_device_based_regular_login/link_login'))

WebUI.takeScreenshot(reportLocation + '/TC91/Step 8-Click on link login.png')

"Step 9: Click on button login -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login/device-based/regular/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login_device_based_regular_login/button_login'))

WebUI.takeScreenshot(reportLocation + '/TC91/Step 9-Click on button login - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC91-Login and Verify Home Page with Regular Credentials_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}