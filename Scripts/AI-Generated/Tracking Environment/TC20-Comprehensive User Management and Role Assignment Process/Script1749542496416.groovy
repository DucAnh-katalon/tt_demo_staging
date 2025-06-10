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

"Step 1: Navigate to /dashboard"

TrueTestScripts.navigate("/dashboard")

"Step 2: Click on list quicklink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/list_quicklink'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 2-Click on list quicklink.png')

"Step 3: Click on button clarioApps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_clarioApps'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 3-Click on button clarioApps.png')

"Step 4: Click on link administrationTool -> Navigate to page '/gssoadmin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_administrationTool'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 4-Click on link administrationTool - Navigate to page gssoadmin.png')

"Step 5: Click on link userManagement (userManagement)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_gssoadmin/link_userManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_gssoadmin/link_userManagement', ['link_userManagement_internalText': link_userManagement_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 5-Click on link userManagement userManagement.png')

"Step 6: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 6-Click on button selectStudyOrOrganization.png')

"Step 7: Click on button automationStudy -> Navigate to page '/studies/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/button_automationStudy'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 7-Click on button automationStudy - Navigate to page studies.png')

"Step 8: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 8-Click on link home - Navigate to page dashboard.png')

"Step 9: Click on button administration2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 9-Click on button administration2.png')

"Step 10: Click on div actionBar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_actionBar_1'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 10-Click on div actionBar.png')

"Step 11: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 11-Click on button selectStudyOrOrganization.png')

"Step 12: Click on button studyActions (userService) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 12-Click on button studyActions userService - Navigate to page studiesdashboard.png')

"Step 13: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 13-Click on button close.png')

"Step 14: Click on button administration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_administration'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 14-Click on button administration.png')

"Step 15: Click on link studyLinks (studySettings2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks_1', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 15-Click on link studyLinks studySettings2.png')

"Step 16: Click on link training"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_training'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 16-Click on link training.png')

"Step 17: Click on button selectRoles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_selectRoles'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 17-Click on button selectRoles.png')

"Step 18: Click on input searchRoles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_searchRoles'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 18-Click on input searchRoles.png')

"Step 19: Enter input value in input searchRoles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_searchRoles'), input_searchRoles)

WebUI.takeScreenshot(reportLocation + '/TC20/Step 19-Enter input value in input searchRoles.png')

"Step 20: Click on button siteRoles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteRoles'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 20-Click on button siteRoles.png')

"Step 21: Click on input siteUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_siteUser'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 21-Click on input siteUser.png')

"Step 22: Click on button next2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 22-Click on button next2.png')

"Step 23: Click on button submit -> Navigate to page '/studies/*/query-settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 23-Click on button submit - Navigate to page studiesquery-settings.png')

"Step 24: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 24-Click on html object.png')

"Step 25: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 25-Click on html object.png')

"Step 26: Click on details trainingAssignment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/details_trainingAssignment'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 26-Click on details trainingAssignment.png')

"Step 27: Click on summary object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/summary_object'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 27-Click on summary object.png')

"Step 28: Click on summary trainingAssignment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/summary_trainingAssignment'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 28-Click on summary trainingAssignment.png')

"Step 29: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 29-Click on html object.png')

"Step 30: Click on button selectRoles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/button_selectRoles'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 30-Click on button selectRoles.png')

"Step 31: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 31-Click on div object.png')

"Step 32: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 32-Click on div object.png')

"Step 33: Click on input searchRoles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/input_searchRoles'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 33-Click on input searchRoles.png')

"Step 34: Enter input value in input searchRoles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/input_searchRoles'), input_searchRoles_1)

WebUI.takeScreenshot(reportLocation + '/TC20/Step 34-Enter input value in input searchRoles.png')

"Step 35: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/div_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 35-Click on div object2.png')

"Step 36: Click on button clearAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/button_clearAll'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 36-Click on button clearAll.png')

"Step 37: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 37-Click on button next.png')

"Step 38: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 38-Click on button submit.png')

"Step 39: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 39-Click on link home - Navigate to page dashboard.png')

"Step 40: Click on link registerSiteJoinStudy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_registerSiteJoinStudy'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 40-Click on link registerSiteJoinStudy.png')

"Step 41: Click on list quicklink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/list_quicklink'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 41-Click on list quicklink.png')

"Step 42: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 42-Click on button selectStudyOrOrganization.png')

"Step 43: Click on button studyActions (userServiceE2E) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText_1, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 43-Click on button studyActions userServiceE2E - Navigate to page studiesdashboard.png')

"Step 44: Click on button administration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_administration'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 44-Click on button administration.png')

"Step 45: Click on link studyLinks (studySettings2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks_1', ['link_studyLinks_aTitle': link_studyLinks_aTitle_1, 'link_studyLinks_href_variable': link_studyLinks_href_variable_1, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 45-Click on link studyLinks studySettings2.png')

"Step 46: Click on link training"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_training'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 46-Click on link training.png')

"Step 47: Click on button selectRoles2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_selectRoles2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 47-Click on button selectRoles2.png')

"Step 48: Click on input checkboxAnjaliQatest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_checkboxAnjaliQatest'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 48-Click on input checkboxAnjaliQatest.png')

"Step 49: Click on button next2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 49-Click on button next2.png')

"Step 50: Click on button selectRoles3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_selectRoles3'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 50-Click on button selectRoles3.png')

"Step 51: Click on input checkboxInternalImagingQcuser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_checkboxInternalImagingQcuser'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 51-Click on input checkboxInternalImagingQcuser.png')

"Step 52: Click on button next2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next2'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 52-Click on button next2.png')

"Step 53: Click on button submit -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 53-Click on button submit - Navigate to page .png')

"Step 54: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC20-Comprehensive User Management and Role Assignment Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}