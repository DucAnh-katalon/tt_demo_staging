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

"Step 1: Navigate to /dashboard"

TrueTestScripts.navigate("/dashboard")

"Step 2: Click on button clarioApps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_clarioApps'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 2-Click on button clarioApps.png')

"Step 3: Click on link administrationTool -> Navigate to page '/gssoadmin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_administrationTool'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 3-Click on link administrationTool - Navigate to page gssoadmin.png')

"Step 4: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 4-Click on button superUser.png')

"Step 5: Click on link logout -> Navigate to page '/gateway'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC82/Step 5-Click on link logout - Navigate to page gateway.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC82-Access Administration Tool and Logout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}