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

"Step 1: Navigate to /file/d/*/view"

TrueTestScripts.navigate("/file/d/${d_id}/view")

"Step 2: Click on section videoPlayer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 2-Click on section videoPlayer.png')

"Step 3: Click on button pause"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/button_pause'))

WebUI.takeScreenshot(reportLocation + '/TC95/Step 3-Click on button pause.png')

"Step 4: Click on button videoPlayer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/button_videoPlayer'))

WebUI.takeScreenshot(reportLocation + '/TC95/Step 4-Click on button videoPlayer.png')

"Step 5: Click on div playbackControls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/div_playbackControls'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 5-Click on div playbackControls.png')

"Step 6: Click on button videoPlayer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/button_videoPlayer'))

WebUI.takeScreenshot(reportLocation + '/TC95/Step 6-Click on button videoPlayer.png')

"Step 7: Click on div pause"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/div_playbackControls'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 7-Click on div pause.png')

"Step 8: Click on div pauseControls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/div_playbackControls'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 8-Click on div pauseControls.png')

"Step 9: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/div_playbackControls'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 9-Click on div object.png')

"Step 10: Click on div pauseRewindFastForward"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/div_playbackControls'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 10-Click on div pauseRewindFastForward.png')

"Step 11: Click on section videoPlayer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 11-Click on section videoPlayer2.png')

"Step 12: Click on div mediaControls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/div_playbackControls'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 12-Click on div mediaControls.png')

"Step 13: Click on div mediaControls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/div_playbackControls'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 13-Click on div mediaControls.png')

"Step 14: Click on div playControls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/div_playbackControls'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 14-Click on div playControls.png')

"Step 15: Click on button videoPlayer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/button_videoPlayer'))

WebUI.takeScreenshot(reportLocation + '/TC95/Step 15-Click on button videoPlayer.png')

"Step 16: Click on section videoPlayer3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 16-Click on section videoPlayer3.png')

"Step 17: Click on section videoPlayer4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 17-Click on section videoPlayer4.png')

"Step 18: Click on button videoPlayer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/button_videoPlayer'))

WebUI.takeScreenshot(reportLocation + '/TC95/Step 18-Click on button videoPlayer.png')

"Step 19: Click on section videoPlayer5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 19-Click on section videoPlayer5.png')

"Step 20: Click on button unmute"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/button_unmute'))

WebUI.takeScreenshot(reportLocation + '/TC95/Step 20-Click on button unmute.png')

"Step 21: Click on section videoPlayer6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 21-Click on section videoPlayer6.png')

"Step 22: Click on div playControls2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/div_playbackControls'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 22-Click on div playControls2.png')

"Step 23: Click on button unmute"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/button_unmute'))

WebUI.takeScreenshot(reportLocation + '/TC95/Step 23-Click on button unmute.png')

"Step 24: Click on section videoPlayer7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 24-Click on section videoPlayer7.png')

"Step 25: Click on section videoPlayer8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 25-Click on section videoPlayer8.png')

"Step 26: Click on section videoPlayer9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 26-Click on section videoPlayer9.png')

"Step 27: Click on section videoPlayer10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 27-Click on section videoPlayer10.png')

"Step 28: Click on section videoPlayer11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 28-Click on section videoPlayer11.png')

"Step 29: Click on button navigationControls (rewind)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_file_d_view/button_navigationControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_file_d_view/button_navigationControls', ['button_navigationControls_class': button_navigationControls_class, 'button_navigationControls_internalLabel': button_navigationControls_internalLabel, 'button_navigationControls_spanNthOfType': button_navigationControls_spanNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC95/Step 29-Click on button navigationControls rewind.png')

"Step 30: Click on button navigationControls (fastForward)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_file_d_view/button_navigationControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_file_d_view/button_navigationControls', ['button_navigationControls_class': button_navigationControls_class_1, 'button_navigationControls_internalLabel': button_navigationControls_internalLabel_1, 'button_navigationControls_spanNthOfType': button_navigationControls_spanNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC95/Step 30-Click on button navigationControls fastForward.png')

"Step 31: Click on div previewImage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/div_previewImage'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 31-Click on div previewImage.png')

"Step 32: Click on section videoPlayer7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 32-Click on section videoPlayer7.png')

"Step 33: Click on div playbackControls2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/div_playbackControls2'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 33-Click on div playbackControls2.png')

"Step 34: Click on section videoPlayer7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 34-Click on section videoPlayer7.png')

"Step 35: Click on section videoPlayer7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 35-Click on section videoPlayer7.png')

"Step 36: Click on section videoPlayer7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 36-Click on section videoPlayer7.png')

"Step 37: Click on section videoPlayer12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/section_videoPlayer'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 37-Click on section videoPlayer12.png')

"Step 38: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/div_playbackControls'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 38-Click on div object2.png')

"Step 39: Click on button fullScreen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/button_fullScreen'))

WebUI.takeScreenshot(reportLocation + '/TC95/Step 39-Click on button fullScreen.png')

"Step 40: Click on div object3 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/file/d/.*/view?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_file_d_view/div_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 40-Click on div object3 - Navigate to page .png')

"Step 41: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC95-Test Video Player Functionality Across Multiple Sections_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}