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

"Step 2: Click on link qualityControlLinks (uploader)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks', ['link_qualityControlLinks_aTitle': link_qualityControlLinks_aTitle, 'link_qualityControlLinks_liNthOfType': link_qualityControlLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 2-Click on link qualityControlLinks uploader.png')

"Step 3: Select option with input value from select searchAll2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_searchAll2'), select_searchAll2)

WebUI.takeScreenshot(reportLocation + '/TC86/Step 3-Select option with input value from select searchAll2.png')

"Step 4: Click on input search2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_search2'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 4-Click on input search2.png')

"Step 5: Enter input value in input search2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_search2'), input_search2)

WebUI.takeScreenshot(reportLocation + '/TC86/Step 5-Enter input value in input search2.png')

"Step 6: Click on button apply2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_apply2'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 6-Click on button apply2.png')

"Step 7: Click on faIcon clear"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_clear'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 7-Click on faIcon clear.png')

"Step 8: Select option with input value from select searchAll2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_searchAll2'), select_searchAll2_1)

WebUI.takeScreenshot(reportLocation + '/TC86/Step 8-Select option with input value from select searchAll2.png')

"Step 9: Select option with input value from select dataFixOrgName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_dataFixOrgName'), select_dataFixOrgName)

WebUI.takeScreenshot(reportLocation + '/TC86/Step 9-Select option with input value from select dataFixOrgName.png')

"Step 10: Click on button apply2 -> Navigate to page '/data-uploader'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_apply2'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 10-Click on button apply2 - Navigate to page data-uploader.png')

"Step 11: Click on html uploader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC86/Step 11-Click on html uploader.png')

"Step 12: Click on html uploader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC86/Step 12-Click on html uploader.png')

"Step 13: Click on faIcon clear"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/faIcon_clear'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 13-Click on faIcon clear.png')

"Step 14: Select option with input value from select searchAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/select_searchAll'), select_searchAll)

WebUI.takeScreenshot(reportLocation + '/TC86/Step 14-Select option with input value from select searchAll.png')

"Step 15: Click on input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 15-Click on input search.png')

"Step 16: Enter input value in input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search'), input_search)

WebUI.takeScreenshot(reportLocation + '/TC86/Step 16-Enter input value in input search.png')

"Step 17: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 17-Click on button apply.png')

"Step 18: Click on html uploader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC86/Step 18-Click on html uploader.png')

"Step 19: Select option with input value from select searchAll2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/select_searchAll2'), select_searchAll2_2)

WebUI.takeScreenshot(reportLocation + '/TC86/Step 19-Select option with input value from select searchAll2.png')

"Step 20: Click on input search2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search2'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 20-Click on input search2.png')

"Step 21: Enter input value in input search2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search2'), input_search2_1)

WebUI.takeScreenshot(reportLocation + '/TC86/Step 21-Enter input value in input search2.png')

"Step 22: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 22-Click on button apply.png')

"Step 23: Click on div uploadWorkList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/div_uploadWorkList'))

// WebUI.takeScreenshot(reportLocation + '/TC86/Step 23-Click on div uploadWorkList.png')

"Step 24: Select option with input value from select studyName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/select_studyName'), select_studyName)

WebUI.takeScreenshot(reportLocation + '/TC86/Step 24-Select option with input value from select studyName.png')

"Step 25: Click on div option"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/div_option'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 25-Click on div option.png')

"Step 26: Click on div uploadExpected"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/div_uploadExpected'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 26-Click on div uploadExpected.png')

"Step 27: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 27-Click on button apply.png')

"Step 28: Click on html object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC86/Step 28-Click on html object2.png')

"Step 29: Click on html object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC86/Step 29-Click on html object2.png')

"Step 30: Select option with input value from select rows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/select_rows'), select_rows)

WebUI.takeScreenshot(reportLocation + '/TC86/Step 30-Select option with input value from select rows.png')

"Step 31: Click on html object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC86/Step 31-Click on html object2.png')

"Step 32: Click on html object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC86/Step 32-Click on html object2.png')

"Step 33: Select option with input value from select rows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/select_rows'), select_rows_1)

WebUI.takeScreenshot(reportLocation + '/TC86/Step 33-Select option with input value from select rows.png')

"Step 34: Click on crPaginator rows"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/crPaginator_rows'))

// WebUI.takeScreenshot(reportLocation + '/TC86/Step 34-Click on crPaginator rows.png')

"Step 35: Click on html object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC86/Step 35-Click on html object2.png')

"Step 36: Click on faIcon navigationControls (next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_data_uploader/faIcon_navigationControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_data_uploader/faIcon_navigationControls', ['faIcon_navigationControls_class': faIcon_navigationControls_class, 'faIcon_navigationControls_internalLabel': faIcon_navigationControls_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 36-Click on faIcon navigationControls next.png')

"Step 37: Click on faIcon navigationControls (next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_data_uploader/faIcon_navigationControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_data_uploader/faIcon_navigationControls', ['faIcon_navigationControls_class': faIcon_navigationControls_class_1, 'faIcon_navigationControls_internalLabel': faIcon_navigationControls_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 37-Click on faIcon navigationControls next.png')

"Step 38: Click on faIcon navigationControls (next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_data_uploader/faIcon_navigationControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_data_uploader/faIcon_navigationControls', ['faIcon_navigationControls_class': faIcon_navigationControls_class_2, 'faIcon_navigationControls_internalLabel': faIcon_navigationControls_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 38-Click on faIcon navigationControls next.png')

"Step 39: Click on faIcon navigationControls (next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_data_uploader/faIcon_navigationControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_data_uploader/faIcon_navigationControls', ['faIcon_navigationControls_class': faIcon_navigationControls_class_3, 'faIcon_navigationControls_internalLabel': faIcon_navigationControls_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 39-Click on faIcon navigationControls next.png')

"Step 40: Click on faIcon navigationControls (next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_data_uploader/faIcon_navigationControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_data_uploader/faIcon_navigationControls', ['faIcon_navigationControls_class': faIcon_navigationControls_class_4, 'faIcon_navigationControls_internalLabel': faIcon_navigationControls_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 40-Click on faIcon navigationControls next.png')

"Step 41: Click on html object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC86/Step 41-Click on html object2.png')

"Step 42: Click on faIcon navigationControls (last)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_data_uploader/faIcon_navigationControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_data_uploader/faIcon_navigationControls', ['faIcon_navigationControls_class': faIcon_navigationControls_class_5, 'faIcon_navigationControls_internalLabel': faIcon_navigationControls_internalLabel_5]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 42-Click on faIcon navigationControls last.png')

"Step 43: Click on faIcon navigationControls (first)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_data_uploader/faIcon_navigationControls"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_data_uploader/faIcon_navigationControls', ['faIcon_navigationControls_class': faIcon_navigationControls_class_6, 'faIcon_navigationControls_internalLabel': faIcon_navigationControls_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC86/Step 43-Click on faIcon navigationControls first.png')

"Step 44: Click on html object2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC86/Step 44-Click on html object2 - Navigate to page .png')

"Step 45: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC86-Upload Data and Manage Quality Control Links_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}