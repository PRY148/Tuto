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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.support.ui.Select as Select

WebUI.callTestCase(findTestCase('Eventos/IngresarModulo'), [:])

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/event')

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/gestionarAnalisis/inputItemSeleccionado'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/gestionarAnalisis/btnVerDetalleEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/gestionarAnalisis/btnIngresarAnalisisEventos'))

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/gestionarAnalisis/inputPasswordAnalisisEventos'), 'c4m1n0')

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/gestionarAnalisis/btnGuardarPassAnalisisEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/gestionarAnalisis/btnAgregarAccionInseguraAnalisisEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/gestionarAnalisis/btnSelectClasificacionAnalisisEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/gestionarAnalisis/selectOptionClasificacionAnalisisEventos'))

//WebUI.executeJavaScript('$("textarea[name=\'event_base[EventUnsafe][event_unsafe_5c79559f0c518][notes]\'").val("No se colee en la fila...");', [])
//WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/gestionarAnalisis/objetoTextarea'), 'Funcione...Plis')

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/gestionarAnalisis/selectPrioridadAnalisisEvento'), 
    '1', true)

WebUI.waitForElementClickable(findTestObject('Test Suit_Eventos/indexEventos/gestionarAnalisis/selectPrioridadAnalisisEvento'), 
    5)

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/gestionarAnalisis/textarea_event_basecontrol_not'), 'Para esto hacemos pruebas, para la calidad...')

WebUI.executeJavaScript('$("#s2id_event_base_risks_list > ul").click();', [])

WebUI.delay(5)

WebUI.executeJavaScript('$("ul.select2-all-none li:nth-child(1)").click();', [])

WebUI.delay(5)

WebUI.executeJavaScript('$("#s2id_event_base_event_control_subtypes_list > ul").click();', [])

WebUI.delay(5)

WebUI.executeJavaScript('$("ul.select2-all-none li:nth-child(1)").click();', [])

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/gestionarAnalisis/textarea_event_basecontrol_not'), 'Pues es una barrera muy brava esa monda...')

