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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Eventos/IngresarModulo'), [:])

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/event')

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/gestionarTratamiento/selectItemTratamientoEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/gestionarTratamiento/btnIngresarTratamientoEventos'))

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/gestionarAnalisis/inputPasswordAnalisisEventos'), 'c4m1n0')

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/gestionarAnalisis/btnGuardarPassAnalisisEventos'))

WebUI.delay(5)

WebUI.executeJavaScript('$("body > div.wrapper > div.content-wrapper > section.content.content-section > div > div.row > div:nth-child(2) > div > div:nth-child(1) > div > div.box-body > a").click();', 
    [])

WebUI.delay(5)

WebUI.executeJavaScript('$(tinymce.activeEditor.setContent(\'Esto es funcional?\'));', [])

WebUI.delay(5)

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/gestionarTratamiento/btnDesplegarListaUserResponsableTratamientoEventos'))

WebUI.executeJavaScript('$("#select2-drop > div > input").val("Tester4").trigger("keyup-change");', [])

WebUI.executeJavaScript('var submitButton = document.getElementById(\'tq_form_submit\'); submitButton.scrollIntoView();', 
    null)

WebUI.delay(3)

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/gestionarTratamiento/selectUserResponsableTrataminetoEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/gestionarTratamiento/btnGuardarPlanAccionTratamientoEventos'))

WebUI.executeJavaScript('$("textarea[name=\'event_base[conclusion_notes]\']").val("Funcionas... ?")', [])

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/gestionarTratamiento/selectTipoEventoTratamientoEventos'), 
    '3', true)

WebUI.delay(3)


WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/gestionarTratamiento/selectSubtipoTratamientoEventos'), 
    '16', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/gestionarTratamiento/selectPodriaPrevenirTratamientoEventos'), 
    '1', true)

