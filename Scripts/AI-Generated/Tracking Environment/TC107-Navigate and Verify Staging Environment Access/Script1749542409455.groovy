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

"Step 2: Click on div homeHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/div_homeHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC107/Step 2-Click on div homeHeader.png')

"Step 3: Click on nav object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/nav_object'))

// WebUI.takeScreenshot(reportLocation + '/TC107/Step 3-Click on nav object.png')

"Step 4: Click on input environment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/input_environment2'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 4-Click on input environment2.png')

"Step 5: Click on div staging2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/div_staging2'))

// WebUI.takeScreenshot(reportLocation + '/TC107/Step 5-Click on div staging2.png')

"Step 6: Click on input password3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/input_password3'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 6-Click on input password3.png')

"Step 7: Click on input password3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/input_password3'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 7-Click on input password3.png')

"Step 8: Click on input password3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/input_password3'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 8-Click on input password3.png')

"Step 9: Click on com1passwordButton object -> Navigate to page '/env/staging'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/com1passwordButton_object'))

// WebUI.takeScreenshot(reportLocation + '/TC107/Step 9-Click on com1passwordButton object - Navigate to page envstaging.png')

"Step 10: Click on div requestFailed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging/div_requestFailed'))

// WebUI.takeScreenshot(reportLocation + '/TC107/Step 10-Click on div requestFailed.png')

"Step 11: Click on div requestFailed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging/div_requestFailed'))

// WebUI.takeScreenshot(reportLocation + '/TC107/Step 11-Click on div requestFailed.png')

"Step 12: Click on div requestFailed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging/div_requestFailed'))

// WebUI.takeScreenshot(reportLocation + '/TC107/Step 12-Click on div requestFailed.png')

"Step 13: Click on button logout -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging/button_logout'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 13-Click on button logout - Navigate to page .png')

"Step 14: Click on input environment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/input_environment2'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 14-Click on input environment2.png')

"Step 15: Click on div staging2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/div_staging2'))

// WebUI.takeScreenshot(reportLocation + '/TC107/Step 15-Click on div staging2.png')

"Step 16: Click on input password3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/input_password3'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 16-Click on input password3.png')

"Step 17: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/span_object'))

// WebUI.takeScreenshot(reportLocation + '/TC107/Step 17-Click on span object.png')

"Step 18: Click on input password3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/input_password3'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 18-Click on input password3.png')

"Step 19: Click on input password3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/input_password3'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 19-Click on input password3.png')

"Step 20: Click on com1passwordButton object -> Navigate to page '/env/staging'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/com1passwordButton_object'))

// WebUI.takeScreenshot(reportLocation + '/TC107/Step 20-Click on com1passwordButton object - Navigate to page envstaging.png')

"Step 21: Click on link qa -> Navigate to page '/env/qa'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging/link_qa'))

WebUI.takeScreenshot(reportLocation + '/TC107/Step 21-Click on link qa - Navigate to page envqa.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC107-Navigate and Verify Staging Environment Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}