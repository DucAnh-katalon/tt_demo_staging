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

"Step 1: Navigate to /wiki/spaces/IP/pages/*/WIP+TrueTest+-+Separate+AUT+env+by+application+domains"

TrueTestScripts.navigate("/wiki/spaces/IP/pages/${pages_id}/WIP+TrueTest+-+Separate+AUT+env+by+application+domains")

"Step 2: Hover over link resolvedView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/wiki/spaces/IP/pages/.*/WIP+TrueTest+-+Separate+AUT+env+by+application+domains?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_wiki_spaces_IP_pages_WIP_TrueTest_Separate_AUT_env_by_domains/link_resolvedView'))

// WebUI.takeScreenshot(reportLocation + '/TC108/Step 2-Hover over link resolvedView.png')

"Step 3: Click on button cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/wiki/spaces/IP/pages/.*/WIP+TrueTest+-+Separate+AUT+env+by+application+domains?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_wiki_spaces_IP_pages_WIP_TrueTest_Separate_AUT_env_by_domains/button_cancel'))

WebUI.takeScreenshot(reportLocation + '/TC108/Step 3-Click on button cancel.png')

"Step 4: Hover over button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/wiki/spaces/IP/pages/.*/WIP+TrueTest+-+Separate+AUT+env+by+application+domains?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_wiki_spaces_IP_pages_WIP_TrueTest_Separate_AUT_env_by_domains/button_object'))

// WebUI.takeScreenshot(reportLocation + '/TC108/Step 4-Hover over button object.png')

"Step 5: Hover over button share"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/wiki/spaces/IP/pages/.*/WIP+TrueTest+-+Separate+AUT+env+by+application+domains?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_wiki_spaces_IP_pages_WIP_TrueTest_Separate_AUT_env_by_domains/button_share'))

// WebUI.takeScreenshot(reportLocation + '/TC108/Step 5-Hover over button share.png')

"Step 6: Hover over button spacesDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/wiki/spaces/IP/pages/.*/WIP+TrueTest+-+Separate+AUT+env+by+application+domains?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_wiki_spaces_IP_pages_WIP_TrueTest_Separate_AUT_env_by_domains/button_spacesDropdown'))

// WebUI.takeScreenshot(reportLocation + '/TC108/Step 6-Hover over button spacesDropdown.png')

"Step 7: Click on div cssElement -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/wiki/spaces/IP/pages/.*/WIP+TrueTest+-+Separate+AUT+env+by+application+domains?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_wiki_spaces_IP_pages_WIP_TrueTest_Separate_AUT_env_by_domains/div_cssElement'))

// WebUI.takeScreenshot(reportLocation + '/TC108/Step 7-Click on div cssElement - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC108-Cancel Action and Verify Home Page in Wiki Spaces_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}