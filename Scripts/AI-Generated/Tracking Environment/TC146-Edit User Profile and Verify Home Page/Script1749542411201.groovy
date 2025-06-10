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

"Step 2: Hover over link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_reports'))

// WebUI.takeScreenshot(reportLocation + '/TC146/Step 2-Hover over link reports.png')

"Step 3: Click on link allReports -> Navigate to page '/project/*/ra/all-reports'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_allReports'))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 3-Click on link allReports - Navigate to page projectraall-reports.png')

"Step 4: Click on button reportsActions (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_ra_all_reports/button_reportsActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_ra_all_reports/button_reportsActions', ['button_reportsActions_class': button_reportsActions_class, 'button_reportsActions_nth': button_reportsActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 4-Click on button reportsActions object.png')

"Step 5: Click on button reportsActions (reportsAndAnalytics)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_ra_all_reports/button_reportsActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_ra_all_reports/button_reportsActions', ['button_reportsActions_class': button_reportsActions_class_1, 'button_reportsActions_nth': button_reportsActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 5-Click on button reportsActions reportsAndAnalytics.png')

"Step 6: Click on button action"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_all_reports/button_action'))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 6-Click on button action.png')

"Step 7: Click on div projectBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_all_reports/div_projectBackdrop'))

// WebUI.takeScreenshot(reportLocation + '/TC146/Step 7-Click on div projectBackdrop.png')

"Step 8: Click on div avatarButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_all_reports/div_avatarButton'))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 8-Click on div avatarButton.png')

"Step 9: Click on div projectBackdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_all_reports/div_projectBackdrop'))

// WebUI.takeScreenshot(reportLocation + '/TC146/Step 9-Click on div projectBackdrop.png')

"Step 10: Click on div avatarButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_all_reports/div_avatarButton'))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 10-Click on div avatarButton.png')

"Step 11: Click on link userProfile -> Navigate to page '/user-profile/project'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/ra/all-reports?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_ra_all_reports/link_userProfile'))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 11-Click on link userProfile - Navigate to page user-profileproject.png')

"Step 12: Click on button editInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_profile_project/button_editInformation'))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 12-Click on button editInformation.png')

"Step 13: Click on div jobTitles (jobTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_user_profile_project/div_jobTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_user_profile_project/div_jobTitles', ['div_jobTitles_internalLabel': div_jobTitles_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 13-Click on div jobTitles jobTitle.png')

"Step 14: Click on item roles (developer)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_user_profile_project/item_roles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_user_profile_project/item_roles', ['item_roles_id': item_roles_id]))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 14-Click on item roles developer.png')

"Step 15: Hover over p developer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_user_profile_project/p_developer'))

// WebUI.takeScreenshot(reportLocation + '/TC146/Step 15-Hover over p developer.png')

"Step 16: Click on div jobTitles (jobTitle2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_user_profile_project/div_jobTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_user_profile_project/div_jobTitles', ['div_jobTitles_internalLabel': div_jobTitles_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 16-Click on div jobTitles jobTitle2.png')

"Step 17: Click on item roles (manualTester)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_user_profile_project/item_roles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_user_profile_project/item_roles', ['item_roles_id': item_roles_id_1]))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 17-Click on item roles manualTester.png')

"Step 18: Hover over item automationSpecialist"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_user_profile_project/item_automationSpecialist'))

// WebUI.takeScreenshot(reportLocation + '/TC146/Step 18-Hover over item automationSpecialist.png')

"Step 19: Click on div jobTitles (jobTitle3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_user_profile_project/div_jobTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_user_profile_project/div_jobTitles', ['div_jobTitles_internalLabel': div_jobTitles_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 19-Click on div jobTitles jobTitle3.png')

"Step 20: Click on item roles (qualityEngineer)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_user_profile_project/item_roles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_user_profile_project/item_roles', ['item_roles_id': item_roles_id_2]))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 20-Click on item roles qualityEngineer.png')

"Step 21: Hover over item developer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_user_profile_project/item_developer2'))

// WebUI.takeScreenshot(reportLocation + '/TC146/Step 21-Hover over item developer2.png')

"Step 22: Click on button cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_profile_project/button_cancel'))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 22-Click on button cancel.png')

"Step 23: Click on button account -> Navigate to page '/user-profile/account'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/project?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_profile_project/button_account'))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 23-Click on button account - Navigate to page user-profileaccount.png')

"Step 24: Click on button changeHistory -> Navigate to page '/user-profile/change-history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/account?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_profile_account/button_changeHistory'))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 24-Click on button changeHistory - Navigate to page user-profilechange-history.png')

"Step 25: Click on button activityHistory -> Navigate to page '/user-profile/activity-history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/change-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_profile_change_history/button_activityHistory'))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 25-Click on button activityHistory - Navigate to page user-profileactivity-history.png')

"Step 26: Click on span back -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-profile/activity-history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_profile_activity_history/span_back'))

WebUI.takeScreenshot(reportLocation + '/TC146/Step 26-Click on span back - Navigate to page .png')

"Step 27: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC146-Edit User Profile and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}