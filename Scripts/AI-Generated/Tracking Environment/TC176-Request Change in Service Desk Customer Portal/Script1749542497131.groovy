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

"Step 1: Navigate to /servicedesk/customer/portal/*/group/*"

TrueTestScripts.navigate("/servicedesk/customer/portal/${portal_id}/group/${group_id}")

"Step 2: Click on link requestChange -> Navigate to page '/servicedesk/customer/portal/*/group/*/create/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group/link_requestChange'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 2-Click on link requestChange - Navigate to page servicedeskcustomerportalgroupcreate.png')

"Step 3: Click on input summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/input_summary'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 3-Click on input summary.png')

"Step 4: Enter input value in input summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/input_summary'), input_summary)

WebUI.takeScreenshot(reportLocation + '/TC176/Step 4-Enter input value in input summary.png')

"Step 5: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 5-Click on div object.png')

"Step 6: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 6-Click on div object2.png')

"Step 7: Click on div aiOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_aiOption'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 7-Click on div aiOption.png')

"Step 8: Click on div aiOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_aiOption'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 8-Click on div aiOption.png')

"Step 9: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 9-Click on div object3.png')

"Step 10: Click on div normalOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_normalOption'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 10-Click on div normalOption.png')

"Step 11: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_object4'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 11-Click on div object4.png')

"Step 12: Click on section helpCenter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/section_helpCenter'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 12-Click on section helpCenter.png')

"Step 13: Click on div selectOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_selectOption'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 13-Click on div selectOption.png')

"Step 14: Click on div minorLocalizedOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_minorLocalizedOption'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 14-Click on div minorLocalizedOption.png')

"Step 15: Click on div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_object5'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 15-Click on div object5.png')

"Step 16: Click on div optionMedium"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_optionMedium'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 16-Click on div optionMedium.png')

"Step 17: Click on div selectOption2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_selectOption2'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 17-Click on div selectOption2.png')

"Step 18: Click on div selectOptionLow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_selectOptionLow'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 18-Click on div selectOptionLow.png')

"Step 19: Click on div object6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_object6'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 19-Click on div object6.png')

"Step 20: Click on div reactSelect7Option1"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_reactSelect7Option1'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 20-Click on div reactSelect7Option1.png')

"Step 21: Click on div valueContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_valueContainer'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 21-Click on div valueContainer.png')

"Step 22: Click on div upgradeOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_upgradeOption'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 22-Click on div upgradeOption.png')

"Step 23: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 23-Click on div object.png')

"Step 24: Click on div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_object7'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 24-Click on div object7.png')

"Step 25: Click on input summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/input_summary'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 25-Click on input summary.png')

"Step 26: Enter input value in input summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/input_summary'), input_summary_1)

WebUI.takeScreenshot(reportLocation + '/TC176/Step 26-Enter input value in input summary.png')

"Step 27: Click on div requestAchange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_requestAchange'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 27-Click on div requestAchange.png')

"Step 28: Click on input summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/input_summary'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 28-Click on input summary.png')

"Step 29: Click on input summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/input_summary'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 29-Click on input summary.png')

"Step 30: Enter input value in input summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/input_summary'), input_summary_2)

WebUI.takeScreenshot(reportLocation + '/TC176/Step 30-Enter input value in input summary.png')

"Step 31: Click on label helpRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/label_helpRequest'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 31-Click on label helpRequest.png')

"Step 32: Click on label helpRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/label_helpRequest'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 32-Click on label helpRequest.png')

"Step 33: Click on div requestChange"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_requestChange'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 33-Click on div requestChange.png')

"Step 34: Click on input summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/input_summary'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 34-Click on input summary.png')

"Step 35: Enter input value in input summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/input_summary'), input_summary_3)

WebUI.takeScreenshot(reportLocation + '/TC176/Step 35-Enter input value in input summary.png')

"Step 36: Click on div ai"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_ai'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 36-Click on div ai.png')

"Step 37: Click on div helpCenter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_helpCenter'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 37-Click on div helpCenter.png')

"Step 38: Click on div changeType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_changeType'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 38-Click on div changeType.png')

"Step 39: Click on div valueContainer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_valueContainer2'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 39-Click on div valueContainer2.png')

"Step 40: Click on section helpCenter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/section_helpCenter'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 40-Click on section helpCenter2.png')

"Step 41: Click on div object8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_object8'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 41-Click on div object8.png')

"Step 42: Click on div urgency"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_urgency'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 42-Click on div urgency.png')

"Step 43: Click on div object9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_object9'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 43-Click on div object9.png')

"Step 44: Click on div urgency"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_urgency'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 44-Click on div urgency.png')

"Step 45: Click on div object9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_object9'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 45-Click on div object9.png')

"Step 46: Click on div urgency"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_urgency'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 46-Click on div urgency.png')

"Step 47: Click on div priorityLow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_priorityLow'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 47-Click on div priorityLow.png')

"Step 48: Click on div lowPriority"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_lowPriority'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 48-Click on div lowPriority.png')

"Step 49: Click on div lowPriority"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_lowPriority'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 49-Click on div lowPriority.png')

"Step 50: Click on div createGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_createGroup'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 50-Click on div createGroup.png')

"Step 51: Click on div createGroup"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_createGroup'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 51-Click on div createGroup.png')

"Step 52: Click on div changeRisk"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_changeRisk'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 52-Click on div changeRisk.png')

"Step 53: Click on div object10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_object10'))

// WebUI.takeScreenshot(reportLocation + '/TC176/Step 53-Click on div object10.png')

"Step 54: Click on input summary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/input_summary'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 54-Click on input summary.png')

"Step 55: Enter input value in div textArea"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/div_textArea'), div_textArea)

WebUI.takeScreenshot(reportLocation + '/TC176/Step 55-Enter input value in div textArea.png')

"Step 56: Click on p implementCoreLogic"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/p_implementCoreLogic'))

WebUI.takeScreenshot(reportLocation + '/TC176/Step 56-Click on p implementCoreLogic.png')

"Step 57: Enter input value in input summary -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/servicedesk/customer/portal/.*/group/.*/create/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_servicedesk_customer_portal_group_create/input_summary'), input_summary_4)

WebUI.takeScreenshot(reportLocation + '/TC176/Step 57-Enter input value in input summary - Navigate to page .png')

"Step 58: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC176-Request Change in Service Desk Customer Portal_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}