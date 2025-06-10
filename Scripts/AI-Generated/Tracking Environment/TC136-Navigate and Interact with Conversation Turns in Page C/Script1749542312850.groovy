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

"Step 1: Navigate to /c/*"

TrueTestScripts.navigate("/c/${c_id}")

"Step 2: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_c/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 2-Click on div object.png')

"Step 3: Enter input value in div promptTextarea"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_c/div_promptTextarea'), div_promptTextarea)

WebUI.takeScreenshot(reportLocation + '/TC136/Step 3-Enter input value in div promptTextarea.png')

"Step 4: Click on list object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_c/list_object'))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 4-Click on list object.png')

"Step 5: Click on item conversationTurns (conversationTurn)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_c/item_conversationTurns"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_c/item_conversationTurns', ['item_conversationTurns_liNthOfType': item_conversationTurns_liNthOfType, 'item_conversationTurns_nth': item_conversationTurns_nth, 'item_conversationTurns_ulNthChild': item_conversationTurns_ulNthChild]))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 5-Click on item conversationTurns conversationTurn.png')

"Step 6: Click on p workflowIssue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_c/p_workflowIssue'))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 6-Click on p workflowIssue.png')

"Step 7: Click on strong dynamicObject (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_c/strong_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_c/strong_dynamicObject', ['strong_dynamicObject_liNthOfType': strong_dynamicObject_liNthOfType, 'strong_dynamicObject_nth': strong_dynamicObject_nth, 'strong_dynamicObject_ulNthChild': strong_dynamicObject_ulNthChild]))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 7-Click on strong dynamicObject object.png')

"Step 8: Click on item conversationTurns (conversationTurn)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_c/item_conversationTurns"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_c/item_conversationTurns', ['item_conversationTurns_liNthOfType': item_conversationTurns_liNthOfType_1, 'item_conversationTurns_nth': item_conversationTurns_nth_1, 'item_conversationTurns_ulNthChild': item_conversationTurns_ulNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 8-Click on item conversationTurns conversationTurn.png')

"Step 9: Click on p object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_c/p_object'))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 9-Click on p object.png')

"Step 10: Click on p object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_c/p_object'))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 10-Click on p object.png')

"Step 11: Click on p sessionDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_c/p_sessionDescription'))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 11-Click on p sessionDescription.png')

"Step 12: Click on header newApproach"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_c/header_newApproach'))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 12-Click on header newApproach.png')

"Step 13: Click on p object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_c/p_object'))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 13-Click on p object.png')

"Step 14: Click on header newApproach"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_c/header_newApproach'))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 14-Click on header newApproach.png')

"Step 15: Click on p description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_c/p_description'))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 15-Click on p description.png')

"Step 16: Click on p description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_c/p_description'))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 16-Click on p description.png')

"Step 17: Click on list object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_c/list_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 17-Click on list object2.png')

"Step 18: Click on strong dynamicObject (higherLevelArtifactGeneration)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_c/strong_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_c/strong_dynamicObject', ['strong_dynamicObject_liNthOfType': strong_dynamicObject_liNthOfType_1, 'strong_dynamicObject_nth': strong_dynamicObject_nth_1, 'strong_dynamicObject_ulNthChild': strong_dynamicObject_ulNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 18-Click on strong dynamicObject higherLevelArtifactGeneration.png')

"Step 19: Click on strong dynamicObject (higherLevelArtifactGeneration)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_c/strong_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_c/strong_dynamicObject', ['strong_dynamicObject_liNthOfType': strong_dynamicObject_liNthOfType_2, 'strong_dynamicObject_nth': strong_dynamicObject_nth_2, 'strong_dynamicObject_ulNthChild': strong_dynamicObject_ulNthChild_2]))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 19-Click on strong dynamicObject higherLevelArtifactGeneration.png')

"Step 20: Click on strong dynamicObject (higherLevelArtifactGeneration)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_c/strong_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_c/strong_dynamicObject', ['strong_dynamicObject_liNthOfType': strong_dynamicObject_liNthOfType_3, 'strong_dynamicObject_nth': strong_dynamicObject_nth_3, 'strong_dynamicObject_ulNthChild': strong_dynamicObject_ulNthChild_3]))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 20-Click on strong dynamicObject higherLevelArtifactGeneration.png')

"Step 21: Click on p description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_c/p_description'))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 21-Click on p description.png')

"Step 22: Click on p description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_c/p_description'))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 22-Click on p description.png')

"Step 23: Click on item conversationTurns (conversationTurn2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/c/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_c/item_conversationTurns"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_c/item_conversationTurns', ['item_conversationTurns_liNthOfType': item_conversationTurns_liNthOfType_2, 'item_conversationTurns_nth': item_conversationTurns_nth_2, 'item_conversationTurns_ulNthChild': item_conversationTurns_ulNthChild_2]))

// WebUI.takeScreenshot(reportLocation + '/TC136/Step 23-Click on item conversationTurns conversationTurn2 - Navigate to page .png')

"Step 24: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC136-Navigate and Interact with Conversation Turns in Page C_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}