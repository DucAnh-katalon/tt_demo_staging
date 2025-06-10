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

"Step 2: Click on link filesChanged (filesChanged2) -> Navigate to page '/katalon-studio/katalon-atg/pull/*/files'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull/link_filesChanged"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull/link_filesChanged', ['link_filesChanged_href_variable': link_filesChanged_href_variable, 'link_filesChanged_internalText': link_filesChanged_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 2-Click on link filesChanged filesChanged2 - Navigate to page katalon-studiokatalon-atgpullfiles.png')

"Step 3: Click on span diffLineChange (selector)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 3-Click on span diffLineChange selector.png')

"Step 4: Click on span diffLineChange (selector)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 4-Click on span diffLineChange selector.png')

"Step 5: Click on span diffLineChange (literalEval)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_2]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 5-Click on span diffLineChange literalEval.png')

"Step 6: Click on span diffLineChange (literalEval)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_1, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_1, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_3]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 6-Click on span diffLineChange literalEval.png')

"Step 7: Click on span diffLineChange8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange8'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 7-Click on span diffLineChange8.png')

"Step 8: Click on span diffLineChange8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange8'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 8-Click on span diffLineChange8.png')

"Step 9: Click on span diffLineChange8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange8'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 9-Click on span diffLineChange8.png')

"Step 10: Click on span diffLineChange9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange9'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 10-Click on span diffLineChange9.png')

"Step 11: Click on span diffLineChange (diffLineChange10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_4]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 11-Click on span diffLineChange diffLineChange10.png')

"Step 12: Click on span diffLineChange (diffLineChange10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_5]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 12-Click on span diffLineChange diffLineChange10.png')

"Step 13: Click on span diffLineChange (diffLineChange10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_6]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 13-Click on span diffLineChange diffLineChange10.png')

"Step 14: Click on span diffLineChange9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange9'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 14-Click on span diffLineChange9.png')

"Step 15: Click on span diffLineChange9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange9'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 15-Click on span diffLineChange9.png')

"Step 16: Click on span diffLineChange9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange9'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 16-Click on span diffLineChange9.png')

"Step 17: Click on span diffLineChange9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange9'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 17-Click on span diffLineChange9.png')

"Step 18: Click on span diffLineChange9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange9'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 18-Click on span diffLineChange9.png')

"Step 19: Click on span diffLineChange9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange9'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 19-Click on span diffLineChange9.png')

"Step 20: Click on span diffLineChange (selector)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_7]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 20-Click on span diffLineChange selector.png')

"Step 21: Click on span diffLineChange (selector)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_8]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 21-Click on span diffLineChange selector.png')

"Step 22: Click on span diffLineChange (selector)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_9]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 22-Click on span diffLineChange selector.png')

"Step 23: Click on span diffLineChange (diffLineChange10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_10]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 23-Click on span diffLineChange diffLineChange10.png')

"Step 24: Click on span diffLineChange (diffLineChange10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_11]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 24-Click on span diffLineChange diffLineChange10.png')

"Step 25: Click on span diffLineChange (diffLineChange10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_12]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 25-Click on span diffLineChange diffLineChange10.png')

"Step 26: Click on span diffLineChange (diffLineChange11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_2, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_2, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_13]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 26-Click on span diffLineChange diffLineChange11.png')

"Step 27: Click on span diffLineChange (diffLineChange11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_3, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_3, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_14]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 27-Click on span diffLineChange diffLineChange11.png')

"Step 28: Click on span diffLineChange (diffLineChange11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_4, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_4, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_15]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 28-Click on span diffLineChange diffLineChange11.png')

"Step 29: Click on span diffLineChange12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange12'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 29-Click on span diffLineChange12.png')

"Step 30: Click on span diffLineChange12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange12'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 30-Click on span diffLineChange12.png')

"Step 31: Click on span diffLineChange12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange12'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 31-Click on span diffLineChange12.png')

"Step 32: Click on span diffLineChange (diffLineChange13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_5, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_5, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_16]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 32-Click on span diffLineChange diffLineChange13.png')

"Step 33: Click on span diffLineChange (diffLineChange13)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_6, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_6, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_17]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 33-Click on span diffLineChange diffLineChange13.png')

"Step 34: Click on span diffLineChange (diffLineChange14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_18]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 34-Click on span diffLineChange diffLineChange14.png')

"Step 35: Click on span diffLineChange (diffLineChange14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_19]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 35-Click on span diffLineChange diffLineChange14.png')

"Step 36: Click on span diffLineChange (diffLineChange14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_20]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 36-Click on span diffLineChange diffLineChange14.png')

"Step 37: Click on span diffLineChange (diffLineChange14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_21]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 37-Click on span diffLineChange diffLineChange14.png')

"Step 38: Click on span diffLineChange (diffLineChange14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_22]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 38-Click on span diffLineChange diffLineChange14.png')

"Step 39: Click on span diffLineChange15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange15'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 39-Click on span diffLineChange15.png')

"Step 40: Click on span diffLineChange15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange15'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 40-Click on span diffLineChange15.png')

"Step 41: Click on span diffLineChange12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange12'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 41-Click on span diffLineChange12.png')

"Step 42: Click on span diffLineChange12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange12'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 42-Click on span diffLineChange12.png')

"Step 43: Click on span diffLineChange (diffLineChange16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_7, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_7, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_23]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 43-Click on span diffLineChange diffLineChange16.png')

"Step 44: Click on span diffLineChange (diffLineChange16)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_8, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_8, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_24]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 44-Click on span diffLineChange diffLineChange16.png')

"Step 45: Click on span diffLineChange15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange15'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 45-Click on span diffLineChange15.png')

"Step 46: Click on span diffLineChange (diffLineChange17)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_9, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_9, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_25]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 46-Click on span diffLineChange diffLineChange17.png')

"Step 47: Click on span diffLineChange (diffLineChange17)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_10, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_10, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_26]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 47-Click on span diffLineChange diffLineChange17.png')

"Step 48: Click on span diffLineChange18"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange18'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 48-Click on span diffLineChange18.png')

"Step 49: Click on td addLineComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/td_addLineComment'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 49-Click on td addLineComment.png')

"Step 50: Click on td addLineComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/td_addLineComment'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 50-Click on td addLineComment.png')

"Step 51: Click on td addLineComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/td_addLineComment'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 51-Click on td addLineComment.png')

"Step 52: Click on td addLineComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/td_addLineComment'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 52-Click on td addLineComment.png')

"Step 53: Click on td addLineComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/td_addLineComment'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 53-Click on td addLineComment.png')

"Step 54: Click on span diffLineChange (selectorValue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_11, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_11, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_27]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 54-Click on span diffLineChange selectorValue.png')

"Step 55: Click on span diffLineChange (selectorValue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_12, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_12, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_28]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 55-Click on span diffLineChange selectorValue.png')

"Step 56: Click on span diffLineChange (selectorValue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_13, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_13, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_29]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 56-Click on span diffLineChange selectorValue.png')

"Step 57: Click on span diffLineChange (diffLineChange14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_30]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 57-Click on span diffLineChange diffLineChange14.png')

"Step 58: Click on span diffLineChange (diffLineChange14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_31]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 58-Click on span diffLineChange diffLineChange14.png')

"Step 59: Click on span diffLineChange (diffLineChange14)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_32]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 59-Click on span diffLineChange diffLineChange14.png')

"Step 60: Click on span diffLineChange (selectorValue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_14, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_14, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_33]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 60-Click on span diffLineChange selectorValue.png')

"Step 61: Click on span diffLineChange (selectorValue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_15, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_15, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_34]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 61-Click on span diffLineChange selectorValue.png')

"Step 62: Click on span diffLineChange19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange19'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 62-Click on span diffLineChange19.png')

"Step 63: Click on span diffLineChange (diffLineChange11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_16, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_16, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_35]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 63-Click on span diffLineChange diffLineChange11.png')

"Step 64: Click on span diffLineChange (diffLineChange11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_17, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_17, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_36]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 64-Click on span diffLineChange diffLineChange11.png')

"Step 65: Click on span diffLineChange (diffLineChange11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_18, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_18, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_37]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 65-Click on span diffLineChange diffLineChange11.png')

"Step 66: Click on span diffLineChange19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange19'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 66-Click on span diffLineChange19.png')

"Step 67: Click on span diffLineChange (diffLineChange11)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_19, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_19, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_38]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 67-Click on span diffLineChange diffLineChange11.png')

"Step 68: Click on span diffLineChange (diffLineChange20)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_20, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_20, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_39]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 68-Click on span diffLineChange diffLineChange20.png')

"Step 69: Click on span diffLineChange (diffLineChange20)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_21, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_21, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_40]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 69-Click on span diffLineChange diffLineChange20.png')

"Step 70: Click on span diffLineChange (diffLineChange10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_41]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 70-Click on span diffLineChange diffLineChange10.png')

"Step 71: Click on span diffLineChange (diffLineChange10)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_2', ['span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_42]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 71-Click on span diffLineChange diffLineChange10.png')

"Step 72: Click on span diffLineChange19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange19'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 72-Click on span diffLineChange19.png')

"Step 73: Click on span diffLineChange19"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange19'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 73-Click on span diffLineChange19.png')

"Step 74: Click on span diffLineChange (syntaxError)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_22, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_22, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_43]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 74-Click on span diffLineChange syntaxError.png')

"Step 75: Click on span diffLineChange (syntaxError)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange_3', ['span_diffLineChange_spanNthChild': span_diffLineChange_spanNthChild_23, 'span_diffLineChange_spanNthOfType': span_diffLineChange_spanNthOfType_23, 'span_diffLineChange_trNthChild': span_diffLineChange_trNthChild_44]))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 75-Click on span diffLineChange syntaxError.png')

"Step 76: Click on span diffLineChange21"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange21'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 76-Click on span diffLineChange21.png')

"Step 77: Click on button reviewChanges"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/button_reviewChanges'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 77-Click on button reviewChanges.png')

"Step 78: Click on span approve"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_approve'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 78-Click on span approve.png')

"Step 79: Click on input approve"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/input_approve'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 79-Click on input approve.png')

"Step 80: Click on button submitReview -> Navigate to page '/katalon-studio/katalon-atg/pull/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/button_submitReview'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 80-Click on button submitReview - Navigate to page katalon-studiokatalon-atgpull.png')

"Step 81: Click on div submissionSuccess"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull/div_submissionSuccess'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 81-Click on div submissionSuccess.png')

"Step 82: Click on link pullRequests -> Navigate to page '/katalon-studio/katalon-atg/pulls'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull/link_pullRequests'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 82-Click on link pullRequests - Navigate to page katalon-studiokatalon-atgpulls.png')

"Step 83: Click on link comparePullRequest -> Navigate to page '/katalon-studio/katalon-atg/compare/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pulls?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pulls/link_comparePullRequest'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 83-Click on link comparePullRequest - Navigate to page katalon-studiokatalon-atgcompare.png')

"Step 84: Enter input value in input pullRequestTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/compare/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_compare/input_pullRequestTitle'), input_pullRequestTitle)

WebUI.takeScreenshot(reportLocation + '/TC59/Step 84-Enter input value in input pullRequestTitle.png')

"Step 85: Click on span main"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/compare/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_compare/span_main'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 85-Click on span main.png')

"Step 86: Enter input value in input findBranch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/compare/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_compare/input_findBranch'), input_findBranch)

WebUI.takeScreenshot(reportLocation + '/TC59/Step 86-Enter input value in input findBranch.png')

"Step 87: Click on link releaseDefault"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/compare/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_compare/link_releaseDefault'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 87-Click on link releaseDefault.png')

"Step 88: Click on div pullRequestForm"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/compare/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_compare/div_pullRequestForm'))

// WebUI.takeScreenshot(reportLocation + '/TC59/Step 88-Click on div pullRequestForm.png')

"Step 89: Click on button createPullRequest -> Navigate to page '/katalon-studio/katalon-atg/pull/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/compare/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_compare/button_createPullRequest'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 89-Click on button createPullRequest - Navigate to page katalon-studiokatalon-atgpull.png')

"Step 90: Click on link pullRequests2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull/link_pullRequests2'))

WebUI.takeScreenshot(reportLocation + '/TC59/Step 90-Click on link pullRequests2 - Navigate to page .png')

"Step 91: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC59-Review and Approve Changes in Katalon Studio Pull Request_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}