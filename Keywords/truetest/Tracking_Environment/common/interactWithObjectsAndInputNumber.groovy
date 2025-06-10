package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class interactWithObjectsAndInputNumber {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_object'))
        
        "Step 2: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_object'))
        
        "Step 3: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_object'))
        
        "Step 4: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_object'))
        
        "Step 5: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_object'))
        
        "Step 6: Click on div object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/div_object'))
        
        "Step 7: Click on input number"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_number'))
        
        "Step 8: Enter input value in input numberInput"
        
        WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_env_qa_aut_history_graph/input_numberInput'), data['input_numberInput'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_numberInput'] = testData.getValue('input_numberInput', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_numberInput'] = 'default_data'
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

