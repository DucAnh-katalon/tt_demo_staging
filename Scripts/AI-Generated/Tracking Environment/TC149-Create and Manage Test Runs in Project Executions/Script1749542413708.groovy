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

"Step 1: Navigate to /project/*/home/overview with params (filter)"

TrueTestScripts.navigate("/project/${project_id}/home/overview", ["filter": overview_filter])

"Step 2: Click on div navigationMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/div_navigationMenu'))

// WebUI.takeScreenshot(reportLocation + '/TC149/Step 2-Click on div navigationMenu.png')

"Step 3: Click on link assets3 -> Navigate to page '/project/*/resources'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_assets3'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 3-Click on link assets3 - Navigate to page projectresources.png')

"Step 4: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/resources?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_resources/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC149/Step 4-Hover over div object.png')

"Step 5: Click on link testObjects -> Navigate to page '/project/*/resources/test-objects'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/resources?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_resources/link_testObjects'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 5-Click on link testObjects - Navigate to page projectresourcestest-objects.png')

"Step 6: Hover over link assets"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/resources/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_resources_test_objects/link_assets'))

// WebUI.takeScreenshot(reportLocation + '/TC149/Step 6-Hover over link assets.png')

"Step 7: Click on link environments -> Navigate to page '/project/*/resources/environments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/resources/test-objects?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_resources_test_objects/link_environments'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 7-Click on link environments - Navigate to page projectresourcesenvironments.png')

"Step 8: Hover over link assets"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/resources/environments?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_resources_environments/link_assets'))

// WebUI.takeScreenshot(reportLocation + '/TC149/Step 8-Hover over link assets.png')

"Step 9: Click on link testData -> Navigate to page '/project/*/resources/test-data'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/resources/environments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_resources_environments/link_testData'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 9-Click on link testData - Navigate to page projectresourcestest-data.png')

"Step 10: Click on div executions -> Navigate to page '/project/*/executions'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/resources/test-data?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_resources_test_data/div_executions'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 10-Click on div executions - Navigate to page projectexecutions.png')

"Step 11: Click on button groupButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_executions/button_groupButton'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 11-Click on button groupButton.png')

"Step 12: Click on button today"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_executions/button_today'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 12-Click on button today.png')

"Step 13: Click on span create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_executions/span_create'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 13-Click on span create.png')

"Step 14: Click on item createManualTestRun -> Navigate to page '/project/*/executions/types/manual/schedules/create'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_executions/item_createManualTestRun'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 14-Click on item createManualTestRun - Navigate to page projectexecutionstypesmanualschedulescreate.png')

"Step 15: Click on div createTestRunHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions/types/manual/schedules/create?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_executions_types_manual_schedules_create/div_createTestRunHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC149/Step 15-Click on div createTestRunHeader.png')

"Step 16: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions/types/manual/schedules/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_executions_types_manual_schedules_create/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 16-Click on button close.png')

"Step 17: Click on button sprintTestRunActions (openSprintSelector)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions/types/manual/schedules/create?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_executions_types_manual_schedules_create/button_sprintTestRunActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_executions_types_manual_schedules_create/button_sprintTestRunActions', ['button_sprintTestRunActions_class': button_sprintTestRunActions_class, 'button_sprintTestRunActions_dataTestid': button_sprintTestRunActions_dataTestid, 'button_sprintTestRunActions_internalLabel': button_sprintTestRunActions_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 17-Click on button sprintTestRunActions openSprintSelector.png')

"Step 18: Click on item releaseDetails (postGa4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions/types/manual/schedules/create?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_executions_types_manual_schedules_create/item_releaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_executions_types_manual_schedules_create/item_releaseDetails', ['item_releaseDetails_id': item_releaseDetails_id]))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 18-Click on item releaseDetails postGa4.png')

"Step 19: Click on button open"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions/types/manual/schedules/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_executions_types_manual_schedules_create/button_open'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 19-Click on button open.png')

"Step 20: Click on item releaseDetails (release2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions/types/manual/schedules/create?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_executions_types_manual_schedules_create/item_releaseDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_executions_types_manual_schedules_create/item_releaseDetails', ['item_releaseDetails_id': item_releaseDetails_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 20-Click on item releaseDetails release2.png')

"Step 21: Click on button sprintTestRunActions (openTestRun)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions/types/manual/schedules/create?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_executions_types_manual_schedules_create/button_sprintTestRunActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_executions_types_manual_schedules_create/button_sprintTestRunActions', ['button_sprintTestRunActions_class': button_sprintTestRunActions_class_1, 'button_sprintTestRunActions_dataTestid': button_sprintTestRunActions_dataTestid_1, 'button_sprintTestRunActions_internalLabel': button_sprintTestRunActions_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 21-Click on button sprintTestRunActions openTestRun.png')

"Step 22: Click on input testRunName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions/types/manual/schedules/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_executions_types_manual_schedules_create/input_testRunName'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 22-Click on input testRunName.png')

"Step 23: Click on div createTestRunHeader2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions/types/manual/schedules/create?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_executions_types_manual_schedules_create/div_createTestRunHeader2'))

// WebUI.takeScreenshot(reportLocation + '/TC149/Step 23-Click on div createTestRunHeader2.png')

"Step 24: Click on div createTestRunHeader3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions/types/manual/schedules/create?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_executions_types_manual_schedules_create/div_createTestRunHeader3'))

// WebUI.takeScreenshot(reportLocation + '/TC149/Step 24-Click on div createTestRunHeader3.png')

"Step 25: Click on button sprintTestRunActions (clear)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions/types/manual/schedules/create?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_executions_types_manual_schedules_create/button_sprintTestRunActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_executions_types_manual_schedules_create/button_sprintTestRunActions', ['button_sprintTestRunActions_class': button_sprintTestRunActions_class_2, 'button_sprintTestRunActions_dataTestid': button_sprintTestRunActions_dataTestid_2, 'button_sprintTestRunActions_internalLabel': button_sprintTestRunActions_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 25-Click on button sprintTestRunActions clear.png')

"Step 26: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions/types/manual/schedules/create?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_executions_types_manual_schedules_create/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC149/Step 26-Click on div object.png')

"Step 27: Hover over div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions/types/manual/schedules/create?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_executions_types_manual_schedules_create/div_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC149/Step 27-Hover over div object2.png')

"Step 28: Click on link testRuns -> Navigate to page '/project/*/ra/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/executions/types/manual/schedules/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_executions_types_manual_schedules_create/link_testRuns'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 28-Click on link testRuns - Navigate to page projectratest-runs.png')

"Step 29: Click on div emailDisplay"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_test_runs/div_emailDisplay'))

// WebUI.takeScreenshot(reportLocation + '/TC149/Step 29-Click on div emailDisplay.png')

"Step 30: Click on div emailDisplay2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_test_runs/div_emailDisplay2'))

// WebUI.takeScreenshot(reportLocation + '/TC149/Step 30-Click on div emailDisplay2.png')

"Step 31: Click on link projectRun -> Navigate to page '/project/*/ra/test-runs/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_test_runs/link_projectRun'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 31-Click on link projectRun - Navigate to page projectratest-runs.png')

"Step 32: Click on button testResults -> Navigate to page '/project/*/ra/test-runs/*/test-runs'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/test-runs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_test_runs/button_testResults'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 32-Click on button testResults - Navigate to page projectratest-runstest-runs.png')

"Step 33: Click on button mainHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/test-runs/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_test_runs_test_runs/button_mainHeader'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 33-Click on button mainHeader.png')

"Step 34: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/test-runs/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_test_runs_test_runs/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC149/Step 34-Click on div object.png')

"Step 35: Click on div empty"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/test-runs/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_test_runs_test_runs/div_empty'))

// WebUI.takeScreenshot(reportLocation + '/TC149/Step 35-Click on div empty.png')

"Step 36: Click on button defects -> Navigate to page '/project/*/ra/test-runs/*/defect'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/test-runs/.*/test-runs?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_test_runs_test_runs/button_defects'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 36-Click on button defects - Navigate to page projectratest-runsdefect.png')

"Step 37: Click on button summary -> Navigate to page '/project/*/ra/test-runs/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/test-runs/.*/defect?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_test_runs_defect/button_summary'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 37-Click on button summary - Navigate to page projectratest-runs.png')

"Step 38: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/test-runs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_test_runs/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC149/Step 38-Hover over div object.png')

"Step 39: Click on link allReports -> Navigate to page '/project/*/ra/all-reports'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/test-runs/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_test_runs/link_allReports'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 39-Click on link allReports - Navigate to page projectraall-reports.png')

"Step 40: Click on div icon -> Navigate to page '/project/*/ra/all-reports/metric/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_all_reports/div_icon'))

// WebUI.takeScreenshot(reportLocation + '/TC149/Step 40-Click on div icon - Navigate to page projectraall-reportsmetric.png')

"Step 41: Click on link testCloud -> Navigate to page '/project/*/tc/live/app'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports/metric/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_all_reports_metric/link_testCloud'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 41-Click on link testCloud - Navigate to page projecttcliveapp.png')

"Step 42: Click on div testCloud"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tc/live/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tc_live_app/div_testCloud'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 42-Click on div testCloud.png')

"Step 43: Click on button mobileBrowser -> Navigate to page '/project/*/tc/live/browser'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tc/live/app?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tc_live_app/button_mobileBrowser'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 43-Click on button mobileBrowser - Navigate to page projecttclivebrowser.png')

"Step 44: Click on button desktopBrowser -> Navigate to page '/project/*/tc/live/desktop-browser'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tc/live/browser?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tc_live_browser/button_desktopBrowser'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 44-Click on button desktopBrowser - Navigate to page projecttclivedesktop-browser.png')

"Step 45: Click on button applications -> Navigate to page '/project/*/tc/application'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tc/live/desktop-browser?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tc_live_desktop_browser/button_applications'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 45-Click on button applications - Navigate to page projecttcapplication.png')

"Step 46: Click on button uploadApplication"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tc/application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tc_application/button_uploadApplication'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 46-Click on button uploadApplication.png')

"Step 47: Click on span katalonTestCloud -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tc/application?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tc_application/span_katalonTestCloud'))

WebUI.takeScreenshot(reportLocation + '/TC149/Step 47-Click on span katalonTestCloud - Navigate to page .png')

"Step 48: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC149-Create and Manage Test Runs in Project Executions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}