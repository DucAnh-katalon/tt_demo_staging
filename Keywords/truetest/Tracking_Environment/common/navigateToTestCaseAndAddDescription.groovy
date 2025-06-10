package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class navigateToTestCaseAndAddDescription {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link testCaseNavigation -> Navigate to page '/project/*/tests/test-cases/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation', ['link_testCaseNavigation_class': data['link_testCaseNavigation_class'], 'link_testCaseNavigation_href_variable': data['link_testCaseNavigation_href_variable'], 'link_testCaseNavigation_internalLabel': data['link_testCaseNavigation_internalLabel']]))
        
        "Step 2: Click on textarea description2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_description2'))
        
        "Step 3: Enter input value in textarea description2"
        
        WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_description2'), data['textarea_description2'])
        
        "Step 4: Click on button testCaseActions"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions', ['button_testCaseActions_class': data['button_testCaseActions_class'], 'button_testCaseActions_divNthOfType': data['button_testCaseActions_divNthOfType'], 'button_testCaseActions_internalText': data['button_testCaseActions_internalText']]))
        
        "Step 5: Click on button testCaseActions"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/button_testCaseActions', ['button_testCaseActions_class': data['button_testCaseActions_class_1'], 'button_testCaseActions_divNthOfType': data['button_testCaseActions_divNthOfType_1'], 'button_testCaseActions_internalText': data['button_testCaseActions_internalText_1']]))
        
        "Step 6: Click on button newStep"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_newStep'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_testCaseActions_class'] = testData.getValue('button_testCaseActions_class', rowIndex)
        data['button_testCaseActions_class_1'] = testData.getValue('button_testCaseActions_class_1', rowIndex)
        data['button_testCaseActions_divNthOfType'] = testData.getValue('button_testCaseActions_divNthOfType', rowIndex)
        data['button_testCaseActions_divNthOfType_1'] = testData.getValue('button_testCaseActions_divNthOfType_1', rowIndex)
        data['button_testCaseActions_internalText'] = testData.getValue('button_testCaseActions_internalText', rowIndex)
        data['button_testCaseActions_internalText_1'] = testData.getValue('button_testCaseActions_internalText_1', rowIndex)
        data['link_testCaseNavigation_class'] = testData.getValue('link_testCaseNavigation_class', rowIndex)
        data['link_testCaseNavigation_href_variable'] = testData.getValue('link_testCaseNavigation_href_variable', rowIndex)
        data['link_testCaseNavigation_internalLabel'] = testData.getValue('link_testCaseNavigation_internalLabel', rowIndex)
        data['textarea_description2'] = testData.getValue('textarea_description2', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_testCaseActions_class'] = 'default_data'
        data['button_testCaseActions_class_1'] = 'default_data'
        data['button_testCaseActions_divNthOfType'] = 'default_data'
        data['button_testCaseActions_divNthOfType_1'] = 'default_data'
        data['button_testCaseActions_internalText'] = 'default_data'
        data['button_testCaseActions_internalText_1'] = 'default_data'
        data['link_testCaseNavigation_class'] = 'default_data'
        data['link_testCaseNavigation_href_variable'] = 'default_data'
        data['link_testCaseNavigation_internalLabel'] = 'default_data'
        data['textarea_description2'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

