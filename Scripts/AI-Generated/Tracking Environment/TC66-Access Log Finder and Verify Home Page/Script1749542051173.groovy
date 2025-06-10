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

"Step 1: Navigate to /a/cloud-home-app"

TrueTestScripts.navigate("/a/cloud-home-app")

"Step 2: Click on link logFinder -> Navigate to page '/d/*/log-finder'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/a/cloud-home-app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_a_cloud_home_app/link_logFinder'))

WebUI.takeScreenshot(reportLocation + '/TC66/Step 2-Click on link logFinder - Navigate to page dlog-finder.png')

"Step 3: Click on div dashboardTemplateVariables -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/d/.*/log-finder?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_d_log_finder/div_dashboardTemplateVariables'))

// WebUI.takeScreenshot(reportLocation + '/TC66/Step 3-Click on div dashboardTemplateVariables - Navigate to page .png')

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC66-Access Log Finder and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}