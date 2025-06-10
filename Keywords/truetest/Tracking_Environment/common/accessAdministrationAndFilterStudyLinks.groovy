package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class accessAdministrationAndFilterStudyLinks {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button administration2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_administration2'))
        
        "Step 2: Click on link studyLinks"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks_1"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks_1', ['link_studyLinks_aTitle': data['link_studyLinks_aTitle'], 'link_studyLinks_href_variable': data['link_studyLinks_href_variable'], 'link_studyLinks_liNthOfType': data['link_studyLinks_liNthOfType']]))
        
        "Step 3: Click on button siteManagement"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_siteManagement'))
        
        "Step 4: Click on input textFilter"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_textFilter'))
        
        "Step 5: Enter input value in input textFilter"
        
        WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_textFilter'), data['input_textFilter'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_textFilter'] = testData.getValue('input_textFilter', rowIndex)
        data['link_studyLinks_aTitle'] = testData.getValue('link_studyLinks_aTitle', rowIndex)
        data['link_studyLinks_href_variable'] = testData.getValue('link_studyLinks_href_variable', rowIndex)
        data['link_studyLinks_liNthOfType'] = testData.getValue('link_studyLinks_liNthOfType', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_textFilter'] = 'default_data'
        data['link_studyLinks_aTitle'] = 'default_data'
        data['link_studyLinks_href_variable'] = 'default_data'
        data['link_studyLinks_liNthOfType'] = 'default_data'
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

