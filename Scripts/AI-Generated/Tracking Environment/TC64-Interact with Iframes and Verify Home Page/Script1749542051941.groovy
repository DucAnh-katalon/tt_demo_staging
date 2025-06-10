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

"Step 1: Navigate to /iframes"

TrueTestScripts.navigate("/iframes")

"Step 2: Click on button iframeSameDomain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_iframes/button_iframeSameDomain'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 2-Click on button iframeSameDomain.png')

"Step 3: Click on link dynamicElements (dragAndDrop)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_iframes/link_dynamicElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_iframes/link_dynamicElements', ['link_dynamicElements_class': link_dynamicElements_class, 'link_dynamicElements_dataTest': link_dynamicElements_dataTest, 'link_dynamicElements_divNthOfType': link_dynamicElements_divNthOfType, 'link_dynamicElements_liNthOfType': link_dynamicElements_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 3-Click on link dynamicElements dragAndDrop.png')

"Step 4: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_iframes/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC64/Step 4-Click on button object.png')

"Step 5: Click on div iframeExamples -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_iframes/div_iframeExamples'))

// WebUI.takeScreenshot(reportLocation + '/TC64/Step 5-Click on div iframeExamples - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC64-Interact with Iframes and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}