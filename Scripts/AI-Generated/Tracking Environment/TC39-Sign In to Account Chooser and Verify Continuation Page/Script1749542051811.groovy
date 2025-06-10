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

"Step 1: Navigate to /AccountChooser/signinchooser with params (continue, ddm, faa, flowEntry, flowName)"

TrueTestScripts.navigate("/AccountChooser/signinchooser", ["continue": signinchooser_continue, "ddm": signinchooser_ddm, "faa": signinchooser_faa, "flowEntry": signinchooser_flowEntry, "flowName": signinchooser_flowName])

"Step 2: Click on div signInChooser -> Navigate to page '/o/*/continue'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/AccountChooser/signinchooser?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_AccountChooser_signinchooser/div_signInChooser'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 2-Click on div signInChooser - Navigate to page ocontinue.png')

"Step 3: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC39-Sign In to Account Chooser and Verify Continuation Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}