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

"Step 2: Click on link productsSliderPrev"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_productsSliderPrev'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link productsSliderPrev.png')

"Step 3: Click on div productsSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/div_productsSlider'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on div productsSlider.png')

"Step 4: Click on header customersLoveUs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/header_customersLoveUs'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on header customersLoveUs.png')

"Step 5: Click on div reviewComment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/div_reviewComment'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on div reviewComment.png')

"Step 6: Click on link productsSliderPrev"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_productsSliderPrev'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link productsSliderPrev.png')

"Step 7: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_addToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button addToCart.png')

"Step 8: Click on button addToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_addToCart2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on button addToCart2.png')

"Step 9: Click on button productAction"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_productAction'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button productAction.png')

"Step 10: Click on span goToCart -> Navigate to page '/cart'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/span_goToCart'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on span goToCart - Navigate to page cart.png')

"Step 11: Click on div cartItemQtyInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/div_cartItemQtyInput'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on div cartItemQtyInput.png')

"Step 12: Click on div cartItemQtyInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/div_cartItemQtyInput'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on div cartItemQtyInput.png')

"Step 13: Click on div cartItemQtyInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/div_cartItemQtyInput'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on div cartItemQtyInput.png')

"Step 14: Click on div cartItemQtyInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/div_cartItemQtyInput'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on div cartItemQtyInput.png')

"Step 15: Click on div cartItemQtyInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/div_cartItemQtyInput'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on div cartItemQtyInput.png')

"Step 16: Click on div cartItemQtyInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/div_cartItemQtyInput'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Click on div cartItemQtyInput.png')

"Step 17: Click on button proceedToCheckout -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_cart/button_proceedToCheckout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on button proceedToCheckout - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Add Multiple Products to Cart and Proceed to Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}