import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Procesos/IngresarModulo'), [:])

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/process_admin')

WebUI.click(findTestObject('Organizacion/Procesos/Crear/Page_/a_btn btn-primary btn-circle b'))

WebUI.selectOptionByValue(findTestObject('Organizacion/Procesos/Crear/Page_Daruma Software  Quality Manag/select_Centro de Investigacin'), 
    '2', true)

WebUI.delay(5)
//WebUI.executeJavaScript('$(\'[name="tq_process[parent_id]"]\').select2(\'val\',[2]);', [])
WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Organizacion/Procesos/Crear/Page_Daruma Software  Quality Manag/select_MacroProcesoProcesoSubP'), 
    '1', true)

WebUI.setText(findTestObject('Organizacion/Procesos/Crear/Page_Daruma Software  Quality Manag/input_tq_processname'), 'Test Case 6')

WebUI.executeJavaScript('$(\'#tq_process_notes\').val(\'Prueba funcionales del modulo de Organizacion, y como cosa no funciona.\');', 
    [])

WebUI.click(findTestObject('Organizacion/Procesos/Crear/Page_Daruma Software  Quality Manag/input_tq_processrequisites_lis'))

WebUI.click(findTestObject('Organizacion/Procesos/Crear/Page_Daruma Software  Quality Manag/input_tq_processrequisites_lis_1'))

WebUI.click(findTestObject('Organizacion/Procesos/Crear/Page_Daruma Software  Quality Manag/input_tq_processrequisites_lis_2'))

WebUI.click(findTestObject('Organizacion/Procesos/Crear/Page_Daruma Software  Quality Manag/input_tq_processrequisites_lis_3'))

WebUI.click(findTestObject('Organizacion/Procesos/Crear/Page_Daruma Software  Quality Manag/input_btn btn-primary btn-sm'))

