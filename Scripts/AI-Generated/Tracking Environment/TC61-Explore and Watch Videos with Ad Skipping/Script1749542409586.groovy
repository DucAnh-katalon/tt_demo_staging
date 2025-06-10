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

"Step 2: Click on link tuyenTapPhatTatCa3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_tuyenTapPhatTatCa3'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 2-Click on link tuyenTapPhatTatCa3.png')

"Step 3: Click on link tuyenTapPhatTatCa4 -> Navigate to page '/watch'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_tuyenTapPhatTatCa4'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 3-Click on link tuyenTapPhatTatCa4 - Navigate to page watch.png')

"Step 4: Hover over div watch6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_watch6'))

// WebUI.takeScreenshot(reportLocation + '/TC61/Step 4-Hover over div watch6.png')

"Step 5: Click on button skipAd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_watch/button_skipAd'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 5-Click on button skipAd.png')

"Step 6: Click on video object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_watch/video_object'))

// WebUI.takeScreenshot(reportLocation + '/TC61/Step 6-Click on video object.png')

"Step 7: Click on link youtubeHome -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_watch/link_youtubeHome'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 7-Click on link youtubeHome - Navigate to page .png')

"Step 8: Hover over link object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_home/link_object'))

// WebUI.takeScreenshot(reportLocation + '/TC61/Step 8-Hover over link object.png')

"Step 9: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_home/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC61/Step 9-Hover over div object.png')

"Step 10: Hover over div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_home/div_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC61/Step 10-Hover over div object2.png')

"Step 11: Hover over div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_home/div_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC61/Step 11-Hover over div object3.png')

"Step 12: Click on button closeMiniplayer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_closeMiniplayer'))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 12-Click on button closeMiniplayer.png')

"Step 13: Click on link thumbnailLinks (thumbnail2) -> Navigate to page '/watch'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/link_thumbnailLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/link_thumbnailLinks', ['link_thumbnailLinks_ytdRichItemRendererNthChild': link_thumbnailLinks_ytdRichItemRendererNthChild, 'link_thumbnailLinks_ytdRichItemRendererNthOfType': link_thumbnailLinks_ytdRichItemRendererNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 13-Click on link thumbnailLinks thumbnail2 - Navigate to page watch.png')

"Step 14: Click on video object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_watch/video_object'))

// WebUI.takeScreenshot(reportLocation + '/TC61/Step 14-Click on video object.png')

"Step 15: Click on link watchVideo (watchVideo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_watch/link_watchVideo"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_watch/link_watchVideo', ['link_watchVideo_internalHasText': link_watchVideo_internalHasText, 'link_watchVideo_ytLockupViewModelNthOfType': link_watchVideo_ytLockupViewModelNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 15-Click on link watchVideo watchVideo.png')

"Step 16: Hover over link watchVideo2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/link_watchVideo2'))

// WebUI.takeScreenshot(reportLocation + '/TC61/Step 16-Hover over link watchVideo2.png')

"Step 17: Hover over div watch7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_watch7'))

// WebUI.takeScreenshot(reportLocation + '/TC61/Step 17-Hover over div watch7.png')

"Step 18: Click on button skipActions (skip2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_watch/button_skipActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_watch/button_skipActions', ['button_skipActions_class': button_skipActions_class, 'button_skipActions_id': button_skipActions_id]))

WebUI.takeScreenshot(reportLocation + '/TC61/Step 18-Click on button skipActions skip2 - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC61-Explore and Watch Videos with Ad Skipping_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}