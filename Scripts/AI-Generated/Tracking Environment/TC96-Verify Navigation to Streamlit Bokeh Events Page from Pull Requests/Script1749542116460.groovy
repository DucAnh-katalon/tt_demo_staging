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

"Step 1: Navigate to /katalon-studio/katalon-atg/pull/*"

TrueTestScripts.navigate("/katalon-studio/katalon-atg/pull/${pull_id}")

"Step 2: Click on link pullRequests2 -> Navigate to page '/*/streamlit-bokeh-events'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull/link_pullRequests2'))

WebUI.takeScreenshot(reportLocation + '/TC96/Step 2-Click on link pullRequests2 - Navigate to page streamlit-bokeh-events.png')

"Step 3: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC96-Verify Navigation to Streamlit Bokeh Events Page from Pull Requests_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}