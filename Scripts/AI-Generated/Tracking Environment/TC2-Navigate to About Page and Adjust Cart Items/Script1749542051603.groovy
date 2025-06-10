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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link about -> Navigate to page '/about'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_about'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link about - Navigate to page about.png')

"Step 3: Click on header about"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_about/header_about'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on header about.png')

"Step 4: Click on link accessories -> Navigate to page '/category/accessories'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_about/link_accessories'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on link accessories - Navigate to page categoryaccessories.png')

"Step 5: Click on link goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/accessories?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_accessories/link_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link goToCart - Navigate to page cart.png')

"Step 6: Click on div cartItemQtyInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/div_cartItemQtyInput2'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on div cartItemQtyInput2.png')

"Step 7: Click on div cartItemQtyInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/div_cartItemQtyInput2'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on div cartItemQtyInput2.png')

"Step 8: Click on div cartItemQtyInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/div_cartItemQtyInput2'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on div cartItemQtyInput2.png')

"Step 9: Click on div cartItemQtyInput -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/div_cartItemQtyInput'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on div cartItemQtyInput - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Navigate to About Page and Adjust Cart Items_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}