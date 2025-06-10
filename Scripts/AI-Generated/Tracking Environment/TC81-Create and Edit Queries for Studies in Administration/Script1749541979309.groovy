import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.adminLogoutAndCreateNewTemplate
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

"Step 2: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 2-Click on button close.png')

"Step 3: Click on button administration2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration2'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 3-Click on button administration2.png')

"Step 4: Click on link templateLinks (templates)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks', ['link_templateLinks_aTitle': link_templateLinks_aTitle]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 4-Click on link templateLinks templates.png')

"Step 5: Click on button createNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_createNew'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 5-Click on button createNew.png')

"Step 6: Select option with input value from select category"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_category'), select_category)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 6-Select option with input value from select category.png')

"Step 7: Select option with input value from select businessLine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_businessLine'), select_businessLine)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 7-Select option with input value from select businessLine.png')

"Step 8: Select option with input value from select creator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_creator'), select_creator)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 8-Select option with input value from select creator.png')

"Step 9: Select option with input value from select recipient"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_recipient'), select_recipient)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 9-Select option with input value from select recipient.png')

"Step 10: Select option with input value from select level"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_level'), select_level)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 10-Select option with input value from select level.png')

"Step 11: Click on div dashboardBody"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_dashboardBody'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 11-Click on div dashboardBody.png')

"Step 12: Click on input type4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type4'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 12-Click on input type4.png')

"Step 13: Enter input value in input type4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type4'), input_type4)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 13-Enter input value in input type4.png')

"Step 14: Click on crModalBody object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/crModalBody_object'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 14-Click on crModalBody object3.png')

"Step 15: Click on textarea description4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description4'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 15-Click on textarea description4.png')

"Step 16: Enter input value in textarea description4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description4'), textarea_description4)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 16-Enter input value in textarea description4.png')

"Step 17: Click on crModalBody object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/crModalBody_object'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 17-Click on crModalBody object3.png')

"Step 18: Click on textarea suggestedResolution3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution3'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 18-Click on textarea suggestedResolution3.png')

"Step 19: Enter input value in textarea suggestedResolution3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution3'), textarea_suggestedResolution3)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 19-Enter input value in textarea suggestedResolution3.png')

"Step 20: Click on crModalBody object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/crModalBody_object'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 20-Click on crModalBody object3.png')

"Step 21: Click on label sponsorNotification"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/label_sponsorNotification'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 21-Click on label sponsorNotification.png')

"Step 22: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 22-Click on button save.png')

"Step 23: Click on faIcon object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_object4'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 23-Click on faIcon object4.png')

"Step 24: Click on link viewActions (view)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_viewActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_viewActions', ['link_viewActions_internalHasText': link_viewActions_internalHasText, 'link_viewActions_liNthOfType': link_viewActions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 24-Click on link viewActions view.png')

"Step 25: Click on button edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_edit'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 25-Click on button edit.png')

"Step 26: Select option with input value from select isEnabled"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_isEnabled'), select_isEnabled)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 26-Select option with input value from select isEnabled.png')

"Step 27: Click on button save -> Navigate to page '/query-template'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 27-Click on button save - Navigate to page query-template.png')

"Step 28: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_query_template/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 28-Click on button selectStudyOrOrganization.png')

"Step 29: Click on link showMore"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_query_template/link_showMore'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 29-Click on link showMore.png')

"Step 30: Click on input filterText"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_query_template/input_filterText'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 30-Click on input filterText.png')

"Step 31: Enter input value in input filterText"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_query_template/input_filterText'), input_filterText)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 31-Enter input value in input filterText.png')

"Step 32: Press key Enter on input filterText"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_query_template/input_filterText'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 32-Press key Enter on input filterText.png')

"Step 33: Enter input value in input filterText"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_query_template/input_filterText'), input_filterText_1)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 33-Enter input value in input filterText.png')

"Step 34: Click on span studyProtocol -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_query_template/span_studyProtocol'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 34-Click on span studyProtocol - Navigate to page studiesdashboard.png')

"Step 35: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 35-Click on button close.png')

"Step 36: Create a query for a study by selecting study codes."

createStudyQuery.execute(data_path_0, Integer.valueOf(index_0))

"Step 37: Select option with input value from select typeValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_typeValue2'), select_typeValue)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 37-Select option with input value from select typeValue.png')

"Step 38: Enter input value in div test"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_test'), div_test)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 38-Enter input value in div test.png')

"Step 39: Click on button submit2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit2'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 39-Click on button submit2.png')

"Step 40: Click on div queriesContent4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_queriesContent4'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 40-Click on div queriesContent4.png')

"Step 41: Click on span queryTitles (queryTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_queryTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_queryTitles', ['span_queryTitles_appQcWorkItemQueryNthChild': span_queryTitles_appQcWorkItemQueryNthChild, 'span_queryTitles_appQcWorkItemQueryNthOfType': span_queryTitles_appQcWorkItemQueryNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 41-Click on span queryTitles queryTitle.png')

"Step 42: Click on span queryTitles (queryTitle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_queryTitles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_queryTitles', ['span_queryTitles_appQcWorkItemQueryNthChild': span_queryTitles_appQcWorkItemQueryNthChild_1, 'span_queryTitles_appQcWorkItemQueryNthOfType': span_queryTitles_appQcWorkItemQueryNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 42-Click on span queryTitles queryTitle.png')

"Step 43: Click on span viewQuery2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_viewQuery2'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 43-Click on span viewQuery2.png')

"Step 44: Click on button action3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_action3'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 44-Click on button action3.png')

"Step 45: Search and apply filters on studies dashboard"

searchAndApplyFiltersOnStudiesDashboard.execute(data_path_1, Integer.valueOf(index_1))

"Step 46: Click on faIcon object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object8'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 46-Click on faIcon object8.png')

"Step 47: Click on link view3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_view3'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 47-Click on link view3.png')

"Step 48: Click on faIcon object9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object9'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 48-Click on faIcon object9.png')

"Step 49: Logout as super user and create a new template in administration"

adminLogoutAndCreateNewTemplate.execute(data_path_2, Integer.valueOf(index_2))

"Step 50: Select option with input value from select isEnabled"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_isEnabled'), select_isEnabled_1)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 50-Select option with input value from select isEnabled.png')

"Step 51: Select option with input value from select category"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_category'), select_category_1)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 51-Select option with input value from select category.png')

"Step 52: Select option with input value from select businessLine"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_businessLine'), select_businessLine_1)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 52-Select option with input value from select businessLine.png')

"Step 53: Select option with input value from select creator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_creator'), select_creator_1)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 53-Select option with input value from select creator.png')

"Step 54: Select option with input value from select recipient"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_recipient'), select_recipient_1)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 54-Select option with input value from select recipient.png')

"Step 55: Select option with input value from select level"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_level'), select_level_1)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 55-Select option with input value from select level.png')

"Step 56: Click on input type5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type5'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 56-Click on input type5.png')

"Step 57: Enter input value in input type5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type5'), input_type5)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 57-Enter input value in input type5.png')

"Step 58: Click on crModalBody object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/crModalBody_object'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 58-Click on crModalBody object4.png')

"Step 59: Click on input type5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type5'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 59-Click on input type5.png')

"Step 60: Enter input value in input type5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type5'), input_type5_1)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 60-Enter input value in input type5.png')

"Step 61: Click on textarea description5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description5'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 61-Click on textarea description5.png')

"Step 62: Enter input value in textarea description5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description5'), textarea_description5)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 62-Enter input value in textarea description5.png')

"Step 63: Click on crModalBody object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/crModalBody_object'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 63-Click on crModalBody object4.png')

"Step 64: Click on textarea suggestedResolution4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution4'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 64-Click on textarea suggestedResolution4.png')

"Step 65: Enter input value in textarea suggestedResolution4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_suggestedResolution4'), textarea_suggestedResolution4)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 65-Enter input value in textarea suggestedResolution4.png')

"Step 66: Click on label sponsorNotification"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/label_sponsorNotification'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 66-Click on label sponsorNotification.png')

"Step 67: Click on crModalBody object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/crModalBody_object'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 67-Click on crModalBody object4.png')

"Step 68: Click on button save -> Navigate to page '/query-template'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 68-Click on button save - Navigate to page query-template.png')

"Step 69: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_query_template/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 69-Click on button selectStudyOrOrganization.png')

"Step 70: Click on button testStudyForDcrquery2 -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_query_template/button_testStudyForDcrquery'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 70-Click on button testStudyForDcrquery2 - Navigate to page studiesdashboard.png')

"Step 71: Click on link studyLinks (qualityControl)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 71-Click on link studyLinks qualityControl.png')

"Step 72: Click on faIcon actionMenu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_actionMenu'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 72-Click on faIcon actionMenu.png')

"Step 73: Click on link openWorkitems (open2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_openWorkitems"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_openWorkitems', ['link_openWorkitems_dataTestid': link_openWorkitems_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 73-Click on link openWorkitems open2.png')

"Step 74: Click on button createQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_createQuery'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 74-Click on button createQuery.png')

"Step 75: Click on button createQuery2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_createQuery2'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 75-Click on button createQuery2.png')

"Step 76: Select option with input value from select typeValue4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_typeValue2'), select_typeValue4)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 76-Select option with input value from select typeValue4.png')

"Step 77: Click on span enterDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_enterDescription'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 77-Click on span enterDescription.png')

"Step 78: Click on button submit2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit2'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 78-Click on button submit2.png')

"Step 79: Enter input value in div test"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_test'), div_test_1)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 79-Enter input value in div test.png')

"Step 80: Click on div queriesContent5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_queriesContent4'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 80-Click on div queriesContent5.png')

"Step 81: Click on div queriesContent6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_queriesContent4'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 81-Click on div queriesContent6.png')

"Step 82: Click on div abcTrueTestAi"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_abcTrueTestAi'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 82-Click on div abcTrueTestAi.png')

"Step 83: Click on div abcTrueTestAi"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_abcTrueTestAi'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 83-Click on div abcTrueTestAi.png')

"Step 84: Click on span viewQueryDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_viewQueryDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 84-Click on span viewQueryDetails.png')

"Step 85: Click on faIcon object5 -> Navigate to page '/studies/*/qc-worklist/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object5'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 85-Click on faIcon object5 - Navigate to page studiesqc-worklist.png')

"Step 86: Click on link testStudyForDcrquery -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/link_testStudyForDcrquery'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 86-Click on link testStudyForDcrquery - Navigate to page studiesdashboard.png')

"Step 87: Click on link studyLinks (queries3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_1, 'link_studyLinks_class': link_studyLinks_class_1, 'link_studyLinks_href_variable': link_studyLinks_href_variable_1, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 87-Click on link studyLinks queries3.png')

"Step 88: Click on input searchAll2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_searchAll2'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 88-Click on input searchAll2.png')

"Step 89: Enter input value in input searchAll2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_searchAll2'), input_searchAll2)

WebUI.takeScreenshot(reportLocation + '/TC81/Step 89-Enter input value in input searchAll2.png')

"Step 90: Click on button apply -> Navigate to page '/studies/*/queries'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 90-Click on button apply - Navigate to page studiesqueries.png')

"Step 91: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 91-Click on button superUser.png')

"Step 92: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 92-Click on link logout - Navigate to page dashboard.png')

"Step 93: Click on button libraries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_libraries'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 93-Click on button libraries.png')

"Step 94: Click on button administration2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration2'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 94-Click on button administration2.png')

"Step 95: Click on link templates3 -> Navigate to page '/studies/*/qc-worklist/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_templates3'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 95-Click on link templates3 - Navigate to page studiesqc-worklist.png')

"Step 96: Click on button goBackToGlobalDashboard -> Navigate to page '/gateway'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/button_goBackToGlobalDashboard'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 96-Click on button goBackToGlobalDashboard - Navigate to page gateway.png')

"Step 97: Click on div suspendedOpen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/div_suspendedOpen'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 97-Click on div suspendedOpen.png')

"Step 98: Click on div suspendedOpen"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/div_suspendedOpen'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 98-Click on div suspendedOpen.png')

"Step 99: Click on faIcon object -> Navigate to page '/studies/*/qc-worklist/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/faIcon_object'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 99-Click on faIcon object - Navigate to page studiesqc-worklist.png')

"Step 100: Click on div homeJelenaExamsQualityControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/div_homeJelenaExamsQualityControl'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 100-Click on div homeJelenaExamsQualityControl.png')

"Step 101: Click on div baselineCt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/div_baselineCt'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 101-Click on div baselineCt.png')

"Step 102: Click on div baselineCt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/div_baselineCt'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 102-Click on div baselineCt.png')

"Step 103: Click on div baselineCt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/div_baselineCt'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 103-Click on div baselineCt.png')

"Step 104: Click on div baselineCt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/div_baselineCt'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 104-Click on div baselineCt.png')

"Step 105: Click on div baselineCt -> Navigate to page '/gateway'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/qc-worklist/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_qc_worklist/div_baselineCt'))

// WebUI.takeScreenshot(reportLocation + '/TC81/Step 105-Click on div baselineCt - Navigate to page gateway.png')

"Step 106: Click on button goBackToGlobalDashboard -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/button_goBackToGlobalDashboard'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 106-Click on button goBackToGlobalDashboard - Navigate to page dashboard.png')

"Step 107: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 107-Click on button close.png')

"Step 108: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 108-Click on button selectStudyOrOrganization.png')

"Step 109: Click on button studyActions (testStudyForDcrquery) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 109-Click on button studyActions testStudyForDcrquery - Navigate to page studiesdashboard.png')

"Step 110: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 110-Click on button close.png')

"Step 111: Click on link studyLinks (uploader3) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_2, 'link_studyLinks_class': link_studyLinks_class_2, 'link_studyLinks_href_variable': link_studyLinks_href_variable_2, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC81/Step 111-Click on link studyLinks uploader3 - Navigate to page .png')

"Step 112: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC81-Create and Edit Queries for Studies in Administration_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}