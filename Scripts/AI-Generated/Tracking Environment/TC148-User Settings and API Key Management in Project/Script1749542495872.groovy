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

"Step 1: Navigate to /project/*/home/overview with params (filter)"

TrueTestScripts.navigate("/project/${project_id}/home/overview", ["filter": overview_filter])

"Step 2: Hover over link tests5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_tests5'))

// WebUI.takeScreenshot(reportLocation + '/TC148/Step 2-Hover over link tests5.png')

"Step 3: Click on link journeyMaps -> Navigate to page '/project/*/tests/journey-maps'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/home/overview?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_home_overview/link_journeyMaps'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 3-Click on link journeyMaps - Navigate to page projecttestsjourney-maps.png')

"Step 4: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/journey-maps?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_journey_maps/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 4-Click on button object.png')

"Step 5: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/journey-maps?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_journey_maps/div_backdrop'))

// WebUI.takeScreenshot(reportLocation + '/TC148/Step 5-Click on div backdrop.png')

"Step 6: Click on div avatar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/journey-maps?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_journey_maps/div_avatar'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 6-Click on div avatar.png')

"Step 7: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/journey-maps?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_journey_maps/div_backdrop'))

// WebUI.takeScreenshot(reportLocation + '/TC148/Step 7-Click on div backdrop.png')

"Step 8: Click on link userSettings -> Navigate to page '/user-settings/personal-integration'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/project/.*/tests/journey-maps?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_journey_maps/link_userSettings'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 8-Click on link userSettings - Navigate to page user-settingspersonal-integration.png')

"Step 9: Click on span button -> Navigate to page '/user-settings/personal-integration/create'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_personal_integration/span_button'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 9-Click on span button - Navigate to page user-settingspersonal-integrationcreate.png')

"Step 10: Click on input passwordField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_personal_integration_create/input_passwordField'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 10-Click on input passwordField.png')

"Step 11: Click on input passwordField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_personal_integration_create/input_passwordField'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 11-Click on input passwordField.png')

"Step 12: Enter input value in input passwordField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_personal_integration_create/input_passwordField'), input_passwordField)

WebUI.takeScreenshot(reportLocation + '/TC148/Step 12-Enter input value in input passwordField.png')

"Step 13: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_personal_integration_create/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 13-Click on input email.png')

"Step 14: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_personal_integration_create/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC148/Step 14-Enter input value in input email.png')

"Step 15: Click on input passwordField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_personal_integration_create/input_passwordField'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 15-Click on input passwordField.png')

"Step 16: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_personal_integration_create/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 16-Click on input email.png')

"Step 17: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_personal_integration_create/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC148/Step 17-Click on div object.png')

"Step 18: Enter input value in input passwordField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_personal_integration_create/input_passwordField'), input_passwordField_1)

WebUI.takeScreenshot(reportLocation + '/TC148/Step 18-Enter input value in input passwordField.png')

"Step 19: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_personal_integration_create/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 19-Click on input email.png')

"Step 20: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_personal_integration_create/input_email'), input_email_1)

WebUI.takeScreenshot(reportLocation + '/TC148/Step 20-Enter input value in input email.png')

"Step 21: Click on button cancel -> Navigate to page '/user-settings/personal-integration'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration/create?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_personal_integration_create/button_cancel'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 21-Click on button cancel - Navigate to page user-settingspersonal-integration.png')

"Step 22: Click on button katalonApiKey -> Navigate to page '/user-settings/api-key'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/personal-integration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_personal_integration/button_katalonApiKey'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 22-Click on button katalonApiKey - Navigate to page user-settingsapi-key.png')

"Step 23: Click on span apiKey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_api_key/span_apiKey'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 23-Click on span apiKey.png')

"Step 24: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_api_key/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 24-Click on span object.png')

"Step 25: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_api_key/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 25-Click on button object.png')

"Step 26: Click on div apiKeyExpiration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_api_key/div_apiKeyExpiration'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 26-Click on div apiKeyExpiration.png')

"Step 27: Click on div apiKeyExpiration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_api_key/div_apiKeyExpiration'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 27-Click on div apiKeyExpiration.png')

"Step 28: Click on div userSettings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_api_key/div_userSettings'))

// WebUI.takeScreenshot(reportLocation + '/TC148/Step 28-Click on div userSettings.png')

"Step 29: Click on div updateApiKey"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_api_key/div_updateApiKey'))

// WebUI.takeScreenshot(reportLocation + '/TC148/Step 29-Click on div updateApiKey.png')

"Step 30: Click on textarea description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_api_key/textarea_description'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 30-Click on textarea description.png')

"Step 31: Click on button cancel -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/user-settings/api-key?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_user_settings_api_key/button_cancel'))

WebUI.takeScreenshot(reportLocation + '/TC148/Step 31-Click on button cancel - Navigate to page .png')

"Step 32: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC148-User Settings and API Key Management in Project_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}