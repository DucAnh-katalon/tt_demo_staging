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

"Step 1: Navigate to /app"

TrueTestScripts.navigate("/app")

"Step 2: Click on input emailOrUsername"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_app/input_emailOrUsername'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 2-Click on input emailOrUsername.png')

"Step 3: Click on button signInWithCompanySso"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_app/button_signInWithCompanySso'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 3-Click on button signInWithCompanySso.png')

"Step 4: Click on button signInWithCompanySso"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_app/button_signInWithCompanySso'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 4-Click on button signInWithCompanySso.png')

"Step 5: Click on button pastReviews"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_app/button_pastReviews'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 5-Click on button pastReviews.png')

"Step 6: Click on link dashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_app/link_dashboard'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 6-Click on link dashboard.png')

"Step 7: Click on link goals"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_app/link_goals'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 7-Click on link goals.png')

"Step 8: Click on image anhDao"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_app/image_anhDao'))

// WebUI.takeScreenshot(reportLocation + '/TC145/Step 8-Click on image anhDao.png')

"Step 9: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_app/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC145/Step 9-Click on div object.png')

"Step 10: Click on button notificationsTrigger"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_app/button_notificationsTrigger'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 10-Click on button notificationsTrigger.png')

"Step 11: Click on span notificationItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_app/span_notificationItem'))

// WebUI.takeScreenshot(reportLocation + '/TC145/Step 11-Click on span notificationItem.png')

"Step 12: Enter input value in input deadline"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_app/input_deadline'), input_deadline)

WebUI.takeScreenshot(reportLocation + '/TC145/Step 12-Enter input value in input deadline.png')

"Step 13: Enter input value in input deadline2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_app/input_deadline2'), input_deadline2)

WebUI.takeScreenshot(reportLocation + '/TC145/Step 13-Enter input value in input deadline2.png')

"Step 14: Click on div goalDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_app/div_goalDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC145/Step 14-Click on div goalDetails.png')

"Step 15: Click on button teamwork"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_app/button_teamwork'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 15-Click on button teamwork.png')

"Step 16: Click on button teamwork2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_app/button_teamwork'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 16-Click on button teamwork2.png')

"Step 17: Click on button teamwork"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_app/button_teamwork'))

WebUI.takeScreenshot(reportLocation + '/TC145/Step 17-Click on button teamwork.png')

"Step 18: Click on div tabs -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/app?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_app/div_tabs'))

// WebUI.takeScreenshot(reportLocation + '/TC145/Step 18-Click on div tabs - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC145-Sign In and Manage Goals with Notifications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}