import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to */*/*"

TrueTestScripts.navigate("${path_param_1}/${path_param_2}/${path_param_3}")

"Step 2: Hover over link dockLayout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_live_worksheet/link_dockLayout'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Hover over link dockLayout.png')

"Step 3: Click on link dockLayout2 -> Navigate to page 'dock management interface#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet/link_dockLayout2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on link dockLayout2 - Navigate to page dock management interface.png')

"Step 4: Hover over link dock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_dock_management_interface/link_dock'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Hover over link dock.png')

"Step 5: Click on link liveWorksheet -> Navigate to page 'live worksheet#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_interface/link_liveWorksheet'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on link liveWorksheet - Navigate to page live worksheet.png')

"Step 6: Select option with input value from select selectedWorkType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_live_worksheet/select_selectedWorkType'), select_selectedWorkType)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Select option with input value from select selectedWorkType.png')

"Step 7: Click on input actionButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet/input_actionButton'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on input actionButton.png')

"Step 8: Select option with input value from select doorYard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_live_worksheet/select_doorYard'), select_doorYard)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Select option with input value from select doorYard.png')

"Step 9: Select option with input value from select employeeDoor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_live_worksheet/select_employeeDoor'), select_employeeDoor)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Select option with input value from select employeeDoor.png')

"Step 10: Click on input arriveTrailer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet/input_arriveTrailer'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on input arriveTrailer.png')

"Step 11: Select option with input value from select selectedWorkType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_live_worksheet/select_selectedWorkType'), select_selectedWorkType_1)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Select option with input value from select selectedWorkType.png')

"Step 12: Click on label door"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet/label_door'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on label door.png')

"Step 13: Click on label door"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet/label_door'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on label door.png')

"Step 14: Click on label door"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet/label_door'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Click on label door.png')

"Step 15: Click on link deleteAssignWork"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet/link_deleteAssignWork'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Click on link deleteAssignWork.png')

"Step 16: Select option with input value from select workAssignmentEmployeeId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_live_worksheet/select_workAssignmentEmployeeId2'), select_workAssignmentEmployeeId)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16-Select option with input value from select workAssignmentEmployeeId.png')

"Step 17: Click on input saveWork"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet/input_saveWork'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 17-Click on input saveWork.png')

"Step 18: Hover over link dockLayout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_live_worksheet/link_dockLayout'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 18-Hover over link dockLayout.png')

"Step 19: Click on link dockLayout2 -> Navigate to page 'dock management interface#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet/link_dockLayout2'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 19-Click on link dockLayout2 - Navigate to page dock management interface.png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Assign Work and Verify Dock Management Interface_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}