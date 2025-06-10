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

"Step 2: Click on input environment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/input_environment'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 2-Click on input environment.png')

"Step 3: Click on div staging"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/div_staging'))

// WebUI.takeScreenshot(reportLocation + '/TC35/Step 3-Click on div staging.png')

"Step 4: Click on input password -> Navigate to page '/env/staging'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/input_password'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 4-Click on input password - Navigate to page envstaging.png')

"Step 5: Click on link clientCodes (clientCode) -> Navigate to page '/env/staging/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging/link_clientCodes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging/link_clientCodes', ['link_clientCodes_href_variable': link_clientCodes_href_variable, 'link_clientCodes_nth': link_clientCodes_nth]))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 5-Click on link clientCodes clientCode - Navigate to page envstagingaut.png')

"Step 6: Click on span false"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/span_false'))

// WebUI.takeScreenshot(reportLocation + '/TC35/Step 6-Click on span false.png')

"Step 7: Click on div dynamicObject (trueIndicator)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut/div_dynamicObject', ['div_dynamicObject_divTitle': div_dynamicObject_divTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC35/Step 7-Click on div dynamicObject trueIndicator.png')

"Step 8: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 8-Click on button submit.png')

"Step 9: Click on button yes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/button_yes'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 9-Click on button yes.png')

"Step 10: Click on span false"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/span_false'))

// WebUI.takeScreenshot(reportLocation + '/TC35/Step 10-Click on span false.png')

"Step 11: Click on div dynamicObject (trueIndicator)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut/div_dynamicObject', ['div_dynamicObject_divTitle': div_dynamicObject_divTitle_1]))

// WebUI.takeScreenshot(reportLocation + '/TC35/Step 11-Click on div dynamicObject trueIndicator.png')

"Step 12: Click on span falseStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/span_falseStatus'))

// WebUI.takeScreenshot(reportLocation + '/TC35/Step 12-Click on span falseStatus.png')

"Step 13: Click on div selectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/div_selectOption'))

// WebUI.takeScreenshot(reportLocation + '/TC35/Step 13-Click on div selectOption.png')

"Step 14: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 14-Click on button submit.png')

"Step 15: Click on button yes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/button_yes'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 15-Click on button yes.png')

"Step 16: Click on p createAut -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/p_createAut'))

// WebUI.takeScreenshot(reportLocation + '/TC35/Step 16-Click on p createAut - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC35-Verify Environment Setup and Client Code Submission_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}