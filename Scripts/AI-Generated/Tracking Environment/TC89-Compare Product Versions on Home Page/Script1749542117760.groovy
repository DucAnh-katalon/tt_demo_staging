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

"Step 2: Click on textarea pasteVersionText"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/textarea_pasteVersionText'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 2-Click on textarea pasteVersionText.png')

"Step 3: Enter input value in textarea pasteVersionText"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_home/textarea_pasteVersionText'), textarea_pasteVersionText)

WebUI.takeScreenshot(reportLocation + '/TC89/Step 3-Enter input value in textarea pasteVersionText.png')

"Step 4: Click on textarea pasteAnotherVersion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/textarea_pasteAnotherVersion'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 4-Click on textarea pasteAnotherVersion.png')

"Step 5: Enter input value in textarea pasteAnotherVersion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_home/textarea_pasteAnotherVersion'), textarea_pasteAnotherVersion)

WebUI.takeScreenshot(reportLocation + '/TC89/Step 5-Enter input value in textarea pasteAnotherVersion.png')

"Step 6: Click on button compare -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_compare'))

WebUI.takeScreenshot(reportLocation + '/TC89/Step 6-Click on button compare - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC89-Compare Product Versions on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}