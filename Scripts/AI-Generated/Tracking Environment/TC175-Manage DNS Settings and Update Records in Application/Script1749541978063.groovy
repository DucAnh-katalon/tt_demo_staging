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

"Step 1: Navigate to /login"

TrueTestScripts.navigate("/login")

"Step 2: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/login?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_login/td_object'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 2-Click on td object.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on p deleteRecord"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/p_deleteRecord'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 4-Click on p deleteRecord.png')

"Step 5: Click on td ipAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/td_ipAddress'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 5-Click on td ipAddress.png')

"Step 6: Click on p sua"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/p_sua'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 6-Click on p sua.png')

"Step 7: Click on input dns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_dns'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 7-Click on input dns.png')

"Step 8: Enter input value in input dns"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_dns'), input_dns)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 8-Enter input value in input dns.png')

"Step 9: Click on p object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/p_object'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 9-Click on p object.png')

"Step 10: Click on td dnsSettings (www)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsSettings', ['td_dnsSettings_trNthChild': td_dnsSettings_trNthChild, 'td_dnsSettings_trNthOfType': td_dnsSettings_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 10-Click on td dnsSettings www.png')

"Step 11: Click on p deleteRecord2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/p_deleteRecord2'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 11-Click on p deleteRecord2.png')

"Step 12: Click on button xacNhan"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/button_xacNhan'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 12-Click on button xacNhan.png')

"Step 13: Click on td dnsTypes (mxType)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsTypes', ['td_dnsTypes_class': td_dnsTypes_class, 'td_dnsTypes_trNthChild': td_dnsTypes_trNthChild]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 13-Click on td dnsTypes mxType.png')

"Step 14: Click on td dnsTypes (indexType)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsTypes', ['td_dnsTypes_class': td_dnsTypes_class_1, 'td_dnsTypes_trNthChild': td_dnsTypes_trNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 14-Click on td dnsTypes indexType.png')

"Step 15: Click on td dnsTypes (indexType)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsTypes', ['td_dnsTypes_class': td_dnsTypes_class_2, 'td_dnsTypes_trNthChild': td_dnsTypes_trNthChild_2]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 15-Click on td dnsTypes indexType.png')

"Step 16: Click on td dnsTypes (indexType)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsTypes', ['td_dnsTypes_class': td_dnsTypes_class_3, 'td_dnsTypes_trNthChild': td_dnsTypes_trNthChild_3]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 16-Click on td dnsTypes indexType.png')

"Step 17: Click on item deleteRecord"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/item_deleteRecord'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 17-Click on item deleteRecord.png')

"Step 18: Click on button xacNhan"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/button_xacNhan'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 18-Click on button xacNhan.png')

"Step 19: Click on item add"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/item_add'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 19-Click on item add.png')

"Step 20: Click on input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_name'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 20-Click on input name.png')

"Step 21: Enter input value in input name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_name'), input_name)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 21-Enter input value in input name.png')

"Step 22: Select option with input value from select dnsType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/select_dnsType'), select_dnsType)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 22-Select option with input value from select dnsType.png')

"Step 23: Click on input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_value'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 23-Click on input value.png')

"Step 24: Enter input value in input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_value'), input_value)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 24-Enter input value in input value.png')

"Step 25: Click on item luu"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/item_luu'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 25-Click on item luu.png')

"Step 26: Click on item edit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/item_edit'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 26-Click on item edit.png')

"Step 27: Click on input dnsSetting"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_dnsSetting'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 27-Click on input dnsSetting.png')

"Step 28: Enter input value in input dnsSetting"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_dnsSetting'), input_dnsSetting)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 28-Enter input value in input dnsSetting.png')

"Step 29: Click on p objectDescription (description)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/p_objectDescription"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/p_objectDescription', ['p_objectDescription_trNthChild': p_objectDescription_trNthChild, 'p_objectDescription_trNthOfType': p_objectDescription_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 29-Click on p objectDescription description.png')

"Step 30: Click on i objectIcons (deleteIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/i_objectIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/i_objectIcons', ['i_objectIcons_trNthChild': i_objectIcons_trNthChild, 'i_objectIcons_trNthOfType': i_objectIcons_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 30-Click on i objectIcons deleteIcon.png')

"Step 31: Click on i objectIcons (deleteIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/i_objectIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/i_objectIcons', ['i_objectIcons_trNthChild': i_objectIcons_trNthChild_1, 'i_objectIcons_trNthOfType': i_objectIcons_trNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 31-Click on i objectIcons deleteIcon.png')

"Step 32: Click on td priority"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/td_priority'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 32-Click on td priority.png')

"Step 33: Click on td object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/td_object'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 33-Click on td object.png')

"Step 34: Click on input dnsSetting2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_dnsSetting2'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 34-Click on input dnsSetting2.png')

"Step 35: Enter input value in input dnsSetting"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_dnsSetting'), input_dnsSetting_1)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 35-Enter input value in input dnsSetting.png')

"Step 36: Click on item changesActions (delete)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/item_changesActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/item_changesActions', ['item_changesActions_trNthChild': item_changesActions_trNthChild, 'item_changesActions_trNthOfType': item_changesActions_trNthOfType]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 36-Click on item changesActions delete.png')

"Step 37: Click on input dnsSetting2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_dnsSetting2'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 37-Click on input dnsSetting2.png')

"Step 38: Enter input value in input dnsSetting"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_dnsSetting'), input_dnsSetting_2)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 38-Enter input value in input dnsSetting.png')

"Step 39: Click on i objectIcons (deleteIcon)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/i_objectIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/i_objectIcons', ['i_objectIcons_trNthChild': i_objectIcons_trNthChild_2, 'i_objectIcons_trNthOfType': i_objectIcons_trNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 39-Click on i objectIcons deleteIcon.png')

"Step 40: Click on button ok"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 40-Click on button ok.png')

"Step 41: Click on input dnsSetting"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_dnsSetting'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 41-Click on input dnsSetting.png')

"Step 42: Enter input value in input dnsSetting"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_dnsSetting'), input_dnsSetting_3)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 42-Enter input value in input dnsSetting.png')

"Step 43: Click on p huy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/p_huy'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 43-Click on p huy.png')

"Step 44: Click on i editRecord"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/i_editRecord'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 44-Click on i editRecord.png')

"Step 45: Click on input dnsSetting"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_dnsSetting'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 45-Click on input dnsSetting.png')

"Step 46: Enter input value in input dnsSetting"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_dnsSetting'), input_dnsSetting_4)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 46-Enter input value in input dnsSetting.png')

"Step 47: Click on item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/item_object'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 47-Click on item object.png')

"Step 48: Click on i editRecord2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/i_editRecord2'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 48-Click on i editRecord2.png')

"Step 49: Click on input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 49-Click on input text.png')

"Step 50: Enter input value in input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'), input_text)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 50-Enter input value in input text.png')

"Step 51: Click on item saveChanged"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/item_saveChanged'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 51-Click on item saveChanged.png')

"Step 52: Click on button ok"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 52-Click on button ok.png')

"Step 53: Click on input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 53-Click on input text.png')

"Step 54: Click on p editRecord"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/p_editRecord'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 54-Click on p editRecord.png')

"Step 55: Click on input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 55-Click on input text.png')

"Step 56: Enter input value in input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'), input_text_1)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 56-Enter input value in input text.png')

"Step 57: Click on i objectIcons (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/i_objectIcons"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/i_objectIcons', ['i_objectIcons_trNthChild': i_objectIcons_trNthChild_3, 'i_objectIcons_trNthOfType': i_objectIcons_trNthOfType_3]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 57-Click on i objectIcons object.png')

"Step 58: Click on button ok"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 58-Click on button ok.png')

"Step 59: Click on input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 59-Click on input text.png')

"Step 60: Enter input value in input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'), input_text_2)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 60-Enter input value in input text.png')

"Step 61: Press key Enter on input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 61-Press key Enter on input text.png')

"Step 62: Enter input value in input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'), input_text_3)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 62-Enter input value in input text.png')

"Step 63: Click on item changesActions (saveChanges)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/item_changesActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/item_changesActions', ['item_changesActions_trNthChild': item_changesActions_trNthChild_1, 'item_changesActions_trNthOfType': item_changesActions_trNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 63-Click on item changesActions saveChanges.png')

"Step 64: Click on button ok"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 64-Click on button ok.png')

"Step 65: Enter input value in input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'), input_text_4)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 65-Enter input value in input text.png')

"Step 66: Click on td mailInspiredesk"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/td_mailInspiredesk'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 66-Click on td mailInspiredesk.png')

"Step 67: Click on td dnsSettings (www)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsSettings', ['td_dnsSettings_trNthChild': td_dnsSettings_trNthChild_1, 'td_dnsSettings_trNthOfType': td_dnsSettings_trNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 67-Click on td dnsSettings www.png')

"Step 68: Click on td dnsSettings (atSymbol)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsSettings', ['td_dnsSettings_trNthChild': td_dnsSettings_trNthChild_2, 'td_dnsSettings_trNthOfType': td_dnsSettings_trNthOfType_2]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 68-Click on td dnsSettings atSymbol.png')

"Step 69: Click on td dnsSettings (www)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsSettings', ['td_dnsSettings_trNthChild': td_dnsSettings_trNthChild_3, 'td_dnsSettings_trNthOfType': td_dnsSettings_trNthOfType_3]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 69-Click on td dnsSettings www.png')

"Step 70: Click on td dnsSettings (www)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsSettings', ['td_dnsSettings_trNthChild': td_dnsSettings_trNthChild_4, 'td_dnsSettings_trNthOfType': td_dnsSettings_trNthOfType_4]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 70-Click on td dnsSettings www.png')

"Step 71: Click on td dnsSettings (www)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsSettings', ['td_dnsSettings_trNthChild': td_dnsSettings_trNthChild_5, 'td_dnsSettings_trNthOfType': td_dnsSettings_trNthOfType_5]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 71-Click on td dnsSettings www.png')

"Step 72: Click on td dnsSettings (www)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsSettings', ['td_dnsSettings_trNthChild': td_dnsSettings_trNthChild_6, 'td_dnsSettings_trNthOfType': td_dnsSettings_trNthOfType_6]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 72-Click on td dnsSettings www.png')

"Step 73: Click on td mailInspiredesk"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/td_mailInspiredesk'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 73-Click on td mailInspiredesk.png')

"Step 74: Click on input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 74-Click on input text.png')

"Step 75: Enter input value in input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'), input_text_5)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 75-Enter input value in input text.png')

"Step 76: Click on td dnsTypes (txt)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsTypes"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/td_dnsTypes', ['td_dnsTypes_class': td_dnsTypes_class_4, 'td_dnsTypes_trNthChild': td_dnsTypes_trNthChild_4]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 76-Click on td dnsTypes txt.png')

"Step 77: Click on td inspiredeskUrl"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/td_inspiredeskUrl'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 77-Click on td inspiredeskUrl.png')

"Step 78: Click on input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 78-Click on input text.png')

"Step 79: Enter input value in input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'), input_text_6)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 79-Enter input value in input text.png')

"Step 80: Press key Enter on input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC175/Step 80-Press key Enter on input text.png')

"Step 81: Enter input value in input text"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/input_text'), input_text_7)

WebUI.takeScreenshot(reportLocation + '/TC175/Step 81-Enter input value in input text.png')

"Step 82: Click on p objectDescription (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/p_objectDescription"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_ApiDnsSetting/p_objectDescription', ['p_objectDescription_trNthChild': p_objectDescription_trNthChild_1, 'p_objectDescription_trNthOfType': p_objectDescription_trNthOfType_1]))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 82-Click on p objectDescription object2.png')

"Step 83: Click on item updateDnsStatus -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/ApiDnsSetting?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_ApiDnsSetting/item_updateDnsStatus'))

// WebUI.takeScreenshot(reportLocation + '/TC175/Step 83-Click on item updateDnsStatus - Navigate to page .png')

"Step 84: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC175-Manage DNS Settings and Update Records in Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}