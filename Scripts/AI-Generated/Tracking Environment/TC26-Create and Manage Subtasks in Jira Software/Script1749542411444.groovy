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

"Step 1: Navigate to /browse/* with params (focusedCommentId, page)"

TrueTestScripts.navigate("/browse/${browse_id}", ["focusedCommentId": browse_focusedCommentId, "page": browse_page])

"Step 2: Click on link activeSprints -> Navigate to page '/jira/software/c/projects/KIP/boards/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/browse/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_browse/link_activeSprints'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 2-Click on link activeSprints - Navigate to page jirasoftwarecprojectsKIPboards.png')

"Step 3: Click on span errorMessages (errorMessage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_errorMessages"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/span_errorMessages', ['span_errorMessages_cardKip': span_errorMessages_cardKip, 'span_errorMessages_divNthOfType': span_errorMessages_divNthOfType, 'span_errorMessages_divNthOfType_1': span_errorMessages_divNthOfType_1, 'span_errorMessages_divNthOfType_2': span_errorMessages_divNthOfType_2, 'span_errorMessages_divNthOfType_3': span_errorMessages_divNthOfType_3, 'span_errorMessages_liNthOfType': span_errorMessages_liNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 3-Click on span errorMessages errorMessage.png')

"Step 4: Click on list softwareBoard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/list_softwareBoard'))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 4-Click on list softwareBoard.png')

"Step 5: Click on button kipActions (kip4915)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_kipActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_jira_software_c_projects_KIP_boards/button_kipActions', ['button_kipActions_class': button_kipActions_class, 'button_kipActions_divNthOfType': button_kipActions_divNthOfType, 'button_kipActions_nth': button_kipActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 5-Click on button kipActions kip4915.png')

"Step 6: Click on button createSubtask"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_createSubtask'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 6-Click on button createSubtask.png')

"Step 7: Click on button changeStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_changeStatus'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 7-Click on button changeStatus.png')

"Step 8: Click on div willNotImplement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_willNotImplement'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 8-Click on div willNotImplement.png')

"Step 9: Click on input whatNeedsToBeDone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/input_whatNeedsToBeDone'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 9-Click on input whatNeedsToBeDone.png')

"Step 10: Enter input value in input whatNeedsToBeDone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/input_whatNeedsToBeDone'), input_whatNeedsToBeDone)

WebUI.takeScreenshot(reportLocation + '/TC26/Step 10-Enter input value in input whatNeedsToBeDone.png')

"Step 11: Click on div createCancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/div_createCancel'))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 11-Click on div createCancel.png')

"Step 12: Click on input whatNeedsToBeDone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/input_whatNeedsToBeDone'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 12-Click on input whatNeedsToBeDone.png')

"Step 13: Enter input value in input whatNeedsToBeDone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/input_whatNeedsToBeDone'), input_whatNeedsToBeDone_1)

WebUI.takeScreenshot(reportLocation + '/TC26/Step 13-Enter input value in input whatNeedsToBeDone.png')

"Step 14: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_create'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 14-Click on button create.png')

"Step 15: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/jira/software/c/projects/KIP/boards/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_jira_software_c_projects_KIP_boards/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 15-Click on button close.png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC26-Create and Manage Subtasks in Jira Software_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}