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
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Eventos/IngresarModulo'), [:])

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/event')

WebUI.click(findTestObject('Eventos/Crear/a_btn btn-primary btn-circle b'))

WebUI.setText(findTestObject('Eventos/Crear/textarea_event_basenotes'), 'Esto es una prueba de un evento adverso ')

WebUI.executeJavaScript('$(\'#tq_form > div.row > div.col-sm-12.col-md-6.opk > div > div:nth-child(1) > div > div.box-body > div > div:nth-child(2) > div > button\').click();', 
    [])

//WebUI.click(findTestObject('Eventos/Crear/button_ui-datepicker-trigger'))
//WebUI.click(findTestObject('Eventos/Crear/td_7'))
WebUI.executeJavaScript('$(\'#ui-datepicker-div > table > tbody > tr:nth-child(2) > td:nth-child(5) > a\').click();', [])

WebUI.selectOptionByValue(findTestObject('Eventos/Crear/select_00010203040506070809101'), '10', true)

WebUI.selectOptionByValue(findTestObject('Eventos/Crear/select_00010203040506070809101_1'), '20', true)

WebUI.click(findTestObject('Eventos/Crear/button_Aadir adjunto'))

WebUI.setText(findTestObject('Eventos/Crear/input_event_basepatient_nb_his'), '123456789')

WebUI.setText(findTestObject('Eventos/Crear/input_event_basepatient_nb_att'), 'HJ123456')

WebUI.selectOptionByValue(findTestObject('Eventos/Crear/select_Menor sin identificacin'), '1', true)

WebUI.setText(findTestObject('Eventos/Crear/input_event_basepatient_nb_id'), '6526695')

WebUI.setText(findTestObject('Eventos/Crear/input_event_basepatient_name'), 'Juan Andres ')

WebUI.selectOptionByValue(findTestObject('Eventos/Crear/select_19091910191119121913191'), '1996', true)

WebUI.selectOptionByValue(findTestObject('Eventos/Crear/select_01020304050607080910111'), '10', true)

WebUI.selectOptionByValue(findTestObject('Eventos/Crear/select_01020304050607080910111_1'), '28', true)

WebUI.click(findTestObject('Eventos/Crear/input_event_basepatient_gender'))

WebUI.setText(findTestObject('Eventos/Crear/input_event_basepatient_weight'), '70 KG')

WebUI.setText(findTestObject('Eventos/Crear/input_event_basepatient_height'), '1.75')

WebUI.setText(findTestObject('Eventos/Crear/input_event_basecare_software'), 'www.asistencia.com')

WebUI.setText(findTestObject('Eventos/Crear/input_event_baseadministrative'), 'www.administrativo.com')

WebUI.setText(findTestObject('Eventos/Crear/textarea_event_baseinitial_dia'), 'Paciente en causa de prueba y de mejora.')

WebUI.click(findTestObject('Eventos/Crear/btn1'))

WebUI.waitForElementClickable(findTestObject('Eventos/Crear/btn1'), 5)

//WebUI.executeJavaScript('$(\'#select2-results-19 > li:nth-child(1)\').click();', [])

WebUI.click(findTestObject('Eventos/Crear/btn2'))

WebUI.click(findTestObject('Eventos/Crear/btn3'))

WebUI.waitForElementClickable(findTestObject('Eventos/Crear/btn3'), 5)

WebUI.click(findTestObject('Eventos/Crear/btn4'))
	
WebUI.setText(findTestObject('Eventos/Crear/textarea_event_basesubsequent_'), 'Esto esta de la ostia, deberian implementarlo.')

WebUI.click(findTestObject('Eventos/Crear/btnSelCargo'))

WebUI.waitForElementClickable(findTestObject('Eventos/Crear/btnSelCargo'), 5)

WebUI.click(findTestObject('Eventos/Crear/btn5'))

WebUI.click(findTestObject('Eventos/Crear/btnSelProceso'))

WebUI.waitForElementClickable(findTestObject('Eventos/Crear/btnSelProceso'), 5)

WebUI.click(findTestObject('Eventos/Crear/btn6'))

WebUI.click(findTestObject('Eventos/Crear/btnSelArea'))

WebUI.waitForElementClickable(findTestObject('Eventos/Crear/btnSelArea'), 5)

WebUI.click(findTestObject('Eventos/Crear/btn7'))

WebUI.click(findTestObject('Eventos/Crear/btnSelUnidad'))

WebUI.waitForElementClickable(findTestObject('Eventos/Crear/btnSelUnidad'), 5)

WebUI.click(findTestObject('Eventos/Crear/btn8'))

WebUI.click(findTestObject('Eventos/Crear/btnSelServicio'))

WebUI.waitForElementClickable(findTestObject('Eventos/Crear/btnSelservicio'), 5)

WebUI.click(findTestObject('Eventos/Crear/btn9'))

WebUI.click(findTestObject('Eventos/Crear/btnSelProceso2'))

WebUI.waitForElementClickable(findTestObject('Eventos/Crear/btnSelProceso2'), 5)

WebUI.click(findTestObject('Eventos/Crear/btn10'))

WebUI.click(findTestObject('Eventos/Crear/btnSelArea2'))

WebUI.waitForElementClickable(findTestObject('Eventos/Crear/btnSelArea2'), 5)

WebUI.click(findTestObject('Eventos/Crear/btn11'))

WebUI.click(findTestObject('Eventos/Crear/btnSelUnidad2'))

WebUI.waitForElementClickable(findTestObject('Eventos/Crear/btnSelUnidad2'), 5)

WebUI.click(findTestObject('Eventos/Crear/btn12'))

WebUI.selectOptionByValue(findTestObject('Eventos/Crear/select_SERVICIO GENERALNuevo S'), '1', true)

WebUI.setText(findTestObject('Eventos/Crear/input_event_baseinvolved_nb_be'), '15')

WebUI.setText(findTestObject('Eventos/Crear/input_event_baseinvolved_nb_ro'), '04')

WebUI.setText(findTestObject('Eventos/Crear/input_event_baseinvolved_locat'), 'Clinica de pruebas')

WebUI.click(findTestObject('Eventos/Crear/button_Guardar'))

