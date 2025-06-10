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

"Step 1: Navigate to /env/staging/aut/*/history/*/graph/*"

TrueTestScripts.navigate("/env/staging/aut/${aut_id}/history/${history_id}/graph/${graph_id}")

"Step 2: Hover over link qa"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history_graph/link_qa'))

// WebUI.takeScreenshot(reportLocation + '/TC126/Step 2-Hover over link qa.png')

"Step 3: Click on button showDetailFlow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history_graph/button_showDetailFlow'))

WebUI.takeScreenshot(reportLocation + '/TC126/Step 3-Click on button showDetailFlow.png')

"Step 4: Click on button showDetailFlowPanel -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history_graph/button_showDetailFlowPanel'))

WebUI.takeScreenshot(reportLocation + '/TC126/Step 4-Click on button showDetailFlowPanel - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC126-Show Detail Flow and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}