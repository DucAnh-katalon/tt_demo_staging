package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class clickDynamicObjectsMultipleTimes {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on span dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': data['span_dynamicObject_spanNthChild'], 'span_dynamicObject_spanNthOfType': data['span_dynamicObject_spanNthOfType']]))
        
        "Step 2: Click on span dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': data['span_dynamicObject_spanNthChild_1'], 'span_dynamicObject_spanNthOfType': data['span_dynamicObject_spanNthOfType_1']]))
        
        "Step 3: Click on span dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': data['span_dynamicObject_spanNthChild_2'], 'span_dynamicObject_spanNthOfType': data['span_dynamicObject_spanNthOfType_2']]))
        
        "Step 4: Click on span dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': data['span_dynamicObject_spanNthChild_3'], 'span_dynamicObject_spanNthOfType': data['span_dynamicObject_spanNthOfType_3']]))
        
        "Step 5: Click on span dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_env_staging_aut_history/span_dynamicObject', ['span_dynamicObject_spanNthChild': data['span_dynamicObject_spanNthChild_4'], 'span_dynamicObject_spanNthOfType': data['span_dynamicObject_spanNthOfType_4']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['span_dynamicObject_spanNthChild'] = testData.getValue('span_dynamicObject_spanNthChild', rowIndex)
        data['span_dynamicObject_spanNthChild_1'] = testData.getValue('span_dynamicObject_spanNthChild_1', rowIndex)
        data['span_dynamicObject_spanNthChild_2'] = testData.getValue('span_dynamicObject_spanNthChild_2', rowIndex)
        data['span_dynamicObject_spanNthChild_3'] = testData.getValue('span_dynamicObject_spanNthChild_3', rowIndex)
        data['span_dynamicObject_spanNthChild_4'] = testData.getValue('span_dynamicObject_spanNthChild_4', rowIndex)
        data['span_dynamicObject_spanNthOfType'] = testData.getValue('span_dynamicObject_spanNthOfType', rowIndex)
        data['span_dynamicObject_spanNthOfType_1'] = testData.getValue('span_dynamicObject_spanNthOfType_1', rowIndex)
        data['span_dynamicObject_spanNthOfType_2'] = testData.getValue('span_dynamicObject_spanNthOfType_2', rowIndex)
        data['span_dynamicObject_spanNthOfType_3'] = testData.getValue('span_dynamicObject_spanNthOfType_3', rowIndex)
        data['span_dynamicObject_spanNthOfType_4'] = testData.getValue('span_dynamicObject_spanNthOfType_4', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['span_dynamicObject_spanNthChild'] = 'default_data'
        data['span_dynamicObject_spanNthChild_1'] = 'default_data'
        data['span_dynamicObject_spanNthChild_2'] = 'default_data'
        data['span_dynamicObject_spanNthChild_3'] = 'default_data'
        data['span_dynamicObject_spanNthChild_4'] = 'default_data'
        data['span_dynamicObject_spanNthOfType'] = 'default_data'
        data['span_dynamicObject_spanNthOfType_1'] = 'default_data'
        data['span_dynamicObject_spanNthOfType_2'] = 'default_data'
        data['span_dynamicObject_spanNthOfType_3'] = 'default_data'
        data['span_dynamicObject_spanNthOfType_4'] = 'default_data'
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

