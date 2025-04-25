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

"Step 1: Navigate to */*"

TrueTestScripts.navigate("${path_param_1}/${path_param_2}")

"Step 2: Click on input refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_interface/input_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 2-Click on input refresh.png')

"Step 3: Click on input refresh -> Navigate to page 'door history reports#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_interface/input_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Click on input refresh - Navigate to page door history reports.png')

"Step 4: Enter input value in input trailerNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_door_history_reports/input_trailerNumber'), input_trailerNumber)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Enter input value in input trailerNumber.png')

"Step 5: Click on input search -> Navigate to page 'pro movement reports#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_door_history_reports/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on input search - Navigate to page pro movement reports.png')

"Step 6: Enter input value in input proNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_pro_movement_reports/input_proNumber'), input_proNumber)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Enter input value in input proNumber.png')

"Step 7: Click on input proSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pro_movement_reports/input_proSearch'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on input proSearch.png')

"Step 8: Click on div proSearchForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pro_movement_reports/div_proSearchForm2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Click on div proSearchForm.png')

"Step 9: Enter input value in input proNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_pro_movement_reports/input_proNumber'), input_proNumber_1)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Enter input value in input proNumber.png')

"Step 10: Click on input proSearch -> Navigate to page 'live worksheet#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pro_movement_reports/input_proSearch'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 10-Click on input proSearch - Navigate to page live worksheet.png')

"Step 11: Enter input value in input searchString"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_live_worksheet/input_searchString'), input_searchString)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 11-Enter input value in input searchString.png')

"Step 12: Click on input searchString"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet/input_searchString'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 12-Click on input searchString.png')

"Step 13: Select option with input value from select layoutSelectedTerminal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_live_worksheet/select_layoutSelectedTerminal'), select_layoutSelectedTerminal)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 13-Select option with input value from select layoutSelectedTerminal.png')

"Step 14: Select option with input value from select searchOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_live_worksheet/select_searchOption'), select_searchOption)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 14-Select option with input value from select searchOption.png')

"Step 15: Click on input searchString -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet/input_searchString'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 15-Click on input searchString - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Search and Verify Pro Movement Reports_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}