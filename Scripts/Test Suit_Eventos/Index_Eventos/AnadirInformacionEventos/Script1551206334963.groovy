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

WebUI.callTestCase(findTestCase('Eventos/IngresarModulo'), [:])

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/event/show?id=15')

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/btnIngresarInformacionEventos'))

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/editarIndexEventos/inputContraseniaEventos'), 'c4m1n0')

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/textareaDescripcionEventos'), 
    'Pues que en el momento el hombre paso y se cayo.')

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectAnioInformacionEventos'), 
    '2019', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectMesInformacionEventos'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectDiaInformacionEventos'), 
    '26', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectHoraInformacionEventos'), 
    '13', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectMinInformacionEventos'), 
    '53', true)

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputObservadorInformacionEventos'), 
    'Solo para llenar este campo del formulario.')

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectTipoEventoInformacionEventos'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectSubtipoEventoInformacionEventos'), 
    '14', true)

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/textareaJustificacionInformacionEventos'), 
    'Es algo que no lo esperabamos y pues que todo bien todo bonito 3-0 con la yuda de diso')

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/btnAgregarEquipoMedicoInformacionEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/btnSelectEquipoEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectOptionEquipoEventos'))

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputCausaEventoInformacionEventos'), 
    'Negligencia')

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputAccionesCorrectivasInformacionEventos'), 
    'Estar mas pendientes del lugar de trabajo')

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputReportoDistribuidorInformacionEventos'))

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputFechaReporteInformacionEventos'), 
    '2019-02-27')

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputDisponibleEvaluacionInformacionEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputDispositivoEnviadoInformacionEventos'))

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputFechaEnvioInformacionEventos'), 
    '2019-03-01')

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/btnAgregarReactivoInformacionEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/btnSelectEquipoEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectOptionEquipoEventos'))

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputDosisInformacionEventos'), 
    '125')

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputUnidadMedidaInformacionEventos'), 
    'mg')

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputViaAdministracionInformacionEventos'), 
    'Oral')

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputFrecuenciaInformacionEventos'), 
    'Cada 8 horas')

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectAnioReactivoInicioInformacionEventos'), 
    '2019', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectMesInicioReactivoInformacionEventos'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectDiaInicioReactivoInformacionEvento'), 
    '27', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectHoraInicioReactivoInformacionEvento'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectMinuInicioReactivoInformacionEvento'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectAnioReactivoFinInformacionEventos'), 
    '2019', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectMesReactivoFinInformacionEventos'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectDiaReactivoFinInformacionEventos'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectHoraReactivoFinInformacionEventos'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectMinuReactivoFinInformacionEventos'), 
    '1', true)

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/btnAgregarMedicamentoInformacionEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/btnSelectEquipoEventos'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectOptionEquipoEventos'))

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputDosisMedicamentoInformacionEventos'), 
    '500')

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputMedidaMedicamentoInformacionEventos'), 
    'gr')

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputViaMedicamentoInformacionEventos'), 
    'Intramuscular')

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/inputFrecuenciaMedicamentoInformacionEventos'), 
    '1 cada dia')

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectAnioMedicamentoInicioInformacionEventos'), 
    '2019', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectMesMedicamentoInicioInformacionEventos'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectDiaMedicamentoInicioInformacionEventos'), 
    '27', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectHoraMedicamentoInicioInformacionEventos'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectMinuMedicamentoInicioInformacionEventos'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectAnioMedicamentoFinInformacionEventos'), 
    '2019', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectMesMedicamentoFinInformacionEventos'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectDiaMedicamentoFinInformacionEventos'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectHoraMedicamentoFinInformacionEventos'), 
    '20', true)

WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/selectMinuMedicamentoFinInformacionEventos'), 
    '23', true)

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/ul_select2-choices'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/li_Seleccionar Todo'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/ul_select2-choices_1'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/eliminarIndexEventos/input_detail_button'))



