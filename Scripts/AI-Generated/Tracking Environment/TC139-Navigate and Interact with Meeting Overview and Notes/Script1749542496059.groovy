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

"Step 1: Navigate to /login with params (redirectUrl)"

TrueTestScripts.navigate("/login", ["redirectUrl": login_redirectUrl])

"Step 2: Click on link signInWithGoogle -> Navigate to page '/meetings/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login/link_signInWithGoogle'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 2-Click on link signInWithGoogle - Navigate to page meetings.png')

"Step 3: Click on gmHealthValue object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/gmHealthValue_object'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 3-Click on gmHealthValue object.png')

"Step 4: Click on header trueTestSprint"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/header_trueTestSprint'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 4-Click on header trueTestSprint.png')

"Step 5: Click on header trueTestSprint"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/header_trueTestSprint'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 5-Click on header trueTestSprint.png')

"Step 6: Click on header trueTestSprint"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/header_trueTestSprint'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 6-Click on header trueTestSprint.png')

"Step 7: Click on link navigationToggle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/link_navigationToggle'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 7-Click on link navigationToggle.png')

"Step 8: Click on div navigationDrawerMask"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/div_navigationDrawerMask'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 8-Click on div navigationDrawerMask.png')

"Step 9: Click on main meetingOverview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/main_meetingOverview'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 9-Click on main meetingOverview.png')

"Step 10: Click on textarea meetingNotes (addWhatPuzzlesUs)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 10-Click on textarea meetingNotes addWhatPuzzlesUs.png')

"Step 11: Click on header whatPuzzlesUs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/header_whatPuzzlesUs'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 11-Click on header whatPuzzlesUs.png')

"Step 12: Click on header whatPuzzlesUs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/header_whatPuzzlesUs'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 12-Click on header whatPuzzlesUs.png')

"Step 13: Click on article improvementQuestion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/article_improvementQuestion'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 13-Click on article improvementQuestion.png')

"Step 14: Click on textarea meetingNotes (addWhatWentWell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_1, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_1]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 14-Click on textarea meetingNotes addWhatWentWell.png')

"Step 15: Enter input value in textarea meetingNotes (addWhatWentWell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_2, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_2]), textarea_meetingNotes)

WebUI.takeScreenshot(reportLocation + '/TC139/Step 15-Enter input value in textarea meetingNotes addWhatWentWell.png')

"Step 16: Click on textarea meetingNotes (addWhatWentLessWell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_3, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 16-Click on textarea meetingNotes addWhatWentLessWell.png')

"Step 17: Click on textarea meetingNotes (addWhatWentWell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_4, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 17-Click on textarea meetingNotes addWhatWentWell.png')

"Step 18: Enter input value in textarea meetingNotes (addWhatWentWell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_5, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_5]), textarea_meetingNotes_1)

WebUI.takeScreenshot(reportLocation + '/TC139/Step 18-Enter input value in textarea meetingNotes addWhatWentWell.png')

"Step 19: Click on textarea meetingNotes (addWhatToTryNext)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_6, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 19-Click on textarea meetingNotes addWhatToTryNext.png')

"Step 20: Click on textarea meetingNotes (addWhatWentLessWell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_7, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_7]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 20-Click on textarea meetingNotes addWhatWentLessWell.png')

"Step 21: Click on textarea meetingNotes (addWhatWentLessWell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_8, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_8]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 21-Click on textarea meetingNotes addWhatWentLessWell.png')

"Step 22: Click on article improvementQuestion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/article_improvementQuestion'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 22-Click on article improvementQuestion.png')

"Step 23: Click on textarea meetingNotes (addWhatWentLessWell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_9, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_9]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 23-Click on textarea meetingNotes addWhatWentLessWell.png')

"Step 24: Click on textarea meetingNotes (addWhatWentLessWell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_10, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_10]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 24-Click on textarea meetingNotes addWhatWentLessWell.png')

"Step 25: Click on header improvementDiscussion"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/header_improvementDiscussion'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 25-Click on header improvementDiscussion.png')

"Step 26: Click on textarea meetingNotes (addWhatWentLessWell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_11, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_11]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 26-Click on textarea meetingNotes addWhatWentLessWell.png')

"Step 27: Click on textarea meetingNotes (addWhatWentLessWell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_12, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_12]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 27-Click on textarea meetingNotes addWhatWentLessWell.png')

"Step 28: Click on textarea meetingNotes (addWhatToTryNext)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_13, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_13]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 28-Click on textarea meetingNotes addWhatToTryNext.png')

"Step 29: Click on textarea meetingNotes (addWhatWentLessWell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_14, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_14]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 29-Click on textarea meetingNotes addWhatWentLessWell.png')

"Step 30: Click on textarea meetingNotes (addWhatToTryNext)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_15, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_15]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 30-Click on textarea meetingNotes addWhatToTryNext.png')

"Step 31: Enter input value in textarea meetingNotes (addWhatToTryNext)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_16, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_16]), textarea_meetingNotes_2)

WebUI.takeScreenshot(reportLocation + '/TC139/Step 31-Enter input value in textarea meetingNotes addWhatToTryNext.png')

"Step 32: Click on textarea meetingNotes (addWhatWentLessWell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_17, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_17]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 32-Click on textarea meetingNotes addWhatWentLessWell.png')

"Step 33: Click on textarea meetingNotes (addWhatWentLessWell)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/textarea_meetingNotes', ['textarea_meetingNotes_articleNthOfType': textarea_meetingNotes_articleNthOfType_18, 'textarea_meetingNotes_internalLabel': textarea_meetingNotes_internalLabel_18]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 33-Click on textarea meetingNotes addWhatWentLessWell.png')

"Step 34: Click on button finished"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_finished'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 34-Click on button finished.png')

"Step 35: Click on div canvasTopics"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/div_canvasTopics'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 35-Click on div canvasTopics.png')

"Step 36: Click on span agreements"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/span_agreements'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 36-Click on span agreements.png')

"Step 37: Click on button actions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_actions'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 37-Click on button actions.png')

"Step 38: Click on div meetingTopic"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/div_meetingTopic'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 38-Click on div meetingTopic.png')

"Step 39: Click on div canvasTopics"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/div_canvasTopics'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 39-Click on div canvasTopics.png')

"Step 40: Click on gmCarousel meetingHighlights"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/gmCarousel_meetingHighlights'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 40-Click on gmCarousel meetingHighlights.png')

"Step 41: Click on gmCarousel meetingHighlights"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/gmCarousel_meetingHighlights'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 41-Click on gmCarousel meetingHighlights.png')

"Step 42: Hover over button actions2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_actions2'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 42-Hover over button actions2.png')

"Step 43: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 43-Click on button object.png')

"Step 44: Hover over main object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_meetings/main_object'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 44-Hover over main object.png')

"Step 45: Click on article meetingDetails"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/article_meetingDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 45-Click on article meetingDetails.png')

"Step 46: Hover over main object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_meetings/main_object'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 46-Hover over main object.png')

"Step 47: Hover over button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_object2'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 47-Hover over button object2.png')

"Step 48: Click on button meetingActions (avatar)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/button_meetingActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/button_meetingActions', ['button_meetingActions_class': button_meetingActions_class, 'button_meetingActions_internalText': button_meetingActions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 48-Click on button meetingActions avatar.png')

"Step 49: Hover over button object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 49-Hover over button object3.png')

"Step 50: Click on button meetingActions (thumbsUp)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/button_meetingActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_meetings/button_meetingActions', ['button_meetingActions_class': button_meetingActions_class_1, 'button_meetingActions_internalText': button_meetingActions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 50-Click on button meetingActions thumbsUp.png')

"Step 51: Click on button action"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_action'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 51-Click on button action.png')

"Step 52: Click on button vote"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_vote'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 52-Click on button vote.png')

"Step 53: Click on button object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_object4'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 53-Click on button object4.png')

"Step 54: Click on div imFinished"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/div_imFinished'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 54-Click on div imFinished.png')

"Step 55: Click on div imFinished"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/div_imFinished'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 55-Click on div imFinished.png')

"Step 56: Click on span participantProgress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/span_participantProgress'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 56-Click on span participantProgress.png')

"Step 57: Click on div imFinished"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/div_imFinished'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 57-Click on div imFinished.png')

"Step 58: Click on button actions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_actions'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 58-Click on button actions.png')

"Step 59: Click on span ideaTitle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/span_ideaTitle'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 59-Click on span ideaTitle.png')

"Step 60: Click on button closeCarousel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_closeCarousel'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 60-Click on button closeCarousel.png')

"Step 61: Hover over button ttTeam"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_ttTeam'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 61-Hover over button ttTeam.png')

"Step 62: Click on button object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_object5'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 62-Click on button object5.png')

"Step 63: Click on span agreements"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/span_agreements'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 63-Click on span agreements.png')

"Step 64: Hover over button ttTeam"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_ttTeam'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 64-Hover over button ttTeam.png')

"Step 65: Click on button object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_object5'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 65-Click on button object5.png')

"Step 66: Click on button dvPlus13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_dvPlus13'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 66-Click on button dvPlus13.png')

"Step 67: Hover over button anhDao"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_anhDao'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 67-Hover over button anhDao.png')

"Step 68: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC139/Step 68-Click on button object.png')

"Step 69: Click on span participantProgressIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/span_participantProgressIndicator'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 69-Click on span participantProgressIndicator.png')

"Step 70: Click on div imFinished"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/div_imFinished'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 70-Click on div imFinished.png')

"Step 71: Click on div imFinished"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/div_imFinished'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 71-Click on div imFinished.png')

"Step 72: Click on gmTimebox finished"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/gmTimebox_finished'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 72-Click on gmTimebox finished.png')

"Step 73: Click on article meetingSummary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/article_meetingDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 73-Click on article meetingSummary.png')

"Step 74: Click on nav carouselNavigation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/nav_carouselNavigation'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 74-Click on nav carouselNavigation.png')

"Step 75: Click on section meetingSummary -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/meetings/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_meetings/section_meetingSummary'))

// WebUI.takeScreenshot(reportLocation + '/TC139/Step 75-Click on section meetingSummary - Navigate to page .png')

"Step 76: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC139-Navigate and Interact with Meeting Overview and Notes_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}