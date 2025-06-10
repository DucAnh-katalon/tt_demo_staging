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

"Step 1: Navigate to /html/html iframe.asp"

TrueTestScripts.navigate("/html/html_iframe.asp")

"Step 2: Hover over link startLearningHtml"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_iframe.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_html_html_iframe_asp/link_startLearningHtml'))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 2-Hover over link startLearningHtml.png')

"Step 3: Hover over link pythonTutorial"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_iframe.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_html_html_iframe_asp/link_pythonTutorial'))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 3-Hover over link pythonTutorial.png')

"Step 4: Hover over link services"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_iframe.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_html_html_iframe_asp/link_services'))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 4-Hover over link services.png')

"Step 5: Hover over link php"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_iframe.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_html_html_iframe_asp/link_php'))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 5-Hover over link php.png')

"Step 6: Click on link htmlElements -> Navigate to page '/html/html elements.asp'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_iframe.asp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_html_html_iframe_asp/link_htmlElements'))

WebUI.takeScreenshot(reportLocation + '/TC142/Step 6-Click on link htmlElements - Navigate to page htmlhtml elementsasp.png')

"Step 7: Click on span doctypeHtml"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_elements.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_html_html_elements_asp/span_doctypeHtml'))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 7-Click on span doctypeHtml.png')

"Step 8: Click on div htmlCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_elements.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_html_html_elements_asp/div_htmlCode'))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 8-Click on div htmlCode.png')

"Step 9: Click on div htmlCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_elements.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_html_html_elements_asp/div_htmlCode'))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 9-Click on div htmlCode.png')

"Step 10: Click on div htmlCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_elements.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_html_html_elements_asp/div_htmlCode'))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 10-Click on div htmlCode.png')

"Step 11: Click on span htmlTags (h1Tag)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_elements.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_html_html_elements_asp/span_htmlTags"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_html_html_elements_asp/span_htmlTags', ['span_htmlTags_spanNthChild': span_htmlTags_spanNthChild, 'span_htmlTags_spanNthOfType': span_htmlTags_spanNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 11-Click on span htmlTags h1Tag.png')

"Step 12: Click on input searchField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_elements.asp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_html_html_elements_asp/input_searchField'))

WebUI.takeScreenshot(reportLocation + '/TC142/Step 12-Click on input searchField.png')

"Step 13: Enter input value in input searchField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_elements.asp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_html_html_elements_asp/input_searchField'), input_searchField)

WebUI.takeScreenshot(reportLocation + '/TC142/Step 13-Enter input value in input searchField.png')

"Step 14: Click on span htmlTags (titleTag)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_elements.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_html_html_elements_asp/span_htmlTags"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_html_html_elements_asp/span_htmlTags', ['span_htmlTags_spanNthChild': span_htmlTags_spanNthChild_1, 'span_htmlTags_spanNthOfType': span_htmlTags_spanNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 14-Click on span htmlTags titleTag.png')

"Step 15: Click on span htmlTags (titleTag)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_elements.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_html_html_elements_asp/span_htmlTags"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_html_html_elements_asp/span_htmlTags', ['span_htmlTags_spanNthChild': span_htmlTags_spanNthChild_2, 'span_htmlTags_spanNthOfType': span_htmlTags_spanNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 15-Click on span htmlTags titleTag.png')

"Step 16: Click on div htmlCode -> Navigate to page '/html/html iframe.asp'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_elements.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_html_html_elements_asp/div_htmlCode'))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 16-Click on div htmlCode - Navigate to page htmlhtml iframeasp.png')

"Step 17: Click on div htmlIframe"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_iframe.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_html_html_iframe_asp/div_htmlIframe'))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 17-Click on div htmlIframe.png')

"Step 18: Click on header syntax"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_iframe.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_html_html_iframe_asp/header_syntax'))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 18-Click on header syntax.png')

"Step 19: Click on div iframeContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_iframe.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_html_html_iframe_asp/div_iframeContainer'))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 19-Click on div iframeContainer.png')

"Step 20: Click on span urlAttribute"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_iframe.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_html_html_iframe_asp/span_urlAttribute'))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 20-Click on span urlAttribute.png')

"Step 21: Click on div htmlIframe -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/html/html_iframe.asp?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_html_html_iframe_asp/div_htmlIframe'))

// WebUI.takeScreenshot(reportLocation + '/TC142/Step 21-Click on div htmlIframe - Navigate to page .png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC142-Explore HTML Iframe Elements and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}