package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class addStepsToTestCaseAndEditDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link testCaseNavigation -> Navigate to page '/project/*/tests/test-cases/*'"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/link_testCaseNavigation', ['link_testCaseNavigation_class': data['link_testCaseNavigation_class'], 'link_testCaseNavigation_href_variable': data['link_testCaseNavigation_href_variable'], 'link_testCaseNavigation_internalLabel': data['link_testCaseNavigation_internalLabel']]))
        
        "Step 2: Click on button newStep"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_newStep'))
        
        "Step 3: Enter input value in textarea manualEditor2"
        
        WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_manualEditor2'), data['textarea_manualEditor2'])
        
        "Step 4: Click on div testCaseDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/div_testCaseDetails', ['div_testCaseDetails_class': data['div_testCaseDetails_class'], 'div_testCaseDetails_divNthChild': data['div_testCaseDetails_divNthChild'], 'div_testCaseDetails_divNthChild_1': data['div_testCaseDetails_divNthChild_1'], 'div_testCaseDetails_divNthOfType': data['div_testCaseDetails_divNthOfType']]))
        
        "Step 5: Enter input value in textarea manualEditor3"
        
        WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/textarea_manualEditor3'), data['textarea_manualEditor3'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['div_testCaseDetails_class'] = testData.getValue('div_testCaseDetails_class', rowIndex)
        data['div_testCaseDetails_divNthChild'] = testData.getValue('div_testCaseDetails_divNthChild', rowIndex)
        data['div_testCaseDetails_divNthChild_1'] = testData.getValue('div_testCaseDetails_divNthChild_1', rowIndex)
        data['div_testCaseDetails_divNthOfType'] = testData.getValue('div_testCaseDetails_divNthOfType', rowIndex)
        data['link_testCaseNavigation_class'] = testData.getValue('link_testCaseNavigation_class', rowIndex)
        data['link_testCaseNavigation_href_variable'] = testData.getValue('link_testCaseNavigation_href_variable', rowIndex)
        data['link_testCaseNavigation_internalLabel'] = testData.getValue('link_testCaseNavigation_internalLabel', rowIndex)
        data['textarea_manualEditor2'] = testData.getValue('textarea_manualEditor2', rowIndex)
        data['textarea_manualEditor3'] = testData.getValue('textarea_manualEditor3', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['div_testCaseDetails_class'] = 'default_data'
        data['div_testCaseDetails_divNthChild'] = 'default_data'
        data['div_testCaseDetails_divNthChild_1'] = 'default_data'
        data['div_testCaseDetails_divNthOfType'] = 'default_data'
        data['link_testCaseNavigation_class'] = 'default_data'
        data['link_testCaseNavigation_href_variable'] = 'default_data'
        data['link_testCaseNavigation_internalLabel'] = 'default_data'
        data['textarea_manualEditor2'] = 'default_data'
        data['textarea_manualEditor3'] = 'default_data'
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

