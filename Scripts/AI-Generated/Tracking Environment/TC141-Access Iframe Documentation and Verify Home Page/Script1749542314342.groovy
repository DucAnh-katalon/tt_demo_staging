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

"Step 1: Navigate to /en-US/docs/Web/HTML/Reference/Elements/iframe"

TrueTestScripts.navigate("/en-US/docs/Web/HTML/Reference/Elements/iframe")

"Step 2: Click on link iframe"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/en-US/docs/Web/HTML/Reference/Elements/iframe?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_en_US_docs_Web_HTML_Reference_Elements_iframe/link_iframe'))

WebUI.takeScreenshot(reportLocation + '/TC141/Step 2-Click on link iframe.png')

"Step 3: Click on slot object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/en-US/docs/Web/HTML/Reference/Elements/iframe?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_en_US_docs_Web_HTML_Reference_Elements_iframe/slot_object'))

// WebUI.takeScreenshot(reportLocation + '/TC141/Step 3-Click on slot object.png')

"Step 4: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/en-US/docs/Web/HTML/Reference/Elements/iframe?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_en_US_docs_Web_HTML_Reference_Elements_iframe/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC141/Step 4-Click on div object.png')

"Step 5: Click on link attributes -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/en-US/docs/Web/HTML/Reference/Elements/iframe?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_en_US_docs_Web_HTML_Reference_Elements_iframe/link_attributes'))

WebUI.takeScreenshot(reportLocation + '/TC141/Step 5-Click on link attributes - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC141-Access Iframe Documentation and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}