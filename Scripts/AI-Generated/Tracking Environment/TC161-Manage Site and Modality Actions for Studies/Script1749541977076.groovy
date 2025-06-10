import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.accessAdministrationAndFilterStudyLinks
import truetest.Tracking_Environment.common.filterSiteManagementByText
import truetest.Tracking_Environment.common.filterStudiesAndNavigateLinks
import truetest.Tracking_Environment.common.selectStudyOrOrganizationAndApplyFilter
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

"Step 2: Click on span projectName -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_projectName'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 2-Click on span projectName - Navigate to page studiesdashboard.png')

"Step 3: Click on link studyLinks (mySite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 3-Click on link studyLinks mySite2.png')

"Step 4: Click on button siteManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteManagement'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 4-Click on button siteManagement.png')

"Step 5: Click on span studyDetails (studyName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_studyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_studyDetails', ['span_studyDetails_tdNthChild': span_studyDetails_tdNthChild, 'span_studyDetails_tdNthOfType': span_studyDetails_tdNthOfType, 'span_studyDetails_trNthChild': span_studyDetails_trNthChild, 'span_studyDetails_trNthOfType': span_studyDetails_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 5-Click on span studyDetails studyName.png')

"Step 6: Click on faIcon previousPage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_previousPage3'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 6-Click on faIcon previousPage3.png')

"Step 7: Click on span studyDetails (principalInvestigator2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_studyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_studyDetails', ['span_studyDetails_tdNthChild': span_studyDetails_tdNthChild_1, 'span_studyDetails_tdNthOfType': span_studyDetails_tdNthOfType_1, 'span_studyDetails_trNthChild': span_studyDetails_trNthChild_1, 'span_studyDetails_trNthOfType': span_studyDetails_trNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 7-Click on span studyDetails principalInvestigator2.png')

"Step 8: Click on button siteAndModalityActions (siteUsers)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAndModalityActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAndModalityActions', ['button_siteAndModalityActions_internalText': button_siteAndModalityActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 8-Click on button siteAndModalityActions siteUsers.png')

"Step 9: Click on button previousPage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_previousPage2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 9-Click on button previousPage2.png')

"Step 10: Click on td studyDetails (studyName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyDetails', ['td_studyDetails_tdNthChild': td_studyDetails_tdNthChild, 'td_studyDetails_tdNthOfType': td_studyDetails_tdNthOfType, 'td_studyDetails_trNthChild': td_studyDetails_trNthChild, 'td_studyDetails_trNthOfType': td_studyDetails_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 10-Click on td studyDetails studyName.png')

"Step 11: Click on faIcon previousPage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_previousPage3'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 11-Click on faIcon previousPage3.png')

"Step 12: Click on td studyDetails (principalInvestigator)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyDetails', ['td_studyDetails_tdNthChild': td_studyDetails_tdNthChild_1, 'td_studyDetails_tdNthOfType': td_studyDetails_tdNthOfType_1, 'td_studyDetails_trNthChild': td_studyDetails_trNthChild_1, 'td_studyDetails_trNthOfType': td_studyDetails_trNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 12-Click on td studyDetails principalInvestigator.png')

"Step 13: Click on td locationName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/td_locationName'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 13-Click on td locationName.png')

"Step 14: Click on faIcon object10 -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object10'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 14-Click on faIcon object10 - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 15: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 15-Click on link home - Navigate to page dashboard.png')

"Step 16: Click on span projectNames (projectName8) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/span_projectNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/span_projectNames', ['span_projectNames_trNthChild': span_projectNames_trNthChild, 'span_projectNames_trNthOfType': span_projectNames_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 16-Click on span projectNames projectName8 - Navigate to page studiesdashboard.png')

"Step 17: Click on link studyLinks (mySite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_1, 'link_studyLinks_class': link_studyLinks_class_1, 'link_studyLinks_href_variable': link_studyLinks_href_variable_1, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 17-Click on link studyLinks mySite2.png')

"Step 18: Click on button siteManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteManagement'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 18-Click on button siteManagement.png')

"Step 19: Click on td studyDetails (studyName2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyDetails', ['td_studyDetails_tdNthChild': td_studyDetails_tdNthChild_2, 'td_studyDetails_tdNthOfType': td_studyDetails_tdNthOfType_2, 'td_studyDetails_trNthChild': td_studyDetails_trNthChild_2, 'td_studyDetails_trNthOfType': td_studyDetails_trNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 19-Click on td studyDetails studyName2.png')

"Step 20: Click on td locationName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/td_locationName'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 20-Click on td locationName2.png')

"Step 21: Click on faIcon object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object10'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 21-Click on faIcon object10.png')

"Step 22: Click on faIcon previousPage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_previousPage3'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 22-Click on faIcon previousPage3.png')

"Step 23: Select option with input value from select rowsPerPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_rowsPerPage'), select_rowsPerPage)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 23-Select option with input value from select rowsPerPage.png')

"Step 24: Click on span studyDetails (study3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_studyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_studyDetails', ['span_studyDetails_tdNthChild': span_studyDetails_tdNthChild_2, 'span_studyDetails_tdNthOfType': span_studyDetails_tdNthOfType_2, 'span_studyDetails_trNthChild': span_studyDetails_trNthChild_2, 'span_studyDetails_trNthOfType': span_studyDetails_trNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 24-Click on span studyDetails study3.png')

"Step 25: Click on button siteAndModalityActions (siteUsers)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAndModalityActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAndModalityActions', ['button_siteAndModalityActions_internalText': button_siteAndModalityActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 25-Click on button siteAndModalityActions siteUsers.png')

"Step 26: Click on button siteAndModalityActions (modalities)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAndModalityActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAndModalityActions', ['button_siteAndModalityActions_internalText': button_siteAndModalityActions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 26-Click on button siteAndModalityActions modalities.png')

"Step 27: Click on td technologists"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/td_technologists'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 27-Click on td technologists.png')

"Step 28: Click on span siteIdentifier"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_siteIdentifier'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 28-Click on span siteIdentifier.png')

"Step 29: Click on faIcon object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object10'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 29-Click on faIcon object10.png')

"Step 30: Click on button openQuestionnaire"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_openQuestionnaire'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 30-Click on button openQuestionnaire.png')

"Step 31: Click on faIcon object11 -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object11'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 31-Click on faIcon object11 - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 32: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 32-Click on link home - Navigate to page dashboard.png')

"Step 33: Click on span projectNames (projectName9) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/span_projectNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/span_projectNames', ['span_projectNames_trNthChild': span_projectNames_trNthChild_1, 'span_projectNames_trNthOfType': span_projectNames_trNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 33-Click on span projectNames projectName9 - Navigate to page studiesdashboard.png')

"Step 34: Click on link studyLinks (mySite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_2, 'link_studyLinks_class': link_studyLinks_class_2, 'link_studyLinks_href_variable': link_studyLinks_href_variable_2, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 34-Click on link studyLinks mySite2.png')

"Step 35: Click on button siteManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteManagement'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 35-Click on button siteManagement.png')

"Step 36: Click on span studyDetails (studyName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_studyDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/span_studyDetails', ['span_studyDetails_tdNthChild': span_studyDetails_tdNthChild_3, 'span_studyDetails_tdNthOfType': span_studyDetails_tdNthOfType_3, 'span_studyDetails_trNthChild': span_studyDetails_trNthChild_3, 'span_studyDetails_trNthOfType': span_studyDetails_trNthOfType_3]))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 36-Click on span studyDetails studyName.png')

"Step 37: Click on button openQuestionnaire"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_openQuestionnaire'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 37-Click on button openQuestionnaire.png')

"Step 38: Click on faIcon object11 -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object11'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 38-Click on faIcon object11 - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 39: Click on link testStudyForms -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_testStudyForms'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 39-Click on link testStudyForms - Navigate to page studiesdashboard.png')

"Step 40: Click on link studyLinks (uploader4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_3, 'link_studyLinks_class': link_studyLinks_class_3, 'link_studyLinks_href_variable': link_studyLinks_href_variable_3, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_3]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 40-Click on link studyLinks uploader4.png')

"Step 41: Click on link studyLinks (uploader4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_4, 'link_studyLinks_class': link_studyLinks_class_4, 'link_studyLinks_href_variable': link_studyLinks_href_variable_4, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_4]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 41-Click on link studyLinks uploader4.png')

"Step 42: Click on link studyLinks (queries3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_5, 'link_studyLinks_class': link_studyLinks_class_5, 'link_studyLinks_href_variable': link_studyLinks_href_variable_5, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_5]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 42-Click on link studyLinks queries3.png')

"Step 43: Click on link studyLinks (queries3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_6, 'link_studyLinks_class': link_studyLinks_class_6, 'link_studyLinks_href_variable': link_studyLinks_href_variable_6, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_6]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 43-Click on link studyLinks queries3.png')

"Step 44: Click on faIcon pageTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_pageTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 44-Click on faIcon pageTitle.png')

"Step 45: Click on link studyLinks (mySite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_7, 'link_studyLinks_class': link_studyLinks_class_7, 'link_studyLinks_href_variable': link_studyLinks_href_variable_7, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_7]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 45-Click on link studyLinks mySite2.png')

"Step 46: Click on button siteManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteManagement'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 46-Click on button siteManagement.png')

"Step 47: Click on span studyName2 -> Navigate to page '/gateway'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_studyName2'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 47-Click on span studyName2 - Navigate to page gateway.png')

"Step 48: Click on button siteUsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/button_siteUsers'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 48-Click on button siteUsers.png')

"Step 49: Click on faIcon previousPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/faIcon_previousPage'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 49-Click on faIcon previousPage.png')

"Step 50: Click on span study"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/span_study'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 50-Click on span study.png')

"Step 51: Click on button siteUsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/button_siteUsers'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 51-Click on button siteUsers.png')

"Step 52: Click on button siteUsers2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/button_siteUsers2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 52-Click on button siteUsers2.png')

"Step 53: Click on faIcon previousPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/faIcon_previousPage'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 53-Click on faIcon previousPage.png')

"Step 54: Select option with input value from select selectedFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_gateway/select_selectedFilter'), select_selectedFilter)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 54-Select option with input value from select selectedFilter.png')

"Step 55: Select option with input value from select filterValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_gateway/select_filterValue'), select_filterValue)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 55-Select option with input value from select filterValue.png')

"Step 56: Click on button apply -> Navigate to page '/studies/*/siteservice-service/site-assessments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 56-Click on button apply - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 57: Click on link home2 -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_home2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 57-Click on link home2 - Navigate to page dashboard.png')

"Step 58: Click on span projectNames (projectName9) -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/span_projectNames"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/span_projectNames', ['span_projectNames_trNthChild': span_projectNames_trNthChild_2, 'span_projectNames_trNthOfType': span_projectNames_trNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 58-Click on span projectNames projectName9 - Navigate to page studiesdashboard.png')

"Step 59: Click on link studyLinks (mySite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_8, 'link_studyLinks_class': link_studyLinks_class_8, 'link_studyLinks_href_variable': link_studyLinks_href_variable_8, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_8]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 59-Click on link studyLinks mySite2.png')

"Step 60: Click on button siteManagement -> Navigate to page '/studies/*/siteservice-service/site-assessments'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteManagement'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 60-Click on button siteManagement - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 61: Click on button demoSite2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_demoSite2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 61-Click on button demoSite2.png')

"Step 62: Click on link logout2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 62-Click on link logout2.png')

"Step 63: Select study or organization and apply a filter to the list"

selectStudyOrOrganizationAndApplyFilter.execute(data_path_0, Integer.valueOf(index_0))

"Step 64: Click on span studyProtocol2 -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_studyProtocol2'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 64-Click on span studyProtocol2 - Navigate to page studiesdashboard.png')

"Step 65: Click on link studyLinks (mySite2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle_9, 'link_studyLinks_class': link_studyLinks_class_9, 'link_studyLinks_href_variable': link_studyLinks_href_variable_9, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType_9]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 65-Click on link studyLinks mySite2.png')

"Step 66: Click on button siteManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteManagement'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 66-Click on button siteManagement.png')

"Step 67: Click on input textFilter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_textFilter2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 67-Click on input textFilter2.png')

"Step 68: Enter input value in input textFilter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_textFilter2'), input_textFilter2)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 68-Enter input value in input textFilter2.png')

"Step 69: Click on div tableHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_tableHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 69-Click on div tableHeader.png')

"Step 70: Click on button apply6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply6'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 70-Click on button apply6.png')

"Step 71: Click on span study2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_study2'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 71-Click on span study2.png')

"Step 72: Click on button siteAndModalityActions (siteUsers)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAndModalityActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAndModalityActions', ['button_siteAndModalityActions_internalText': button_siteAndModalityActions_internalText_3]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 72-Click on button siteAndModalityActions siteUsers.png')

"Step 73: Click on button newUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_newUser'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 73-Click on button newUser.png')

"Step 74: Click on input firstName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_firstName2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 74-Click on input firstName2.png')

"Step 75: Enter input value in input firstName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_firstName2'), input_firstName2)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 75-Enter input value in input firstName2.png')

"Step 76: Press key Tab on input firstName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_firstName2'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 76-Press key Tab on input firstName2.png')

"Step 77: Click on input firstName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_firstName2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 77-Click on input firstName2.png')

"Step 78: Click on input lastName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_lastName2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 78-Click on input lastName2.png')

"Step 79: Enter input value in input lastName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_lastName2'), input_lastName2)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 79-Enter input value in input lastName2.png')

"Step 80: Click on input email2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_email2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 80-Click on input email2.png')

"Step 81: Enter input value in input email2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_email2'), input_email2)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 81-Enter input value in input email2.png')

"Step 82: Click on div openCombobox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_openCombobox'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 82-Click on div openCombobox.png')

"Step 83: Click on input studyRoles (principalInvestigator)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/input_studyRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/input_studyRoles', ['input_studyRoles_id': input_studyRoles_id, 'input_studyRoles_internalLabel': input_studyRoles_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 83-Click on input studyRoles principalInvestigator.png')

"Step 84: Click on input studyRoles (technologist)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/input_studyRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/input_studyRoles', ['input_studyRoles_id': input_studyRoles_id_1, 'input_studyRoles_internalLabel': input_studyRoles_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 84-Click on input studyRoles technologist.png')

"Step 85: Click on crModalFooter object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/crModalFooter_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 85-Click on crModalFooter object2.png')

"Step 86: Click on button submit9 -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit9'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 86-Click on button submit9 - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 87: Click on button siteServiceRoles (demoSite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles', ['button_siteServiceRoles_internalHasText': button_siteServiceRoles_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 87-Click on button siteServiceRoles demoSite.png')

"Step 88: Click on link logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 88-Click on link logout.png')

"Step 89: Select study or organization and apply a filter to the list"

selectStudyOrOrganizationAndApplyFilter.execute(data_path_1, Integer.valueOf(index_1))

"Step 90: Click on span studyProtocol3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_dontDelEditAutoStudy'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 90-Click on span studyProtocol3.png')

"Step 91: Access administration and filter study links"

accessAdministrationAndFilterStudyLinks.execute(data_path_2, Integer.valueOf(index_2))

"Step 92: Click on button apply2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 92-Click on button apply2.png')

"Step 93: Click on td studyInfo (study3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyInfo', ['td_studyInfo_tdNthChild': td_studyInfo_tdNthChild, 'td_studyInfo_tdNthOfType': td_studyInfo_tdNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 93-Click on td studyInfo study3.png')

"Step 94: Click on button siteUsers2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteUsers2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 94-Click on button siteUsers2.png')

"Step 95: Click on button siteAssessmentDecision (approve)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAssessmentDecision"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAssessmentDecision', ['button_siteAssessmentDecision_buttonNthOfType': button_siteAssessmentDecision_buttonNthOfType, 'button_siteAssessmentDecision_dataTestid': button_siteAssessmentDecision_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 95-Click on button siteAssessmentDecision approve.png')

"Step 96: Click on button confirm2 -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_confirm2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 96-Click on button confirm2 - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 97: Click on button siteServiceRoles (imgSiteServiceUser)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles', ['button_siteServiceRoles_internalHasText': button_siteServiceRoles_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 97-Click on button siteServiceRoles imgSiteServiceUser.png')

"Step 98: Click on link logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 98-Click on link logout.png')

"Step 99: Select study or organization and apply a filter to the list"

selectStudyOrOrganizationAndApplyFilter.execute(data_path_3, Integer.valueOf(index_3))

"Step 100: Click on span studyProtocol2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_studyProtocol2'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 100-Click on span studyProtocol2.png')

"Step 101: Filter site management options using text input."

filterSiteManagementByText.execute(data_path_4, Integer.valueOf(index_4))

"Step 102: Click on td studyInfo (institutionName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/td_studyInfo', ['td_studyInfo_tdNthChild': td_studyInfo_tdNthChild_1, 'td_studyInfo_tdNthOfType': td_studyInfo_tdNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 102-Click on td studyInfo institutionName.png')

"Step 103: Click on button siteAndModalityActions (siteUsers)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAndModalityActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAndModalityActions', ['button_siteAndModalityActions_internalText': button_siteAndModalityActions_internalText_4]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 103-Click on button siteAndModalityActions siteUsers.png')

"Step 104: Click on button newUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_newUser'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 104-Click on button newUser.png')

"Step 105: Click on input firstName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_firstName2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 105-Click on input firstName2.png')

"Step 106: Enter input value in input firstName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_firstName2'), input_firstName2_1)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 106-Enter input value in input firstName2.png')

"Step 107: Press key Tab on input firstName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_firstName2'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 107-Press key Tab on input firstName2.png')

"Step 108: Click on input lastName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_lastName2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 108-Click on input lastName2.png')

"Step 109: Enter input value in input lastName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_lastName2'), input_lastName2_1)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 109-Enter input value in input lastName2.png')

"Step 110: Click on input email2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_email2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 110-Click on input email2.png')

"Step 111: Enter input value in input email2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_email2'), input_email2_1)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 111-Enter input value in input email2.png')

"Step 112: Click on div openCombobox2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_openCombobox2'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 112-Click on div openCombobox2.png')

"Step 113: Click on input studyRoles (siteCoordinator)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/input_studyRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/input_studyRoles', ['input_studyRoles_id': input_studyRoles_id_2, 'input_studyRoles_internalLabel': input_studyRoles_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 113-Click on input studyRoles siteCoordinator.png')

"Step 114: Click on input studyRoles (technologist2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/input_studyRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/input_studyRoles', ['input_studyRoles_id': input_studyRoles_id_3, 'input_studyRoles_internalLabel': input_studyRoles_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 114-Click on input studyRoles technologist2.png')

"Step 115: Click on crModalFooter object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/crModalFooter_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 115-Click on crModalFooter object2.png')

"Step 116: Click on button submit9 -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit9'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 116-Click on button submit9 - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 117: Click on button siteServiceRoles (demoSite)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles', ['button_siteServiceRoles_internalHasText': button_siteServiceRoles_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 117-Click on button siteServiceRoles demoSite.png')

"Step 118: Click on link logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 118-Click on link logout.png')

"Step 119: Select study or organization and apply a filter to the list"

selectStudyOrOrganizationAndApplyFilter.execute(data_path_5, Integer.valueOf(index_5))

"Step 120: Click on span studyProtocol3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_dontDelEditAutoStudy'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 120-Click on span studyProtocol3.png')

"Step 121: Access administration and filter study links"

accessAdministrationAndFilterStudyLinks.execute(data_path_6, Integer.valueOf(index_6))

"Step 122: Click on button apply2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 122-Click on button apply2.png')

"Step 123: Click on span study2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_study2'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 123-Click on span study2.png')

"Step 124: Click on button siteUsers2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteUsers2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 124-Click on button siteUsers2.png')

"Step 125: Click on button siteAssessmentDecision (rejectSiteAssessment)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAssessmentDecision"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_siteAssessmentDecision', ['button_siteAssessmentDecision_buttonNthOfType': button_siteAssessmentDecision_buttonNthOfType_1, 'button_siteAssessmentDecision_dataTestid': button_siteAssessmentDecision_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 125-Click on button siteAssessmentDecision rejectSiteAssessment.png')

"Step 126: Click on button confirmDecline -> Navigate to page '/studies/*/siteservice-service/site-assessments/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_confirmDecline'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 126-Click on button confirmDecline - Navigate to page studiessiteservice-servicesite-assessments.png')

"Step 127: Click on button siteServiceRoles (imgSiteServiceUser)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/button_siteServiceRoles', ['button_siteServiceRoles_internalHasText': button_siteServiceRoles_internalHasText_3]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 127-Click on button siteServiceRoles imgSiteServiceUser.png')

"Step 128: Click on link logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/siteservice-service/site-assessments/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 128-Click on link logout.png')

"Step 129: Select study or organization and apply a filter to the list"

selectStudyOrOrganizationAndApplyFilter.execute(data_path_7, Integer.valueOf(index_7))

"Step 130: Click on input filterText"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_filterText'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 130-Click on input filterText.png')

"Step 131: Enter input value in input filterText"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_filterText'), input_filterText)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 131-Enter input value in input filterText.png')

"Step 132: Click on button apply3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_apply3'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 132-Click on button apply3.png')

"Step 133: Click on button apply3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_apply3'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 133-Click on button apply3.png')

"Step 134: Filter studies and navigate to study links"

filterStudiesAndNavigateLinks.execute(data_path_8, Integer.valueOf(index_8))

"Step 135: Click on button siteManagement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteManagement'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 135-Click on button siteManagement.png')

"Step 136: Select option with input value from select siteNumberFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_siteNumberFilter'), select_siteNumberFilter)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 136-Select option with input value from select siteNumberFilter.png')

"Step 137: Select option with input value from select filterValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_filterValue'), select_filterValue_1)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 137-Select option with input value from select filterValue.png')

"Step 138: Click on button apply6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply6'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 138-Click on button apply6.png')

"Step 139: Click on span study4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_study2'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 139-Click on span study4.png')

"Step 140: Click on button addNewEquipment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_addNewEquipment2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 140-Click on button addNewEquipment2.png')

"Step 141: Click on input selectSiteDevice2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_selectSiteDevice2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 141-Click on input selectSiteDevice2.png')

"Step 142: Click on button continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_continue'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 142-Click on button continue.png')

"Step 143: Click on input radioCanUploadScannerProtocolYes"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioCanUploadScannerProtocolYes'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 143-Click on input radioCanUploadScannerProtocolYes.png')

"Step 144: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 144-Click on button next3.png')

"Step 145: Click on div deviceLocation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_deviceLocation'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 145-Click on div deviceLocation.png')

"Step 146: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 146-Click on button next3.png')

"Step 147: Click on button addNewTechnologist"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_addNewTechnologist'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 147-Click on button addNewTechnologist.png')

"Step 148: Click on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_firstName'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 148-Click on input firstName.png')

"Step 149: Enter input value in input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_firstName'), input_firstName)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 149-Enter input value in input firstName.png')

"Step 150: Press key Tab on input firstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_firstName'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 150-Press key Tab on input firstName.png')

"Step 151: Enter input value in input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_lastName'), input_lastName)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 151-Enter input value in input lastName.png')

"Step 152: Press key Tab on input lastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_lastName'), Keys.chord(Keys.TAB))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 152-Press key Tab on input lastName.png')

"Step 153: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 153-Enter input value in input email.png')

"Step 154: Select option with input value from select position"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_position'), select_position)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 154-Select option with input value from select position.png')

"Step 155: Click on input modalityExperience"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_modalityExperience'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 155-Click on input modalityExperience.png')

"Step 156: Enter input value in input modalityExperience"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_modalityExperience'), input_modalityExperience)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 156-Enter input value in input modalityExperience.png')

"Step 157: Click on input clinicalTrialExperience"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_clinicalTrialExperience'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 157-Click on input clinicalTrialExperience.png')

"Step 158: Enter input value in input clinicalTrialExperience"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_clinicalTrialExperience'), input_clinicalTrialExperience)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 158-Enter input value in input clinicalTrialExperience.png')

"Step 159: Click on button add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_add'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 159-Click on button add.png')

"Step 160: Click on button next3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next3'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 160-Click on button next3.png')

"Step 161: Click on input tired"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_tired'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 161-Click on input tired.png')

"Step 162: Click on faIcon openCalendar15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar15'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 162-Click on faIcon openCalendar15.png')

"Step 163: Click on button dateTimeSelection (selectDate2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 163-Click on button dateTimeSelection selectDate2.png')

"Step 164: Click on input comments2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_comments2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 164-Click on input comments2.png')

"Step 165: Enter input value in input comments2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_comments2'), input_comments2)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 165-Enter input value in input comments2.png')

"Step 166: Click on span list12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/span_list12'))

// WebUI.takeScreenshot(reportLocation + '/TC161/Step 166-Click on span list12.png')

"Step 167: Click on div option12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_option12'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 167-Click on div option12.png')

"Step 168: Click on input text12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_text12'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 168-Click on input text12.png')

"Step 169: Enter input value in input text12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_text12'), input_text12)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 169-Enter input value in input text12.png')

"Step 170: Click on button object11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object11'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 170-Click on button object11.png')

"Step 171: Click on button object12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object12'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 171-Click on button object12.png')

"Step 172: Click on faIcon openCalendar16"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar16'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 172-Click on faIcon openCalendar16.png')

"Step 173: Click on button dateTimeSelection (selectDate3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_dateTimeSelection', ['button_dateTimeSelection_class': button_dateTimeSelection_class_1, 'button_dateTimeSelection_internalLabel': button_dateTimeSelection_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 173-Click on button dateTimeSelection selectDate3.png')

"Step 174: Click on faIcon openTimepicker5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openTimepicker5'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 174-Click on faIcon openTimepicker5.png')

"Step 175: Click on button ok2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_ok2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 175-Click on button ok2.png')

"Step 176: Click on input yes3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_yes3'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 176-Click on input yes3.png')

"Step 177: Click on input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_text'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 177-Click on input text.png')

"Step 178: Click on button object13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object13'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 178-Click on button object13.png')

"Step 179: Click on button object14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object14'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 179-Click on button object14.png')

"Step 180: Click on button object14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object14'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 180-Click on button object14.png')

"Step 181: Click on button object14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object14'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 181-Click on button object14.png')

"Step 182: Click on button object14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object14'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 182-Click on button object14.png')

"Step 183: Click on button object14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object14'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 183-Click on button object14.png')

"Step 184: Click on button object14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object14'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 184-Click on button object14.png')

"Step 185: Click on button object14"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object14'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 185-Click on button object14.png')

"Step 186: Click on input no4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_no4'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 186-Click on input no4.png')

"Step 187: Click on input no4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_no4'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 187-Click on input no4.png')

"Step 188: Click on input no5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_no5'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 188-Click on input no5.png')

"Step 189: Click on input  22"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input__22'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 189-Click on input  22.png')

"Step 190: Click on textarea object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_object6'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 190-Click on textarea object6.png')

"Step 191: Enter input value in textarea object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_object6'), textarea_object6)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 191-Enter input value in textarea object6.png')

"Step 192: Click on input cde2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_cde2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 192-Click on input cde2.png')

"Step 193: Click on input c2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_c2'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 193-Click on input c2.png')

"Step 194: Click on textarea object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_object7'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 194-Click on textarea object7.png')

"Step 195: Enter input value in textarea object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_object7'), textarea_object7)

WebUI.takeScreenshot(reportLocation + '/TC161/Step 195-Enter input value in textarea object7.png')

"Step 196: Click on input  23"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input__23'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 196-Click on input  23.png')

"Step 197: Click on button submit5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit5'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 197-Click on button submit5.png')

"Step 198: Click on button submit5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_submit5'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 198-Click on button submit5.png')

"Step 199: Click on faIcon object16"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object16'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 199-Click on faIcon object16.png')

"Step 200: Click on button object15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_object15'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 200-Click on button object15.png')

"Step 201: Click on faIcon object12 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object12'))

WebUI.takeScreenshot(reportLocation + '/TC161/Step 201-Click on faIcon object12 - Navigate to page .png')

"Step 202: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC161-Manage Site and Modality Actions for Studies_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}