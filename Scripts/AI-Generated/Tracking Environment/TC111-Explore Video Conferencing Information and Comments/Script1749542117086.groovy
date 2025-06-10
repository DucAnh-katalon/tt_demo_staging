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

"Step 1: Navigate to /browse/*"

TrueTestScripts.navigate("/browse/${browse_id}")

"Step 2: Click on link katalonTrueTestPocmeetings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_katalonTrueTestPocmeetings'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 2-Click on link katalonTrueTestPocmeetings.png')

"Step 3: Click on button showMoreComments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_showMoreComments'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 3-Click on button showMoreComments.png')

"Step 4: Click on link videoConferencing"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_videoConferencing'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 4-Click on link videoConferencing.png')

"Step 5: Click on p videoConferencingInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/p_videoConferencingInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC111/Step 5-Click on p videoConferencingInfo.png')

"Step 6: Click on p videoConferencingInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/p_videoConferencingInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC111/Step 6-Click on p videoConferencingInfo.png')

"Step 7: Click on link videoConferencing"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_videoConferencing'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 7-Click on link videoConferencing.png')

"Step 8: Click on button showMoreComments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_showMoreComments'))

WebUI.takeScreenshot(reportLocation + '/TC111/Step 8-Click on button showMoreComments.png')

"Step 9: Click on p videoConferencingInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/p_videoConferencingInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC111/Step 9-Click on p videoConferencingInfo.png')

"Step 10: Click on p videoConferencingInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/p_videoConferencingInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC111/Step 10-Click on p videoConferencingInfo.png')

"Step 11: Click on p videoConferencingInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/p_videoConferencingInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC111/Step 11-Click on p videoConferencingInfo.png')

"Step 12: Click on p videoConferencingInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/p_videoConferencingInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC111/Step 12-Click on p videoConferencingInfo.png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC111-Explore Video Conferencing Information and Comments_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}