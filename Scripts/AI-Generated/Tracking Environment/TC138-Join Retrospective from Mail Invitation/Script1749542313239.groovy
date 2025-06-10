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

"Step 1: Navigate to /mail/u/*"

TrueTestScripts.navigate("/mail/u/${u_id}")

"Step 2: Click on div updatedInvitation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/mail/u/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_mail_u/div_updatedInvitation'))

WebUI.takeScreenshot(reportLocation + '/TC138/Step 2-Click on div updatedInvitation.png')

"Step 3: Click on tr unreadMessages (unreadEmail)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/mail/u/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_mail_u/tr_unreadMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_mail_u/tr_unreadMessages', ['tr_unreadMessages_internalLabel': tr_unreadMessages_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC138/Step 3-Click on tr unreadMessages unreadEmail.png')

"Step 4: Click on div mailItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/mail/u/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_mail_u/div_mailItem'))

WebUI.takeScreenshot(reportLocation + '/TC138/Step 4-Click on div mailItem.png')

"Step 5: Click on tr unreadMessages (unreadMessage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/mail/u/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_mail_u/tr_unreadMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_mail_u/tr_unreadMessages', ['tr_unreadMessages_internalLabel': tr_unreadMessages_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC138/Step 5-Click on tr unreadMessages unreadMessage.png')

"Step 6: Click on tr unreadMessages (unreadInvitation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/mail/u/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_mail_u/tr_unreadMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_mail_u/tr_unreadMessages', ['tr_unreadMessages_internalLabel': tr_unreadMessages_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC138/Step 6-Click on tr unreadMessages unreadInvitation.png')

"Step 7: Click on link joinRetrospective -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/mail/u/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_mail_u/link_joinRetrospective'))

WebUI.takeScreenshot(reportLocation + '/TC138/Step 7-Click on link joinRetrospective - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC138-Join Retrospective from Mail Invitation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}