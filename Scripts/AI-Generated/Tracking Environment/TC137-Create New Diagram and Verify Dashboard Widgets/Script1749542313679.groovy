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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on button createNewDiagram"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_createNewDiagram'))

WebUI.takeScreenshot(reportLocation + '/TC137/Step 2-Click on button createNewDiagram.png')

"Step 3: Click on div dashboardWidgets (flowcharts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 3-Click on div dashboardWidgets flowcharts.png')

"Step 4: Click on div dashboardWidgets (maps)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_1, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_1]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 4-Click on div dashboardWidgets maps.png')

"Step 5: Click on div dashboardWidgets (network)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_2, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_2]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 5-Click on div dashboardWidgets network.png')

"Step 6: Click on div dashboardWidgets (tablesInfo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_3, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_3]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 6-Click on div dashboardWidgets tablesInfo.png')

"Step 7: Click on div dashboardWidgets (umlInfo)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_4, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_4]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 7-Click on div dashboardWidgets umlInfo.png')

"Step 8: Click on div dashboardWidgets (layout)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_5, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_5]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 8-Click on div dashboardWidgets layout.png')

"Step 9: Click on div dashboardWidgets (wireframes)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_6, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_6]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 9-Click on div dashboardWidgets wireframes.png')

"Step 10: Click on div dashboardWidgets (venn)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_7, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_7]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 10-Click on div dashboardWidgets venn.png')

"Step 11: Click on div dashboardWidgets (engineeringCount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_8, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_8]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 11-Click on div dashboardWidgets engineeringCount.png')

"Step 12: Click on div dashboardWidgets (engineeringCount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_9, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_9]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 12-Click on div dashboardWidgets engineeringCount.png')

"Step 13: Click on div dashboardWidgets (flowcharts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_10, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_10]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 13-Click on div dashboardWidgets flowcharts.png')

"Step 14: Click on div dashboardWidgets (business)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_11, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_11]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 14-Click on div dashboardWidgets business.png')

"Step 15: Click on div dashboardWidgets (smartTemplate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_12, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_12]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 15-Click on div dashboardWidgets smartTemplate.png')

"Step 16: Click on div dashboardWidgets (basic)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_13, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_13]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 16-Click on div dashboardWidgets basic.png')

"Step 17: Click on div dashboardWidgets (smartTemplate)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_14, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_14]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 17-Click on div dashboardWidgets smartTemplate.png')

"Step 18: Click on div dashboardWidgets (business)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_15, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_15]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 18-Click on div dashboardWidgets business.png')

"Step 19: Click on div dashboardWidgets (charts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_16, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_16]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 19-Click on div dashboardWidgets charts.png')

"Step 20: Click on div dashboardWidgets (engineeringCount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_17, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_17]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 20-Click on div dashboardWidgets engineeringCount.png')

"Step 21: Click on div dashboardWidgets (flowcharts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_18, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_18]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 21-Click on div dashboardWidgets flowcharts.png')

"Step 22: Click on div dashboardWidgets (network) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/div_dashboardWidgets', ['div_dashboardWidgets_divNthOfType': div_dashboardWidgets_divNthOfType_19, 'div_dashboardWidgets_divTitle': div_dashboardWidgets_divTitle_19]))

// WebUI.takeScreenshot(reportLocation + '/TC137/Step 22-Click on div dashboardWidgets network - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC137-Create New Diagram and Verify Dashboard Widgets_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}