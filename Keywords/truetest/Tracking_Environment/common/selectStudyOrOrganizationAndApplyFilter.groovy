package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectStudyOrOrganizationAndApplyFilter {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button selectStudyOrOrganization"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))
        
        "Step 2: Click on link showMore"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/link_showMore'))
        
        "Step 3: Click on input filterText"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_filterText'))
        
        "Step 4: Enter input value in input filterText"
        
        WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_filterText'), data['input_filterText'])
        
        "Step 5: Click on button apply4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_apply4'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_filterText'] = testData.getValue('input_filterText', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_filterText'] = 'default_data'
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

