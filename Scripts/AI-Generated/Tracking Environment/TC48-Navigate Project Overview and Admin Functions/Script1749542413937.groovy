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

"Step 1: Navigate to /project/*/home/overview with params (filter)"

TrueTestScripts.navigate("/project/${project_id}/home/overview", ["filter": overview_filter])

"Step 2: Click on link releaseQuality -> Navigate to page '/project/*/home/release'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_releaseQuality'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 2-Click on link releaseQuality - Navigate to page projecthomerelease.png')

"Step 3: Click on div projectOverview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/release?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_release/div_projectOverview'))

// WebUI.takeScreenshot(reportLocation + '/TC48/Step 3-Click on div projectOverview.png')

"Step 4: Click on div projectOverview2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/release?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_release/div_projectOverview2'))

// WebUI.takeScreenshot(reportLocation + '/TC48/Step 4-Click on div projectOverview2.png')

"Step 5: Click on div projectOverview3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/release?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_release/div_projectOverview3'))

// WebUI.takeScreenshot(reportLocation + '/TC48/Step 5-Click on div projectOverview3.png')

"Step 6: Click on link projectOverview -> Navigate to page '/project/*/home/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/release?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_release/link_projectOverview'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 6-Click on link projectOverview - Navigate to page projecthomeoverview.png')

"Step 7: Click on link releaseQuality -> Navigate to page '/project/*/home/release'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_releaseQuality'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 7-Click on link releaseQuality - Navigate to page projecthomerelease.png')

"Step 8: Click on span admin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/release?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_release/span_admin'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 8-Click on span admin.png')

"Step 9: Click on input searchProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/release?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_release/input_searchProject'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 9-Click on input searchProject.png')

"Step 10: Enter input value in input searchProject"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/release?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_home_release/input_searchProject'), input_searchProject)

WebUI.takeScreenshot(reportLocation + '/TC48/Step 10-Enter input value in input searchProject.png')

"Step 11: Hover over button admin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/release?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_home_release/button_admin'))

// WebUI.takeScreenshot(reportLocation + '/TC48/Step 11-Hover over button admin.png')

"Step 12: Click on link admin -> Navigate to page '/project/*/home/overview'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/release?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_release/link_admin'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 12-Click on link admin - Navigate to page projecthomeoverview.png')

"Step 13: Click on div plans -> Navigate to page '/project/*/plans'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/div_plans'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 13-Click on div plans - Navigate to page projectplans.png')

"Step 14: Click on span sync"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/span_sync'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 14-Click on span sync.png')

"Step 15: Hover over button clear"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/button_clear'))

// WebUI.takeScreenshot(reportLocation + '/TC48/Step 15-Hover over button clear.png')

"Step 16: Click on button today"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/button_today'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 16-Click on button today.png')

"Step 17: Click on button openClear (open)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/button_openClear"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/button_openClear', ['button_openClear_class': button_openClear_class, 'button_openClear_class_1': button_openClear_class_1, 'button_openClear_internalLabel': button_openClear_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 17-Click on button openClear open.png')

"Step 18: Enter input value in input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/input_text'), input_text)

WebUI.takeScreenshot(reportLocation + '/TC48/Step 18-Enter input value in input text.png')

"Step 19: Click on button openClear (clear2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/button_openClear"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_plans/button_openClear', ['button_openClear_class': button_openClear_class_1, 'button_openClear_class_1': button_openClear_class_1_1, 'button_openClear_internalLabel': button_openClear_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 19-Click on button openClear clear2.png')

"Step 20: Click on link katalonLogo -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/plans?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_plans/link_katalonLogo'))

WebUI.takeScreenshot(reportLocation + '/TC48/Step 20-Click on link katalonLogo - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC48-Navigate Project Overview and Admin Functions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}