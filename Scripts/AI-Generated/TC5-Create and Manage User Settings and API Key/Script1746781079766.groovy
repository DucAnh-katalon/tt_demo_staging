import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /project/*/home/overview with params (filter)"

TrueTestScripts.navigate("/project/${project_id}/home/overview", ["filter": overview_filter])

"Step 2: Hover over link tests2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_project_home_overview/link_tests2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Hover over link tests2.png')

"Step 3: Click on link journeyMaps -> Navigate to page '/project/*/tests/journey-maps'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_home_overview/link_journeyMaps'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 3-Click on link journeyMaps - Navigate to page projecttestsjourney-maps.png')

"Step 4: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/journey-maps?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_journey_maps/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on button object.png')

"Step 5: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/journey-maps?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_journey_maps/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on div object.png')

"Step 6: Click on div avatarButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/journey-maps?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_journey_maps/div_avatarButton'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on div avatarButton.png')

"Step 7: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/journey-maps?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_journey_maps/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on div object.png')

"Step 8: Click on link userSettings -> Navigate to page '/user-settings/personal-integration'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/journey-maps?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_project_tests_journey_maps/link_userSettings'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on link userSettings - Navigate to page user-settingspersonal-integration.png')

"Step 9: Click on span object -> Navigate to page '/user-settings/personal-integration/create'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_personal_integration/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on span object - Navigate to page user-settingspersonal-integrationcreate.png')

"Step 10: Click on input credential"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_personal_integration_create/input_credential'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on input credential.png')

"Step 11: Click on input credential"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_personal_integration_create/input_credential'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on input credential.png')

"Step 12: Enter input value in input credential"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_settings_personal_integration_create/input_credential'), input_credential)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Enter input value in input credential.png')

"Step 13: Click on input credentialEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_personal_integration_create/input_credentialEmail'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on input credentialEmail.png')

"Step 14: Enter input value in input credentialEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_settings_personal_integration_create/input_credentialEmail'), input_credentialEmail)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Enter input value in input credentialEmail.png')

"Step 15: Click on input credential"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_personal_integration_create/input_credential'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Click on input credential.png')

"Step 16: Click on input credentialEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_personal_integration_create/input_credentialEmail'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on input credentialEmail.png')

"Step 17: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_personal_integration_create/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on div object.png')

"Step 18: Enter input value in input credential"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_settings_personal_integration_create/input_credential'), input_credential_1)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 18-Enter input value in input credential.png')

"Step 19: Click on input credentialEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_personal_integration_create/input_credentialEmail'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 19-Click on input credentialEmail.png')

"Step 20: Enter input value in input credentialEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_user_settings_personal_integration_create/input_credentialEmail'), input_credentialEmail_1)

WebUI.takeScreenshot(reportLocation + '/TC5/Step 20-Enter input value in input credentialEmail.png')

"Step 21: Click on button cancel -> Navigate to page '/user-settings/personal-integration'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_personal_integration_create/button_cancel'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 21-Click on button cancel - Navigate to page user-settingspersonal-integration.png')

"Step 22: Click on button katalonApiKey -> Navigate to page '/user-settings/api-key'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_personal_integration/button_katalonApiKey'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 22-Click on button katalonApiKey - Navigate to page user-settingsapi-key.png')

"Step 23: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_api_key/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 23-Click on span object.png')

"Step 24: Click on span object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_api_key/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 24-Click on span object2.png')

"Step 25: Click on button createApiKey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_api_key/button_createApiKey'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 25-Click on button createApiKey.png')

"Step 26: Click on div selectExpiration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_api_key/div_selectExpiration'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 26-Click on div selectExpiration.png')

"Step 27: Click on div selectExpiration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_api_key/div_selectExpiration'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 27-Click on div selectExpiration.png')

"Step 28: Click on div inputBase"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_api_key/div_inputBase'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 28-Click on div inputBase.png')

"Step 29: Click on div updateApiKeyDialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_api_key/div_updateApiKeyDialog'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 29-Click on div updateApiKeyDialog.png')

"Step 30: Click on textarea enterDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_api_key/textarea_enterDescription'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 30-Click on textarea enterDescription.png')

"Step 31: Click on button cancel -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_user_settings_api_key/button_cancel'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 31-Click on button cancel - Navigate to page .png')

"Step 32: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Create and Manage User Settings and API Key_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}