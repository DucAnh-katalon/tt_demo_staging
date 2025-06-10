import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /studies/*/dashboard"

TrueTestScripts.navigate("/studies/${studies_id}/dashboard")

"Step 2: Click on link studyLinks (queries)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 2-Click on link studyLinks queries.png')

"Step 3: Click on input searchAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_searchAll'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 3-Click on input searchAll.png')

"Step 4: Select option with input value from select searchAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_searchAll'), select_searchAll)

WebUI.takeScreenshot(reportLocation + '/TC18/Step 4-Select option with input value from select searchAll.png')

"Step 5: Click on input id"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_id'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 5-Click on input id.png')

"Step 6: Enter input value in input id"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_id'), input_id)

WebUI.takeScreenshot(reportLocation + '/TC18/Step 6-Enter input value in input id.png')

"Step 7: Press key Enter on input id"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_id'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 7-Press key Enter on input id.png')

"Step 8: Enter input value in input id"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_id'), input_id_1)

WebUI.takeScreenshot(reportLocation + '/TC18/Step 8-Enter input value in input id.png')

"Step 9: Click on input id"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_id'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 9-Click on input id.png')

"Step 10: Enter input value in input id"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_id'), input_id_2)

WebUI.takeScreenshot(reportLocation + '/TC18/Step 10-Enter input value in input id.png')

"Step 11: Enter input value in input id"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_id'), input_id_3)

WebUI.takeScreenshot(reportLocation + '/TC18/Step 11-Enter input value in input id.png')

"Step 12: Click on faIcon object -> Navigate to page '/studies/*/queries'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 12-Click on faIcon object - Navigate to page studiesqueries.png')

"Step 13: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC18/Step 13-Click on html object.png')

"Step 14: Click on faIcon next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/faIcon_next'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 14-Click on faIcon next.png')

"Step 15: Click on div tableCellQry"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/div_tableCellQry'))

// WebUI.takeScreenshot(reportLocation + '/TC18/Step 15-Click on div tableCellQry.png')

"Step 16: Click on faIcon action"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/faIcon_action'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 16-Click on faIcon action.png')

"Step 17: Click on link view"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/link_view'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 17-Click on link view.png')

"Step 18: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 18-Click on button object.png')

"Step 19: Click on appQueries object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/appQueries_object'))

// WebUI.takeScreenshot(reportLocation + '/TC18/Step 19-Click on appQueries object.png')

"Step 20: Click on html object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC18/Step 20-Click on html object2.png')

"Step 21: Click on link jelenaExams1 -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/queries?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/link_jelenaExams1'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 21-Click on link jelenaExams1 - Navigate to page studiesdashboard.png')

"Step 22: Click on link studyLinks (queries)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_1, 'link_studyLinks_class': link_studyLinks_class_1, 'link_studyLinks_href_variable': link_studyLinks_href_variable_1, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 22-Click on link studyLinks queries.png')

"Step 23: Click on link object -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 23-Click on link object - Navigate to page dashboard.png')

"Step 24: Click on button administration2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration2'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 24-Click on button administration2.png')

"Step 25: Click on link templateLinks (templates)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks', ['link_templateLinks_aTitle': link_templateLinks_aTitle]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 25-Click on link templateLinks templates.png')

"Step 26: Click on button createNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_createNew'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 26-Click on button createNew.png')

"Step 27: Click on faIcon dismiss"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_dismiss'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 27-Click on faIcon dismiss.png')

"Step 28: Click on faIcon object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_object'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 28-Click on faIcon object.png')

"Step 29: Click on link viewActions (duplicate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_viewActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_viewActions', ['link_viewActions_internalHasText': link_viewActions_internalHasText, 'link_viewActions_liNthOfType': link_viewActions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 29-Click on link viewActions duplicate.png')

"Step 30: Click on textarea description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 30-Click on textarea description.png')

"Step 31: Enter input value in textarea description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description'), textarea_description)

WebUI.takeScreenshot(reportLocation + '/TC18/Step 31-Enter input value in textarea description.png')

"Step 32: Click on input type"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_type'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 32-Click on input type.png')

"Step 33: Click on textarea description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_description'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 33-Click on textarea description.png')

"Step 34: Click on button save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_save'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 34-Click on button save.png')

"Step 35: Click on div description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/div_description'))

// WebUI.takeScreenshot(reportLocation + '/TC18/Step 35-Click on div description.png')

"Step 36: Click on td description -> Navigate to page '/query-template'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/td_description'))

// WebUI.takeScreenshot(reportLocation + '/TC18/Step 36-Click on td description - Navigate to page query-template.png')

"Step 37: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_query_template/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 37-Click on link home - Navigate to page dashboard.png')

"Step 38: Click on button administration2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration2'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 38-Click on button administration2.png')

"Step 39: Click on link sites2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_sites2'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 39-Click on link sites2.png')

"Step 40: Click on button administration2 -> Navigate to page '/siteservice-service'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration2'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 40-Click on button administration2 - Navigate to page siteservice-service.png')

"Step 41: Click on main homeSites"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/siteservice-service?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_siteservice_service/main_homeSites'))

// WebUI.takeScreenshot(reportLocation + '/TC18/Step 41-Click on main homeSites.png')

"Step 42: Click on input textFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/siteservice-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_siteservice_service/input_textFilter'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 42-Click on input textFilter.png')

"Step 43: Enter input value in input textFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/siteservice-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_siteservice_service/input_textFilter'), input_textFilter)

WebUI.takeScreenshot(reportLocation + '/TC18/Step 43-Enter input value in input textFilter.png')

"Step 44: Click on button apply -> Navigate to page '/siteservice-service/site-overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/siteservice-service?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_siteservice_service/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 44-Click on button apply - Navigate to page siteservice-servicesite-overview.png')

"Step 45: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/siteservice-service/site-overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_siteservice_service_site_overview/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 45-Click on button superUser.png')

"Step 46: Click on link logout -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/siteservice-service/site-overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_siteservice_service_site_overview/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC18/Step 46-Click on link logout - Navigate to page .png')

"Step 47: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC18-Create and Manage Query Templates in Studies Dashboard_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}