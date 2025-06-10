package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class adminLogoutAndCreateNewTemplate {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button superUser"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/button_superUser'))
        
        "Step 2: Click on link logout -> Navigate to page '/dashboard'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_queries/link_logout'))
        
        "Step 3: Click on button administration2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_administration2'))
        
        "Step 4: Click on link templateLinks"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/link_templateLinks', ['link_templateLinks_aTitle': data['link_templateLinks_aTitle']]))
        
        "Step 5: Click on button createNew"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_createNew'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['link_templateLinks_aTitle'] = testData.getValue('link_templateLinks_aTitle', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['link_templateLinks_aTitle'] = 'default_data'
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

