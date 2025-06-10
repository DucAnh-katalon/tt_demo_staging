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

"Step 2: Enter input value in input passcode2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/component-page?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_rec_component_page/input_passcode2'), input_passcode2)

WebUI.takeScreenshot(reportLocation + '/TC113/Step 2-Enter input value in input passcode2.png')

"Step 3: Click on button watchRecording -> Navigate to page '/rec/play/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/component-page?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_component_page/button_watchRecording'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 3-Click on button watchRecording - Navigate to page recplay.png')

"Step 4: Click on div progressBar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/div_progressBar'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 4-Click on div progressBar.png')

"Step 5: Click on div progressBar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/div_progressBar'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 5-Click on div progressBar.png')

"Step 6: Click on video object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/video_object'))

// WebUI.takeScreenshot(reportLocation + '/TC113/Step 6-Click on video object.png')

"Step 7: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC113/Step 7-Click on div object.png')

"Step 8: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC113/Step 8-Click on div object.png')

"Step 9: Click on div volumeSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/div_volumeSlider'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 9-Click on div volumeSlider.png')

"Step 10: Click on div volumeSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/div_volumeSlider'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 10-Click on div volumeSlider.png')

"Step 11: Click on div volumeSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/div_volumeSlider'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 11-Click on div volumeSlider.png')

"Step 12: Click on button pause"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/button_pause'))

WebUI.takeScreenshot(reportLocation + '/TC113/Step 12-Click on button pause.png')

"Step 13: Click on div playbackControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/div_playbackControl'))

// WebUI.takeScreenshot(reportLocation + '/TC113/Step 13-Click on div playbackControl.png')

"Step 14: Click on video object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/video_object'))

// WebUI.takeScreenshot(reportLocation + '/TC113/Step 14-Click on video object.png')

"Step 15: Click on div controlBar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/div_playbackControl'))

// WebUI.takeScreenshot(reportLocation + '/TC113/Step 15-Click on div controlBar.png')

"Step 16: Click on div controlBar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/div_playbackControl'))

// WebUI.takeScreenshot(reportLocation + '/TC113/Step 16-Click on div controlBar.png')

"Step 17: Click on div controlBar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/div_playbackControl'))

// WebUI.takeScreenshot(reportLocation + '/TC113/Step 17-Click on div controlBar2.png')

"Step 18: Click on div controlBar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/div_playbackControl'))

// WebUI.takeScreenshot(reportLocation + '/TC113/Step 18-Click on div controlBar2.png')

"Step 19: Click on video object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/video_object'))

// WebUI.takeScreenshot(reportLocation + '/TC113/Step 19-Click on video object.png')

"Step 20: Click on div loadedStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/div_playbackControl'))

// WebUI.takeScreenshot(reportLocation + '/TC113/Step 20-Click on div loadedStatus.png')

"Step 21: Click on header pageTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/header_pageTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC113/Step 21-Click on header pageTitle.png')

"Step 22: Click on div controlBar3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/div_playbackControl'))

// WebUI.takeScreenshot(reportLocation + '/TC113/Step 22-Click on div controlBar3.png')

"Step 23: Click on div progressControl -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/rec/play/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_rec_play/div_progressControl'))

// WebUI.takeScreenshot(reportLocation + '/TC113/Step 23-Click on div progressControl - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC113-Watch and Control Video Recording Playback_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}