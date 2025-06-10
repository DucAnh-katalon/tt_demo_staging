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

"Step 2: Click on div description2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_description'))

// WebUI.takeScreenshot(reportLocation + '/TC102/Step 2-Click on div description2.png')

"Step 3: Click on div addDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_addDescription'))

// WebUI.takeScreenshot(reportLocation + '/TC102/Step 3-Click on div addDescription.png')

"Step 4: Hover over button cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_cancel'))

// WebUI.takeScreenshot(reportLocation + '/TC102/Step 4-Hover over button cancel.png')

"Step 5: Click on button unlink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_unlink'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 5-Click on button unlink.png')

"Step 6: Enter input value in div descriptionArea2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_descriptionArea'), div_descriptionArea2)

WebUI.takeScreenshot(reportLocation + '/TC102/Step 6-Enter input value in div descriptionArea2.png')

"Step 7: Click on div addDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_addDescription'))

// WebUI.takeScreenshot(reportLocation + '/TC102/Step 7-Click on div addDescription.png')

"Step 8: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 8-Click on button save.png')

"Step 9: Enter input value in div descriptionArea3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_descriptionArea'), div_descriptionArea3)

WebUI.takeScreenshot(reportLocation + '/TC102/Step 9-Enter input value in div descriptionArea3.png')

"Step 10: Click on code s3Path"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/code_s3Path'))

// WebUI.takeScreenshot(reportLocation + '/TC102/Step 10-Click on code s3Path.png')

"Step 11: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 11-Click on button save.png')

"Step 12: Click on p improveMaintainability"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/p_improveMaintainability'))

// WebUI.takeScreenshot(reportLocation + '/TC102/Step 12-Click on p improveMaintainability.png')

"Step 13: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC102/Step 13-Click on button save.png')

"Step 14: Enter input value in div descriptionArea4 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_browse/div_descriptionArea'), div_descriptionArea4)

WebUI.takeScreenshot(reportLocation + '/TC102/Step 14-Enter input value in div descriptionArea4 - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC102-Verify Description Management and Navigation to Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}