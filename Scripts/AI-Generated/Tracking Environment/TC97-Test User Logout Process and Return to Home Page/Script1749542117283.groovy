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

"Step 1: Navigate to /*/VAEs with params (fbclid)"

TrueTestScripts.navigate("/${path_param_1}/VAEs", ["fbclid": VAEs_fbclid])

"Step 2: Click on button openUserNavigationMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs/button_openUserNavigationMenu'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 2-Click on button openUserNavigationMenu.png')

"Step 3: Click on link signOut -> Navigate to page '/logout'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/VAEs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_VAEs/link_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 3-Click on link signOut - Navigate to page logout.png')

"Step 4: Click on div logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/logout?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_logout/div_logout'))

// WebUI.takeScreenshot(reportLocation + '/TC97/Step 4-Click on div logout.png')

"Step 5: Click on div signedInUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/logout?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_logout/div_signedInUser'))

// WebUI.takeScreenshot(reportLocation + '/TC97/Step 5-Click on div signedInUser.png')

"Step 6: Click on div logout2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/logout?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_logout/div_logout2'))

// WebUI.takeScreenshot(reportLocation + '/TC97/Step 6-Click on div logout2.png')

"Step 7: Click on input signOut -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/logout?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_logout/input_signOut'))

WebUI.takeScreenshot(reportLocation + '/TC97/Step 7-Click on input signOut - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC97-Test User Logout Process and Return to Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}