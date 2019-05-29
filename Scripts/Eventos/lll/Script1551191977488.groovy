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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/event')

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/lll/Page_/input_items'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/lll/Page_/a_btn btn-primary btn-circle b'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/lll/Page_Daruma Software  Quality Manag/p_Anlisis'))

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/lll/Page_Daruma Software  Quality Manag/input_signinpassword'), 
    'c4m1n0')

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/lll/Page_Daruma Software  Quality Manag/button_Guardar'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/lll/Page_/button_Agregar'))


WebUI.selectOptionByValue(findTestObject('Test Suit_Eventos/indexEventos/lll/Page_Daruma Software  Quality Manag/select_Hagale RapidoPrioridad'), 
    '1', true)

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/lll/Page_Daruma Software  Quality Manag/textarea_event_baseEventConduc'), 
    'pues que tenia que pasar...')

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/lll/Page_Daruma Software  Quality Manag/ul_select2-choices'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/lll/Page_Daruma Software  Quality Manag/li_Seleccionar Todo'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/lll/Page_Daruma Software  Quality Manag/ul_select2-choices_1'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/lll/Page_Daruma Software  Quality Manag/div_Barreras        Entrenamie'))

WebUI.click(findTestObject('Test Suit_Eventos/indexEventos/lll/Page_Daruma Software  Quality Manag/ul_Entrenamiento'))

WebUI.setText(findTestObject('Test Suit_Eventos/indexEventos/lll/Page_Daruma Software  Quality Manag/textarea_event_basecontrol_not'), 
    'Esto no es una barrera, es mas que eso')

WebUI.closeBrowser()

