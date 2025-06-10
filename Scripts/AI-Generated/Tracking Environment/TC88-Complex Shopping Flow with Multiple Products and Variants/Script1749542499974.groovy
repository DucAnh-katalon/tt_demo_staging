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

"Step 2: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_addToCart_1'))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 2-Click on button addToCart.png')

"Step 3: Hover over link newProduct"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_home/link_newProduct'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 3-Hover over link newProduct.png')

"Step 4: Click on div chooseVariant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/div_chooseVariant'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 4-Click on div chooseVariant.png')

"Step 5: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 5-Click on button close.png')

"Step 6: Hover over link phone"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_home/link_phone'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 6-Hover over link phone.png')

"Step 7: Click on link samsung -> Navigate to page '/category/samsung'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_samsung'))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 7-Click on link samsung - Navigate to page categorysamsung.png')

"Step 8: Click on link viewApple -> Navigate to page '/category/apple'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/samsung?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_samsung/link_viewApple'))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 8-Click on link viewApple - Navigate to page categoryapple.png')

"Step 9: Click on button addToCart2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_apple/button_addToCart2'))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 9-Click on button addToCart2.png')

"Step 10: Hover over link iphone15ProMax"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_category_apple/link_iphone15ProMax'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 10-Hover over link iphone15ProMax.png')

"Step 11: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_apple/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 11-Click on button buy.png')

"Step 12: Click on div chooseVariant"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_apple/div_chooseVariant'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 12-Click on div chooseVariant.png')

"Step 13: Click on label storageOptions (green)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_category_apple/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_category_apple/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for, 'label_storageOptions_internalText': label_storageOptions_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 13-Click on label storageOptions green.png')

"Step 14: Click on div variantPicker"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_apple/div_variantPicker'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 14-Click on div variantPicker.png')

"Step 15: Click on label storageOptions (green2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_category_apple/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_category_apple/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_1, 'label_storageOptions_internalText': label_storageOptions_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 15-Click on label storageOptions green2.png')

"Step 16: Click on label storageOptions (storageSize)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_category_apple/label_storageOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_category_apple/label_storageOptions', ['label_storageOptions_for': label_storageOptions_for_2, 'label_storageOptions_internalText': label_storageOptions_internalText_2]))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 16-Click on label storageOptions storageSize.png')

"Step 17: Click on button buy2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_apple/button_buy2'))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 17-Click on button buy2.png')

"Step 18: Click on header categoryApple"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_apple/header_categoryApple'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 18-Click on header categoryApple.png')

"Step 19: Click on span categoryApple"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_apple/span_categoryApple'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 19-Click on span categoryApple.png')

"Step 20: Click on item apple"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_apple/item_apple'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 20-Click on item apple.png')

"Step 21: Click on link viewApple"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_apple/link_viewApple'))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 21-Click on link viewApple.png')

"Step 22: Click on div appleCategory"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_apple/div_appleCategory'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 22-Click on div appleCategory.png')

"Step 23: Click on div appleCategory"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_apple/div_appleCategory'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 23-Click on div appleCategory.png')

"Step 24: Click on link phone -> Navigate to page '/category/chekhly-na-iphone'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/apple?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_apple/link_phone'))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 24-Click on link phone - Navigate to page categorychekhly-na-iphone.png')

"Step 25: Click on div appleCategory"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_chekhly_na_iphone/div_appleCategory'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 25-Click on div appleCategory.png')

"Step 26: Click on div appleCategory"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_chekhly_na_iphone/div_appleCategory'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 26-Click on div appleCategory.png')

"Step 27: Click on span apple"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_chekhly_na_iphone/span_apple'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 27-Click on span apple.png')

"Step 28: Click on span apple"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_chekhly_na_iphone/span_apple'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 28-Click on span apple.png')

"Step 29: Click on div category"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_chekhly_na_iphone/div_category'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 29-Click on div category.png')

"Step 30: Click on item apple"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_chekhly_na_iphone/item_apple'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 30-Click on item apple.png')

"Step 31: Click on span appleCategory"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_chekhly_na_iphone/span_appleCategory'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 31-Click on span appleCategory.png')

"Step 32: Click on link kCellphoneShop -> Navigate to page '/'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/category/chekhly-na-iphone?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_category_chekhly_na_iphone/link_kCellphoneShop'))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 32-Click on link kCellphoneShop - Navigate to page .png')

"Step 33: Click on button addToCartActions (addToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/button_addToCartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/button_addToCartActions', ['button_addToCartActions_divNthChild': button_addToCartActions_divNthChild, 'button_addToCartActions_divNthOfType': button_addToCartActions_divNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 33-Click on button addToCartActions addToCart2.png')

"Step 34: Click on button addToCartActions (addToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/button_addToCartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/button_addToCartActions', ['button_addToCartActions_divNthChild': button_addToCartActions_divNthChild_1, 'button_addToCartActions_divNthOfType': button_addToCartActions_divNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 34-Click on button addToCartActions addToCart2.png')

"Step 35: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 35-Click on button close.png')

"Step 36: Click on button addToCartActions (addToCart3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/button_addToCartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/button_addToCartActions', ['button_addToCartActions_divNthChild': button_addToCartActions_divNthChild_2, 'button_addToCartActions_divNthOfType': button_addToCartActions_divNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 36-Click on button addToCartActions addToCart3.png')

"Step 37: Click on button addToCartActions (addToCart2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_home/button_addToCartActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_home/button_addToCartActions', ['button_addToCartActions_divNthChild': button_addToCartActions_divNthChild_3, 'button_addToCartActions_divNthOfType': button_addToCartActions_divNthOfType_3]))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 37-Click on button addToCartActions addToCart2.png')

"Step 38: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 38-Click on button close.png')

"Step 39: Hover over button home"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_home/button_home'))

// WebUI.takeScreenshot(reportLocation + '/TC88/Step 39-Hover over button home.png')

"Step 40: Click on button close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC88/Step 40-Click on button close - Navigate to page .png')

"Step 41: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC88-Complex Shopping Flow with Multiple Products and Variants_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}