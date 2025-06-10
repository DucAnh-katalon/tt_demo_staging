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

"Step 1: Navigate to /katalon-studio/katalon-atg/pull/*/files"

TrueTestScripts.navigate("/katalon-studio/katalon-atg/pull/${pull_id}/files")

"Step 2: Click on span switchToWindowTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_switchToWindowTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 2-Click on span switchToWindowTitle.png')

"Step 3: Click on span switchToWindowTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_switchToWindowTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 3-Click on span switchToWindowTitle.png')

"Step 4: Click on span switchToWindowTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_switchToWindowTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 4-Click on span switchToWindowTitle.png')

"Step 5: Hover over button addLineComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/button_addLineComment'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 5-Hover over button addLineComment.png')

"Step 6: Click on input viewed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/input_viewed'))

WebUI.takeScreenshot(reportLocation + '/TC135/Step 6-Click on input viewed.png')

"Step 7: Click on input markAsViewed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/input_markAsViewed'))

WebUI.takeScreenshot(reportLocation + '/TC135/Step 7-Click on input markAsViewed.png')

"Step 8: Click on input viewed2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/input_viewed2'))

WebUI.takeScreenshot(reportLocation + '/TC135/Step 8-Click on input viewed2.png')

"Step 9: Hover over button addLineComment2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/button_addLineComment2'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 9-Hover over button addLineComment2.png')

"Step 10: Click on label viewed"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/label_viewed'))

WebUI.takeScreenshot(reportLocation + '/TC135/Step 10-Click on label viewed.png')

"Step 11: Click on label viewed2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/label_viewed2'))

WebUI.takeScreenshot(reportLocation + '/TC135/Step 11-Click on label viewed2.png')

"Step 12: Click on input viewed3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/input_viewed3'))

WebUI.takeScreenshot(reportLocation + '/TC135/Step 12-Click on input viewed3.png')

"Step 13: Click on label viewed3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/label_viewed3'))

WebUI.takeScreenshot(reportLocation + '/TC135/Step 13-Click on label viewed3.png')

"Step 14: Click on span diffLineChange22"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange22'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 14-Click on span diffLineChange22.png')

"Step 15: Click on span diffLineChange23"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange23'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 15-Click on span diffLineChange23.png')

"Step 16: Click on span diffLineChange24"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange24'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 16-Click on span diffLineChange24.png')

"Step 17: Click on span diffLineChange24"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange24'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 17-Click on span diffLineChange24.png')

"Step 18: Click on span diffLineChange24"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange24'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 18-Click on span diffLineChange24.png')

"Step 19: Click on span diffLineChange23"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange23'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 19-Click on span diffLineChange23.png')

"Step 20: Click on span diffLineChange25"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange25'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 20-Click on span diffLineChange25.png')

"Step 21: Click on span diffLineChange23"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange23'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 21-Click on span diffLineChange23.png')

"Step 22: Click on span diffLineChange24"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange24'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 22-Click on span diffLineChange24.png')

"Step 23: Click on span diffLineChange24"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange24'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 23-Click on span diffLineChange24.png')

"Step 24: Click on span diffLineChange24"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange24'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 24-Click on span diffLineChange24.png')

"Step 25: Click on span diffLineChange24"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange24'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 25-Click on span diffLineChange24.png')

"Step 26: Click on span diffLineChange23"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange23'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 26-Click on span diffLineChange23.png')

"Step 27: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/td_object'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 27-Click on td object.png')

"Step 28: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/td_object'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 28-Click on td object.png')

"Step 29: Click on span diffLineChange26"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange26'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 29-Click on span diffLineChange26.png')

"Step 30: Click on span diffLineChange26"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/span_diffLineChange26'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 30-Click on span diffLineChange26.png')

"Step 31: Hover over div diffLineNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/div_diffLineNumber'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 31-Hover over div diffLineNumber.png')

"Step 32: Hover over label viewed4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/label_viewed4'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 32-Hover over label viewed4.png')

"Step 33: Hover over label viewed5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/label_viewed5'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 33-Hover over label viewed5.png')

"Step 34: Hover over button askCopilot"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/button_askCopilot'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 34-Hover over button askCopilot.png')

"Step 35: Hover over label viewed6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/label_viewed6'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 35-Hover over label viewed6.png')

"Step 36: Hover over label viewed4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/label_viewed4'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 36-Hover over label viewed4.png')

"Step 37: Hover over label viewed5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/label_viewed5'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 37-Hover over label viewed5.png')

"Step 38: Click on button reviewChanges2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/button_reviewChanges2'))

WebUI.takeScreenshot(reportLocation + '/TC135/Step 38-Click on button reviewChanges2.png')

"Step 39: Click on label approve"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/label_approve'))

WebUI.takeScreenshot(reportLocation + '/TC135/Step 39-Click on label approve.png')

"Step 40: Click on td diffLineChange2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/td_diffLineChange2'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 40-Click on td diffLineChange2.png')

"Step 41: Hover over summary expand"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/summary_expand'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 41-Hover over summary expand.png')

"Step 42: Hover over label viewed7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/label_viewed7'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 42-Hover over label viewed7.png')

"Step 43: Hover over label viewed8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/label_viewed8'))

// WebUI.takeScreenshot(reportLocation + '/TC135/Step 43-Hover over label viewed8.png')

"Step 44: Click on button reviewChanges2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/button_reviewChanges2'))

WebUI.takeScreenshot(reportLocation + '/TC135/Step 44-Click on button reviewChanges2.png')

"Step 45: Click on button submitReview2 -> Navigate to page '/katalon-studio/katalon-atg/pull/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/katalon-studio/katalon-atg/pull/.*/files?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_katalon_studio_katalon_atg_pull_files/button_submitReview2'))

WebUI.takeScreenshot(reportLocation + '/TC135/Step 45-Click on button submitReview2 - Navigate to page katalon-studiokatalon-atgpull.png')

"Step 46: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC135-Review and Approve Changes in Katalon Studio Pull Request_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}