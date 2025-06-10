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

"Step 1: Navigate to /fscmUI/faces/AtkHomePageWelcome with params ( adf.ctrl-state,  adf.no-new-window-redirect,  afrFS,  afrLoop,  afrMFC,  afrMFCI,  afrMFDH,  afrMFDW,  afrMFG,  afrMFH,  afrMFM,  afrMFO,  afrMFR,  afrMFS,  afrMFW,  afrMT,  afrWindowId,  afrWindowMode)"

TrueTestScripts.navigate("/fscmUI/faces/AtkHomePageWelcome", ["_adf.ctrl-state": AtkHomePageWelcome__adf_ctrl_state, "_adf.no-new-window-redirect": AtkHomePageWelcome__adf_no_new_window_redirect, "_afrFS": AtkHomePageWelcome__afrFS, "_afrLoop": AtkHomePageWelcome__afrLoop, "_afrMFC": AtkHomePageWelcome__afrMFC, "_afrMFCI": AtkHomePageWelcome__afrMFCI, "_afrMFDH": AtkHomePageWelcome__afrMFDH, "_afrMFDW": AtkHomePageWelcome__afrMFDW, "_afrMFG": AtkHomePageWelcome__afrMFG, "_afrMFH": AtkHomePageWelcome__afrMFH, "_afrMFM": AtkHomePageWelcome__afrMFM, "_afrMFO": AtkHomePageWelcome__afrMFO, "_afrMFR": AtkHomePageWelcome__afrMFR, "_afrMFS": AtkHomePageWelcome__afrMFS, "_afrMFW": AtkHomePageWelcome__afrMFW, "_afrMT": AtkHomePageWelcome__afrMT, "_afrWindowId": AtkHomePageWelcome__afrWindowId, "_afrWindowMode": AtkHomePageWelcome__afrWindowMode])

"Step 2: Click on link navigator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/AtkHomePageWelcome?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_AtkHomePageWelcome/link_navigator'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 2-Click on link navigator.png')

"Step 3: Hover over link blkDailyRatesReport"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/AtkHomePageWelcome?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_AtkHomePageWelcome/link_blkDailyRatesReport'))

// WebUI.takeScreenshot(reportLocation + '/TC125/Step 3-Hover over link blkDailyRatesReport.png')

"Step 4: Click on div navMenuMask"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/AtkHomePageWelcome?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_AtkHomePageWelcome/div_navMenuMask'))

// WebUI.takeScreenshot(reportLocation + '/TC125/Step 4-Click on div navMenuMask.png')

"Step 5: Click on link navigator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/AtkHomePageWelcome?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_AtkHomePageWelcome/link_navigator'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 5-Click on link navigator.png')

"Step 6: Click on div navMenuMask"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/AtkHomePageWelcome?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_AtkHomePageWelcome/div_navMenuMask'))

// WebUI.takeScreenshot(reportLocation + '/TC125/Step 6-Click on div navMenuMask.png')

"Step 7: Click on link navigator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/AtkHomePageWelcome?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_AtkHomePageWelcome/link_navigator'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 7-Click on link navigator.png')

"Step 8: Click on div navMenuMask"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/AtkHomePageWelcome?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_AtkHomePageWelcome/div_navMenuMask'))

// WebUI.takeScreenshot(reportLocation + '/TC125/Step 8-Click on div navMenuMask.png')

"Step 9: Click on link navigator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/AtkHomePageWelcome?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_AtkHomePageWelcome/link_navigator'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 9-Click on link navigator.png')

"Step 10: Click on div procurementSection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/AtkHomePageWelcome?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_AtkHomePageWelcome/div_procurementSection'))

// WebUI.takeScreenshot(reportLocation + '/TC125/Step 10-Click on div procurementSection.png')

"Step 11: Click on div procurementSection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/AtkHomePageWelcome?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_AtkHomePageWelcome/div_procurementSection'))

// WebUI.takeScreenshot(reportLocation + '/TC125/Step 11-Click on div procurementSection.png')

"Step 12: Click on link navigator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/AtkHomePageWelcome?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_AtkHomePageWelcome/link_navigator'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 12-Click on link navigator.png')

"Step 13: Click on div procurementSection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/AtkHomePageWelcome?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_AtkHomePageWelcome/div_procurementSection'))

// WebUI.takeScreenshot(reportLocation + '/TC125/Step 13-Click on div procurementSection.png')

"Step 14: Click on link purchaseRequisitions -> Navigate to page '/fscmUI/faces/FndOverview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/AtkHomePageWelcome?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_AtkHomePageWelcome/link_purchaseRequisitions'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 14-Click on link purchaseRequisitions - Navigate to page fscmUIfacesFndOverview.png')

"Step 15: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/FndOverview?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_FndOverview/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC125/Step 15-Click on html object.png')

"Step 16: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/FndOverview?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_FndOverview/td_object'))

// WebUI.takeScreenshot(reportLocation + '/TC125/Step 16-Click on td object.png')

"Step 17: Click on link navigator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/FndOverview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_FndOverview/link_navigator'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 17-Click on link navigator.png')

"Step 18: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/FndOverview?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_FndOverview/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC125/Step 18-Click on div object.png')

"Step 19: Click on link navigator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/FndOverview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_FndOverview/link_navigator'))

WebUI.takeScreenshot(reportLocation + '/TC125/Step 19-Click on link navigator.png')

"Step 20: Click on div procurementSection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/FndOverview?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_FndOverview/div_procurementSection'))

// WebUI.takeScreenshot(reportLocation + '/TC125/Step 20-Click on div procurementSection.png')

"Step 21: Click on div procurementSection -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/fscmUI/faces/FndOverview?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_fscmUI_faces_FndOverview/div_procurementSection'))

// WebUI.takeScreenshot(reportLocation + '/TC125/Step 21-Click on div procurementSection - Navigate to page .png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC125-Access Procurement Section and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}