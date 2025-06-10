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

"Step 1: Navigate to /katalon-studio/katalon-atg"

TrueTestScripts.navigate("/katalon-studio/katalon-atg")

"Step 2: Click on link latestCommit -> Navigate to page '/katalon-studio/katalon-atg/commit/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg/link_latestCommit'))

WebUI.takeScreenshot(reportLocation + '/TC144/Step 2-Click on link latestCommit - Navigate to page katalon-studiokatalon-atgcommit.png')

"Step 3: Click on item model"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/item_model'))

WebUI.takeScreenshot(reportLocation + '/TC144/Step 3-Click on item model.png')

"Step 4: Click on link flowStepCompiler"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/link_flowStepCompiler'))

WebUI.takeScreenshot(reportLocation + '/TC144/Step 4-Click on link flowStepCompiler.png')

"Step 5: Click on span diffLineChange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/span_diffLineChange'))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 5-Click on span diffLineChange.png')

"Step 6: Click on span diffLineChange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/span_diffLineChange2'))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 6-Click on span diffLineChange2.png')

"Step 7: Click on span diffLineChanges (diffLineChange3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineChanges"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineChanges', ['span_diffLineChanges_trNthChild': span_diffLineChanges_trNthChild, 'span_diffLineChanges_trNthOfType': span_diffLineChanges_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 7-Click on span diffLineChanges diffLineChange3.png')

"Step 8: Click on span diffLineChanges (diffLineChange3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineChanges"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineChanges', ['span_diffLineChanges_trNthChild': span_diffLineChanges_trNthChild_1, 'span_diffLineChanges_trNthOfType': span_diffLineChanges_trNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 8-Click on span diffLineChanges diffLineChange3.png')

"Step 9: Click on span diffLineChanges (diffLineChange4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineChanges"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineChanges', ['span_diffLineChanges_trNthChild': span_diffLineChanges_trNthChild_2, 'span_diffLineChanges_trNthOfType': span_diffLineChanges_trNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 9-Click on span diffLineChanges diffLineChange4.png')

"Step 10: Click on span diffLineChanges (diffLineChange4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineChanges"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineChanges', ['span_diffLineChanges_trNthChild': span_diffLineChanges_trNthChild_3, 'span_diffLineChanges_trNthOfType': span_diffLineChanges_trNthOfType_3]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 10-Click on span diffLineChanges diffLineChange4.png')

"Step 11: Click on div diffLineChange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/div_diffLineChange'))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 11-Click on div diffLineChange.png')

"Step 12: Click on span diffLineChange5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/span_diffLineChange5'))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 12-Click on span diffLineChange5.png')

"Step 13: Click on div originalFileLineNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/div_originalFileLineNumber'))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 13-Click on div originalFileLineNumber.png')

"Step 14: Click on span diffLineChanges (diffLineChange3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineChanges"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineChanges', ['span_diffLineChanges_trNthChild': span_diffLineChanges_trNthChild_4, 'span_diffLineChanges_trNthOfType': span_diffLineChanges_trNthOfType_4]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 14-Click on span diffLineChanges diffLineChange3.png')

"Step 15: Click on span diffLineChanges (diffLineChange3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineChanges"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineChanges', ['span_diffLineChanges_trNthChild': span_diffLineChanges_trNthChild_5, 'span_diffLineChanges_trNthOfType': span_diffLineChanges_trNthOfType_5]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 15-Click on span diffLineChanges diffLineChange3.png')

"Step 16: Click on div diffLineChange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/div_diffLineChange2'))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 16-Click on div diffLineChange2.png')

"Step 17: Click on div diffLineChange3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/div_diffLineChange3'))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 17-Click on div diffLineChange3.png')

"Step 18: Click on span diffLineContext (diffLineChange6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext', ['span_diffLineContext_divNthOfType': span_diffLineContext_divNthOfType, 'span_diffLineContext_spanNthChild': span_diffLineContext_spanNthChild, 'span_diffLineContext_spanNthOfType': span_diffLineContext_spanNthOfType, 'span_diffLineContext_trNthChild': span_diffLineContext_trNthChild, 'span_diffLineContext_trNthOfType': span_diffLineContext_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 18-Click on span diffLineContext diffLineChange6.png')

"Step 19: Click on span diffLineContext (diffLineChange6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext', ['span_diffLineContext_divNthOfType': span_diffLineContext_divNthOfType_1, 'span_diffLineContext_spanNthChild': span_diffLineContext_spanNthChild_1, 'span_diffLineContext_spanNthOfType': span_diffLineContext_spanNthOfType_1, 'span_diffLineContext_trNthChild': span_diffLineContext_trNthChild_1, 'span_diffLineContext_trNthOfType': span_diffLineContext_trNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 19-Click on span diffLineContext diffLineChange6.png')

"Step 20: Click on span diffLineContextPopup (diffLineChange7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContextPopup"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContextPopup', ['span_diffLineContextPopup_divNthOfType': span_diffLineContextPopup_divNthOfType, 'span_diffLineContextPopup_spanNthChild': span_diffLineContextPopup_spanNthChild, 'span_diffLineContextPopup_spanNthOfType': span_diffLineContextPopup_spanNthOfType, 'span_diffLineContextPopup_trNthChild': span_diffLineContextPopup_trNthChild, 'span_diffLineContextPopup_trNthOfType': span_diffLineContextPopup_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 20-Click on span diffLineContextPopup diffLineChange7.png')

"Step 21: Click on span diffLineContextPopup (diffLineChange7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContextPopup"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContextPopup', ['span_diffLineContextPopup_divNthOfType': span_diffLineContextPopup_divNthOfType_1, 'span_diffLineContextPopup_spanNthChild': span_diffLineContextPopup_spanNthChild_1, 'span_diffLineContextPopup_spanNthOfType': span_diffLineContextPopup_spanNthOfType_1, 'span_diffLineContextPopup_trNthChild': span_diffLineContextPopup_trNthChild_1, 'span_diffLineContextPopup_trNthOfType': span_diffLineContextPopup_trNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 21-Click on span diffLineContextPopup diffLineChange7.png')

"Step 22: Click on span diffLineContextPopup (diffLineChangeContext)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContextPopup"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContextPopup', ['span_diffLineContextPopup_divNthOfType': span_diffLineContextPopup_divNthOfType_2, 'span_diffLineContextPopup_spanNthChild': span_diffLineContextPopup_spanNthChild_2, 'span_diffLineContextPopup_spanNthOfType': span_diffLineContextPopup_spanNthOfType_2, 'span_diffLineContextPopup_trNthChild': span_diffLineContextPopup_trNthChild_2, 'span_diffLineContextPopup_trNthOfType': span_diffLineContextPopup_trNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 22-Click on span diffLineContextPopup diffLineChangeContext.png')

"Step 23: Click on span diffLineContext (diffLineChangeContextPopup)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext', ['span_diffLineContext_divNthOfType': span_diffLineContext_divNthOfType_2, 'span_diffLineContext_spanNthChild': span_diffLineContext_spanNthChild_2, 'span_diffLineContext_spanNthOfType': span_diffLineContext_spanNthOfType_2, 'span_diffLineContext_trNthChild': span_diffLineContext_trNthChild_2, 'span_diffLineContext_trNthOfType': span_diffLineContext_trNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 23-Click on span diffLineContext diffLineChangeContextPopup.png')

"Step 24: Click on span diffLineContext (diffLineChangeContextPopup)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext', ['span_diffLineContext_divNthOfType': span_diffLineContext_divNthOfType_3, 'span_diffLineContext_spanNthChild': span_diffLineContext_spanNthChild_3, 'span_diffLineContext_spanNthOfType': span_diffLineContext_spanNthOfType_3, 'span_diffLineContext_trNthChild': span_diffLineContext_trNthChild_3, 'span_diffLineContext_trNthOfType': span_diffLineContext_trNthOfType_3]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 24-Click on span diffLineContext diffLineChangeContextPopup.png')

"Step 25: Click on span diffLineContext (context)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext', ['span_diffLineContext_divNthOfType': span_diffLineContext_divNthOfType_4, 'span_diffLineContext_spanNthChild': span_diffLineContext_spanNthChild_4, 'span_diffLineContext_spanNthOfType': span_diffLineContext_spanNthOfType_4, 'span_diffLineContext_trNthChild': span_diffLineContext_trNthChild_4, 'span_diffLineContext_trNthOfType': span_diffLineContext_trNthOfType_4]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 25-Click on span diffLineContext context.png')

"Step 26: Click on span diffLineContext (context)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext', ['span_diffLineContext_divNthOfType': span_diffLineContext_divNthOfType_5, 'span_diffLineContext_spanNthChild': span_diffLineContext_spanNthChild_5, 'span_diffLineContext_spanNthOfType': span_diffLineContext_spanNthOfType_5, 'span_diffLineContext_trNthChild': span_diffLineContext_trNthChild_5, 'span_diffLineContext_trNthOfType': span_diffLineContext_trNthOfType_5]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 26-Click on span diffLineContext context.png')

"Step 27: Click on span diffLineContext (diffLineChangeContextPopup)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext', ['span_diffLineContext_divNthOfType': span_diffLineContext_divNthOfType_6, 'span_diffLineContext_spanNthChild': span_diffLineContext_spanNthChild_6, 'span_diffLineContext_spanNthOfType': span_diffLineContext_spanNthOfType_6, 'span_diffLineContext_trNthChild': span_diffLineContext_trNthChild_6, 'span_diffLineContext_trNthOfType': span_diffLineContext_trNthOfType_6]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 27-Click on span diffLineContext diffLineChangeContextPopup.png')

"Step 28: Click on span diffLineContext (diffLineChangeContextPopup)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContext', ['span_diffLineContext_divNthOfType': span_diffLineContext_divNthOfType_7, 'span_diffLineContext_spanNthChild': span_diffLineContext_spanNthChild_7, 'span_diffLineContext_spanNthOfType': span_diffLineContext_spanNthOfType_7, 'span_diffLineContext_trNthChild': span_diffLineContext_trNthChild_7, 'span_diffLineContext_trNthOfType': span_diffLineContext_trNthOfType_7]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 28-Click on span diffLineContext diffLineChangeContextPopup.png')

"Step 29: Click on div diffLineChange4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/div_diffLineChange4'))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 29-Click on div diffLineChange4.png')

"Step 30: Click on div diffLineChange4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/div_diffLineChange4'))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 30-Click on div diffLineChange4.png')

"Step 31: Click on span diffLineContextPopup (extraIsPopup)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContextPopup"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContextPopup', ['span_diffLineContextPopup_divNthOfType': span_diffLineContextPopup_divNthOfType_3, 'span_diffLineContextPopup_spanNthChild': span_diffLineContextPopup_spanNthChild_3, 'span_diffLineContextPopup_spanNthOfType': span_diffLineContextPopup_spanNthOfType_3, 'span_diffLineContextPopup_trNthChild': span_diffLineContextPopup_trNthChild_3, 'span_diffLineContextPopup_trNthOfType': span_diffLineContextPopup_trNthOfType_3]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 31-Click on span diffLineContextPopup extraIsPopup.png')

"Step 32: Click on span diffLineContextPopup (extraIsPopup)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContextPopup"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContextPopup', ['span_diffLineContextPopup_divNthOfType': span_diffLineContextPopup_divNthOfType_4, 'span_diffLineContextPopup_spanNthChild': span_diffLineContextPopup_spanNthChild_4, 'span_diffLineContextPopup_spanNthOfType': span_diffLineContextPopup_spanNthOfType_4, 'span_diffLineContextPopup_trNthChild': span_diffLineContextPopup_trNthChild_4, 'span_diffLineContextPopup_trNthOfType': span_diffLineContextPopup_trNthOfType_4]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 32-Click on span diffLineContextPopup extraIsPopup.png')

"Step 33: Click on span diffLineContextPopup (extraIsPopup)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContextPopup"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContextPopup', ['span_diffLineContextPopup_divNthOfType': span_diffLineContextPopup_divNthOfType_5, 'span_diffLineContextPopup_spanNthChild': span_diffLineContextPopup_spanNthChild_5, 'span_diffLineContextPopup_spanNthOfType': span_diffLineContextPopup_spanNthOfType_5, 'span_diffLineContextPopup_trNthChild': span_diffLineContextPopup_trNthChild_5, 'span_diffLineContextPopup_trNthOfType': span_diffLineContextPopup_trNthOfType_5]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 33-Click on span diffLineContextPopup extraIsPopup.png')

"Step 34: Click on span diffLineContextPopup (extraIsPopup)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContextPopup"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_katalon_studio_katalon_atg_commit/span_diffLineContextPopup', ['span_diffLineContextPopup_divNthOfType': span_diffLineContextPopup_divNthOfType_6, 'span_diffLineContextPopup_spanNthChild': span_diffLineContextPopup_spanNthChild_6, 'span_diffLineContextPopup_spanNthOfType': span_diffLineContextPopup_spanNthOfType_6, 'span_diffLineContextPopup_trNthChild': span_diffLineContextPopup_trNthChild_6, 'span_diffLineContextPopup_trNthOfType': span_diffLineContextPopup_trNthOfType_6]))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 34-Click on span diffLineContextPopup extraIsPopup.png')

"Step 35: Click on div diffLineChange5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/div_diffLineChange5'))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 35-Click on div diffLineChange5.png')

"Step 36: Click on div diffLineChange5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/div_diffLineChange5'))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 36-Click on div diffLineChange5.png')

"Step 37: Click on span diffLineChange8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/span_diffLineChange8'))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 37-Click on span diffLineChange8.png')

"Step 38: Click on div diffLineChange5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/div_diffLineChange5'))

// WebUI.takeScreenshot(reportLocation + '/TC144/Step 38-Click on div diffLineChange5.png')

"Step 39: Click on link pullRequests"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/link_pullRequests'))

WebUI.takeScreenshot(reportLocation + '/TC144/Step 39-Click on link pullRequests.png')

"Step 40: Click on link pullRequests -> Navigate to page '/katalon-studio/katalon-atg/pulls'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/commit/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_commit/link_pullRequests'))

WebUI.takeScreenshot(reportLocation + '/TC144/Step 40-Click on link pullRequests - Navigate to page katalon-studiokatalon-atgpulls.png')

"Step 41: Click on link replaceUrlInSpecialEvent -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pulls?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pulls/link_replaceUrlInSpecialEvent'))

WebUI.takeScreenshot(reportLocation + '/TC144/Step 41-Click on link replaceUrlInSpecialEvent - Navigate to page .png')

"Step 42: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC144-Explore Katalon Studio Commit Changes and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}