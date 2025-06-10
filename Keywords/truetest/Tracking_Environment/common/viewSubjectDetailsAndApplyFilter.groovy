package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts

public class viewSubjectDetailsAndApplyFilter {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div subjectDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_subjectDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_subjectDetails', ['div_subjectDetails_trNthChild': data['div_subjectDetails_trNthChild'], 'div_subjectDetails_trNthOfType': data['div_subjectDetails_trNthOfType']]))
        
        "Step 2: Select option with input value from select filter3"
        
        TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/select_filter3'), data['select_filter3'])
        
        "Step 3: Click on input subjectId3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectId3'))
        
        "Step 4: Enter input value in input subjectId3"
        
        WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/input_subjectId3'), data['input_subjectId3'])
        
        "Step 5: Click on button apply3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/button_apply3'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['div_subjectDetails_trNthChild'] = testData.getValue('div_subjectDetails_trNthChild', rowIndex)
        data['div_subjectDetails_trNthOfType'] = testData.getValue('div_subjectDetails_trNthOfType', rowIndex)
        data['input_subjectId3'] = testData.getValue('input_subjectId3', rowIndex)
        data['select_filter3'] = testData.getValue('select_filter3', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['div_subjectDetails_trNthChild'] = 'default_data'
        data['div_subjectDetails_trNthOfType'] = 'default_data'
        data['input_subjectId3'] = 'default_data'
        data['select_filter3'] = 'default_data'
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

