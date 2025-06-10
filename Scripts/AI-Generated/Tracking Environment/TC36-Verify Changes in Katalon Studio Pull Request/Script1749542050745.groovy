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

"Step 1: Navigate to /katalon-studio/katalon-atg/pull/*"

TrueTestScripts.navigate("/katalon-studio/katalon-atg/pull/${pull_id}")

"Step 2: Click on link filesChanged (filesChanged) -> Navigate to page '/katalon-studio/katalon-atg/pull/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull/link_filesChanged"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull/link_filesChanged', ['link_filesChanged_href_variable': link_filesChanged_href_variable, 'link_filesChanged_internalText': link_filesChanged_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC36/Step 2-Click on link filesChanged filesChanged - Navigate to page katalon-studiokatalon-atgpullfiles.png')

"Step 3: Click on span diffLineChange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange'))

// WebUI.takeScreenshot(reportLocation + '/TC36/Step 3-Click on span diffLineChange.png')

"Step 4: Click on span diffLineChange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange'))

// WebUI.takeScreenshot(reportLocation + '/TC36/Step 4-Click on span diffLineChange.png')

"Step 5: Click on span diffLineChange (diffLineChange2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild]))

// WebUI.takeScreenshot(reportLocation + '/TC36/Step 5-Click on span diffLineChange diffLineChange2.png')

"Step 6: Click on span diffLineChange3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange3'))

// WebUI.takeScreenshot(reportLocation + '/TC36/Step 6-Click on span diffLineChange3.png')

"Step 7: Click on span diffLineChange (diffLineChange4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC36/Step 7-Click on span diffLineChange diffLineChange4.png')

"Step 8: Click on span diffLineChange (diffLineChange4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_2]))

// WebUI.takeScreenshot(reportLocation + '/TC36/Step 8-Click on span diffLineChange diffLineChange4.png')

"Step 9: Click on span diffLineChange (diffLineChange5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_1', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_3]))

// WebUI.takeScreenshot(reportLocation + '/TC36/Step 9-Click on span diffLineChange diffLineChange5.png')

"Step 10: Click on span diffLineChange (diffLineChange5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_1', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_4]))

// WebUI.takeScreenshot(reportLocation + '/TC36/Step 10-Click on span diffLineChange diffLineChange5.png')

"Step 11: Click on span diffLineChange6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange6'))

// WebUI.takeScreenshot(reportLocation + '/TC36/Step 11-Click on span diffLineChange6.png')

"Step 12: Click on span diffLineChange6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange6'))

// WebUI.takeScreenshot(reportLocation + '/TC36/Step 12-Click on span diffLineChange6.png')

"Step 13: Click on span diffLineChange6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange6'))

// WebUI.takeScreenshot(reportLocation + '/TC36/Step 13-Click on span diffLineChange6.png')

"Step 14: Click on span diffLineChange (diffLineChange7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_1', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_5]))

// WebUI.takeScreenshot(reportLocation + '/TC36/Step 14-Click on span diffLineChange diffLineChange7.png')

"Step 15: Click on span diffLineChange (diffLineChange7) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_1', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_6]))

// WebUI.takeScreenshot(reportLocation + '/TC36/Step 15-Click on span diffLineChange diffLineChange7 - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC36-Verify Changes in Katalon Studio Pull Request_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}