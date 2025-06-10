import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.viewSubjectDetailsAndApplyFilter
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /qc-worklist"

TrueTestScripts.navigate("/qc-worklist")

"Step 2: Click on button selectStudyOrOrganization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qc-worklist?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_qc_worklist/button_selectStudyOrOrganization'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 2-Click on button selectStudyOrOrganization.png')

"Step 3: Click on button dontDelEditAutoStd -> Navigate to page '/studies/*/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qc-worklist?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_qc_worklist/button_dontDelEditAutoStd'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 3-Click on button dontDelEditAutoStd - Navigate to page studiesdashboard.png')

"Step 4: Click on link studyLinks (qualityControl)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': link_studyLinks_aTitle, 'link_studyLinks_class': link_studyLinks_class, 'link_studyLinks_href_variable': link_studyLinks_href_variable, 'link_studyLinks_liNthOfType': link_studyLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 4-Click on link studyLinks qualityControl.png')

"Step 5: View subject details and apply filter"

viewSubjectDetailsAndApplyFilter.execute(data_path_0, Integer.valueOf(index_0))

"Step 6: Click on faIcon object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC19/Step 6-Click on faIcon object2.png')

"Step 7: Click on link openWorkitems (open)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_openWorkitems"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_openWorkitems', ['link_openWorkitems_dataTestid': link_openWorkitems_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 7-Click on link openWorkitems open.png')

"Step 8: Click on button taskManagement (takeTask)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_taskManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_taskManagement', ['button_taskManagement_class': button_taskManagement_class, 'button_taskManagement_dataTestid': button_taskManagement_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 8-Click on button taskManagement takeTask.png')

"Step 9: Click on button taskSummary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_taskSummary'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 9-Click on button taskSummary.png')

"Step 10: Click on button qualityControlForms -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_qualityControlForms'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 10-Click on button qualityControlForms - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Navigate and Verify Quality Control Worklist Functionality_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}