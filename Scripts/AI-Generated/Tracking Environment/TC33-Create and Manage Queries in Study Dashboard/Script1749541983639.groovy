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

"Step 2: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 2-Click on button close.png')

"Step 3: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 3-Click on button selectStudyOrOrganization.png')

"Step 4: Click on button studyActions (testStudyForDcrquery) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 4-Click on button studyActions testStudyForDcrquery - Navigate to page studiesdashboard.png')

"Step 5: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 5-Click on button close.png')

"Step 6: Click on link studyLinks (qualityControl)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 6-Click on link studyLinks qualityControl.png')

"Step 7: Click on td siteSubjectIds (siteId)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_siteSubjectIds"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_siteSubjectIds', ['td_siteSubjectIds_tdNthChild': td_siteSubjectIds_tdNthChild, 'td_siteSubjectIds_tdNthOfType': td_siteSubjectIds_tdNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 7-Click on td siteSubjectIds siteId.png')

"Step 8: Click on td siteSubjectIds (siteId)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_siteSubjectIds"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_siteSubjectIds', ['td_siteSubjectIds_tdNthChild': td_siteSubjectIds_tdNthChild_1, 'td_siteSubjectIds_tdNthOfType': td_siteSubjectIds_tdNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 8-Click on td siteSubjectIds siteId.png')

"Step 9: Click on button createQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_createQuery'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 9-Click on button createQuery.png')

"Step 10: Click on button createQuery2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_createQuery2'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 10-Click on button createQuery2.png')

"Step 11: Select option with input value from select typeValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_typeValue2'), select_typeValue)

WebUI.takeScreenshot(reportLocation + '/TC33/Step 11-Select option with input value from select typeValue.png')

"Step 12: Enter input value in div textboxTestAiflowUserJourney"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_test'), div_textboxTestAiflowUserJourney)

WebUI.takeScreenshot(reportLocation + '/TC33/Step 12-Enter input value in div textboxTestAiflowUserJourney.png')

"Step 13: Click on crModalBody studyDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/crModalBody_object'))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 13-Click on crModalBody studyDetails.png')

"Step 14: Select option with input value from select description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_description'), select_description)

WebUI.takeScreenshot(reportLocation + '/TC33/Step 14-Select option with input value from select description.png')

"Step 15: Click on button submit2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit2'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 15-Click on button submit2.png')

"Step 16: Click on div queriesContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_queriesContent4'))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 16-Click on div queriesContent.png')

"Step 17: Click on div queriesContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_queriesContent4'))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 17-Click on div queriesContent2.png')

"Step 18: Click on span queryTitles (queryCardTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_queryTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_queryTitles', ['span_queryTitles_appQcWorkItemQueryNthChild': span_queryTitles_appQcWorkItemQueryNthChild, 'span_queryTitles_appQcWorkItemQueryNthOfType': span_queryTitles_appQcWorkItemQueryNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 18-Click on span queryTitles queryCardTitle.png')

"Step 19: Click on span queryTitles (queryCardTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_queryTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_queryTitles', ['span_queryTitles_appQcWorkItemQueryNthChild': span_queryTitles_appQcWorkItemQueryNthChild_1, 'span_queryTitles_appQcWorkItemQueryNthOfType': span_queryTitles_appQcWorkItemQueryNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 19-Click on span queryTitles queryCardTitle.png')

"Step 20: Click on span viewQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_viewQuery'))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 20-Click on span viewQuery.png')

"Step 21: Click on faIcon object5 -> Navigate to page '/studies/*/qc-worklist/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object5'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 21-Click on faIcon object5 - Navigate to page studiesqc-worklist.png')

"Step 22: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 22-Click on button superUser.png')

"Step 23: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/link_logout2'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 23-Click on link logout - Navigate to page dashboard.png')

"Step 24: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 24-Click on button close.png')

"Step 25: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 25-Click on button selectStudyOrOrganization.png')

"Step 26: Click on button studyActions (testStudyForDcrquery) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText_1, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 26-Click on button studyActions testStudyForDcrquery - Navigate to page studiesdashboard.png')

"Step 27: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 27-Click on button close.png')

"Step 28: Click on link uploader2 -> Navigate to page '/studies/*/data-uploader'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_uploader2'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 28-Click on link uploader2 - Navigate to page studiesdata-uploader.png')

"Step 29: Click on link dynamicObject (testStudyForDcrquery) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_data_uploader/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_data_uploader/link_dynamicObject', ['link_dynamicObject_internalText': link_dynamicObject_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 29-Click on link dynamicObject testStudyForDcrquery - Navigate to page studiesdashboard.png')

"Step 30: Click on link studyLinks (queries2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_1, 'link_studyLinks_class': link_studyLinks_class_1, 'link_studyLinks_href_variable': link_studyLinks_href_variable_1, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 30-Click on link studyLinks queries2.png')

"Step 31: Click on input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 31-Click on input search.png')

"Step 32: Enter input value in input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_search'), input_search)

WebUI.takeScreenshot(reportLocation + '/TC33/Step 32-Enter input value in input search.png')

"Step 33: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 33-Click on button apply.png')

"Step 34: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 34-Click on button object2.png')

"Step 35: Click on link view"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_view'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 35-Click on link view.png')

"Step 36: Click on textarea typeHere"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_typeHere'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 36-Click on textarea typeHere.png')

"Step 37: Enter input value in textarea typeHere"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_typeHere'), textarea_typeHere)

WebUI.takeScreenshot(reportLocation + '/TC33/Step 37-Enter input value in textarea typeHere.png')

"Step 38: Click on button submit3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit3'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 38-Click on button submit3.png')

"Step 39: Click on span status"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_status'))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 39-Click on span status.png')

"Step 40: Click on div object -> Navigate to page '/studies/*/queries'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 40-Click on div object - Navigate to page studiesqueries.png')

"Step 41: Click on button siteAdmin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/button_siteAdmin'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 41-Click on button siteAdmin.png')

"Step 42: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 42-Click on link logout - Navigate to page dashboard.png')

"Step 43: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 43-Click on button selectStudyOrOrganization.png')

"Step 44: Click on button studyActions (testStudyForDcrquery2) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText_2, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 44-Click on button studyActions testStudyForDcrquery2 - Navigate to page studiesdashboard.png')

"Step 45: Click on link studyLinks (qualityControl)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_2, 'link_studyLinks_class': link_studyLinks_class_2, 'link_studyLinks_href_variable': link_studyLinks_href_variable_2, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 45-Click on link studyLinks qualityControl.png')

"Step 46: Click on div studyCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_studyCode'))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 46-Click on div studyCode.png')

"Step 47: Click on div studyCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_studyCode'))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 47-Click on div studyCode.png')

"Step 48: Click on div queriesContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_queriesContent4'))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 48-Click on div queriesContent3.png')

"Step 49: Click on span queryTitles (abcTestTrueTestAiflow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_queryTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_queryTitles', ['span_queryTitles_appQcWorkItemQueryNthChild': span_queryTitles_appQcWorkItemQueryNthChild_2, 'span_queryTitles_appQcWorkItemQueryNthOfType': span_queryTitles_appQcWorkItemQueryNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 49-Click on span queryTitles abcTestTrueTestAiflow.png')

"Step 50: Click on span queryTitles (abcTestTrueTestAiflow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_queryTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_queryTitles', ['span_queryTitles_appQcWorkItemQueryNthChild': span_queryTitles_appQcWorkItemQueryNthChild_3, 'span_queryTitles_appQcWorkItemQueryNthOfType': span_queryTitles_appQcWorkItemQueryNthOfType_3]))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 50-Click on span queryTitles abcTestTrueTestAiflow.png')

"Step 51: Click on button action"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_action'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 51-Click on button action.png')

"Step 52: Select option with input value from select actionType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_actionType'), select_actionType)

WebUI.takeScreenshot(reportLocation + '/TC33/Step 52-Select option with input value from select actionType.png')

"Step 53: Click on textarea typeHere2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_typeHere2'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 53-Click on textarea typeHere2.png')

"Step 54: Enter input value in textarea typeHere2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_typeHere2'), textarea_typeHere2)

WebUI.takeScreenshot(reportLocation + '/TC33/Step 54-Enter input value in textarea typeHere2.png')

"Step 55: Click on button submit4 -> Navigate to page '/studies/*/qc-worklist/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit4'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 55-Click on button submit4 - Navigate to page studiesqc-worklist.png')

"Step 56: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 56-Click on button superUser.png')

"Step 57: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/link_logout2'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 57-Click on link logout - Navigate to page dashboard.png')

"Step 58: Click on button administration2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration2'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 58-Click on button administration2.png')

"Step 59: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 59-Click on button selectStudyOrOrganization.png')

"Step 60: Click on button studyActions (testStudyForDcrquery2) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText_3, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType_3]))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 60-Click on button studyActions testStudyForDcrquery2 - Navigate to page studiesdashboard.png')

"Step 61: Click on button administration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_administration'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 61-Click on button administration.png')

"Step 62: Click on link studyLinks (qualityControl)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_3, 'link_studyLinks_class': link_studyLinks_class_3, 'link_studyLinks_href_variable': link_studyLinks_href_variable_3, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_3]))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 62-Click on link studyLinks qualityControl.png')

"Step 63: Click on td expedited"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/td_expedited'))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 63-Click on td expedited.png')

"Step 64: Click on td expedited"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/td_expedited'))

// WebUI.takeScreenshot(reportLocation + '/TC33/Step 64-Click on td expedited.png')

"Step 65: Click on button createQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_createQuery'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 65-Click on button createQuery.png')

"Step 66: Click on button createQuery2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_createQuery2'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 66-Click on button createQuery2.png')

"Step 67: Click on faIcon object6 -> Navigate to page '/studies/*/qc-worklist/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object6'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 67-Click on faIcon object6 - Navigate to page studiesqc-worklist.png')

"Step 68: Click on link testStudyForDcrquery -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/link_testStudyForDcrquery'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 68-Click on link testStudyForDcrquery - Navigate to page studiesdashboard.png')

"Step 69: Click on button administration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_administration'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 69-Click on button administration.png')

"Step 70: Click on button reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_reports'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 70-Click on button reports.png')

"Step 71: Click on link object -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 71-Click on link object - Navigate to page dashboard.png')

"Step 72: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 72-Click on button selectStudyOrOrganization.png')

"Step 73: Click on button administration2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration2'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 73-Click on button administration2.png')

"Step 74: Click on link templateLinks (templates)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks', ['link_templateLinks_aTitle': link_templateLinks_aTitle]))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 74-Click on link templateLinks templates.png')

"Step 75: Click on button createNew -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_createNew'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 75-Click on button createNew - Navigate to page .png')

"Step 76: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC33-Create and Manage Queries in Study Dashboard_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}