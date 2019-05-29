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

WebUI.callTestCase(findTestCase('Login/Logiin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Organizaciones/IngresoModulo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.executeJavaScript('$("a[href$=\'/app_mysql.php/accident/new \']").click();\t', [])

//WebUI.click(findTestObject('Organizacion/Tipo Global/Crear y Crear Otro/Page_/btnCrearTipoGlobal'))
WebUI.delay(3)

WebUI.setText(findTestObject('Organizacion/Tipo Global/Crear y Crear Otro/Page_Daruma Software  Quality Manag/input_tq_global_typename'), 
    'Prueba Auto')

WebUI.delay(3)

WebUI.setText(findTestObject('Organizacion/Tipo Global/Crear y Crear Otro/Page_Daruma Software  Quality Manag/input_tq_global_typeabbr'), 
    'PCA')

WebUI.delay(3)

WebUI.click(findTestObject('Organizacion/Tipo Global/Crear y Crear Otro/Page_Daruma Software  Quality Manag/input_tq_global_typestate'))

WebUI.delay(3)

WebUI.setText(findTestObject('Organizacion/Tipo Global/Crear y Crear Otro/Page_Daruma Software  Quality Manag/textarea_tq_global_typenotes'), 
    'Se establece para generar una super prueba')

WebUI.delay(3)

WebUI.click(findTestObject('Organizacion/Tipo Global/Crear y Crear Otro/Page_Daruma Software  Quality Manag/Page_/input__save_and_add'))

WebUI.delay(5)

