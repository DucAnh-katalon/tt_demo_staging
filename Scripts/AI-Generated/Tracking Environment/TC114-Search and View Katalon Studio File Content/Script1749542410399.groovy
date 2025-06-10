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

"Step 2: Click on link katalonStudio -> Navigate to page '/katalon-studio'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg/link_katalonStudio'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 2-Click on link katalonStudio - Navigate to page katalon-studio.png')

"Step 3: Click on input searchRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio/input_searchRepository'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 3-Click on input searchRepository.png')

"Step 4: Enter input value in input searchRepository"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio/input_searchRepository'), input_searchRepository)

WebUI.takeScreenshot(reportLocation + '/TC114/Step 4-Enter input value in input searchRepository.png')

"Step 5: Click on link katalonFlow -> Navigate to page '/katalon-studio/katalon-flow'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio/link_katalonFlow'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 5-Click on link katalonFlow - Navigate to page katalon-studiokatalon-flow.png')

"Step 6: Click on link schemas -> Navigate to page '/katalon-studio/katalon-flow/tree/main/schemas'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow/link_schemas'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 6-Click on link schemas - Navigate to page katalon-studiokatalon-flowtreemainschemas.png')

"Step 7: Click on link viewFile -> Navigate to page '/katalon-studio/katalon-flow/blob/main/schemas/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/tree/main/schemas?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_tree_main_schemas/link_viewFile'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 7-Click on link viewFile - Navigate to page katalon-studiokatalon-flowblobmainschemas.png')

"Step 8: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 8-Click on textarea fileContent.png')

"Step 9: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 9-Click on textarea fileContent.png')

"Step 10: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 10-Click on textarea fileContent.png')

"Step 11: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 11-Click on textarea fileContent.png')

"Step 12: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 12-Click on textarea fileContent.png')

"Step 13: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 13-Click on textarea fileContent.png')

"Step 14: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 14-Click on textarea fileContent.png')

"Step 15: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 15-Click on textarea fileContent.png')

"Step 16: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 16-Click on textarea fileContent.png')

"Step 17: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 17-Click on textarea fileContent.png')

"Step 18: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 18-Click on textarea fileContent.png')

"Step 19: Click on div navigationCursor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/div_navigationCursor'))

// WebUI.takeScreenshot(reportLocation + '/TC114/Step 19-Click on div navigationCursor.png')

"Step 20: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 20-Click on textarea fileContent.png')

"Step 21: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 21-Click on textarea fileContent.png')

"Step 22: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 22-Click on textarea fileContent.png')

"Step 23: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 23-Click on textarea fileContent.png')

"Step 24: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 24-Click on textarea fileContent.png')

"Step 25: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 25-Click on textarea fileContent.png')

"Step 26: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 26-Click on textarea fileContent.png')

"Step 27: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 27-Click on textarea fileContent.png')

"Step 28: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 28-Click on textarea fileContent.png')

"Step 29: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 29-Click on textarea fileContent.png')

"Step 30: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 30-Click on textarea fileContent.png')

"Step 31: Click on div navigationCursor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/div_navigationCursor'))

// WebUI.takeScreenshot(reportLocation + '/TC114/Step 31-Click on div navigationCursor.png')

"Step 32: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 32-Click on textarea fileContent.png')

"Step 33: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 33-Click on textarea fileContent.png')

"Step 34: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 34-Click on textarea fileContent.png')

"Step 35: Click on div navigationCursor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/div_navigationCursor'))

// WebUI.takeScreenshot(reportLocation + '/TC114/Step 35-Click on div navigationCursor.png')

"Step 36: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 36-Click on textarea fileContent.png')

"Step 37: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 37-Click on textarea fileContent.png')

"Step 38: Click on textarea fileContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 38-Click on textarea fileContent.png')

"Step 39: Click on div navigationCursor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/div_navigationCursor'))

// WebUI.takeScreenshot(reportLocation + '/TC114/Step 39-Click on div navigationCursor.png')

"Step 40: Click on textarea fileContent -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-flow/blob/main/schemas/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_flow_blob_main_schemas/textarea_fileContent'))

WebUI.takeScreenshot(reportLocation + '/TC114/Step 40-Click on textarea fileContent - Navigate to page .png')

"Step 41: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC114-Search and View Katalon Studio File Content_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}