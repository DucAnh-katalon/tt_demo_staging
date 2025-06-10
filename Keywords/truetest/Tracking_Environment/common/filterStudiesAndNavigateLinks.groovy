package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class filterStudiesAndNavigateLinks {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input filterText"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_filterText'))
        
        "Step 2: Enter input value in input filterText"
        
        WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/input_filterText'), data['input_filterText'])
        
        "Step 3: Click on button apply3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_apply3'))
        
        "Step 4: Click on span studyProtocol -> Navigate to page '/studies/*/dashboard'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/span_studyProtocol2'))
        
        "Step 5: Click on link studyLinks"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': data['link_studyLinks_aTitle'], 'link_studyLinks_class': data['link_studyLinks_class'], 'link_studyLinks_href_variable': data['link_studyLinks_href_variable'], 'link_studyLinks_liNthOfType': data['link_studyLinks_liNthOfType']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_filterText'] = testData.getValue('input_filterText', rowIndex)
        data['link_studyLinks_aTitle'] = testData.getValue('link_studyLinks_aTitle', rowIndex)
        data['link_studyLinks_class'] = testData.getValue('link_studyLinks_class', rowIndex)
        data['link_studyLinks_href_variable'] = testData.getValue('link_studyLinks_href_variable', rowIndex)
        data['link_studyLinks_liNthOfType'] = testData.getValue('link_studyLinks_liNthOfType', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_filterText'] = 'default_data'
        data['link_studyLinks_aTitle'] = 'default_data'
        data['link_studyLinks_class'] = 'default_data'
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

