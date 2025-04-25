import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to */*/*"

TrueTestScripts.navigate("${path_param_1}/${path_param_2}/${path_param_3}")

"Step 2: Hover over link dockLayout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_live_worksheet/link_dockLayout'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Hover over link dockLayout.png')

"Step 3: Click on link dockLayout2 -> Navigate to page 'dock management interface#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet/link_dockLayout2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on link dockLayout2 - Navigate to page dock management interface.png')

"Step 4: Click on link doorOptions (doorNumber)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_interface/link_doorOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_interface/link_doorOptions', ['link_doorOptions_id': link_doorOptions_id, 'link_doorOptions_internalText': link_doorOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on link doorOptions doorNumber.png')

"Step 5: Click on link trailerSummary -> Navigate to page 'move shipment#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_interface/link_trailerSummary'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on link trailerSummary - Navigate to page move shipment.png')

"Step 6: Click on button ok"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_move_shipment/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on button ok.png')

"Step 7: Click on input dockIt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_move_shipment/input_dockIt'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on input dockIt.png')

"Step 8: Click on input buffer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_move_shipment/input_buffer'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on input buffer.png')

"Step 9: Click on input enter -> Navigate to page 'move confirmation#*/*/MoveConfirmation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_move_shipment/input_enter'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on input enter - Navigate to page move confirmationMoveConfirmation.png')

"Step 10: Click on input ok -> Navigate to page 'dock management interface#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/MoveConfirmation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_move_confirmation/input_ok'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on input ok - Navigate to page dock management interface.png')

"Step 11: Click on link close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_interface/link_close'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on link close.png')

"Step 12: Click on link close (close2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_interface/link_close"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_interface/link_close', ['link_close_internalLabel': link_close_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on link close close2.png')

"Step 13: Click on input refresh -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_interface/input_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Click on input refresh - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Manage Trailer Summary and Confirm Move_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}