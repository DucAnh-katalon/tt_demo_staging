import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
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

"Step 2: Click on link videoPreview -> Navigate to page '/watch'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_videoPreview'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 2-Click on link videoPreview - Navigate to page watch.png')

"Step 3: Hover over div description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_description'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 3-Hover over div description.png')

"Step 4: Hover over div watch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_watch'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 4-Hover over div watch.png')

"Step 5: Hover over div slider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_slider'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 5-Hover over div slider.png')

"Step 6: Hover over div watch2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_watch2'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 6-Hover over div watch2.png')

"Step 7: Hover over div watch3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_watch3'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 7-Hover over div watch3.png')

"Step 8: Hover over div watch4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_watch4'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 8-Hover over div watch4.png')

"Step 9: Hover over div watch5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_watch5'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 9-Hover over div watch5.png')

"Step 10: Click on link youtubeHome -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_watch/link_youtubeHome'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 10-Click on link youtubeHome - Navigate to page .png')

"Step 11: Click on link tuyenTapPhatTatCa -> Navigate to page '/watch'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_tuyenTapPhatTatCa4'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 11-Click on link tuyenTapPhatTatCa - Navigate to page watch.png')

"Step 12: Click on button skipActions (skip)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_watch/button_skipActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_watch/button_skipActions', ['button_skipActions_class': button_skipActions_class, 'button_skipActions_id': button_skipActions_id]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 12-Click on button skipActions skip.png')

"Step 13: Hover over div description2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_description'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 13-Hover over div description2.png')

"Step 14: Click on link youtubeHome -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_watch/link_youtubeHome'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 14-Click on link youtubeHome - Navigate to page .png')

"Step 15: Hover over link videoTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_home/link_videoTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 15-Hover over link videoTitle.png')

"Step 16: Hover over link tiepTheo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_home/link_tiepTheo'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 16-Hover over link tiepTheo.png')

"Step 17: Click on button closeMiniplayer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_closeMiniplayer'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 17-Click on button closeMiniplayer.png')

"Step 18: Click on link thumbnailLinks (thumbnail) -> Navigate to page '/watch'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/link_thumbnailLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/link_thumbnailLinks', ['link_thumbnailLinks_ytdRichItemRendererNthChild': link_thumbnailLinks_ytdRichItemRendererNthChild, 'link_thumbnailLinks_ytdRichItemRendererNthOfType': link_thumbnailLinks_ytdRichItemRendererNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 18-Click on link thumbnailLinks thumbnail - Navigate to page watch.png')

"Step 19: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_description'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 19-Hover over div object.png')

"Step 20: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 20-Click on div object2.png')

"Step 21: Click on button confirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_watch/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 21-Click on button confirm.png')

"Step 22: Press key Enter on div videoPlayer -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_videoPlayer'), Keys.chord(Keys.ENTER))

// WebUI.takeScreenshot(reportLocation + '/TC25/Step 22-Press key Enter on div videoPlayer - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC25-Explore Video Preview Features and Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}