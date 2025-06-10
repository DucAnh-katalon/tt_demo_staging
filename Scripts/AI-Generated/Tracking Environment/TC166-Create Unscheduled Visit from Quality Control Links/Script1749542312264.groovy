import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /dashboard"

TrueTestScripts.navigate("/dashboard")

"Step 2: Click on item uploader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/item_uploader'))

// WebUI.takeScreenshot(reportLocation + '/TC166/Step 2-Click on item uploader.png')

"Step 3: Click on link qualityControlLinks (uploader)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks', ['link_qualityControlLinks_aTitle': link_qualityControlLinks_aTitle, 'link_qualityControlLinks_liNthOfType': link_qualityControlLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC166/Step 3-Click on link qualityControlLinks uploader.png')

"Step 4: Click on button createUnscheduledVisit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_createUnscheduledVisit'))

WebUI.takeScreenshot(reportLocation + '/TC166/Step 4-Click on button createUnscheduledVisit.png')

"Step 5: Click on div inputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_inputField'))

WebUI.takeScreenshot(reportLocation + '/TC166/Step 5-Click on div inputField.png')

"Step 6: Click on input search3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_search3'))

WebUI.takeScreenshot(reportLocation + '/TC166/Step 6-Click on input search3.png')

"Step 7: Enter input value in input search3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_search3'), input_search3)

WebUI.takeScreenshot(reportLocation + '/TC166/Step 7-Enter input value in input search3.png')

"Step 8: Press key Enter on input search3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_search3'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC166/Step 8-Press key Enter on input search3.png')

"Step 9: Enter input value in input search3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_search3'), input_search3_1)

WebUI.takeScreenshot(reportLocation + '/TC166/Step 9-Enter input value in input search3.png')

"Step 10: Click on div noData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_noData'))

// WebUI.takeScreenshot(reportLocation + '/TC166/Step 10-Click on div noData.png')

"Step 11: Click on faIcon dismiss2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_dismiss2'))

WebUI.takeScreenshot(reportLocation + '/TC166/Step 11-Click on faIcon dismiss2 - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC166-Create Unscheduled Visit from Quality Control Links_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}