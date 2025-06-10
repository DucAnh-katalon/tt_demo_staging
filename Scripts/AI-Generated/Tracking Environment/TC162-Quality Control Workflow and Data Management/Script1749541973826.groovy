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

"Step 2: Click on link qualityControl2 -> Navigate to page '/qc-worklist'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_qualityControl2'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 2-Click on link qualityControl2 - Navigate to page qc-worklist.png')

"Step 3: Click on link home2 -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qc-worklist?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_qc_worklist/link_home2'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 3-Click on link home2 - Navigate to page dashboard.png')

"Step 4: Click on button development2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_development2'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 4-Click on button development2.png')

"Step 5: Click on link modFedDefault -> Navigate to page '/modfed-app/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_modFedDefault'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 5-Click on link modFedDefault - Navigate to page modfed-app.png')

"Step 6: Click on th name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/modfed-app/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_modfed_app/th_name'))

// WebUI.takeScreenshot(reportLocation + '/TC162/Step 6-Click on th name.png')

"Step 7: Click on link modFedApp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/modfed-app/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_modfed_app/link_modFedApp'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 7-Click on link modFedApp.png')

"Step 8: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/modfed-app/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_modfed_app/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 8-Click on link home - Navigate to page dashboard.png')

"Step 9: Click on button libraries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_libraries'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 9-Click on button libraries.png')

"Step 10: Click on link templateLinks (forms2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks', ['link_templateLinks_aTitle': link_templateLinks_aTitle]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 10-Click on link templateLinks forms2.png')

"Step 11: Click on button dashboardComponents (categories)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_dashboardComponents"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_dashboardComponents', ['button_dashboardComponents_buttonNthOfType': button_dashboardComponents_buttonNthOfType, 'button_dashboardComponents_internalText': button_dashboardComponents_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 11-Click on button dashboardComponents categories.png')

"Step 12: Click on button dashboardComponents (components)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_dashboardComponents"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_dashboardComponents', ['button_dashboardComponents_buttonNthOfType': button_dashboardComponents_buttonNthOfType_1, 'button_dashboardComponents_internalText': button_dashboardComponents_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 12-Click on button dashboardComponents components.png')

"Step 13: Click on button forms -> Navigate to page '/forms'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_forms'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 13-Click on button forms - Navigate to page forms.png')

"Step 14: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/forms?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_forms/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 14-Click on link home - Navigate to page dashboard.png')

"Step 15: Click on button libraries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_libraries'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 15-Click on button libraries.png')

"Step 16: Click on link forms -> Navigate to page '/forms'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_forms'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 16-Click on link forms - Navigate to page forms.png')

"Step 17: Click on div homeForms"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/forms?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_forms/div_homeForms'))

// WebUI.takeScreenshot(reportLocation + '/TC162/Step 17-Click on div homeForms.png')

"Step 18: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/forms?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_forms/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 18-Click on link home - Navigate to page dashboard.png')

"Step 19: Click on link qualityControlLinks (uploader)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks', ['link_qualityControlLinks_aTitle': link_qualityControlLinks_aTitle, 'link_qualityControlLinks_liNthOfType': link_qualityControlLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 19-Click on link qualityControlLinks uploader.png')

"Step 20: Click on link qualityControlLinks (uploader)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks', ['link_qualityControlLinks_aTitle': link_qualityControlLinks_aTitle_1, 'link_qualityControlLinks_liNthOfType': link_qualityControlLinks_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 20-Click on link qualityControlLinks uploader.png')

"Step 21: Click on button object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_object5'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 21-Click on button object5.png')

"Step 22: Click on link viewUploadData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_viewUploadData'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 22-Click on link viewUploadData.png')

"Step 23: Click on link home"

WebUI.switchToWindowTitle('Upload Task')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 23-Click on link home.png')

"Step 24: Click on link qualityControlLinks (qualityControl3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks', ['link_qualityControlLinks_aTitle': link_qualityControlLinks_aTitle_2, 'link_qualityControlLinks_liNthOfType': link_qualityControlLinks_liNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 24-Click on link qualityControlLinks qualityControl3.png')

"Step 25: Click on span qualityControl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_qualityControl'))

// WebUI.takeScreenshot(reportLocation + '/TC162/Step 25-Click on span qualityControl.png')

"Step 26: Click on button processingErrors"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_processingErrors'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 26-Click on button processingErrors.png')

"Step 27: Click on faIcon tableHeader2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_tableHeader2'))

// WebUI.takeScreenshot(reportLocation + '/TC162/Step 27-Click on faIcon tableHeader2.png')

"Step 28: Click on link openWorkItems (open)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_openWorkItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_openWorkItems', ['link_openWorkItems_dataTestid': link_openWorkItems_dataTestid]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 28-Click on link openWorkItems open.png')

"Step 29: Click on faIcon object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_object10'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 29-Click on faIcon object10.png')

"Step 30: Click on trigger object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/trigger_object'))

// WebUI.takeScreenshot(reportLocation + '/TC162/Step 30-Click on trigger object.png')

"Step 31: Click on faIcon tableHeader3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_tableHeader3'))

// WebUI.takeScreenshot(reportLocation + '/TC162/Step 31-Click on faIcon tableHeader3.png')

"Step 32: Click on button processingErrors"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_processingErrors'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 32-Click on button processingErrors.png')

"Step 33: Click on faIcon object11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_object11'))

// WebUI.takeScreenshot(reportLocation + '/TC162/Step 33-Click on faIcon object11.png')

"Step 34: Click on link openWorkItems (open2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_openWorkItems"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_openWorkItems', ['link_openWorkItems_dataTestid': link_openWorkItems_dataTestid_1]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 34-Click on link openWorkItems open2.png')

"Step 35: Click on button dismiss"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_dismiss'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 35-Click on button dismiss.png')

"Step 36: Click on textarea addReason"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_addReason'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 36-Click on textarea addReason.png')

"Step 37: Enter input value in textarea addReason"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/textarea_addReason'), textarea_addReason)

WebUI.takeScreenshot(reportLocation + '/TC162/Step 37-Enter input value in textarea addReason.png')

"Step 38: Click on button dismiss2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_dismiss2'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 38-Click on button dismiss2.png')

"Step 39: Click on link home"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 39-Click on link home.png')

"Step 40: Click on link qualityControlLinks (imageReads)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks', ['link_qualityControlLinks_aTitle': link_qualityControlLinks_aTitle_3, 'link_qualityControlLinks_liNthOfType': link_qualityControlLinks_liNthOfType_3]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 40-Click on link qualityControlLinks imageReads.png')

"Step 41: Click on link qualityControlLinks (imageReads)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks', ['link_qualityControlLinks_aTitle': link_qualityControlLinks_aTitle_4, 'link_qualityControlLinks_liNthOfType': link_qualityControlLinks_liNthOfType_4]))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 41-Click on link qualityControlLinks imageReads.png')

"Step 42: Click on link home"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 42-Click on link home.png')

"Step 43: Click on link qualityControlLinks (qualityControl3) -> Navigate to page '/data-uploader'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks', ['link_qualityControlLinks_aTitle': link_qualityControlLinks_aTitle_5, 'link_qualityControlLinks_liNthOfType': link_qualityControlLinks_liNthOfType_5]))

WebUI.switchToWindowIndex(0)

WebUI.takeScreenshot(reportLocation + '/TC162/Step 43-Click on link qualityControlLinks qualityControl3 - Navigate to page data-uploader.png')

"Step 44: Click on div pageHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/div_pageHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC162/Step 44-Click on div pageHeader.png')

"Step 45: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 45-Click on link home - Navigate to page dashboard.png')

"Step 46: Click on link qualityControl2 -> Navigate to page '/qc-worklist'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_qualityControl2'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 46-Click on link qualityControl2 - Navigate to page qc-worklist.png')

"Step 47: Click on link home2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/qc-worklist?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_qc_worklist/link_home2'))

WebUI.takeScreenshot(reportLocation + '/TC162/Step 47-Click on link home2 - Navigate to page .png')

"Step 48: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC162-Quality Control Workflow and Data Management_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}