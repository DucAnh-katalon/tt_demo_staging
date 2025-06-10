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

"Step 1: Navigate to /en"

TrueTestScripts.navigate("/en")

"Step 2: Hover over button investments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/en?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_en/button_investments'))

// WebUI.takeScreenshot(reportLocation + '/TC128/Step 2-Hover over button investments.png')

"Step 3: Click on link mutualFunds -> Navigate to page '/en/investments/mutual-funds'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/en?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_en/link_mutualFunds'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 3-Click on link mutualFunds - Navigate to page eninvestmentsmutual-funds.png')

"Step 4: Click on button readMore -> Navigate to page '/en/investor-education/mutual-fund'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/en/investments/mutual-funds?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_en_investments_mutual_funds/button_readMore'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 4-Click on button readMore - Navigate to page eninvestor-educationmutual-fund.png')

"Step 5: Hover over button investments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/en/investor-education/mutual-fund?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_en_investor_education_mutual_fund/button_investments'))

// WebUI.takeScreenshot(reportLocation + '/TC128/Step 5-Hover over button investments.png')

"Step 6: Click on link mutualFunds -> Navigate to page '/en/investments/mutual-funds'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/en/investor-education/mutual-fund?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_en_investor_education_mutual_fund/link_mutualFunds'))

WebUI.takeScreenshot(reportLocation + '/TC128/Step 6-Click on link mutualFunds - Navigate to page eninvestmentsmutual-funds.png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC128-Explore Mutual Funds Section in Investor Education_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}