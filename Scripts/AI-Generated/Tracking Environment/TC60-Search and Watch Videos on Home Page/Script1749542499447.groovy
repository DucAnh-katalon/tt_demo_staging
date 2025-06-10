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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link tuyenTapPhatTatCa2 -> Navigate to page '/watch'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_tuyenTapPhatTatCa2'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 2-Click on link tuyenTapPhatTatCa2 - Navigate to page watch.png')

"Step 3: Hover over button register"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/button_register'))

// WebUI.takeScreenshot(reportLocation + '/TC60/Step 3-Hover over button register.png')

"Step 4: Click on div videoControls"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_videoControls'))

// WebUI.takeScreenshot(reportLocation + '/TC60/Step 4-Click on div videoControls.png')

"Step 5: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC60/Step 5-Click on div object3.png')

"Step 6: Click on input searchQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_watch/input_searchQuery'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 6-Click on input searchQuery.png')

"Step 7: Enter input value in input searchQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_watch/input_searchQuery'), input_searchQuery)

WebUI.takeScreenshot(reportLocation + '/TC60/Step 7-Enter input value in input searchQuery.png')

"Step 8: Press key Enter on input searchQuery -> Navigate to page '/results'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_watch/input_searchQuery'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 8-Press key Enter on input searchQuery - Navigate to page results.png')

"Step 9: Click on link tuyenTapPhatTatCa"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/results?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_results/link_tuyenTapPhatTatCa'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 9-Click on link tuyenTapPhatTatCa.png')

"Step 10: Click on input searchQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/results?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_results/input_searchQuery'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 10-Click on input searchQuery.png')

"Step 11: Enter input value in input searchQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/results?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_results/input_searchQuery'), input_searchQuery_1)

WebUI.takeScreenshot(reportLocation + '/TC60/Step 11-Enter input value in input searchQuery.png')

"Step 12: Press key Enter on input searchQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/results?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_results/input_searchQuery'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 12-Press key Enter on input searchQuery.png')

"Step 13: Click on div searchBox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/results?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_results/div_searchBox'))

// WebUI.takeScreenshot(reportLocation + '/TC60/Step 13-Click on div searchBox.png')

"Step 14: Enter input value in input searchQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/results?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_results/input_searchQuery'), input_searchQuery_2)

WebUI.takeScreenshot(reportLocation + '/TC60/Step 14-Enter input value in input searchQuery.png')

"Step 15: Press key Enter on input searchQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/results?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_results/input_searchQuery'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 15-Press key Enter on input searchQuery.png')

"Step 16: Click on input searchQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/results?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_results/input_searchQuery'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 16-Click on input searchQuery.png')

"Step 17: Enter input value in input searchQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/results?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_results/input_searchQuery'), input_searchQuery_3)

WebUI.takeScreenshot(reportLocation + '/TC60/Step 17-Enter input value in input searchQuery.png')

"Step 18: Press key Enter on input searchQuery"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/results?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_results/input_searchQuery'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 18-Press key Enter on input searchQuery.png')

"Step 19: Click on link video21Savage -> Navigate to page '/watch'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/results?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_results/link_video21Savage'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 19-Click on link video21Savage - Navigate to page watch.png')

"Step 20: Hover over div chipContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_chipContainer'))

// WebUI.takeScreenshot(reportLocation + '/TC60/Step 20-Hover over div chipContainer.png')

"Step 21: Hover over button follow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/button_follow'))

// WebUI.takeScreenshot(reportLocation + '/TC60/Step 21-Hover over button follow.png')

"Step 22: Click on button skipAd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_watch/button_skipAd'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 22-Click on button skipAd.png')

"Step 23: Hover over div description3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_description'))

// WebUI.takeScreenshot(reportLocation + '/TC60/Step 23-Hover over div description3.png')

"Step 24: Click on link youtubeHome -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_watch/link_youtubeHome'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 24-Click on link youtubeHome - Navigate to page .png')

"Step 25: Click on link home"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 25-Click on link home.png')

"Step 26: Click on link mediaContainer -> Navigate to page '/watch'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_mediaContainer'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 26-Click on link mediaContainer - Navigate to page watch.png')

"Step 27: Click on div toggleLoop -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/watch?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_watch/div_toggleLoop'))

WebUI.takeScreenshot(reportLocation + '/TC60/Step 27-Click on div toggleLoop - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC60-Search and Watch Videos on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}