import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.adminLogoutAndAccessStudyDashboard
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

"Step 2: Logout from admin and access the studies dashboard."

adminLogoutAndAccessStudyDashboard.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Select option with input value from select studyName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_studyName'), select_studyName)

WebUI.takeScreenshot(reportLocation + '/TC160/Step 3-Select option with input value from select studyName.png')

"Step 4: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC160/Step 4-Click on div object5.png')

"Step 5: Click on div optionUploadExpected"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/div_optionUploadExpected'))

WebUI.takeScreenshot(reportLocation + '/TC160/Step 5-Click on div optionUploadExpected.png')

"Step 6: Click on button apply5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply5'))

WebUI.takeScreenshot(reportLocation + '/TC160/Step 6-Click on button apply5.png')

"Step 7: Click on faIcon object15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object15'))

WebUI.takeScreenshot(reportLocation + '/TC160/Step 7-Click on faIcon object15.png')

"Step 8: Click on faIcon object15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_object15'))

WebUI.takeScreenshot(reportLocation + '/TC160/Step 8-Click on faIcon object15.png')

"Step 9: Click on faIcon openCalendar"

WebUI.switchToWindowTitle('Upload Task')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_openCalendar'))

WebUI.takeScreenshot(reportLocation + '/TC160/Step 9-Click on faIcon openCalendar.png')

"Step 10: Click on button selectDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_selectDate'))

WebUI.takeScreenshot(reportLocation + '/TC160/Step 10-Click on button selectDate.png')

"Step 11: Click on button selectFiles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_selectFiles'))

WebUI.takeScreenshot(reportLocation + '/TC160/Step 11-Click on button selectFiles.png')

"Step 12: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC160/Step 12-Click on button next.png')

"Step 13: Click on input radioYesQuestion1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioYesQuestion1'))

WebUI.takeScreenshot(reportLocation + '/TC160/Step 13-Click on input radioYesQuestion1.png')

"Step 14: Click on input radioYesQuestion2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioYesQuestion2'))

WebUI.takeScreenshot(reportLocation + '/TC160/Step 14-Click on input radioYesQuestion2.png')

"Step 15: Click on input radioOption1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_radioOption1'))

WebUI.takeScreenshot(reportLocation + '/TC160/Step 15-Click on input radioOption1.png')

"Step 16: Click on button next"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_next'))

WebUI.takeScreenshot(reportLocation + '/TC160/Step 16-Click on button next.png')

"Step 17: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC160/Step 17-Click on button superUser.png')

"Step 18: Click on link logout2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studies/.*/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/link_logout2'))

WebUI.switchToWindowIndex(0)

WebUI.takeScreenshot(reportLocation + '/TC160/Step 18-Click on link logout2 - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC160-Upload Expected Data for Study Management_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}