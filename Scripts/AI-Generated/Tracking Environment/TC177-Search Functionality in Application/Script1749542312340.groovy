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

"Step 1: Navigate to /search with params (gs lcrp, ie, oq, q, sourceid)"

TrueTestScripts.navigate("/search", ["gs_lcrp": search_gs_lcrp, "ie": search_ie, "oq": search_oq, "q": search_q, "sourceid": search_sourceid])

"Step 2: Click on textarea search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_search/textarea_search'))

WebUI.takeScreenshot(reportLocation + '/TC177/Step 2-Click on textarea search.png')

"Step 3: Enter input value in textarea search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_search/textarea_search'), textarea_search)

WebUI.takeScreenshot(reportLocation + '/TC177/Step 3-Enter input value in textarea search.png')

"Step 4: Click on em useMsckRepairTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_search/em_useMsckRepairTable'))

// WebUI.takeScreenshot(reportLocation + '/TC177/Step 4-Click on em useMsckRepairTable.png')

"Step 5: Click on div searchResults -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_search/div_searchResults'))

// WebUI.takeScreenshot(reportLocation + '/TC177/Step 5-Click on div searchResults - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC177-Search Functionality in Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}