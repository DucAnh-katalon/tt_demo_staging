import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.adminLogoutAndAccessStudyDashboard
import truetest.Tracking_Environment.common.navigateToSiteManagementAndUploadSections
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /access-denied"

TrueTestScripts.navigate("/access-denied")

"Step 2: Click on button goBackToDashboard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/access-denied?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_access_denied/button_goBackToDashboard'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 2-Click on button goBackToDashboard.png')

"Step 3: Logout from admin and access the studies dashboard."

adminLogoutAndAccessStudyDashboard.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on button siteManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteManagement'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 4-Click on button siteManagement.png')

"Step 5: Click on span siteNumber -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_siteNumber'))

// WebUI.takeScreenshot(reportLocation + '/TC163/Step 5-Click on span siteNumber - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 6: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC163/Step 6-Click on html object.png')

"Step 7: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC163/Step 7-Click on html object.png')

"Step 8: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC163/Step 8-Click on html object.png')

"Step 9: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC163/Step 9-Click on html object.png')

"Step 10: Click on faIcon previousPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/faIcon_previousPage'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 10-Click on faIcon previousPage.png')

"Step 11: Click on td siteNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/td_siteNumber'))

// WebUI.takeScreenshot(reportLocation + '/TC163/Step 11-Click on td siteNumber.png')

"Step 12: Navigate to site management and upload sections"

navigateToSiteManagementAndUploadSections.execute(data_path_1, Integer.valueOf(index_1))

"Step 13: Click on div uploadSections (uploadScannerProtocol2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections', ['div_uploadSections_trNthChild': div_uploadSections_trNthChild, 'div_uploadSections_trNthOfType': div_uploadSections_trNthOfType]))

// WebUI.switchToWindowIndex(0)

// WebUI.takeScreenshot(reportLocation + '/TC163/Step 13-Click on div uploadSections uploadScannerProtocol2.png')

"Step 14: Click on div uploadSections (uploadScannerProtocol4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections_2', ['div_uploadSections_trNthChild': div_uploadSections_trNthChild_1, 'div_uploadSections_trNthOfType': div_uploadSections_trNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC163/Step 14-Click on div uploadSections uploadScannerProtocol4.png')

"Step 15: Click on html object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC163/Step 15-Click on html object.png')

"Step 16: Click on faIcon previousPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/faIcon_previousPage'))

WebUI.takeScreenshot(reportLocation + '/TC163/Step 16-Click on faIcon previousPage.png')

"Step 17: Click on td siteNumber2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/td_siteNumber2'))

// WebUI.takeScreenshot(reportLocation + '/TC163/Step 17-Click on td siteNumber2.png')

"Step 18: Click on html object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC163/Step 18-Click on html object3.png')

"Step 19: Click on div uploadSections (uploadScannerProtocol5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections_2', ['div_uploadSections_trNthChild': div_uploadSections_trNthChild_2, 'div_uploadSections_trNthOfType': div_uploadSections_trNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC163/Step 19-Click on div uploadSections uploadScannerProtocol5.png')

"Step 20: Click on div uploadSections (uploadPhantomData3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections_2', ['div_uploadSections_trNthChild': div_uploadSections_trNthChild_3, 'div_uploadSections_trNthOfType': div_uploadSections_trNthOfType_3]))

// WebUI.takeScreenshot(reportLocation + '/TC163/Step 20-Click on div uploadSections uploadPhantomData3.png')

"Step 21: Click on div uploadSections (viewUpload)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections_2', ['div_uploadSections_trNthChild': div_uploadSections_trNthChild_4, 'div_uploadSections_trNthOfType': div_uploadSections_trNthOfType_4]))

// WebUI.takeScreenshot(reportLocation + '/TC163/Step 21-Click on div uploadSections viewUpload.png')

"Step 22: Click on div queryStatusOpen"

// WebUI.switchToWindowTitle('Upload Task')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/div_queryStatusOpen'))

// WebUI.takeScreenshot(reportLocation + '/TC163/Step 22-Click on div queryStatusOpen.png')

"Step 23: Click on button object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_object'))

WebUI.switchToWindowIndex(0)

WebUI.takeScreenshot(reportLocation + '/TC163/Step 23-Click on button object - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC163-Navigate and Manage Site Assessments in Studies Dashboard_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}