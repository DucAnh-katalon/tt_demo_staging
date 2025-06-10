import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.navigateToSiteManagementAndUploadSections
import truetest.Tracking_Environment.common.selectStudyOrOrganizationAndManageSite
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

"Step 2: Click on link qualityControlLinks (uploader) -> Navigate to page '/data-uploader'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks', ['link_qualityControlLinks_aTitle': link_qualityControlLinks_aTitle, 'link_qualityControlLinks_liNthOfType': link_qualityControlLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on link qualityControlLinks uploader - Navigate to page data-uploader.png')

"Step 3: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on html object.png')

"Step 4: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on html object.png')

"Step 5: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on div object.png')

"Step 6: Click on button clarioApps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/button_clarioApps'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on button clarioApps.png')

"Step 7: Click on link administrationTool -> Navigate to page '/gssoadmin'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/link_administrationTool'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on link administrationTool - Navigate to page gssoadmin.png')

"Step 8: Click on link userManagement (roleManagement)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_gssoadmin/link_userManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_gssoadmin/link_userManagement', ['link_userManagement_internalText': link_userManagement_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on link userManagement roleManagement.png')

"Step 9: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gssoadmin?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gssoadmin/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Click on button superUser.png')

"Step 10: Select study or organization and manage site details"

selectStudyOrOrganizationAndManageSite.execute(data_path_0, Integer.valueOf(index_0))

"Step 11: Navigate to site management and upload sections"

navigateToSiteManagementAndUploadSections.execute(data_path_1, Integer.valueOf(index_1))

"Step 12: Click on link mrUpload"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_mrUpload'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 12-Click on link mrUpload.png')

"Step 13: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 13-Click on html object.png')

"Step 14: Click on div uploadSections (uploadScannerProtocol)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections_1', ['div_uploadSections_trNthChild': div_uploadSections_trNthChild, 'div_uploadSections_trNthOfType': div_uploadSections_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 14-Click on div uploadSections uploadScannerProtocol.png')

"Step 15: Click on link imgUp6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_imgUp6'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 15-Click on link imgUp6.png')

"Step 16: Click on link mySite"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_mySite'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 16-Click on link mySite.png')

"Step 17: Click on button siteManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_siteManagement'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 17-Click on button siteManagement.png')

"Step 18: Click on span siteNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/span_siteNumber'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 18-Click on span siteNumber.png')

"Step 19: Click on link mrTatUpload"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_mrTatUpload'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 19-Click on link mrTatUpload.png')

"Step 20: Click on html object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 20-Click on html object2.png')

"Step 21: Click on div uploadSections (uploadPhantomData)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections_1', ['div_uploadSections_trNthChild': div_uploadSections_trNthChild_1, 'div_uploadSections_trNthOfType': div_uploadSections_trNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 21-Click on div uploadSections uploadPhantomData.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Manage Site Details and Upload Data in Quality Control_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}