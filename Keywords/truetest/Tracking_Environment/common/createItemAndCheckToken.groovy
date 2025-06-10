package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class createItemAndCheckToken {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on item ciSamples"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_ciSamples"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_project_tests_test_cases/item_ciSamples', ['item_ciSamples_id': data['item_ciSamples_id'], 'item_ciSamples_muiTreeView': data['item_ciSamples_muiTreeView']]))
        
        "Step 2: Click on button create"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_create'))
        
        "Step 3: Click on item folder"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/item_folder'))
        
        "Step 4: Click on button checkToken"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_checkToken'))
        
        "Step 5: Click on button cancel2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_project_tests_test_cases/button_cancel2'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['item_ciSamples_id'] = testData.getValue('item_ciSamples_id', rowIndex)
        data['item_ciSamples_muiTreeView'] = testData.getValue('item_ciSamples_muiTreeView', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['item_ciSamples_id'] = 'default_data'
        data['item_ciSamples_muiTreeView'] = 'default_data'
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

