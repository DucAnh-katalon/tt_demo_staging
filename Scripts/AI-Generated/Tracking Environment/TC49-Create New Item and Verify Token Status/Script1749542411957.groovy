import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.createItemAndCheckToken
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /project/*/tests/test-cases with params (folder, testProject)"

TrueTestScripts.navigate("/project/${project_id}/tests/test-cases", ["folder": test_cases_folder, "testProject": test_cases_testProject])

"Step 2: Hover over span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/test-cases?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/span_object'))

// WebUI.takeScreenshot(reportLocation + '/TC49/Step 2-Hover over span object.png')

"Step 3: Create a new item and check token status"

createItemAndCheckToken.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC49-Create New Item and Verify Token Status_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}