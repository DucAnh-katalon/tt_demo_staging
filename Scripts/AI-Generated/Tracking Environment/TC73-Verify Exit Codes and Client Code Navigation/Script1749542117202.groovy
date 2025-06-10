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

"Step 2: Click on link qa (qa)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/link_qa"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/link_qa', ['link_qa_aNthOfType': link_qa_aNthOfType, 'link_qa_internalHasText': link_qa_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 2-Click on link qa qa.png')

"Step 3: Click on link qa2 -> Navigate to page '/env/qa'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_qa2'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 3-Click on link qa2 - Navigate to page envqa.png')

"Step 4: Click on div exitCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa/div_exitCode'))

// WebUI.takeScreenshot(reportLocation + '/TC73/Step 4-Click on div exitCode.png')

"Step 5: Click on div exitCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa/div_exitCode'))

// WebUI.takeScreenshot(reportLocation + '/TC73/Step 5-Click on div exitCode.png')

"Step 6: Click on div exitCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa/div_exitCode'))

// WebUI.takeScreenshot(reportLocation + '/TC73/Step 6-Click on div exitCode.png')

"Step 7: Click on div exitCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa/div_exitCode'))

// WebUI.takeScreenshot(reportLocation + '/TC73/Step 7-Click on div exitCode.png')

"Step 8: Click on div exitCode2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa/div_exitCode2'))

// WebUI.takeScreenshot(reportLocation + '/TC73/Step 8-Click on div exitCode2.png')

"Step 9: Click on div exitCode2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa/div_exitCode2'))

// WebUI.takeScreenshot(reportLocation + '/TC73/Step 9-Click on div exitCode2.png')

"Step 10: Click on div exitCode2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa/div_exitCode2'))

// WebUI.takeScreenshot(reportLocation + '/TC73/Step 10-Click on div exitCode2.png')

"Step 11: Click on div exitCode2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa/div_exitCode2'))

// WebUI.takeScreenshot(reportLocation + '/TC73/Step 11-Click on div exitCode2.png')

"Step 12: Click on td clientCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa/td_clientCode'))

// WebUI.takeScreenshot(reportLocation + '/TC73/Step 12-Click on td clientCode.png')

"Step 13: Click on link clientCode -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa/link_clientCode'))

WebUI.takeScreenshot(reportLocation + '/TC73/Step 13-Click on link clientCode - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC73-Verify Exit Codes and Client Code Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}