import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.adminLogoutAndManageSiteRoles
import truetest.Tracking_Environment.common.approveTestCheckboxes
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /studies/*/siteservice-service/site-overview"

TrueTestScripts.navigate("/studies/${studies_id}/siteservice-service/site-overview")

"Step 2: Click on td siteName -> Navigate to page '/studies/*/siteservice-service/site-overview/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-overview?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_overview/td_siteName'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 2-Click on td siteName - Navigate to page studiessiteservice-servicesite-overview.png')

"Step 3: Click on link imgUp6 -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-overview/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_overview/link_imgUp6'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 3-Click on link imgUp6 - Navigate to page studiesdashboard.png')

"Step 4: Click on link studyLinks (mySite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Click on link studyLinks mySite2.png')

"Step 5: Click on button siteManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteManagement'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 5-Click on button siteManagement.png')

"Step 6: Click on td siteNumber -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/td_siteNumber'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Click on td siteNumber - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 7: Click on html object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 7-Click on html object3.png')

"Step 8: Click on button addNewEquipment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_addNewEquipment'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 8-Click on button addNewEquipment.png')

"Step 9: Click on button addNew"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_addNew'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 9-Click on button addNew.png')

"Step 10: Click on input equipmentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/input_equipmentName'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 10-Click on input equipmentName.png')

"Step 11: Enter input value in input equipmentName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/input_equipmentName'), input_equipmentName)

WebUI.takeScreenshot(reportLocation + '/TC15/Step 11-Enter input value in input equipmentName.png')

"Step 12: Click on input manufacturer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/input_manufacturer'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 12-Click on input manufacturer.png')

"Step 13: Enter input value in input manufacturer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/input_manufacturer'), input_manufacturer)

WebUI.takeScreenshot(reportLocation + '/TC15/Step 13-Enter input value in input manufacturer.png')

"Step 14: Click on input model"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/input_model'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 14-Click on input model.png')

"Step 15: Enter input value in input model"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/input_model'), input_model)

WebUI.takeScreenshot(reportLocation + '/TC15/Step 15-Enter input value in input model.png')

"Step 16: Click on input softwareVersion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/input_softwareVersion'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 16-Click on input softwareVersion.png')

"Step 17: Enter input value in input softwareVersion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/input_softwareVersion'), input_softwareVersion)

WebUI.takeScreenshot(reportLocation + '/TC15/Step 17-Enter input value in input softwareVersion.png')

"Step 18: Click on faIcon openCalendar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/faIcon_openCalendar'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 18-Click on faIcon openCalendar.png')

"Step 19: Click on button date"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_date'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 19-Click on button date.png')

"Step 20: Click on input uploadScannerProtocolYes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/input_uploadScannerProtocolYes'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 20-Click on input uploadScannerProtocolYes.png')

"Step 21: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 21-Click on button next.png')

"Step 22: Click on input deviceLocationSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/input_deviceLocationSelect'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 22-Click on input deviceLocationSelect.png')

"Step 23: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 23-Click on button next.png')

"Step 24: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 24-Click on button submit.png')

"Step 25: Click on button confirmationDialogConfirm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_confirmationDialogConfirm'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 25-Click on button confirmationDialogConfirm.png')

"Step 26: Click on html object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 26-Click on html object3.png')

"Step 27: Click on button siteServiceRoles (siteAdmin)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles', ['button_siteServiceRoles_internalHasText': button_siteServiceRoles_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 27-Click on button siteServiceRoles siteAdmin.png')

"Step 28: Click on link logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 28-Click on link logout.png')

"Step 29: Select checkboxes and approve the test through confirmation."

approveTestCheckboxes.execute(data_path_0, Integer.valueOf(index_0))

"Step 30: Logout from admin and manage site roles in studies."

adminLogoutAndManageSiteRoles.execute(data_path_1, Integer.valueOf(index_1))

"Step 31: Click on td siteNumber -> Navigate to page '/studies/*/siteservice-service/site-assessments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/td_siteNumber'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 31-Click on td siteNumber - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 32: Click on div loadingIndicator -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/div_loadingIndicator'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 32-Click on div loadingIndicator - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 33: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 33-Click on html object.png')

"Step 34: Click on div uploadSections (uploadScannerProtocol3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections', ['div_uploadSections_trNthChild': div_uploadSections_trNthChild, 'div_uploadSections_trNthOfType': div_uploadSections_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 34-Click on div uploadSections uploadScannerProtocol3.png')

"Step 35: Click on button selectFiles"

WebUI.switchToWindowTitle('Upload Task')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_selectFiles'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 35-Click on button selectFiles.png')

"Step 36: Click on button next2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_next2'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 36-Click on button next2.png')

"Step 37: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Manage Site Equipment and Roles in Studies Dashboard_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}