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

"Step 2: Click on button allActivity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_allActivity'))

WebUI.takeScreenshot(reportLocation + '/TC70/Step 2-Click on button allActivity.png')

"Step 3: Click on span description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/span_description'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 3-Click on span description.png')

"Step 4: Click on span description2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/span_description2'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 4-Click on span description2.png')

"Step 5: Click on span description2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/span_description2'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 5-Click on span description2.png')

"Step 6: Click on span description2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/span_description2'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 6-Click on span description2.png')

"Step 7: Click on span description2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/span_description2'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 7-Click on span description2.png')

"Step 8: Click on span description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/span_description'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 8-Click on span description.png')

"Step 9: Click on span description -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/span_description'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 9-Click on span description - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC70-Browse Activities and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}