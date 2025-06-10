import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /spreadsheets/d/*/edit with params (gid)"

TrueTestScripts.navigate("/spreadsheets/d/${d_id}/edit", ["gid": edit_gid])

"Step 2: Enter input value in input findInSheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/input_findInSheet'), input_findInSheet)

WebUI.takeScreenshot(reportLocation + '/TC110/Step 2-Enter input value in input findInSheet.png')

"Step 3: Press key Enter on input findInSheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/input_findInSheet'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 3-Press key Enter on input findInSheet.png')

"Step 4: Press key Enter on input findInSheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/input_findInSheet'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 4-Press key Enter on input findInSheet.png')

"Step 5: Press key Enter on input findInSheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/input_findInSheet'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 5-Press key Enter on input findInSheet.png')

"Step 6: Press key Enter on input findInSheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/input_findInSheet'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 6-Press key Enter on input findInSheet.png')

"Step 7: Press key Enter on input findInSheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/input_findInSheet'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 7-Press key Enter on input findInSheet.png')

"Step 8: Press key Enter on input findInSheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/input_findInSheet'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 8-Press key Enter on input findInSheet.png')

"Step 9: Press key Enter on input findInSheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/input_findInSheet'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 9-Press key Enter on input findInSheet.png')

"Step 10: Press key Enter on input findInSheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/input_findInSheet'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 10-Press key Enter on input findInSheet.png')

"Step 11: Press key Enter on input findInSheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/input_findInSheet'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 11-Press key Enter on input findInSheet.png')

"Step 12: Hover over div summarizeTable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_summarizeTable'))

// WebUI.takeScreenshot(reportLocation + '/TC110/Step 12-Hover over div summarizeTable.png')

"Step 13: Click on div close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_close'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 13-Click on div close.png')

"Step 14: Press key Enter on input findInSheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/input_findInSheet'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 14-Press key Enter on input findInSheet.png')

"Step 15: Enter input value in input findInSheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/input_findInSheet'), input_findInSheet_1)

WebUI.takeScreenshot(reportLocation + '/TC110/Step 15-Enter input value in input findInSheet.png')

"Step 16: Press key Enter on input findInSheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/input_findInSheet'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 16-Press key Enter on input findInSheet.png')

"Step 17: Press key Enter on input findInSheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/input_findInSheet'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 17-Press key Enter on input findInSheet.png')

"Step 18: Press key Enter on input findInSheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/input_findInSheet'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 18-Press key Enter on input findInSheet.png')

"Step 19: Click on div gridScrollable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_gridScrollable'))

// WebUI.takeScreenshot(reportLocation + '/TC110/Step 19-Click on div gridScrollable.png')

"Step 20: Click on div gridScrollable"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_gridScrollable'))

// WebUI.takeScreenshot(reportLocation + '/TC110/Step 20-Click on div gridScrollable.png')

"Step 21: Click on div close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_close'))

WebUI.takeScreenshot(reportLocation + '/TC110/Step 21-Click on div close.png')

"Step 22: Click on div scrollableContent -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/spreadsheets/d/.*/edit?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_spreadsheets_d_edit/div_gridScrollable'))

// WebUI.takeScreenshot(reportLocation + '/TC110/Step 22-Click on div scrollableContent - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC110-Search and Verify Spreadsheet Functionality_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}