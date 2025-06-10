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

"Step 1: Navigate to /query-template"

TrueTestScripts.navigate("/query-template")

"Step 2: Click on link home2 -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/query-template?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_query_template/link_home2'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 2-Click on link home2 - Navigate to page dashboard.png')

"Step 3: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 3-Click on button superUser.png')

"Step 4: Click on link logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 4-Click on link logout.png')

"Step 5: Click on button administration2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration2'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 5-Click on button administration2.png')

"Step 6: Click on link templateLinks (templates2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks', ['link_templateLinks_aTitle': link_templateLinks_aTitle]))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 6-Click on link templateLinks templates2.png')

"Step 7: Select option with input value from select searchAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_searchAll'), select_searchAll)

WebUI.takeScreenshot(reportLocation + '/TC80/Step 7-Select option with input value from select searchAll.png')

"Step 8: Select option with input value from select enabledDisabled"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_enabledDisabled'), select_enabledDisabled)

WebUI.takeScreenshot(reportLocation + '/TC80/Step 8-Select option with input value from select enabledDisabled.png')

"Step 9: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 9-Click on button apply.png')

"Step 10: Select option with input value from select searchAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_searchAll'), select_searchAll_1)

WebUI.takeScreenshot(reportLocation + '/TC80/Step 10-Select option with input value from select searchAll.png')

"Step 11: Select option with input value from select dcrQualityNotificationQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/select_enabledDisabled'), select_dcrQualityNotificationQuery)

WebUI.takeScreenshot(reportLocation + '/TC80/Step 11-Select option with input value from select dcrQualityNotificationQuery.png')

"Step 12: Click on button apply"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_apply'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 12-Click on button apply.png')

"Step 13: Click on faIcon object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/faIcon_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC80/Step 13-Click on faIcon object3.png')

"Step 14: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 14-Click on button superUser.png')

"Step 15: Click on link logout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 15-Click on link logout.png')

"Step 16: Click on link studies3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_studies3'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 16-Click on link studies3.png')

"Step 17: Click on link studies3 -> Navigate to page '/studyservice'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_studies3'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 17-Click on link studies3 - Navigate to page studyservice.png')

"Step 18: Click on button superUser"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studyservice?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studyservice/button_superUser'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 18-Click on button superUser.png')

"Step 19: Click on link logout -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/studyservice?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studyservice/link_logout'))

WebUI.takeScreenshot(reportLocation + '/TC80/Step 19-Click on link logout - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC80-Logout and Manage Query Templates in Administration_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}