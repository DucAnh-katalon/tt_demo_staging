import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.adminLogoutAndCreateNewTemplate
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

"Step 2: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 2-Click on button selectStudyOrOrganization.png')

"Step 3: Click on button studyActions (testStudyForDcrquery) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 3-Click on button studyActions testStudyForDcrquery - Navigate to page studiesdashboard.png')

"Step 4: Click on link studyLinks (queries3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 4-Click on link studyLinks queries3.png')

"Step 5: Select option with input value from select searchAll2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_searchAll2'), select_searchAll2)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 5-Select option with input value from select searchAll2.png')

"Step 6: Select option with input value from select dcrQualityNotification"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_dcrQualityNotification'), select_dcrQualityNotification)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 6-Select option with input value from select dcrQualityNotification.png')

"Step 7: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 7-Click on button apply.png')

"Step 8: Click on faIcon navigation (next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/faIcon_navigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/faIcon_navigation_1', ['faIcon_navigation_class': faIcon_navigation_class, 'faIcon_navigation_internalLabel': faIcon_navigation_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 8-Click on faIcon navigation next.png')

"Step 9: Click on faIcon navigation (back)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/faIcon_navigation_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/faIcon_navigation_1', ['faIcon_navigation_class': faIcon_navigation_class_1, 'faIcon_navigation_internalLabel': faIcon_navigation_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 9-Click on faIcon navigation back.png')

"Step 10: Select option with input value from select rows -> Navigate to page '/studies/*/queries'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_rows'), select_rows)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 10-Select option with input value from select rows - Navigate to page studiesqueries.png')

"Step 11: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 11-Click on button superUser.png')

"Step 12: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 12-Click on link logout - Navigate to page dashboard.png')

"Step 13: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 13-Click on button selectStudyOrOrganization.png')

"Step 14: Click on button studyActions (regressionStudy2) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText_1, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 14-Click on button studyActions regressionStudy2 - Navigate to page studiesdashboard.png')

"Step 15: Click on item protocol"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/item_protocol'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 15-Click on item protocol.png')

"Step 16: Click on link studyLinks (subjects2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_1, 'link_studyLinks_class': link_studyLinks_class_1, 'link_studyLinks_href_variable': link_studyLinks_href_variable_1, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 16-Click on link studyLinks subjects2.png')

"Step 17: Click on td subjectId3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/td_subjectId'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 17-Click on td subjectId3.png')

"Step 18: Click on faIcon previousPage2 -> Navigate to page '/studies/*/subjects-list-study'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_previousPage2'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 18-Click on faIcon previousPage2 - Navigate to page studiessubjects-list-study.png')

"Step 19: Click on input textFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_textFilter'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 19-Click on input textFilter.png')

"Step 20: Enter input value in input textFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_textFilter'), input_textFilter)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 20-Enter input value in input textFilter.png')

"Step 21: Press key Enter on input textFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_textFilter'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 21-Press key Enter on input textFilter.png')

"Step 22: Enter input value in input textFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/input_textFilter'), input_textFilter_1)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 22-Enter input value in input textFilter.png')

"Step 23: Click on td subjectId4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/td_subjectId4'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 23-Click on td subjectId4.png')

"Step 24: Click on button queriesDcrs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_queriesDcrs'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 24-Click on button queriesDcrs.png')

"Step 25: Click on link createDcr"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/link_createDcr'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 25-Click on link createDcr.png')

"Step 26: Click on span selectVisitSession"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/span_selectVisitSession'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 26-Click on span selectVisitSession.png')

"Step 27: Click on div screenVisit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_screenVisit'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 27-Click on div screenVisit.png')

"Step 28: Click on button submit2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submit2'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 28-Click on button submit2.png')

"Step 29: Click on faIcon studyEvent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/faIcon_studyEvent'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 29-Click on faIcon studyEvent.png')

"Step 30: Click on button submit2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submit2'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 30-Click on button submit2.png')

"Step 31: Click on textarea description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/textarea_description'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 31-Click on textarea description.png')

"Step 32: Enter input value in textarea description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/textarea_description'), textarea_description)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 32-Enter input value in textarea description.png')

"Step 33: Click on div reasonDataChangeRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_reasonDataChangeRequest'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 33-Click on div reasonDataChangeRequest.png')

"Step 34: Click on div reasonDataChangeRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_reasonDataChangeRequest'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 34-Click on div reasonDataChangeRequest.png')

"Step 35: Click on button submit3 -> Navigate to page '/studies/*/subjects-list-study/*/visits'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submit3'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 35-Click on button submit3 - Navigate to page studiessubjects-list-studyvisits.png')

"Step 36: Click on button viewData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/visits?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_visits/button_viewData'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 36-Click on button viewData.png')

"Step 37: Click on button queriesDcrs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/visits?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_visits/button_queriesDcrs'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 37-Click on button queriesDcrs.png')

"Step 38: Click on header subject10002"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/visits?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_visits/header_subject10002'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 38-Click on header subject10002.png')

"Step 39: Click on header subject10002 -> Navigate to page '/studies/*/subjects-list-study/*/view-data'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/visits?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_visits/header_subject10002'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 39-Click on header subject10002 - Navigate to page studiessubjects-list-studyview-data.png')

"Step 40: Click on link ecoaViewData -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/view-data?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_view_data/link_ecoaViewData'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 40-Click on link ecoaViewData - Navigate to page studiesdashboard.png')

"Step 41: Click on link studyLinks (subjects2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_2, 'link_studyLinks_class': link_studyLinks_class_2, 'link_studyLinks_href_variable': link_studyLinks_href_variable_2, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 41-Click on link studyLinks subjects2.png')

"Step 42: Click on link studyLinks (queries3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_3, 'link_studyLinks_class': link_studyLinks_class_3, 'link_studyLinks_href_variable': link_studyLinks_href_variable_3, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_3]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 42-Click on link studyLinks queries3.png')

"Step 43: Click on link studyLinks (queries3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_4, 'link_studyLinks_class': link_studyLinks_class_4, 'link_studyLinks_href_variable': link_studyLinks_href_variable_4, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_4]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 43-Click on link studyLinks queries3.png')

"Step 44: Click on link studyLinks (queries3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_5, 'link_studyLinks_class': link_studyLinks_class_5, 'link_studyLinks_href_variable': link_studyLinks_href_variable_5, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_5]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 44-Click on link studyLinks queries3.png')

"Step 45: Click on link studyLinks (queries3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_6, 'link_studyLinks_class': link_studyLinks_class_6, 'link_studyLinks_href_variable': link_studyLinks_href_variable_6, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_6]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 45-Click on link studyLinks queries3.png')

"Step 46: Click on link studyLinks (queries3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_7, 'link_studyLinks_class': link_studyLinks_class_7, 'link_studyLinks_href_variable': link_studyLinks_href_variable_7, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_7]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 46-Click on link studyLinks queries3.png')

"Step 47: Click on link studyLinks (queries3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_8, 'link_studyLinks_class': link_studyLinks_class_8, 'link_studyLinks_href_variable': link_studyLinks_href_variable_8, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_8]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 47-Click on link studyLinks queries3.png')

"Step 48: Click on div searchAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_searchAll'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 48-Click on div searchAll.png')

"Step 49: Click on input searchAll3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_searchAll3'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 49-Click on input searchAll3.png')

"Step 50: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 50-Click on button object2.png')

"Step 51: Click on link view3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_view3'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 51-Click on link view3.png')

"Step 52: Click on faIcon object13 -> Navigate to page '/studies/*/queries'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object13'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 52-Click on faIcon object13 - Navigate to page studiesqueries.png')

"Step 53: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 53-Click on button superUser.png')

"Step 54: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 54-Click on link logout - Navigate to page dashboard.png')

"Step 55: Click on span projectName4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_projectName4'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 55-Click on span projectName4.png')

"Step 56: Click on span projectNames (projectName5) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/span_projectNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/span_projectNames', ['span_projectNames_trNthChild': span_projectNames_trNthChild, 'span_projectNames_trNthOfType': span_projectNames_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 56-Click on span projectNames projectName5 - Navigate to page studiesdashboard.png')

"Step 57: Click on item sponsorName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/item_sponsorName'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 57-Click on item sponsorName.png')

"Step 58: Click on item studyNameValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/item_studyNameValue'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 58-Click on item studyNameValue.png')

"Step 59: Click on item studyNameValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/item_studyNameValue'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 59-Click on item studyNameValue.png')

"Step 60: Click on item sponsorName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/item_sponsorName'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 60-Click on item sponsorName.png')

"Step 61: Click on link object -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 61-Click on link object - Navigate to page dashboard.png')

"Step 62: Click on header globalDashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/header_globalDashboard'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 62-Click on header globalDashboard.png')

"Step 63: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 63-Click on button superUser.png')

"Step 64: Click on link logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 64-Click on link logout.png')

"Step 65: Click on header globalDashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/header_globalDashboard'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 65-Click on header globalDashboard.png')

"Step 66: Click on header globalDashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/header_globalDashboard'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 66-Click on header globalDashboard.png')

"Step 67: Click on header globalDashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/header_globalDashboard'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 67-Click on header globalDashboard.png')

"Step 68: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 68-Click on button selectStudyOrOrganization.png')

"Step 69: Click on button selectStudyOrOrganization2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization2'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 69-Click on button selectStudyOrOrganization2.png')

"Step 70: Click on header globalDashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/header_globalDashboard'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 70-Click on header globalDashboard.png')

"Step 71: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 71-Click on button selectStudyOrOrganization.png')

"Step 72: Click on link showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 72-Click on link showMore.png')

"Step 73: Click on input filterText"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_filterText'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 73-Click on input filterText.png')

"Step 74: Enter input value in input filterText"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_filterText'), input_filterText)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 74-Enter input value in input filterText.png')

"Step 75: Press key Enter on input filterText"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_filterText'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 75-Press key Enter on input filterText.png')

"Step 76: Enter input value in input filterText"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_filterText'), input_filterText_1)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 76-Enter input value in input filterText.png')

"Step 77: Click on td organization -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/td_organization'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 77-Click on td organization - Navigate to page studiesdashboard.png')

"Step 78: Click on link studyLinks (subjects2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_9, 'link_studyLinks_class': link_studyLinks_class_9, 'link_studyLinks_href_variable': link_studyLinks_href_variable_9, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_9]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 78-Click on link studyLinks subjects2.png')

"Step 79: Click on button createSubject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_createSubject'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 79-Click on button createSubject.png')

"Step 80: Click on button dismiss -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_dismiss'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 80-Click on button dismiss - Navigate to page dashboard.png')

"Step 81: Click on main dashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/main_dashboard'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 81-Click on main dashboard.png')

"Step 82: Click on span projectName6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_projectName'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 82-Click on span projectName6.png')

"Step 83: Click on div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_object7'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 83-Click on div object7.png')

"Step 84: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 84-Click on button selectStudyOrOrganization.png')

"Step 85: Click on button studyActions (ecoaViewData) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText_2, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 85-Click on button studyActions ecoaViewData - Navigate to page studiesdashboard.png')

"Step 86: Click on link studyLinks (subjects2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_10, 'link_studyLinks_class': link_studyLinks_class_10, 'link_studyLinks_href_variable': link_studyLinks_href_variable_10, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_10]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 86-Click on link studyLinks subjects2.png')

"Step 87: Click on td subjectId4 -> Navigate to page '/studies/*/subjects-list-study'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/td_subjectId4'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 87-Click on td subjectId4 - Navigate to page studiessubjects-list-study.png')

"Step 88: Click on div loadingIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_loadingIndicator'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 88-Click on div loadingIndicator.png')

"Step 89: Click on div visits"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_visits'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 89-Click on div visits.png')

"Step 90: Click on div subjectDetailsHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/div_subjectDetailsHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 90-Click on div subjectDetailsHeader.png')

"Step 91: Click on button queriesDcrs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_queriesDcrs'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 91-Click on button queriesDcrs.png')

"Step 92: Click on link createDcr"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/link_createDcr'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 92-Click on link createDcr.png')

"Step 93: Click on button submit2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submit2'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 93-Click on button submit2.png')

"Step 94: Click on textarea description2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/textarea_description2'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 94-Click on textarea description2.png')

"Step 95: Enter input value in textarea description2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/textarea_description2'), textarea_description2)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 95-Enter input value in textarea description2.png')

"Step 96: Click on button submit3 -> Navigate to page '/studies/*/subjects-list-study/*/visits'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study/button_submit3'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 96-Click on button submit3 - Navigate to page studiessubjects-list-studyvisits.png')

"Step 97: Click on link ecoaViewData -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/subjects-list-study/.*/visits?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_subjects_list_study_visits/link_ecoaViewData'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 97-Click on link ecoaViewData - Navigate to page studiesdashboard.png')

"Step 98: Click on link studyLinks (queries5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_11, 'link_studyLinks_class': link_studyLinks_class_11, 'link_studyLinks_href_variable': link_studyLinks_href_variable_11, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_11]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 98-Click on link studyLinks queries5.png')

"Step 99: Click on button object9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object9'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 99-Click on button object9.png')

"Step 100: Click on link view4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_view4'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 100-Click on link view4.png')

"Step 101: Click on button object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object10'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 101-Click on button object10.png')

"Step 102: Logout as super user and create a new template in administration"

adminLogoutAndCreateNewTemplate.execute(data_path_0, Integer.valueOf(index_0))

"Step 103: Select option with input value from select category"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_category'), select_category)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 103-Select option with input value from select category.png')

"Step 104: Select option with input value from select businessLine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_businessLine'), select_businessLine)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 104-Select option with input value from select businessLine.png')

"Step 105: Select option with input value from select creator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_creator'), select_creator)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 105-Select option with input value from select creator.png')

"Step 106: Select option with input value from select recipient"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_recipient'), select_recipient)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 106-Select option with input value from select recipient.png')

"Step 107: Select option with input value from select level"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_level'), select_level)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 107-Select option with input value from select level.png')

"Step 108: Click on input type6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type6'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 108-Click on input type6.png')

"Step 109: Enter input value in input type6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type6'), input_type6)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 109-Enter input value in input type6.png')

"Step 110: Press key Tab on input type6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type6'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 110-Press key Tab on input type6.png')

"Step 111: Enter input value in textarea description6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description6'), textarea_description6)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 111-Enter input value in textarea description6.png')

"Step 112: Click on textarea suggestedResolution5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution5'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 112-Click on textarea suggestedResolution5.png')

"Step 113: Enter input value in textarea suggestedResolution5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution5'), textarea_suggestedResolution5)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 113-Enter input value in textarea suggestedResolution5.png')

"Step 114: Click on textarea suggestedResolution5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution5'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 114-Click on textarea suggestedResolution5.png')

"Step 115: Click on textarea suggestedResolution5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution5'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 115-Click on textarea suggestedResolution5.png')

"Step 116: Click on textarea suggestedResolution5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution5'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 116-Click on textarea suggestedResolution5.png')

"Step 117: Click on textarea suggestedResolution5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution5'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 117-Click on textarea suggestedResolution5.png')

"Step 118: Enter input value in textarea suggestedResolution5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution5'), textarea_suggestedResolution5_1)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 118-Enter input value in textarea suggestedResolution5.png')

"Step 119: Click on textarea description6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description6'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 119-Click on textarea description6.png')

"Step 120: Click on textarea description6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description6'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 120-Click on textarea description6.png')

"Step 121: Enter input value in textarea description6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description6'), textarea_description6_1)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 121-Enter input value in textarea description6.png')

"Step 122: Click on label suspendTask"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/label_suspendTask'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 122-Click on label suspendTask.png')

"Step 123: Click on label bypassable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/label_bypassable'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 123-Click on label bypassable.png')

"Step 124: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 124-Click on button save.png')

"Step 125: Select option with input value from select searchStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_searchStatus'), select_searchStatus)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 125-Select option with input value from select searchStatus.png')

"Step 126: Click on input type7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type7'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 126-Click on input type7.png')

"Step 127: Enter input value in input type7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type7'), input_type7)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 127-Enter input value in input type7.png')

"Step 128: Click on input type7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type7'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 128-Click on input type7.png')

"Step 129: Enter input value in input type7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type7'), input_type7_1)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 129-Enter input value in input type7.png')

"Step 130: Press key Enter on input type7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type7'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 130-Press key Enter on input type7.png')

"Step 131: Enter input value in input type7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type7'), input_type7_2)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 131-Enter input value in input type7.png')

"Step 132: Click on button trigger"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_trigger'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 132-Click on button trigger.png')

"Step 133: Click on link viewActions (view2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_viewActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_viewActions', ['link_viewActions_internalHasText': link_viewActions_internalHasText, 'link_viewActions_liNthOfType': link_viewActions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 133-Click on link viewActions view2.png')

"Step 134: Click on button edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_edit'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 134-Click on button edit.png')

"Step 135: Select option with input value from select isEnabled"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_isEnabled'), select_isEnabled)

WebUI.takeScreenshot(reportLocation + '/TC155/Step 135-Select option with input value from select isEnabled.png')

"Step 136: Click on button save -> Navigate to page '/query-template'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 136-Click on button save - Navigate to page query-template.png')

"Step 137: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_query_template/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 137-Click on button superUser.png')

"Step 138: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_query_template/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 138-Click on link logout - Navigate to page dashboard.png')

"Step 139: Click on span projectNames (projectName7) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/span_projectNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/span_projectNames', ['span_projectNames_trNthChild': span_projectNames_trNthChild_1, 'span_projectNames_trNthOfType': span_projectNames_trNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 139-Click on span projectNames projectName7 - Navigate to page studiesdashboard.png')

"Step 140: Click on link studyLinks (uploader4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_12, 'link_studyLinks_class': link_studyLinks_class_12, 'link_studyLinks_href_variable': link_studyLinks_href_variable_12, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_12]))

WebUI.takeScreenshot(reportLocation + '/TC155/Step 140-Click on link studyLinks uploader4.png')

"Step 141: Click on crPaginator object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/crPaginator_object'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 141-Click on crPaginator object.png')

"Step 142: Click on crPaginator object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/crPaginator_object'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 142-Click on crPaginator object.png')

"Step 143: Click on crPaginator object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/crPaginator_object'))

// WebUI.takeScreenshot(reportLocation + '/TC155/Step 143-Click on crPaginator object - Navigate to page .png')

"Step 144: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC155-Navigate and Manage Studies with Super User Actions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}