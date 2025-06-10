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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Enter input value in input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_home/input_search'), input_search)

WebUI.takeScreenshot(reportLocation + '/TC37/Step 2-Enter input value in input search.png')

"Step 3: Click on span startGuide -> Navigate to page '/results'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/span_startGuide'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 3-Click on span startGuide - Navigate to page results.png')

"Step 4: Click on link helpGuide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/results?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_results/link_helpGuide'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 4-Click on link helpGuide.png')

"Step 5: Click on link videoPreview -> Navigate to page '/watch'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/results?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_results/link_videoPreview'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 5-Click on link videoPreview - Navigate to page watch.png')

"Step 6: Click on video object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_watch/video_object'))

// WebUI.takeScreenshot(reportLocation + '/TC37/Step 6-Click on video object - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC37-Verify Help Guide Access and Video Preview_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}