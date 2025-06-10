import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.approveTestCheckboxes
import truetest.Tracking_Environment.common.manageSiteAssessmentsForStudy
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

WebUI.takeScreenshot(reportLocation + '/TC34/Step 2-Click on button selectStudyOrOrganization.png')

"Step 3: Click on button studyActions (imgUp6) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': button_studyActions_internalText, 'button_studyActions_liNthOfType': button_studyActions_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 3-Click on button studyActions imgUp6 - Navigate to page studiesdashboard.png')

"Step 4: Click on link studyLinks (mySite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 4-Click on link studyLinks mySite2.png')

"Step 5: Click on button siteManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteManagement'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 5-Click on button siteManagement.png')

"Step 6: Click on span siteNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_siteNumber'))

// WebUI.takeScreenshot(reportLocation + '/TC34/Step 6-Click on span siteNumber.png')

"Step 7: Click on button addNewEquipment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_addNewEquipment'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 7-Click on button addNewEquipment.png')

"Step 8: Click on button addNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_addNew'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 8-Click on button addNew.png')

"Step 9: Click on input equipmentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_equipmentName'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 9-Click on input equipmentName.png')

"Step 10: Enter input value in input equipmentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_equipmentName'), input_equipmentName)

WebUI.takeScreenshot(reportLocation + '/TC34/Step 10-Enter input value in input equipmentName.png')

"Step 11: Press key Tab on input equipmentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_equipmentName'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 11-Press key Tab on input equipmentName.png')

"Step 12: Click on input model"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_model'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 12-Click on input model.png')

"Step 13: Enter input value in input model"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_model'), input_model)

WebUI.takeScreenshot(reportLocation + '/TC34/Step 13-Enter input value in input model.png')

"Step 14: Click on input manufacturer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_manufacturer'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 14-Click on input manufacturer.png')

"Step 15: Enter input value in input manufacturer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_manufacturer'), input_manufacturer)

WebUI.takeScreenshot(reportLocation + '/TC34/Step 15-Enter input value in input manufacturer.png')

"Step 16: Click on input softwareVersion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_softwareVersion'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 16-Click on input softwareVersion.png')

"Step 17: Enter input value in input softwareVersion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_softwareVersion'), input_softwareVersion)

WebUI.takeScreenshot(reportLocation + '/TC34/Step 17-Enter input value in input softwareVersion.png')

"Step 18: Click on faIcon openCalendar5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar5'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 18-Click on faIcon openCalendar5.png')

"Step 19: Click on button dateTimeSelection (dateTime5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 19-Click on button dateTimeSelection dateTime5.png')

"Step 20: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 20-Click on button next3.png')

"Step 21: Click on input deviceLocation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_deviceLocation'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 21-Click on input deviceLocation.png')

"Step 22: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 22-Click on button next3.png')

"Step 23: Click on button submit5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit5'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 23-Click on button submit5.png')

"Step 24: Click on button ok -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 24-Click on button ok - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 25: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC34/Step 25-Click on html object.png')

"Step 26: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC34/Step 26-Click on html object.png')

"Step 27: Click on button siteServiceRoles (siteAdmin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles', ['button_siteServiceRoles_internalHasText': button_siteServiceRoles_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 27-Click on button siteServiceRoles siteAdmin.png')

"Step 28: Click on link logout -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 28-Click on link logout - Navigate to page dashboard.png')

"Step 29: Click on button administration2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration2'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 29-Click on button administration2.png')

"Step 30: Click on link sites3 -> Navigate to page '/siteservice-service/site-overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_sites3'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 30-Click on link sites3 - Navigate to page siteservice-servicesite-overview.png')

"Step 31: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/siteservice-service/site-overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_siteservice_service_site_overview/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 31-Click on button selectStudyOrOrganization.png')

"Step 32: Select checkboxes and approve the test through confirmation."

approveTestCheckboxes.execute(data_path_0, Integer.valueOf(index_0))

"Step 33: Click on button siteServiceRoles (superUser)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles', ['button_siteServiceRoles_internalHasText': button_siteServiceRoles_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 33-Click on button siteServiceRoles superUser.png')

"Step 34: Click on link logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 34-Click on link logout.png')

"Step 35: Manage site assessments for selected study"

manageSiteAssessmentsForStudy.execute(data_path_1, Integer.valueOf(index_1))

"Step 36: Click on button selectFiles"

WebUI.switchToWindowTitle('Upload Task')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_selectFiles'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 36-Click on button selectFiles.png')

"Step 37: Click on button next2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_next2'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 37-Click on button next2.png')

"Step 38: Click on input groupQuestion1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/input_groupQuestion1'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 38-Click on input groupQuestion1.png')

"Step 39: Click on input groupQuestion2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/input_groupQuestion2'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 39-Click on input groupQuestion2.png')

"Step 40: Click on button next2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_next2'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 40-Click on button next2.png')

"Step 41: Click on input basicTextQuestion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/input_basicTextQuestion'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 41-Click on input basicTextQuestion.png')

"Step 42: Enter input value in input basicTextQuestion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/input_basicTextQuestion'), input_basicTextQuestion)

WebUI.takeScreenshot(reportLocation + '/TC34/Step 42-Enter input value in input basicTextQuestion.png')

"Step 43: Click on button next2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_next2'))

WebUI.switchToWindowIndex(0)

WebUI.takeScreenshot(reportLocation + '/TC34/Step 43-Click on button next2 - Navigate to page .png')

"Step 44: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC34-Add New Equipment and Manage Site Assessments_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}