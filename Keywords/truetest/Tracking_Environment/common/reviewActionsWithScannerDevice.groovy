package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class reviewActionsWithScannerDevice {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input scannerDevice"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/input_scannerDevice"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/input_scannerDevice', ['input_scannerDevice_id': data['input_scannerDevice_id']]))
        
        "Step 2: Click on button reviewActions"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_reviewActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/button_reviewActions', ['button_reviewActions_buttonNthOfType': data['button_reviewActions_buttonNthOfType'], 'button_reviewActions_dataTestid': data['button_reviewActions_dataTestid']]))
        
        "Step 3: Click on textarea comment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_comment'))
        
        "Step 4: Enter input value in textarea comment"
        
        WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/textarea_comment'), data['textarea_comment'])
        
        "Step 5: Click on button ok4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_ok4'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_reviewActions_buttonNthOfType'] = testData.getValue('button_reviewActions_buttonNthOfType', rowIndex)
        data['button_reviewActions_dataTestid'] = testData.getValue('button_reviewActions_dataTestid', rowIndex)
        data['input_scannerDevice_id'] = testData.getValue('input_scannerDevice_id', rowIndex)
        data['textarea_comment'] = testData.getValue('textarea_comment', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_reviewActions_buttonNthOfType'] = 'default_data'
        data['button_reviewActions_dataTestid'] = 'default_data'
        data['input_scannerDevice_id'] = 'default_data'
        data['textarea_comment'] = 'default_data'
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

