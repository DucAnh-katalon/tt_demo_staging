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

"Step 1: Navigate to /oam/server/obrareq.cgi with params (ECID-Context)"

TrueTestScripts.navigate("/oam/server/obrareq.cgi", ["ECID-Context": obrareq_ECID_Context])

"Step 2: Click on div copyrightFooter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/oam/server/obrareq.cgi?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_oam_server_obrareq_cgi/div_copyrightFooter'))

// WebUI.takeScreenshot(reportLocation + '/TC124/Step 2-Click on div copyrightFooter.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC124-Login and Verify Home Page from OAM Server_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}