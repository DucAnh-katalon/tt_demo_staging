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

"Step 1: Navigate to /katalon-studio/katalon-atg"

TrueTestScripts.navigate("/katalon-studio/katalon-atg")

"Step 2: Click on button openUserMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg/button_openUserMenu'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 2-Click on button openUserMenu.png')

"Step 3: Click on link signOut -> Navigate to page '/logout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 3-Click on link signOut - Navigate to page logout.png')

"Step 4: Click on input signOut2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/logout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_logout/input_signOut2'))

WebUI.takeScreenshot(reportLocation + '/TC104/Step 4-Click on input signOut2 - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC104-Sign out and return to home page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}