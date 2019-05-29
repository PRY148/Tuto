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

WebUI.callTestCase(findTestCase('Accidentes/IngresarModulo'), [:])

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/accident?submodule=accident')

WebUI.click(findTestObject('Accidentes/EventoAccidente/Page_/a_2'))

WebUI.click(findTestObject('Accidentes/EventoAccidente/Page_/input_items'))

WebUI.click(findTestObject('Accidentes/EventoAccidente/Page_/a_btn btn-primary btn-circle b'))

WebUI.delay(5)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-wrapper > section.content-header > div.header-actions > div > a:nth-child(3)\').click();', 
    [])

WebUI.delay(5)

WebUI.setText(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/input_accident_baseeffect_dayo'), 
    '30')

WebUI.click(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/input_accident_basewas_by_norm'))

WebUI.selectOptionByValue(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/select_20242023202220212020201'), 
    '2019', true)

WebUI.selectOptionByValue(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/select_01020304050607080910111'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/select_01020304050607080910111'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/select_01020304050607080910111_1'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/select_00010203040506070809101'), 
    '16', true)

WebUI.selectOptionByValue(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/select_00010203040506070809101_1'), 
    '30', true)

WebUI.click(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/input_accident_baseemployed_se'))

//WebUI.click(findTestObject('null'))
//WebUI.click(findTestObject('null'))
//WebUI.click(findTestObject('null'))
//WebUI.click(findTestObject('null'))
WebUI.setText(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/textarea_accident_baseevent_in'), 
    'Se lleva al medico y ya...')

WebUI.setText(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/textarea_accident_baseevent_ob'), 
    'El lugar no estaba aseado')

WebUI.setText(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/input_accident_baseevent_witne'), 
    'Carlos Rodriguez')

WebUI.setText(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/textarea_accident_baseevent_wi'), 
    'Eso estaba feo')

WebUI.setText(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/input_accident_baseevent_witne_1'), 
    'Juan Garces')

WebUI.setText(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/textarea_accident_baseevent_wi_1'), 
    'Es que el tipo es muy torpe y no vio el peligro.')

WebUI.click(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/input_accident_baseseverity_id'))

WebUI.click(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/input_accident_baseprobability'))

WebUI.click(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/input_accident_basemechanisms_'))

WebUI.click(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/input_accident_basemechanisms__1'))

WebUI.click(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/input_accident_baseagents_list'))

WebUI.selectOptionByValue(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/select_AbdomenAntebrazo Derech'), 
    '29', true)

WebUI.selectOptionByValue(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/select_AmputacionEnucleacionAs'), 
    '6', true)

WebUI.click(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/button_Agregar lesin'))

WebUI.selectOptionByValue(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/select_AbdomenAntebrazo Derech_1'), 
    '20', true)

WebUI.selectOptionByValue(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/select_AmputacionEnucleacionAs_1'), 
    '18', true)

WebUI.click(findTestObject('Accidentes/EventoAccidente/Page_Daruma Software  Quality Manag/input_tq_form_submit'))


