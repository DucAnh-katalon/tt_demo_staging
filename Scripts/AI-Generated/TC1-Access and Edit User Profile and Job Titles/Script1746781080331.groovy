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

"Step 1: Navigate to /project/*/home/overview with params (filter)"

TrueTestScripts.navigate("/project/${project_id}/home/overview", ["filter": overview_filter])

"Step 2: Hover over link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_home_overview/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Hover over link reports.png')

"Step 3: Click on link allReports -> Navigate to page '/project/*/ra/all-reports'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_home_overview/link_allReports'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link allReports - Navigate to page projectraall-reports.png')

"Step 4: Click on button katalonReports (katalonReportsAnalytics0)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_ra_all_reports/button_katalonReports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_ra_all_reports/button_katalonReports', ['button_katalonReports_class': button_katalonReports_class, 'button_katalonReports_nth': button_katalonReports_nth]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button katalonReports katalonReportsAnalytics0.png')

"Step 5: Click on button katalonReports (katalonReportsAnalytics1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_project_ra_all_reports/button_katalonReports"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_project_ra_all_reports/button_katalonReports', ['button_katalonReports_class': button_katalonReports_class_1, 'button_katalonReports_nth': button_katalonReports_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button katalonReports katalonReportsAnalytics1.png')

"Step 6: Click on button toolbar2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_ra_all_reports/button_toolbar2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button toolbar2.png')

"Step 7: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_ra_all_reports/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on div backdrop.png')

"Step 8: Click on div avatar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_ra_all_reports/div_avatar'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on div avatar.png')

"Step 9: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_ra_all_reports/div_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on div backdrop.png')

"Step 10: Click on div avatar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_ra_all_reports/div_avatar'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on div avatar.png')

"Step 11: Click on link userProfile -> Navigate to page '/user-profile/project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_ra_all_reports/link_userProfile'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on link userProfile - Navigate to page user-profileproject.png')

"Step 12: Click on button editInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile_project/button_editInformation'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on button editInformation.png')

"Step 13: Click on div jobTitle (jobTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile_project/div_jobTitle"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile_project/div_jobTitle', ['div_jobTitle_internalLabel': div_jobTitle_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on div jobTitle jobTitle.png')

"Step 14: Click on item jobTitles (jobTitleDeveloper)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile_project/item_jobTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile_project/item_jobTitles', ['item_jobTitles_id': item_jobTitles_id]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on item jobTitles jobTitleDeveloper.png')

"Step 15: Hover over p jobTitleDeveloper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_user_profile_project/p_jobTitleDeveloper'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Hover over p jobTitleDeveloper.png')

"Step 16: Click on div jobTitle (jobTitleDeveloper)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile_project/div_jobTitle"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile_project/div_jobTitle', ['div_jobTitle_internalLabel': div_jobTitle_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on div jobTitle jobTitleDeveloper.png')

"Step 17: Click on item jobTitles (jobTitleManualTester)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile_project/item_jobTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile_project/item_jobTitles', ['item_jobTitles_id': item_jobTitles_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on item jobTitles jobTitleManualTester.png')

"Step 18: Hover over item jobTitleAutomationSpecialist"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_user_profile_project/item_jobTitleAutomationSpecialist'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Hover over item jobTitleAutomationSpecialist.png')

"Step 19: Click on div jobTitle (jobTitleManualTester)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile_project/div_jobTitle"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile_project/div_jobTitle', ['div_jobTitle_internalLabel': div_jobTitle_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on div jobTitle jobTitleManualTester.png')

"Step 20: Click on item jobTitles (jobTitleQualityEngineer)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_user_profile_project/item_jobTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_user_profile_project/item_jobTitles', ['item_jobTitles_id': item_jobTitles_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on item jobTitles jobTitleQualityEngineer.png')

"Step 21: Hover over item jobTitleDeveloper2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_user_profile_project/item_jobTitleDeveloper2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Hover over item jobTitleDeveloper2.png')

"Step 22: Click on button cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile_project/button_cancel'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on button cancel.png')

"Step 23: Click on button account -> Navigate to page '/user-profile/account'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile_project/button_account'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 23-Click on button account - Navigate to page user-profileaccount.png')

"Step 24: Click on button changeHistory -> Navigate to page '/user-profile/change-history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/account?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile_account/button_changeHistory'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 24-Click on button changeHistory - Navigate to page user-profilechange-history.png')

"Step 25: Click on button activityHistory -> Navigate to page '/user-profile/activity-history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/change-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile_change_history/button_activityHistory'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 25-Click on button activityHistory - Navigate to page user-profileactivity-history.png')

"Step 26: Click on span back -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/activity-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_profile_activity_history/span_back'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 26-Click on span back - Navigate to page .png')

"Step 27: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Access and Edit User Profile and Job Titles_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}