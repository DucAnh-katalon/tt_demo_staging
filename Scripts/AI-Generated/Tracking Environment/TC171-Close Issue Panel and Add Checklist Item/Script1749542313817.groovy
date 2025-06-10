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

"Step 1: Navigate to /issue/*/panel with params (checklistAlwaysEnabledProjectLevelProperty, checklistAlwaysEnabledProjectLevelPropertyExists, checklistAlwaysEnabledProperty, cp, customViewPermissionEnabledProperty, cv, hasAddChecklistPermission, hasDeleteChecklistPermission, hasEditChecklistPermission, hasEditIssuePermission, hasManageTemplatePermission, hasToggleChecklistPermission, hasViewTemplatePermission, isAdmin, isClassicProject, isEpic, isIssueContentModule, isIssueEditable, isIssueInProject, isProjectAdmin, isServiceDeskProject, isUserOnlyServiceDeskCustomer, isUserProjectRoleAgent, isUserProjectRoleMember, isUserProjectRoleViewer, issueId, issueIsDone, issueTypeId, issueWasRecentlyClosed, jwt, lic, panelNameOptionKey, position, projectId, requestTypeId, xdm c, xdm deprecated addon key do not use, xdm e)"

TrueTestScripts.navigate("/issue/${issue_id}/panel", ["checklistAlwaysEnabledProjectLevelProperty": panel_checklistAlwaysEnabledProjectLevelProperty, "checklistAlwaysEnabledProjectLevelPropertyExists": panel_checklistAlwaysEnabledProjectLevelPropertyExists, "checklistAlwaysEnabledProperty": panel_checklistAlwaysEnabledProperty, "cp": panel_cp, "customViewPermissionEnabledProperty": panel_customViewPermissionEnabledProperty, "cv": panel_cv, "hasAddChecklistPermission": panel_hasAddChecklistPermission, "hasDeleteChecklistPermission": panel_hasDeleteChecklistPermission, "hasEditChecklistPermission": panel_hasEditChecklistPermission, "hasEditIssuePermission": panel_hasEditIssuePermission, "hasManageTemplatePermission": panel_hasManageTemplatePermission, "hasToggleChecklistPermission": panel_hasToggleChecklistPermission, "hasViewTemplatePermission": panel_hasViewTemplatePermission, "isAdmin": panel_isAdmin, "isClassicProject": panel_isClassicProject, "isEpic": panel_isEpic, "isIssueContentModule": panel_isIssueContentModule, "isIssueEditable": panel_isIssueEditable, "isIssueInProject": panel_isIssueInProject, "isProjectAdmin": panel_isProjectAdmin, "isServiceDeskProject": panel_isServiceDeskProject, "isUserOnlyServiceDeskCustomer": panel_isUserOnlyServiceDeskCustomer, "isUserProjectRoleAgent": panel_isUserProjectRoleAgent, "isUserProjectRoleMember": panel_isUserProjectRoleMember, "isUserProjectRoleViewer": panel_isUserProjectRoleViewer, "issueId": panel_issueId, "issueIsDone": panel_issueIsDone, "issueTypeId": panel_issueTypeId, "issueWasRecentlyClosed": panel_issueWasRecentlyClosed, "jwt": panel_jwt, "lic": panel_lic, "panelNameOptionKey": panel_panelNameOptionKey, "position": panel_position, "projectId": panel_projectId, "requestTypeId": panel_requestTypeId, "xdm_c": panel_xdm_c, "xdm_deprecated_addon_key_do_not_use": panel_xdm_deprecated_addon_key_do_not_use, "xdm_e": panel_xdm_e])

"Step 2: Click on div closeIcon"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/issue/.*/panel?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_issue_panel/div_closeIcon'))

// WebUI.takeScreenshot(reportLocation + '/TC171/Step 2-Click on div closeIcon.png')

"Step 3: Click on textarea addChecklistItem -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/issue/.*/panel?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_issue_panel/textarea_addChecklistItem'))

WebUI.takeScreenshot(reportLocation + '/TC171/Step 3-Click on textarea addChecklistItem - Navigate to page .png')

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC171-Close Issue Panel and Add Checklist Item_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}