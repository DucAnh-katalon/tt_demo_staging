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

"Step 2: Click on p mouseStatusIssue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/p_mouseStatusIssue'))

// WebUI.takeScreenshot(reportLocation + '/TC120/Step 2-Click on p mouseStatusIssue.png')

"Step 3: Click on div none"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_none'))

// WebUI.takeScreenshot(reportLocation + '/TC120/Step 3-Click on div none.png')

"Step 4: Click on link recordingSession"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_recordingSession'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 4-Click on link recordingSession.png')

"Step 5: Click on p internalMeeting"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/p_internalMeeting'))

// WebUI.takeScreenshot(reportLocation + '/TC120/Step 5-Click on p internalMeeting.png')

"Step 6: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 6-Click on button save.png')

"Step 7: Enter input value in div descriptionArea"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_descriptionArea'), div_descriptionArea)

WebUI.takeScreenshot(reportLocation + '/TC120/Step 7-Enter input value in div descriptionArea.png')

"Step 8: Click on button allActivity -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_allActivity'))

WebUI.takeScreenshot(reportLocation + '/TC120/Step 8-Click on button allActivity - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC120-Record Internal Meeting and Save Activity_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}