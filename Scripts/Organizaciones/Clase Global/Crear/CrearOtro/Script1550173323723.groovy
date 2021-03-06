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

WebUI.callTestCase(findTestCase('Organizaciones/Clase Global/IngresarModulo/IngresoModulo'), [:])

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/global_class')

WebUI.click(findTestObject('Organizacion/Clase Global/Crear/Page_Daruma Software  Quality Manag/a_btn btn-primary btn-circle b'))

WebUI.setText(findTestObject('Organizacion/Clase Global/Crear/Page_Daruma Software  Quality Manag/input_tq_global_classname'), 
    'Prueba con otro mas')

WebUI.setText(findTestObject('Organizacion/Clase Global/Crear/Page_Daruma Software  Quality Manag/textarea_tq_global_classnotes'), 
    'Una prueba donde...')

WebUI.click(findTestObject('Organizacion/Clase Global/Crear/Page_Daruma Software  Quality Manag/_save_and_add'))

