package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectStudyAndViewSubjectDetails {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button selectStudyOrOrganization"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))
        
        "Step 2: Click on button studyActions -> Navigate to page '/studies/*/dashboard'"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': data['button_studyActions_internalText'], 'button_studyActions_liNthOfType': data['button_studyActions_liNthOfType']]))
        
        "Step 3: Click on link studyLinks"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': data['link_studyLinks_aTitle'], 'link_studyLinks_class': data['link_studyLinks_class'], 'link_studyLinks_href_variable': data['link_studyLinks_href_variable'], 'link_studyLinks_liNthOfType': data['link_studyLinks_liNthOfType']]))
        
        "Step 4: Click on faIcon next2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_dashboard/faIcon_next2'))
        
        "Step 5: Click on div subjectDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_subjectDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_subjectDetails', ['div_subjectDetails_trNthChild': data['div_subjectDetails_trNthChild'], 'div_subjectDetails_trNthOfType': data['div_subjectDetails_trNthOfType']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_studyActions_internalText'] = testData.getValue('button_studyActions_internalText', rowIndex)
        data['button_studyActions_liNthOfType'] = testData.getValue('button_studyActions_liNthOfType', rowIndex)
        data['div_subjectDetails_trNthChild'] = testData.getValue('div_subjectDetails_trNthChild', rowIndex)
        data['div_subjectDetails_trNthOfType'] = testData.getValue('div_subjectDetails_trNthOfType', rowIndex)
        data['link_studyLinks_aTitle'] = testData.getValue('link_studyLinks_aTitle', rowIndex)
        data['link_studyLinks_class'] = testData.getValue('link_studyLinks_class', rowIndex)
        data['link_studyLinks_href_variable'] = testData.getValue('link_studyLinks_href_variable', rowIndex)
        data['link_studyLinks_liNthOfType'] = testData.getValue('link_studyLinks_liNthOfType', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['button_studyActions_internalText'] = 'default_data'
        data['button_studyActions_liNthOfType'] = 'default_data'
        data['div_subjectDetails_trNthChild'] = 'default_data'
        data['div_subjectDetails_trNthOfType'] = 'default_data'
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

