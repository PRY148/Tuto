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

WebUI.callTestCase(findTestCase('Eventos/IngresarModulo'), [:])

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/event')

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnCrearNuevo'))

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/textareaDescEvento'), 'Prueba de calidad de software hecha desde cali, valle del cauca.')

//Validar que los campos de 'Fecha Ocurrencia' correspondan a los actuales...
//WebUI.executeJavaScript('$(\'#tq_form > div.row > div.col-sm-12.col-md-6.opk > div > div:nth-child(1) > div > div.box-body > div > div:nth-child(2) > div > button\').click();', 
//[])
//WebUI.executeJavaScript('$(\'#ui-datepicker-div > table > tbody > tr:nth-child(2) > td:nth-child(5) > a\').click();', [])
//WebUI.selectOptionByValue(findTestObject('Eventos/Crear/select_00010203040506070809101'), '10', true)
//WebUI.selectOptionByValue(findTestObject('Eventos/Crear/select_00010203040506070809101_1'), '20', true)
WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnAnadAdjuntoEventos'))

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/inputHisClinicaEventos'), '123456789')

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/inputHojaAtencionEventos'), 'HJ123456')

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectTipoIdentiEventos'), '1', 
    true)

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/inputNumIdentifiEventos'), '6526695')

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/inputNombreEventos'), 'Juan Andres ')

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectAnioFechaNacEventos'), 
    '1996', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectMesFechaNacEventos'), '10', 
    true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectDiaFechaNacEventos'), '28', 
    true)

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/inputClickGeneroEventos'))

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/inputPesoEventos'), '70 KG')

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/inputTallaEventos'), '1.75')

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectGrupoEtnicoEventos'), 'Ninguno', 
    true)

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/inputUrlAsistencialEventos'), 'www.asistencia.com')

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/inputUrlAdministrativoEventos'), 'www.administrativo.com')

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/textareaDiagnosticoAntesSucesoEventos'), 
    'Paciente en causa de prueba y de mejora.')

//Para seleccionar un registro de un Select con Input consta de tres pasos...
//Paso #1: Seleccionar el select2, es decir desplegar las opciones
WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectCIE10InicialEventos'))

//Paso #2: Generar una espera para que el elemento sea visible...
WebUI.waitForElementClickable(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectCIE10InicialEventos'), 
    5)

/*Paso #3: Una vez desplegada la lista accedemos al elemento a seleccionar, creando un objeto
		   mediante un selector css que contenga una funcion especifica para escoger el hijo de ese
		   elemento, en este caso el select2. Y asi seleccionar el elemento. */
WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectOptionCIE10InicialEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectCIE10PosteriorEventos'))

WebUI.waitForElementClickable(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectCIE10PosteriorEventos'), 
    5)

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectOptionCIE10PosteriorEventos'))

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/textareaDiagnosticoPosteriorSucesoEventos'), 
    'Esto esta de la ostia, deberian implementarlo.')

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectCargoEventos'))

WebUI.waitForElementClickable(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectCargoEventos'), 
    5)

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectOptionCargoEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectProcesoEventos'))

WebUI.waitForElementClickable(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectProcesoEventos'), 
    5)

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectOptionProcesoEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectAreaEventos'))

WebUI.waitForElementClickable(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectAreaEventos'), 5)

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectOptionAreaEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectUnidadEventos'))

WebUI.waitForElementClickable(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectUnidadEventos'), 
    5)

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectOptionUnidadEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectServicioEventos'))

WebUI.waitForElementClickable(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectServicioEventos'), 
    5)

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectOptionServicioEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectProceso2Eventos'))

WebUI.waitForElementClickable(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectProceso2Eventos'), 
    5)

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectOptionProceso2Eventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectArea2Eventos'))

WebUI.waitForElementClickable(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectArea2Eventos'), 
    5)

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectOptionArea2Eventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectUnidad2Eventos'))

WebUI.waitForElementClickable(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/btnSelectUnidad2Eventos'), 
    5)

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectOptionUnidad2Eventos'))

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/selectServicioEventos'), '1', 
    true)

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/inputNumCamaEventos'), '15')

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/inputNumHabitacionEventos'), '04')

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/inputUbicacionEventos'), 'Clinica de pruebas')

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/crearIndexEventos/button_Guardar'))

