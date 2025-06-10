import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.editInputNumberInMultipleObjects
import truetest.Tracking_Environment.common.interactWithObjectsAndInputNumberAgain
import truetest.Tracking_Environment.common.repeatedClickOnObject
import truetest.Tracking_Environment.common.toggleChangeModeAndInteract
import truetest.Tracking_Environment.common.viewAndInteractWithObjects
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /env/qa/aut/*/history/*/graph/*"

TrueTestScripts.navigate("/env/qa/aut/${aut_id}/history/${history_id}/graph/${graph_id}")

"Step 2: Click on span increaseValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/span_increaseValue'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 2-Click on span increaseValue.png')

"Step 3: Click on span increaseValue2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/span_increaseValue2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 3-Click on span increaseValue2.png')

"Step 4: Click on span increaseValue2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/span_increaseValue2'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 4-Click on span increaseValue2.png')

"Step 5: Click on input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 5-Click on input object.png')

"Step 6: Click on input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 6-Click on input object.png')

"Step 7: Click on input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_object'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 7-Click on input object.png')

"Step 8: Enter input value in input object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_object'), input_object)

WebUI.takeScreenshot(reportLocation + '/TC72/Step 8-Enter input value in input object.png')

"Step 9: Click on input number"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_number'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 9-Click on input number.png')

"Step 10: Enter input value in input numberInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_numberInput'), input_numberInput)

WebUI.takeScreenshot(reportLocation + '/TC72/Step 10-Enter input value in input numberInput.png')

"Step 11: Press key Enter on input numberInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_numberInput'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 11-Press key Enter on input numberInput.png')

"Step 12: Press key Enter on input numberInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_numberInput'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 12-Press key Enter on input numberInput.png')

"Step 13: Press key Enter on input numberInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_numberInput'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 13-Press key Enter on input numberInput.png')

"Step 14: Click on button view"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/button_view'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 14-Click on button view.png')

"Step 15: Click on button toggleChangeModeGraph"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/button_toggleChangeModeGraph'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 15-Click on button toggleChangeModeGraph.png')

"Step 16: Repeatedly click on a specific object"

repeatedClickOnObject.execute()

"Step 17: Edit input number in multiple objects"

editInputNumberInMultipleObjects.execute(data_path_0, Integer.valueOf(index_0))

"Step 18: Press key Enter on input numberInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_numberInput'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 18-Press key Enter on input numberInput.png')

"Step 19: View and interact with multiple objects in a list"

viewAndInteractWithObjects.execute()

"Step 20: Click on input number"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_number'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 20-Click on input number.png')

"Step 21: Enter input value in input numberInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_numberInput'), input_numberInput_1)

WebUI.takeScreenshot(reportLocation + '/TC72/Step 21-Enter input value in input numberInput.png')

"Step 22: Press key Enter on input numberInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_numberInput'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 22-Press key Enter on input numberInput.png')

"Step 23: Press key Enter on input numberInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_numberInput'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 23-Press key Enter on input numberInput.png')

"Step 24: Click on div graphInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_graphInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC72/Step 24-Click on div graphInfo.png')

"Step 25: Click on button view"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/button_view'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 25-Click on button view.png')

"Step 26: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC72/Step 26-Click on div object.png')

"Step 27: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC72/Step 27-Click on div object.png')

"Step 28: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC72/Step 28-Click on div object.png')

"Step 29: Click on div graphInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_graphInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC72/Step 29-Click on div graphInfo.png')

"Step 30: Hover over link object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/link_object'))

// WebUI.takeScreenshot(reportLocation + '/TC72/Step 30-Hover over link object.png')

"Step 31: Click on button toggleChangeMode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/button_toggleChangeMode'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 31-Click on button toggleChangeMode.png')

"Step 32: Click on input number"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_number'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 32-Click on input number.png')

"Step 33: Enter input value in input numberInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_numberInput'), input_numberInput_2)

WebUI.takeScreenshot(reportLocation + '/TC72/Step 33-Enter input value in input numberInput.png')

"Step 34: Press key Enter on input numberInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_numberInput'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 34-Press key Enter on input numberInput.png')

"Step 35: Click on button view"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/button_view'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 35-Click on button view.png')

"Step 36: Interact with objects and input a number"

interactWithObjectsAndInputNumberAgain.execute(data_path_1, Integer.valueOf(index_1))

"Step 37: Click on link history -> Navigate to page '/env/qa/aut/*/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*/graph/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/link_history'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 37-Click on link history - Navigate to page envqaauthistory.png')

"Step 38: Click on link history -> Navigate to page '/env/qa/aut/*/history/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history/link_history'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 38-Click on link history - Navigate to page envqaauthistory.png')

"Step 39: Click on div collapsedParams"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history/div_collapsedParams'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 39-Click on div collapsedParams.png')

"Step 40: Click on span object -> Navigate to page '/env/qa/aut/*/history'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history/span_object'))

// WebUI.takeScreenshot(reportLocation + '/TC72/Step 40-Click on span object - Navigate to page envqaauthistory.png')

"Step 41: Click on link history -> Navigate to page '/env/qa/aut/*/history/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history/link_history'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 41-Click on link history - Navigate to page envqaauthistory.png')

"Step 42: Click on div collapsedParams"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history/div_collapsedParams'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 42-Click on div collapsedParams.png')

"Step 43: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history/span_object'))

// WebUI.takeScreenshot(reportLocation + '/TC72/Step 43-Click on span object.png')

"Step 44: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history/span_object'))

// WebUI.takeScreenshot(reportLocation + '/TC72/Step 44-Click on span object.png')

"Step 45: Click on link journeyMap"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history/link_journeyMap'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 45-Click on link journeyMap.png')

"Step 46: Click on link journeyMap"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/env/qa/aut/.*/history/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history/link_journeyMap'))

WebUI.takeScreenshot(reportLocation + '/TC72/Step 46-Click on link journeyMap.png')

"Step 47: Toggle change mode and interact with selected objects"

toggleChangeModeAndInteract.execute()

"Step 48: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC72-Interact with History Graph and Input Values_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}