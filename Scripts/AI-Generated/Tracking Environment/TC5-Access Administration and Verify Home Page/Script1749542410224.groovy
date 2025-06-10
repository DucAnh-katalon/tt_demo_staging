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

"Step 1: Navigate to /dashboard"

TrueTestScripts.navigate("/dashboard")

"Step 2: Click on button administration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on button administration.png')

"Step 3: Click on button development"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_development'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on button development.png')

"Step 4: Click on link studies"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_studies3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on link studies.png')

"Step 5: Click on link studies -> Navigate to page '/studyservice'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_studies3'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on link studies - Navigate to page studyservice.png')

"Step 6: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studyservice?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studyservice/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on link home - Navigate to page dashboard.png')

"Step 7: Click on button administration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on button administration.png')

"Step 8: Click on link sites -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_sites2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on link sites - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Access Administration and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}