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
import org.openqa.selenium.By.ByCssSelector as ByCssSelector
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver

WebUI.callTestCase(findTestCase('Accidentes/IngresarModulo'), [:])

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/accident/new')

WebUI.click(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/input_accident_baseevent_type_'))

WebUI.setText(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/input_accident_baseevent_work_'), '5')

WebUI.selectOptionByValue(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/select_lnesmartesmircolesjueve'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/select_00010203040506070809101'), 
    '49', true)

WebUI.setText(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/input_accident_baseenterprise_'), 'Cll 66 # 13-56')

WebUI.setText(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/input_accident_baseenterprise__1'), '01800911910')

WebUI.click(findTestObject('Accidentes/btnSelCoordinador'))

WebUI.executeJavaScript('$(\'#select2-drop > div > input\').val(\'Tester4\').trigger(\'keyup-change\');', [])

not_run: WebUI.executeJavaScript('var submitButton = document.getElementById(\'tq_form_submit\'); submitButton.scrollIntoView();', 
    null)

assert true

WebUI.delay(3)

WebUI.click(findTestObject('Accidentes/div_select2-result-label-1 (1)'))

//WebUI.executeJavaScript(null, [])
//WebUI.scrollToElement(findTestObject('Accidentes/Elemento'), 5)
//WebUI.executeJavaScript('var submitButton = document.getElementById(\'s2id_document_base_owner_id\');', [])
//WebUI.executeJavaScript('submitButton.scrollIntoView();', [])
//WebUI.setText(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/input_select2-input select2-fo'), 'tester')
WebUI.setText(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/input_autocomplete_accident_ba'), '1556156007')

WebUI.setText(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/input_accident_baseemployed_na'), 'Juan Andres Zepulbeda')

WebUI.setText(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/input_accident_baseemployed_ph'), '3215212351')

WebUI.setText(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/input_accident_baseemployed_bo'), 'Pepito Perez')

WebUI.setText(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/input_accident_basereported_by'), 'Mengano ya tu sabes')

WebUI.click(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/input_accident_baseemployed_ge'))

WebUI.setText(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/input_accident_baseemployed_ag'), '25')

WebUI.selectOptionByValue(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/select_ContratistaTrmino fijoT'), 
    '2', true)

WebUI.click(findTestObject('Accidentes/btnSelArea'))

WebUI.executeJavaScript('$(\'#select2-drop > div > input\').val(\'Comercial\').trigger(\'keyup-change\');', [])

not_run: WebUI.executeJavaScript('var submitButton = document.getElementById(\'tq_form_submit\'); submitButton.scrollIntoView();', 
    null)

WebUI.delay(3)

WebUI.click(findTestObject('Accidentes/select2-child-2'))

WebUI.delay(3)

WebUI.click(findTestObject('Accidentes/btnSelProceso'))

WebUI.executeJavaScript('$(\'#select2-drop > div > input\').val(\'Farmacia\').trigger(\'keyup-change\');', [])

not_run: WebUI.executeJavaScript('var submitButton = document.getElementById(\'tq_form_submit\'); submitButton.scrollIntoView();', 
    null)

WebUI.delay(3)

WebUI.click(findTestObject('Accidentes/div_select2-result-label-1 (1)'))

WebUI.setText(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/input_accident_baseemployed_se'), 'SQA')

WebUI.selectOptionByValue(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/select_Centro de Investigacin'), 
    '7', true)

WebUI.setText(findTestObject('Accidentes/Crear/Page_/input_accident_baseemployed_en'), '24')

WebUI.click(findTestObject('Accidentes/btnSelCargo'))

WebUI.executeJavaScript('$(\'#select2-drop > div > input\').val(\'Alimentador\').trigger(\'keyup-change\');', [])

not_run: WebUI.executeJavaScript('var submitButton = document.getElementById(\'tq_form_submit\'); submitButton.scrollIntoView();', 
    null)

WebUI.delay(3)

WebUI.click(findTestObject('Accidentes/div_select2-result-label-1 (1)'))

WebUI.setText(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/input_accident_baseemployed_ti'), '18')

WebUI.click(findTestObject('Accidentes/btnSelEquiInves2'))

WebUI.executeJavaScript('$(\'#select2-drop > div > input\').val(\'Tester4\').trigger(\'keyup-change\');', [])

not_run: WebUI.executeJavaScript('var submitButton = document.getElementById(\'tq_form_submit\'); submitButton.scrollIntoView();', 
    null)

WebUI.delay(3)

WebUI.click(findTestObject('Accidentes/div_select2-result-label-1 (1)'))

WebUI.selectOptionByValue(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/select_AccidentadoAsesorARPJef'), 
    '4', true)

WebUI.click(findTestObject('Accidentes/btnSelEquiInves'))

WebUI.executeJavaScript('$(\'#select2-drop > div > input\').val(\'Tester4\').trigger(\'keyup-change\');', [])

not_run: WebUI.executeJavaScript('var submitButton = document.getElementById(\'tq_form_submit\'); submitButton.scrollIntoView();', 
    null)

WebUI.delay(3)

WebUI.click(findTestObject('Accidentes/div_select2-result-label-1 (1)')) 

WebUI.selectOptionByValue(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/select_AccidentadoAsesorARPJef_1'), 
    '3', true)

WebUI.click(findTestObject('Accidentes/Crear/Page_Daruma Software  Quality Manag/input_tq_form_submit'))





