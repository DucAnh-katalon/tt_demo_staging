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

"Step 2: Click on div description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_description'))

// WebUI.takeScreenshot(reportLocation + '/TC29/Step 2-Click on div description.png')

"Step 3: Click on div description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_description'))

// WebUI.takeScreenshot(reportLocation + '/TC29/Step 3-Click on div description.png')

"Step 4: Click on div description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_description'))

// WebUI.takeScreenshot(reportLocation + '/TC29/Step 4-Click on div description.png')

"Step 5: Click on div description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_description'))

// WebUI.takeScreenshot(reportLocation + '/TC29/Step 5-Click on div description.png')

"Step 6: Click on p linkMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/p_linkMessage'))

// WebUI.takeScreenshot(reportLocation + '/TC29/Step 6-Click on p linkMessage.png')

"Step 7: Click on div missingStepHover"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_missingStepHover'))

// WebUI.takeScreenshot(reportLocation + '/TC29/Step 7-Click on div missingStepHover.png')

"Step 8: Click on p missingStepHover"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/p_missingStepHover'))

// WebUI.takeScreenshot(reportLocation + '/TC29/Step 8-Click on p missingStepHover.png')

"Step 9: Click on button recordLoomVideo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_recordLoomVideo'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 9-Click on button recordLoomVideo.png')

"Step 10: Enter input value in div editor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_editor'), div_editor)

WebUI.takeScreenshot(reportLocation + '/TC29/Step 10-Enter input value in div editor.png')

"Step 11: Enter input value in div descriptionArea"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_descriptionArea'), div_descriptionArea)

WebUI.takeScreenshot(reportLocation + '/TC29/Step 11-Enter input value in div descriptionArea.png')

"Step 12: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 12-Click on button save.png')

"Step 13: Click on link issueSummary -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_issueSummary'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 13-Click on link issueSummary - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC29-Record Loom Video and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}