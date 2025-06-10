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

"Step 1: Navigate to /*/signin/accountchooser with params (continue, dsh, faa, flowEntry, flowName)"

TrueTestScripts.navigate("/${path_param_1}/signin/accountchooser", ["continue": accountchooser_continue, "dsh": accountchooser_dsh, "faa": accountchooser_faa, "flowEntry": accountchooser_flowEntry, "flowName": accountchooser_flowName])

"Step 2: Click on div accountChooser -> Navigate to page '/o/*/continue'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/.*/signin/accountchooser?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_signin_accountchooser/div_accountChooser'))

WebUI.takeScreenshot(reportLocation + '/TC47/Step 2-Click on div accountChooser - Navigate to page ocontinue.png')

"Step 3: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC47-Verify Account Chooser Navigation and Page Load_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}