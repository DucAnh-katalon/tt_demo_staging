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

"Step 2: Click on link qualityControlLinks (uploader) -> Navigate to page '/data-uploader'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_qualityControlLinks', ['link_qualityControlLinks_aTitle': link_qualityControlLinks_aTitle, 'link_qualityControlLinks_liNthOfType': link_qualityControlLinks_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 2-Click on link qualityControlLinks uploader - Navigate to page data-uploader.png')

"Step 3: Click on html pageDataUploader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC165/Step 3-Click on html pageDataUploader.png')

"Step 4: Click on faIcon object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/faIcon_object'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 4-Click on faIcon object.png')

"Step 5: Click on faIcon object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/faIcon_object'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 5-Click on faIcon object.png')

"Step 6: Click on button createQuery"

WebUI.switchToWindowTitle('Upload Task')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/button_createQuery'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 6-Click on button createQuery.png')

"Step 7: Select option with input value from select typeValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/select_typeValue'), select_typeValue)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 7-Select option with input value from select typeValue.png')

"Step 8: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 8-Click on button submit.png')

"Step 9: Click on div cardContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/div_cardContent'))

// WebUI.takeScreenshot(reportLocation + '/TC165/Step 9-Click on div cardContent.png')

"Step 10: Click on link home"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 10-Click on link home.png')

"Step 11: Click on link uploader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/link_uploader'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 11-Click on link uploader.png')

"Step 12: Select option with input value from select studyName2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/select_studyName2'), select_studyName2)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 12-Select option with input value from select studyName2.png')

"Step 13: Click on input search3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search3'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 13-Click on input search3.png')

"Step 14: Enter input value in input search3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search3'), input_search3)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 14-Enter input value in input search3.png')

"Step 15: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/button_apply'))

WebUI.switchToWindowIndex(0)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 15-Click on button apply.png')

"Step 16: Select option with input value from select studyName3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/select_studyName3'), select_studyName3)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 16-Select option with input value from select studyName3.png')

"Step 17: Select option with input value from select studyName3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/select_studyName3'), select_studyName3_1)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 17-Select option with input value from select studyName3.png')

"Step 18: Click on input search4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search4'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 18-Click on input search4.png')

"Step 19: Enter input value in input search4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search4'), input_search4)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 19-Enter input value in input search4.png')

"Step 20: Click on button apply -> Navigate to page '/gateway'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 20-Click on button apply - Navigate to page gateway.png')

"Step 21: Click on appSubjectTable object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/appSubjectTable_object'))

// WebUI.takeScreenshot(reportLocation + '/TC165/Step 21-Click on appSubjectTable object.png')

"Step 22: Click on td visit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/td_visit'))

// WebUI.takeScreenshot(reportLocation + '/TC165/Step 22-Click on td visit.png')

"Step 23: Select option with input value from select studyName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_gateway/select_studyName'), select_studyName)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 23-Select option with input value from select studyName.png')

"Step 24: Click on input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 24-Click on input search.png')

"Step 25: Enter input value in input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_gateway/input_search'), input_search)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 25-Enter input value in input search.png')

"Step 26: Click on button apply2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/button_apply2'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 26-Click on button apply2.png')

"Step 27: Click on faIcon object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/faIcon_object2'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 27-Click on faIcon object2.png')

"Step 28: Click on faIcon object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/faIcon_object2'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 28-Click on faIcon object2.png')

"Step 29: Click on div studyInfo"

// WebUI.switchToWindowTitle('Upload Task')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/div_studyInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC165/Step 29-Click on div studyInfo.png')

"Step 30: Click on button createQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/button_createQuery'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 30-Click on button createQuery.png')

"Step 31: Select option with input value from select type"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_gateway/select_type'), select_type)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 31-Select option with input value from select type.png')

"Step 32: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 32-Click on button submit.png')

"Step 33: Click on div subjectStudyInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/div_subjectStudyInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC165/Step 33-Click on div subjectStudyInfo.png')

"Step 34: Click on span uploader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/span_uploader'))

// WebUI.takeScreenshot(reportLocation + '/TC165/Step 34-Click on span uploader.png')

"Step 35: Click on div studyInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/div_studyInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC165/Step 35-Click on div studyInfo.png')

"Step 36: Click on span uploader -> Navigate to page '/data-uploader'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/gateway?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_gateway/span_uploader'))

// WebUI.switchToWindowIndex(0)

// WebUI.takeScreenshot(reportLocation + '/TC165/Step 36-Click on span uploader - Navigate to page data-uploader.png')

"Step 37: Select option with input value from select studyName4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/select_studyName4'), select_studyName4)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 37-Select option with input value from select studyName4.png')

"Step 38: Click on input search5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search5'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 38-Click on input search5.png')

"Step 39: Enter input value in input search5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search5'), input_search5)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 39-Enter input value in input search5.png')

"Step 40: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 40-Click on button apply.png')

"Step 41: Click on faIcon query"

// WebUI.switchToWindowTitle('Upload Task')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/faIcon_query'))

// WebUI.takeScreenshot(reportLocation + '/TC165/Step 41-Click on faIcon query.png')

"Step 42: Click on button action"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/button_action'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 42-Click on button action.png')

"Step 43: Select option with input value from select actionType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/select_actionType'), select_actionType)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 43-Select option with input value from select actionType.png')

"Step 44: Click on button submit2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/button_submit2'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 44-Click on button submit2.png')

"Step 45: Click on div queryStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/div_queryStatus'))

// WebUI.takeScreenshot(reportLocation + '/TC165/Step 45-Click on div queryStatus.png')

"Step 46: Click on faIcon object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/faIcon_object2'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 46-Click on faIcon object2.png')

"Step 47: Click on div studyInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/div_studyInformation'))

// WebUI.switchToWindowIndex(0)

// WebUI.takeScreenshot(reportLocation + '/TC165/Step 47-Click on div studyInformation.png')

"Step 48: Click on html uploader2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/html_object'))

// WebUI.takeScreenshot(reportLocation + '/TC165/Step 48-Click on html uploader2.png')

"Step 49: Select option with input value from select studySearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/select_studySearch'), select_studySearch)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 49-Select option with input value from select studySearch.png')

"Step 50: Click on input search6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search6'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 50-Click on input search6.png')

"Step 51: Enter input value in input search6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search6'), input_search6)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 51-Enter input value in input search6.png')

"Step 52: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 52-Click on button apply.png')

"Step 53: Select option with input value from select studySearch2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/select_studySearch2'), select_studySearch2)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 53-Select option with input value from select studySearch2.png')

"Step 54: Click on input search7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search7'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 54-Click on input search7.png')

"Step 55: Enter input value in input search7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search7'), input_search7)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 55-Enter input value in input search7.png')

"Step 56: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 56-Click on button apply.png')

"Step 57: Select option with input value from select studySearch3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/select_studySearch3'), select_studySearch3)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 57-Select option with input value from select studySearch3.png')

"Step 58: Click on input search8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search8'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 58-Click on input search8.png')

"Step 59: Enter input value in input search8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/input_search8'), input_search8)

WebUI.takeScreenshot(reportLocation + '/TC165/Step 59-Enter input value in input search8.png')

"Step 60: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 60-Click on button apply.png')

"Step 61: Click on button createUnscheduledVisit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/button_createUnscheduledVisit'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 61-Click on button createUnscheduledVisit.png')

"Step 62: Click on faIcon dismiss -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/data-uploader?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_data_uploader/faIcon_dismiss'))

WebUI.takeScreenshot(reportLocation + '/TC165/Step 62-Click on faIcon dismiss - Navigate to page .png')

"Step 63: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC165-Create Queries and Manage Study Information in Data Uploader_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}