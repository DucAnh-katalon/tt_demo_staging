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

"Step 1: Navigate to /feed"

TrueTestScripts.navigate("/feed")

"Step 2: Click on button repost"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/button_repost'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 2-Click on button repost.png')

"Step 3: Click on div feedUpdate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/div_feedUpdate'))

// WebUI.takeScreenshot(reportLocation + '/TC132/Step 3-Click on div feedUpdate.png')

"Step 4: Click on link viewProfile -> Navigate to page '/in/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/link_viewProfile'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 4-Click on link viewProfile - Navigate to page in.png')

"Step 5: Click on link showAllExperiences"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/in/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_in/link_showAllExperiences'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 5-Click on link showAllExperiences.png')

"Step 6: Click on link showAllExperiences -> Navigate to page '/in/*/details/experience'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/in/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_in/link_showAllExperiences'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 6-Click on link showAllExperiences - Navigate to page indetailsexperience.png')

"Step 7: Hover over button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/in/.*/details/experience?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_in_details_experience/button_object'))

// WebUI.takeScreenshot(reportLocation + '/TC132/Step 7-Hover over button object.png')

"Step 8: Hover over image quocLe"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/in/.*/details/experience?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_in_details_experience/image_quocLe'))

// WebUI.takeScreenshot(reportLocation + '/TC132/Step 8-Hover over image quocLe.png')

"Step 9: Click on liIcon object -> Navigate to page '/feed'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/in/.*/details/experience?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_in_details_experience/liIcon_object'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 9-Click on liIcon object - Navigate to page feed.png')

"Step 10: Click on liIcon networkUpdate -> Navigate to page '/mynetwork'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/liIcon_networkUpdate'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 10-Click on liIcon networkUpdate - Navigate to page mynetwork.png')

"Step 11: Click on link messagingNotification -> Navigate to page '/messaging/thread/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/mynetwork?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_mynetwork/link_messagingNotification'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 11-Click on link messagingNotification - Navigate to page messagingthread.png')

"Step 12: Hover over button unread"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/messaging/thread/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_messaging_thread/button_unread'))

// WebUI.takeScreenshot(reportLocation + '/TC132/Step 12-Hover over button unread.png')

"Step 13: Click on liIcon notifications -> Navigate to page '/notifications'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/messaging/thread/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_messaging_thread/liIcon_notifications'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 13-Click on liIcon notifications - Navigate to page notifications.png')

"Step 14: Hover over link defaultBackground"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notifications?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_notifications/link_defaultBackground'))

// WebUI.takeScreenshot(reportLocation + '/TC132/Step 14-Hover over link defaultBackground.png')

"Step 15: Click on liIcon notification -> Navigate to page '/feed'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/notifications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_notifications/liIcon_notification'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 15-Click on liIcon notification - Navigate to page feed.png')

"Step 16: Click on button seeMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/button_seeMore'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 16-Click on button seeMore.png')

"Step 17: Click on link viewMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/link_viewMore'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 17-Click on link viewMore.png')

"Step 18: Click on div feedMedia"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/div_feedMedia'))

// WebUI.takeScreenshot(reportLocation + '/TC132/Step 18-Click on div feedMedia.png')

"Step 19: Click on button seeMore2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/button_seeMore2'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 19-Click on button seeMore2.png')

"Step 20: Click on button seeMore3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/button_seeMore3'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 20-Click on button seeMore3.png')

"Step 21: Click on button newPosts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/button_newPosts'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 21-Click on button newPosts.png')

"Step 22: Click on span fluentSpeakers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/span_fluentSpeakers'))

// WebUI.takeScreenshot(reportLocation + '/TC132/Step 22-Click on span fluentSpeakers.png')

"Step 23: Click on button seeMore4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/button_seeMore4'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 23-Click on button seeMore4.png')

"Step 24: Click on button seeMore5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/button_seeMore5'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 24-Click on button seeMore5.png')

"Step 25: Click on button seeMore6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/button_seeMore6'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 25-Click on button seeMore6.png')

"Step 26: Click on div feedContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/div_feedContent'))

// WebUI.takeScreenshot(reportLocation + '/TC132/Step 26-Click on div feedContent.png')

"Step 27: Click on button seeMore7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/button_seeMore7'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 27-Click on button seeMore7.png')

"Step 28: Click on button seeMore8 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/feed?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_feed/button_seeMore8'))

WebUI.takeScreenshot(reportLocation + '/TC132/Step 28-Click on button seeMore8 - Navigate to page .png')

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC132-Interact with Feed and Notifications on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}