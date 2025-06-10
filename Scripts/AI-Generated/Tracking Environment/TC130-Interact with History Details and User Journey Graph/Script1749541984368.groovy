import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.clickMultipleDivObjects
import truetest.Tracking_Environment.common.clickMultipleDivObjects_2
import truetest.Tracking_Environment.common.interactWithDivsAndInputNumber
import truetest.Tracking_Environment.common.interactWithObjectsAndInputNumber
import truetest.Tracking_Environment.common.repeatedClickOnObject
import truetest.Tracking_Environment.common.viewAndInteractWithObjects
import truetest.Tracking_Environment.common.viewMultipleObjects
import truetest.Tracking_Environment.common.viewObjectsAndInputNumber
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /env/qa/aut/*"

TrueTestScripts.navigate("/env/qa/aut/${aut_id}")

"Step 2: Click on button historyDetails -> Navigate to page '/env/qa/aut/*/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut/button_historyDetails'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 2-Click on button historyDetails - Navigate to page envqaauthistory.png')

"Step 3: Click on link history -> Navigate to page '/env/qa/aut/*/history/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history/link_history'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 3-Click on link history - Navigate to page envqaauthistory.png')

"Step 4: Click on div collapsedParams"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history/div_collapsedParams'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 4-Click on div collapsedParams.png')

"Step 5: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history/span_object'))

// WebUI.takeScreenshot(reportLocation + '/TC130/Step 5-Click on span object.png')

"Step 6: Click on link journeyMap -> Navigate to page '/env/qa/aut/*/history/*/graph/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history/link_journeyMap'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 6-Click on link journeyMap - Navigate to page envqaauthistorygraph.png')

"Step 7: Click on button toggleChangeModeGraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/button_toggleChangeModeGraph'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 7-Click on button toggleChangeModeGraph.png')

"Step 8: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC130/Step 8-Click on div object.png')

"Step 9: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC130/Step 9-Click on div object.png')

"Step 10: Click on input number"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_number'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 10-Click on input number.png')

"Step 11: Interact with multiple div elements and input a number"

interactWithDivsAndInputNumber.execute(data_path_0, Integer.valueOf(index_0))

"Step 12: View and interact with multiple objects in a list"

viewAndInteractWithObjects.execute()

"Step 13: Click on input object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_object2'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 13-Click on input object2.png')

"Step 14: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_object'), input_object)

WebUI.takeScreenshot(reportLocation + '/TC130/Step 14-Enter input value in input object.png')

"Step 15: View multiple objects by clicking on them"

viewMultipleObjects.execute()

"Step 16: Click on input number"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_number'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 16-Click on input number.png')

"Step 17: Click on input object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_object2'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 17-Click on input object2.png')

"Step 18: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_object'), input_object_1)

WebUI.takeScreenshot(reportLocation + '/TC130/Step 18-Enter input value in input object.png')

"Step 19: View objects and input a number for further action"

viewObjectsAndInputNumber.execute()

"Step 20: Hover over span historyGraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/span_historyGraph'))

// WebUI.takeScreenshot(reportLocation + '/TC130/Step 20-Hover over span historyGraph.png')

"Step 21: Click on button toggleChangeMode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/button_toggleChangeMode'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 21-Click on button toggleChangeMode.png')

"Step 22: Repeatedly click on a specific object"

repeatedClickOnObject.execute()

"Step 23: Interact with multiple objects and input a number"

interactWithObjectsAndInputNumber.execute(data_path_1, Integer.valueOf(index_1))

"Step 24: View multiple objects by clicking on them"

viewMultipleObjects.execute()

"Step 25: Click on input object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_object2'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 25-Click on input object2.png')

"Step 26: Click on div userJourneyGraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_userJourneyGraph'))

// WebUI.takeScreenshot(reportLocation + '/TC130/Step 26-Click on div userJourneyGraph.png')

"Step 27: Hover over link object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/link_object'))

// WebUI.takeScreenshot(reportLocation + '/TC130/Step 27-Hover over link object.png')

"Step 28: Click on button toggleChangeMode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/button_toggleChangeMode'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 28-Click on button toggleChangeMode.png')

"Step 29: Click on multiple div objects in succession for interaction"

clickMultipleDivObjects_2.execute()

"Step 30: Click on p pagesHeader"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/p_pagesHeader'))

// WebUI.takeScreenshot(reportLocation + '/TC130/Step 30-Click on p pagesHeader.png')

"Step 31: Click on input number"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_number'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 31-Click on input number.png')

"Step 32: Click on input numberInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_numberInput'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 32-Click on input numberInput.png')

"Step 33: Click on input object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_object3'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 33-Click on input object3.png')

"Step 34: Click on input number"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_number'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 34-Click on input number.png')

"Step 35: Repeatedly click on a specific object"

repeatedClickOnObject.execute()

"Step 36: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC130/Step 36-Click on div object.png')

"Step 37: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC130/Step 37-Click on div object.png')

"Step 38: Click on input toggleTrafficView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_toggleTrafficView'))

WebUI.takeScreenshot(reportLocation + '/TC130/Step 38-Click on input toggleTrafficView.png')

"Step 39: Click on multiple div objects in succession."

clickMultipleDivObjects.execute()

"Step 40: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC130-Interact with History Details and User Journey Graph_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}