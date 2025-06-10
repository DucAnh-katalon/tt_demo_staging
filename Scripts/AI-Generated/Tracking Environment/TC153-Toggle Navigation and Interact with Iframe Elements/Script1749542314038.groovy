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

"Step 2: Click on link iframes -> Navigate to page '/iframe'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_iframes'))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 2-Click on link iframes - Navigate to page iframe.png')

"Step 3: Click on button toggleNavigation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframe?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_iframe/button_toggleNavigation'))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 3-Click on button toggleNavigation.png')

"Step 4: Click on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframe?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_iframe/input_firstName'))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 4-Click on input firstName.png')

"Step 5: Click on input selectCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframe?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_iframe/input_selectCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 5-Click on input selectCheckbox.png')

"Step 6: Click on input name -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframe?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_iframe/input_name'))

WebUI.takeScreenshot(reportLocation + '/TC153/Step 6-Click on input name - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC153-Toggle Navigation and Interact with Iframe Elements_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}