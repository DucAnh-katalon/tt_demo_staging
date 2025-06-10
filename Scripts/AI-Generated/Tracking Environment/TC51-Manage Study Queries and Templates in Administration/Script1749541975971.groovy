import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.createStudyQuery
import truetest.Tracking_Environment.common.searchAndApplyFiltersOnStudiesDashboard
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

"Step 2: Click on button administration2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration2'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 2-Click on button administration2.png')

"Step 3: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 3-Click on button selectStudyOrOrganization.png')

"Step 4: Click on button studyActions (testStudyForDcrquery2) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 4-Click on button studyActions testStudyForDcrquery2 - Navigate to page studiesdashboard.png')

"Step 5: Click on list quicklink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/list_quicklink'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 5-Click on list quicklink.png')

"Step 6: Click on button administration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_administration'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 6-Click on button administration.png')

"Step 7: Click on link studyLinks (studySettings3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks_1', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 7-Click on link studyLinks studySettings3.png')

"Step 8: Click on button addException"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_addException'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 8-Click on button addException.png')

"Step 9: Click on input overrideTatQueries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_overrideTatQueries'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 9-Click on input overrideTatQueries.png')

"Step 10: Click on input overrideTatQueries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_overrideTatQueries'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 10-Click on input overrideTatQueries.png')

"Step 11: Enter input value in input overrideTatQueries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_overrideTatQueries'), input_overrideTatQueries)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 11-Enter input value in input overrideTatQueries.png')

"Step 12: Click on input overrideTatQualityNotifications -> Navigate to page '/studies/*/query-settings'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_overrideTatQualityNotifications'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 12-Click on input overrideTatQualityNotifications - Navigate to page studiesquery-settings.png')

"Step 13: Click on div pageHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_query_settings/div_pageHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 13-Click on div pageHeader.png')

"Step 14: Click on link dynamicObject (testStudyForDcrquery) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/query-settings?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_query_settings/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_query_settings/link_dynamicObject', ['link_dynamicObject_internalText': link_dynamicObject_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 14-Click on link dynamicObject testStudyForDcrquery - Navigate to page studiesdashboard.png')

"Step 15: Click on link studyLinks (qualityControl2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_1, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable_1, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 15-Click on link studyLinks qualityControl2.png')

"Step 16: Click on faIcon object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object7'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 16-Click on faIcon object7.png')

"Step 17: Click on link openWorkitems (open2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_openWorkitems"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_openWorkitems', ['link_openWorkitems_dataTestid': link_openWorkitems_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 17-Click on link openWorkitems open2.png')

"Step 18: Click on button createQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_createQuery'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 18-Click on button createQuery.png')

"Step 19: Click on button createQuery2 -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_createQuery2'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 19-Click on button createQuery2 - Navigate to page dashboard.png')

"Step 20: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 20-Click on button superUser.png')

"Step 21: Click on link logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 21-Click on link logout.png')

"Step 22: Click on button administration2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration2'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 22-Click on button administration2.png')

"Step 23: Click on link templateLinks (templates)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks', ['link_templateLinks_aTitle': link_templateLinks_aTitle]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 23-Click on link templateLinks templates.png')

"Step 24: Click on button createNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_createNew'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 24-Click on button createNew.png')

"Step 25: Select option with input value from select category"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_category'), select_category)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 25-Select option with input value from select category.png')

"Step 26: Select option with input value from select businessLine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_businessLine'), select_businessLine)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 26-Select option with input value from select businessLine.png')

"Step 27: Select option with input value from select creator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_creator'), select_creator)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 27-Select option with input value from select creator.png')

"Step 28: Select option with input value from select recipient"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_recipient'), select_recipient)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 28-Select option with input value from select recipient.png')

"Step 29: Select option with input value from select level"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_level'), select_level)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 29-Select option with input value from select level.png')

"Step 30: Click on input type2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type2'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 30-Click on input type2.png')

"Step 31: Enter input value in input type2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type2'), input_type2)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 31-Enter input value in input type2.png')

"Step 32: Click on crModalBody object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/crModalBody_object'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 32-Click on crModalBody object.png')

"Step 33: Click on textarea description2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description2'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 33-Click on textarea description2.png')

"Step 34: Enter input value in textarea description2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description2'), textarea_description2)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 34-Enter input value in textarea description2.png')

"Step 35: Click on textarea suggestedResolution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 35-Click on textarea suggestedResolution.png')

"Step 36: Enter input value in textarea suggestedResolution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution'), textarea_suggestedResolution)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 36-Enter input value in textarea suggestedResolution.png')

"Step 37: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 37-Click on button save.png')

"Step 38: Click on input type2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type2'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 38-Click on input type2.png')

"Step 39: Enter input value in input type2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type2'), input_type2_1)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 39-Enter input value in input type2.png')

"Step 40: Click on textarea description2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description2'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 40-Click on textarea description2.png')

"Step 41: Enter input value in textarea description2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description2'), textarea_description2_1)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 41-Enter input value in textarea description2.png')

"Step 42: Click on textarea suggestedResolution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 42-Click on textarea suggestedResolution.png')

"Step 43: Enter input value in textarea suggestedResolution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution'), textarea_suggestedResolution_1)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 43-Enter input value in textarea suggestedResolution.png')

"Step 44: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 44-Click on button save.png')

"Step 45: Click on faIcon object2 -> Navigate to page '/query-template'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_object2'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 45-Click on faIcon object2 - Navigate to page query-template.png')

"Step 46: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_query_template/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 46-Click on button selectStudyOrOrganization.png')

"Step 47: Click on button testStudyForDcrquery -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_query_template/button_testStudyForDcrquery'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 47-Click on button testStudyForDcrquery - Navigate to page studiesdashboard.png')

"Step 48: Click on link studyLinks (qualityControl2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_2, 'link_studyLinks_class': link_studyLinks_class_1, 'link_studyLinks_href_variable': link_studyLinks_href_variable_2, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 48-Click on link studyLinks qualityControl2.png')

"Step 49: Click on div siteIdCell"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_siteIdCell'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 49-Click on div siteIdCell.png')

"Step 50: Click on div siteIdCell"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_siteIdCell'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 50-Click on div siteIdCell.png')

"Step 51: Click on button createQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_createQuery'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 51-Click on button createQuery.png')

"Step 52: Click on button createQuery2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_createQuery2'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 52-Click on button createQuery2.png')

"Step 53: Click on div mainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_mainContent'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 53-Click on div mainContent.png')

"Step 54: Click on faIcon object6 -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object6'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 54-Click on faIcon object6 - Navigate to page dashboard.png')

"Step 55: Click on button administration2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration2'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 55-Click on button administration2.png')

"Step 56: Click on link templateLinks (templates)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks', ['link_templateLinks_aTitle': link_templateLinks_aTitle_1]))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 56-Click on link templateLinks templates.png')

"Step 57: Click on button createNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_createNew'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 57-Click on button createNew.png')

"Step 58: Select option with input value from select category"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_category'), select_category_1)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 58-Select option with input value from select category.png')

"Step 59: Select option with input value from select businessLine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_businessLine'), select_businessLine_1)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 59-Select option with input value from select businessLine.png')

"Step 60: Select option with input value from select creator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_creator'), select_creator_1)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 60-Select option with input value from select creator.png')

"Step 61: Select option with input value from select recipient"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_recipient'), select_recipient_1)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 61-Select option with input value from select recipient.png')

"Step 62: Select option with input value from select level"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_level'), select_level_1)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 62-Select option with input value from select level.png')

"Step 63: Click on input type3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type3'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 63-Click on input type3.png')

"Step 64: Enter input value in input type3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type3'), input_type3)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 64-Enter input value in input type3.png')

"Step 65: Click on crModalBody object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/crModalBody_object'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 65-Click on crModalBody object2.png')

"Step 66: Click on textarea description3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description3'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 66-Click on textarea description3.png')

"Step 67: Enter input value in textarea description3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description3'), textarea_description3)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 67-Enter input value in textarea description3.png')

"Step 68: Click on textarea suggestedResolution2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution2'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 68-Click on textarea suggestedResolution2.png')

"Step 69: Enter input value in textarea suggestedResolution2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution2'), textarea_suggestedResolution2)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 69-Enter input value in textarea suggestedResolution2.png')

"Step 70: Click on crModalBody object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/crModalBody_object'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 70-Click on crModalBody object2.png')

"Step 71: Select option with input value from select isEnabled"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_isEnabled'), select_isEnabled)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 71-Select option with input value from select isEnabled.png')

"Step 72: Click on button save -> Navigate to page '/query-template'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 72-Click on button save - Navigate to page query-template.png')

"Step 73: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_query_template/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 73-Click on button selectStudyOrOrganization.png')

"Step 74: Click on button testStudyForDcrquery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_query_template/button_testStudyForDcrquery'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 74-Click on button testStudyForDcrquery.png')

"Step 75: Create a query for a study by selecting study codes."

createStudyQuery.execute(data_path_0, Integer.valueOf(index_0))

"Step 76: Select option with input value from select typeValue2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_typeValue2'), select_typeValue2)

WebUI.takeScreenshot(reportLocation + '/TC51/Step 76-Select option with input value from select typeValue2.png')

"Step 77: Click on crModalBody object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/crModalBody_object'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 77-Click on crModalBody object.png')

"Step 78: Click on button submit2 -> Navigate to page '/studies/*/qc-worklist/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit2'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 78-Click on button submit2 - Navigate to page studiesqc-worklist.png')

"Step 79: Click on div studyHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/div_studyHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 79-Click on div studyHeader.png')

"Step 80: Click on div queriesContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/div_queriesContent'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 80-Click on div queriesContent.png')

"Step 81: Click on div queriesContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/div_queriesContent'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 81-Click on div queriesContent.png')

"Step 82: Click on div queriesContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/div_queriesContent'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 82-Click on div queriesContent.png')

"Step 83: Click on div queriesContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/div_queriesContent'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 83-Click on div queriesContent2.png')

"Step 84: Click on span abcKatalonAitrueTest4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/span_abcKatalonAitrueTest4'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 84-Click on span abcKatalonAitrueTest4.png')

"Step 85: Click on span abcKatalonAitrueTest4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/span_abcKatalonAitrueTest4'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 85-Click on span abcKatalonAitrueTest4.png')

"Step 86: Click on div studyDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/div_studyDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 86-Click on div studyDetails.png')

"Step 87: Click on span viewQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/span_viewQuery'))

// WebUI.takeScreenshot(reportLocation + '/TC51/Step 87-Click on span viewQuery.png')

"Step 88: Click on faIcon object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/faIcon_object'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 88-Click on faIcon object.png')

"Step 89: Search and apply filters on studies dashboard"

searchAndApplyFiltersOnStudiesDashboard.execute(data_path_1, Integer.valueOf(index_1))

"Step 90: Click on faIcon object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object8'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 90-Click on faIcon object8.png')

"Step 91: Click on link view2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_view2'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 91-Click on link view2.png')

"Step 92: Click on faIcon object9 -> Navigate to page '/studies/*/queries'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object9'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 92-Click on faIcon object9 - Navigate to page studiesqueries.png')

"Step 93: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 93-Click on button superUser.png')

"Step 94: Click on link logout -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC51/Step 94-Click on link logout - Navigate to page .png')

"Step 95: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC51-Manage Study Queries and Templates in Administration_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}