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

"Step 1: Navigate to /rec/component-page with params (accessLevel, action, clusterId, componentName, meetingId, originRequestUrl, requestFrom, sharelevel, useWhichPasswd)"

TrueTestScripts.navigate("/rec/component-page", ["accessLevel": component_page_accessLevel, "action": component_page_action, "clusterId": component_page_clusterId, "componentName": component_page_componentName, "meetingId": component_page_meetingId, "originRequestUrl": component_page_originRequestUrl, "requestFrom": component_page_requestFrom, "sharelevel": component_page_sharelevel, "useWhichPasswd": component_page_useWhichPasswd])

"Step 2: Click on input passcode -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/component-page?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_component_page/input_passcode'))

WebUI.takeScreenshot(reportLocation + '/TC112/Step 2-Click on input passcode - Navigate to page .png')

"Step 3: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC112-Access Home Page Using Passcode_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}