package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class navigateToSiteManagementAndUploadSections {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on html object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))
        
        "Step 2: Click on div uploadSections"
        
        // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections"
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_studies_siteservice_service_site_assessments/div_uploadSections', ['div_uploadSections_trNthChild': data['div_uploadSections_trNthChild'], 'div_uploadSections_trNthOfType': data['div_uploadSections_trNthOfType']]))
        
        "Step 3: Click on link imgUp6"
        
        WebUI.switchToWindowTitle('Upload Task')
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_imgUp6'))
        
        "Step 4: Click on link mySite"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/link_mySite'))
        
        "Step 5: Click on button siteManagement"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/button_siteManagement'))
        
        "Step 6: Click on td siteNumber2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/td_siteNumber2'))
        
        "Step 7: Click on html object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))
        
        "Step 8: Click on html object"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_studies_siteservice_service_site_assessments/html_object'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['div_uploadSections_trNthChild'] = testData.getValue('div_uploadSections_trNthChild', rowIndex)
        data['div_uploadSections_trNthOfType'] = testData.getValue('div_uploadSections_trNthOfType', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['div_uploadSections_trNthChild'] = 'default_data'
        data['div_uploadSections_trNthOfType'] = 'default_data'
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

