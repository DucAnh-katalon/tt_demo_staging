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

"Step 2: Click on link production -> Navigate to page '/env/production'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_production'))

WebUI.takeScreenshot(reportLocation + '/TC67/Step 2-Click on link production - Navigate to page envproduction.png')

"Step 3: Click on link staging -> Navigate to page '/env/staging'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/production?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_production/link_staging'))

WebUI.takeScreenshot(reportLocation + '/TC67/Step 3-Click on link staging - Navigate to page envstaging.png')

"Step 4: Click on link qa -> Navigate to page '/env/qa'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/staging?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_staging/link_qa'))

WebUI.takeScreenshot(reportLocation + '/TC67/Step 4-Click on link qa - Navigate to page envqa.png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC67-Navigate through Production Staging and QA Environments_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}