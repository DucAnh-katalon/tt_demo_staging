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

"Step 2: Click on span indicatorButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/span_indicatorButton'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 2-Click on span indicatorButton.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link chatBox -> Navigate to page '/chat-box.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_chatBox'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 4-Click on link chatBox - Navigate to page chat-boxhtml.png')

"Step 5: Click on link indicatorButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/chat-box.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_chat_box_html/link_indicatorButton'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 5-Click on link indicatorButton.png')

"Step 6: Click on link orderPurchased -> Navigate to page '/orders-buy.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/chat-box.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_chat_box_html/link_orderPurchased'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 6-Click on link orderPurchased - Navigate to page orders-buyhtml.png')

"Step 7: Click on td orderStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/orders-buy.html?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_orders_buy_html/td_orderStatus'))

// WebUI.takeScreenshot(reportLocation + '/TC62/Step 7-Click on td orderStatus.png')

"Step 8: Click on td orderStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/orders-buy.html?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_orders_buy_html/td_orderStatus'))

// WebUI.takeScreenshot(reportLocation + '/TC62/Step 8-Click on td orderStatus.png')

"Step 9: Click on link netflixAccount"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/orders-buy.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_orders_buy_html/link_netflixAccount'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 9-Click on link netflixAccount.png')

"Step 10: Click on td gianHang"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/orders-buy.html?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_orders_buy_html/td_gianHang'))

// WebUI.takeScreenshot(reportLocation + '/TC62/Step 10-Click on td gianHang.png')

"Step 11: Click on link skvedhjfjz -> Navigate to page '/order-detail.html/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/orders-buy.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_orders_buy_html/link_skvedhjfjz'))

WebUI.takeScreenshot(reportLocation + '/TC62/Step 11-Click on link skvedhjfjz - Navigate to page order-detailhtml.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC62-Check Order Details from Chat Box_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}