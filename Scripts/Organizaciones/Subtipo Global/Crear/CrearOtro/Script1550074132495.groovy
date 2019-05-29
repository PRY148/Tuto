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

WebUI.callTestCase(findTestCase('Organizaciones/Subtipo Global/IngresoModuloSubtipoGlobal'), [:])

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/global_subtype')

WebUI.click(findTestObject('Organizacion/Subtipo Global/Crear/a_btn btn-primary btn-circle b'))

//WebUI.selectOptionByValue(findTestObject('Organizacion/Subtipo Global/Crear/select_Evento con ProveedoresT'), '2', true)

WebUI.setText(findTestObject('Organizacion/Subtipo Global/Crear/input_tq_global_subtypename'),
	'Subtipo prueba Suit')

WebUI.setText(findTestObject('Organizacion/Subtipo Global/Crear/textarea_tq_global_subtypenote'),
	'Se utiliza para conocer cual es el correcto funcionamiento ')

WebUI.click(findTestObject('Organizacion/Subtipo Global/Crear/input__save_and_add'))

