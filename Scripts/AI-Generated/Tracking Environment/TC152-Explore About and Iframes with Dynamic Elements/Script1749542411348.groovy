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

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_about_1'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 2-Click on link about - Navigate to page about.png')

"Step 3: Click on link iframes -> Navigate to page '/iframes'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/about?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_about/link_iframes'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 3-Click on link iframes - Navigate to page iframes.png')

"Step 4: Click on button iframeSameDomain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_iframes/button_iframeSameDomain'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 4-Click on button iframeSameDomain.png')

"Step 5: Click on header iframeSameDomain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_iframes/header_iframeSameDomain'))

// WebUI.takeScreenshot(reportLocation + '/TC152/Step 5-Click on header iframeSameDomain.png')

"Step 6: Click on link dynamicElements (notifications)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_iframes/link_dynamicElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_iframes/link_dynamicElements', ['link_dynamicElements_class': link_dynamicElements_class, 'link_dynamicElements_dataTest': link_dynamicElements_dataTest, 'link_dynamicElements_divNthOfType': link_dynamicElements_divNthOfType, 'link_dynamicElements_liNthOfType': link_dynamicElements_liNthOfType]))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 6-Click on link dynamicElements notifications.png')

"Step 7: Hover over button infoMessage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_iframes/button_infoMessage'))

// WebUI.takeScreenshot(reportLocation + '/TC152/Step 7-Hover over button infoMessage.png')

"Step 8: Click on button toggleTheme"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_iframes/button_toggleTheme'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 8-Click on button toggleTheme.png')

"Step 9: Click on button addSuccess"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_iframes/button_addSuccess'))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 9-Click on button addSuccess.png')

"Step 10: Click on link dynamicElements (fileDownload)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_iframes/link_dynamicElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_iframes/link_dynamicElements', ['link_dynamicElements_class': link_dynamicElements_class_1, 'link_dynamicElements_dataTest': link_dynamicElements_dataTest_1, 'link_dynamicElements_divNthOfType': link_dynamicElements_divNthOfType_1, 'link_dynamicElements_liNthOfType': link_dynamicElements_liNthOfType_1]))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 10-Click on link dynamicElements fileDownload.png')

"Step 11: Click on link dynamicElements (iframes)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_iframes/link_dynamicElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_iframes/link_dynamicElements', ['link_dynamicElements_class': link_dynamicElements_class_2, 'link_dynamicElements_dataTest': link_dynamicElements_dataTest_2, 'link_dynamicElements_divNthOfType': link_dynamicElements_divNthOfType_2, 'link_dynamicElements_liNthOfType': link_dynamicElements_liNthOfType_2]))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 11-Click on link dynamicElements iframes.png')

"Step 12: Hover over button iframeSameDomainForms"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_iframes/button_iframeSameDomainForms'))

// WebUI.takeScreenshot(reportLocation + '/TC152/Step 12-Hover over button iframeSameDomainForms.png')

"Step 13: Click on link dynamicElements (dynamicElements)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_iframes/link_dynamicElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_iframes/link_dynamicElements', ['link_dynamicElements_class': link_dynamicElements_class_3, 'link_dynamicElements_dataTest': link_dynamicElements_dataTest_3, 'link_dynamicElements_divNthOfType': link_dynamicElements_divNthOfType_3, 'link_dynamicElements_liNthOfType': link_dynamicElements_liNthOfType_3]))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 13-Click on link dynamicElements dynamicElements.png')

"Step 14: Click on link dynamicElements (forms)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_iframes/link_dynamicElements"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_iframes/link_dynamicElements', ['link_dynamicElements_class': link_dynamicElements_class_4, 'link_dynamicElements_dataTest': link_dynamicElements_dataTest_4, 'link_dynamicElements_divNthOfType': link_dynamicElements_divNthOfType_4, 'link_dynamicElements_liNthOfType': link_dynamicElements_liNthOfType_4]))

WebUI.takeScreenshot(reportLocation + '/TC152/Step 14-Click on link dynamicElements forms.png')

"Step 15: Login into Application"

TrueTestScripts.login()

"Step 16: Click on p practiceFormDescription -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/iframes?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_iframes/p_practiceFormDescription'))

// WebUI.takeScreenshot(reportLocation + '/TC152/Step 16-Click on p practiceFormDescription - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC152-Explore About and Iframes with Dynamic Elements_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}