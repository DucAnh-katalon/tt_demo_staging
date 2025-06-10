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

"Step 1: Navigate to /env/staging/aut/*/history"

TrueTestScripts.navigate("/env/staging/aut/${aut_id}/history")

"Step 2: Click on link viewHistory -> Navigate to page '/env/staging/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut_history/link_viewHistory'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 2-Click on link viewHistory - Navigate to page envstagingaut.png')

"Step 3: Click on input dynamicUrlVariableLevel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/input_dynamicUrlVariableLevel'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 3-Click on input dynamicUrlVariableLevel.png')

"Step 4: Click on span raw"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/span_raw'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 4-Click on span raw.png')

"Step 5: Click on input useSearchParamsForUrlPattern"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/input_useSearchParamsForUrlPattern'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 5-Click on input useSearchParamsForUrlPattern.png')

"Step 6: Click on input maxSessionLength"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/input_maxSessionLength'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 6-Click on input maxSessionLength.png')

"Step 7: Click on input minSessionLength"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/input_minSessionLength'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 7-Click on input minSessionLength.png')

"Step 8: Click on span dataColumn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/span_dataColumn'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 8-Click on span dataColumn.png')

"Step 9: Click on span true"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/span_true'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 9-Click on span true.png')

"Step 10: Click on input minimumSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/input_minimumSteps'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 10-Click on input minimumSteps.png')

"Step 11: Click on div journeyRangePicker"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/div_journeyRangePicker'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 11-Click on div journeyRangePicker.png')

"Step 12: Click on link home -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 12-Click on link home - Navigate to page .png')

"Step 13: Click on form controlAgentConfig"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/form_controlAgentConfig'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 13-Click on form controlAgentConfig.png')

"Step 14: Click on span object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/span_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 14-Click on span object2.png')

"Step 15: Hover over input environment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_home/input_environment'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 15-Hover over input environment.png')

"Step 16: Click on div staging2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/div_staging2'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 16-Click on div staging2.png')

"Step 17: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/span_object'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 17-Click on span object.png')

"Step 18: Click on com1passwordButton object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/com1passwordButton_object'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 18-Click on com1passwordButton object.png')

"Step 19: Click on com1passwordButton object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/com1passwordButton_object'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 19-Click on com1passwordButton object.png')

"Step 20: Click on form controlAgentConfig2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/form_controlAgentConfig'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 20-Click on form controlAgentConfig2.png')

"Step 21: Click on form controlAgentConfig2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/form_controlAgentConfig'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 21-Click on form controlAgentConfig2.png')

"Step 22: Click on div collapseHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/div_collapseHeader'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 22-Click on div collapseHeader.png')

"Step 23: Click on input advancedMode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/input_advancedMode'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 23-Click on input advancedMode.png')

"Step 24: Click on form agentConfig"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/form_controlAgentConfig'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 24-Click on form agentConfig.png')

"Step 25: Click on form agentConfig"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/form_controlAgentConfig'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 25-Click on form agentConfig.png')

"Step 26: Click on form agentConfig"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/form_controlAgentConfig'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 26-Click on form agentConfig.png')

"Step 27: Click on form agentConfig"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/form_controlAgentConfig'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 27-Click on form agentConfig.png')

"Step 28: Click on form agentConfig"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/form_controlAgentConfig'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 28-Click on form agentConfig.png')

"Step 29: Click on input password3 -> Navigate to page '/env/staging'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/input_password3'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 29-Click on input password3 - Navigate to page envstaging.png')

"Step 30: Click on link clientCodes (clientCode2) -> Navigate to page '/env/staging/aut/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging/link_clientCodes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging/link_clientCodes', ['link_clientCodes_href_variable': link_clientCodes_href_variable, 'link_clientCodes_nth': link_clientCodes_nth]))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 30-Click on link clientCodes clientCode2 - Navigate to page envstagingaut.png')

"Step 31: Click on form autSettings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/form_autSettings'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 31-Click on form autSettings.png')

"Step 32: Click on input useSearchParamsForUrlPattern"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/input_useSearchParamsForUrlPattern'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 32-Click on input useSearchParamsForUrlPattern.png')

"Step 33: Click on label useSearchParams"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/label_useSearchParams'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 33-Click on label useSearchParams.png')

"Step 34: Click on input maxSessionLength"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/input_maxSessionLength'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 34-Click on input maxSessionLength.png')

"Step 35: Click on form autSettings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/form_autSettings'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 35-Click on form autSettings.png')

"Step 36: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 36-Click on div object.png')

"Step 37: Click on input minSessionLength"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/input_minSessionLength'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 37-Click on input minSessionLength.png')

"Step 38: Click on span true"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/span_true'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 38-Click on span true.png')

"Step 39: Click on span true2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/span_true2'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 39-Click on span true2.png')

"Step 40: Click on form autSettings2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/form_autSettings'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 40-Click on form autSettings2.png')

"Step 41: Click on span decreaseValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/span_decreaseValue'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 41-Click on span decreaseValue.png')

"Step 42: Click on div minimumSteps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/div_minimumSteps'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 42-Click on div minimumSteps.png')

"Step 43: Click on span smartLocator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/span_smartLocator'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 43-Click on span smartLocator.png')

"Step 44: Click on div dynamicObject (smartLocator)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut/div_dynamicObject', ['div_dynamicObject_divTitle': div_dynamicObject_divTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 44-Click on div dynamicObject smartLocator.png')

"Step 45: Click on span smartLocator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/span_smartLocator2'))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 45-Click on span smartLocator2.png')

"Step 46: Click on div dynamicObject (smartLocator)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut/div_dynamicObject', ['div_dynamicObject_divTitle': div_dynamicObject_divTitle_1]))

// WebUI.takeScreenshot(reportLocation + '/TC151/Step 46-Click on div dynamicObject smartLocator.png')

"Step 47: Click on button submit2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/button_submit2'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 47-Click on button submit2.png')

"Step 48: Click on button yes2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/button_yes2'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 48-Click on button yes2.png')

"Step 49: Click on button historyDetails -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging_aut/button_historyDetails'))

WebUI.takeScreenshot(reportLocation + '/TC151/Step 49-Click on button historyDetails - Navigate to page .png')

"Step 50: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC151-Navigate and Configure Environment Settings in Staging_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}