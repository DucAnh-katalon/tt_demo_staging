package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectStudyAndNavigateToDashboard {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on button selectStudyOrOrganization"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_dashboard/button_selectStudyOrOrganization'))
        
        "Step 2: Click on button studyActions -> Navigate to page '/studies/*/dashboard'"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_dashboard/button_studyActions', ['button_studyActions_internalText': data['button_studyActions_internalText'], 'button_studyActions_liNthOfType': data['button_studyActions_liNthOfType']]))
        
        "Step 3: Click on link studyLinks"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/link_studyLinks', ['link_studyLinks_aTitle': data['link_studyLinks_aTitle'], 'link_studyLinks_class': data['link_studyLinks_class'], 'link_studyLinks_href_variable': data['link_studyLinks_href_variable'], 'link_studyLinks_liNthOfType': data['link_studyLinks_liNthOfType']]))
        
        "Step 4: Click on div dashboardSections"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': data['div_dashboardSections_class'], 'div_dashboardSections_dataTestid': data['div_dashboardSections_dataTestid'], 'div_dashboardSections_divNthOfType': data['div_dashboardSections_divNthOfType']]))
        
        "Step 5: Click on div dashboardSections"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_dashboard/div_dashboardSections', ['div_dashboardSections_class': data['div_dashboardSections_class_1'], 'div_dashboardSections_dataTestid': data['div_dashboardSections_dataTestid_1'], 'div_dashboardSections_divNthOfType': data['div_dashboardSections_divNthOfType_1']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['button_studyActions_internalText'] = testData.getValue('button_studyActions_internalText', rowIndex)
        data['button_studyActions_liNthOfType'] = testData.getValue('button_studyActions_liNthOfType', rowIndex)
        data['div_dashboardSections_class'] = testData.getValue('div_dashboardSections_class', rowIndex)
        data['div_dashboardSections_class_1'] = testData.getValue('div_dashboardSections_class_1', rowIndex)
        data['div_dashboardSections_dataTestid'] = testData.getValue('div_dashboardSections_dataTestid', rowIndex)
        data['div_dashboardSections_dataTestid_1'] = testData.getValue('div_dashboardSections_dataTestid_1', rowIndex)
        data['div_dashboardSections_divNthOfType'] = testData.getValue('div_dashboardSections_divNthOfType', rowIndex)
        data['div_dashboardSections_divNthOfType_1'] = testData.getValue('div_dashboardSections_divNthOfType_1', rowIndex)
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
        data['div_dashboardSections_class'] = 'default_data'
        data['div_dashboardSections_class_1'] = 'default_data'
        data['div_dashboardSections_dataTestid'] = 'default_data'
        data['div_dashboardSections_dataTestid_1'] = 'default_data'
        data['div_dashboardSections_divNthOfType'] = 'default_data'
        data['div_dashboardSections_divNthOfType_1'] = 'default_data'
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

