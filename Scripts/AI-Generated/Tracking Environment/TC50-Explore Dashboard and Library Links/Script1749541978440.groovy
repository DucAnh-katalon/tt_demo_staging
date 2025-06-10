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

"Step 2: Click on button development2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_development2'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 2-Click on button development2.png')

"Step 3: Click on link modFedDefault -> Navigate to page '/modfed-app/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_modFedDefault'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 3-Click on link modFedDefault - Navigate to page modfed-app.png')

"Step 4: Click on link modFedApp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/modfed-app/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_modfed_app/link_modFedApp'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 4-Click on link modFedApp.png')

"Step 5: Click on link modFedApp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/modfed-app/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_modfed_app/link_modFedApp'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 5-Click on link modFedApp.png')

"Step 6: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/modfed-app/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_modfed_app/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 6-Click on link home - Navigate to page dashboard.png')

"Step 7: Click on button development2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_development2'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 7-Click on button development2.png')

"Step 8: Click on button libraries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_libraries'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 8-Click on button libraries.png')

"Step 9: Click on link examLabels -> Navigate to page '/exam-management/exam label'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_examLabels'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 9-Click on link examLabels - Navigate to page exam-managementexam label.png')

"Step 10: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/exam-management/exam_label?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_exam_management_exam_label/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 10-Click on link home - Navigate to page dashboard.png')

"Step 11: Click on button libraries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_libraries'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 11-Click on button libraries.png')

"Step 12: Click on link forms -> Navigate to page '/forms'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_forms'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 12-Click on link forms - Navigate to page forms.png')

"Step 13: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/forms?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_forms/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 13-Click on link home - Navigate to page dashboard.png')

"Step 14: Click on button libraries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_libraries'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 14-Click on button libraries.png')

"Step 15: Click on link forms -> Navigate to page '/forms'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_forms'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 15-Click on link forms - Navigate to page forms.png')

"Step 16: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/forms?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_forms/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 16-Click on link home - Navigate to page dashboard.png')

"Step 17: Click on button libraries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_libraries'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 17-Click on button libraries.png')

"Step 18: Click on link forms -> Navigate to page '/forms'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_forms'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 18-Click on link forms - Navigate to page forms.png')

"Step 19: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/forms?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_forms/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 19-Click on link home - Navigate to page dashboard.png')

"Step 20: Click on button libraries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_libraries'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 20-Click on button libraries.png')

"Step 21: Click on link forms -> Navigate to page '/forms'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_forms'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 21-Click on link forms - Navigate to page forms.png')

"Step 22: Click on link home -> Navigate to page '/dashboard'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/forms?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_forms/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 22-Click on link home - Navigate to page dashboard.png')

"Step 23: Click on button libraries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_libraries'))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 23-Click on button libraries.png')

"Step 24: Click on link templateLinks (forms2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/dashboard?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks', ['link_templateLinks_aTitle': link_templateLinks_aTitle]))

WebUI.takeScreenshot(reportLocation + '/TC50/Step 24-Click on link templateLinks forms2 - Navigate to page .png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC50-Explore Dashboard and Library Links_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}