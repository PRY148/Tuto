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

WebUI.navigateToUrl('http://167.99.147.38/training/#/subjects-list')

WebUI.click(findTestObject('spa/Page_FrontEnd/a_dashboardPgina de inicio'))

WebUI.click(findTestObject('spa/Page_FrontEnd/mat-panel-title_schoolEntrenam'))

WebUI.click(findTestObject('spa/Page_FrontEnd/a_Lista de asignaturas'))

WebUI.click(findTestObject('spa/Page_FrontEnd/button_add'))

WebUI.click(findTestObject('spa/Page_FrontEnd/mat-icon_add'))

WebUI.click(findTestObject('spa/Page_FrontEnd/span_Tipo de asignatura'))

WebUI.click(findTestObject('spa/Page_FrontEnd/span_Externa'))

WebUI.setText(findTestObject('spa/Page_FrontEnd/input_subject_name'), 'Prueba')

WebUI.setText(findTestObject('spa/Page_FrontEnd/input_subject_effort'), '5')

WebUI.setText(findTestObject('spa/Page_FrontEnd/input_subject_num_sessions'), '15')

WebUI.setText(findTestObject('spa/Page_FrontEnd/textarea_subject_objective'), 'Lograr una excelente calidad...')

WebUI.setText(findTestObject('spa/Page_FrontEnd/textarea_subject_scope'), 'El que necesite...')

WebUI.click(findTestObject('spa/Page_FrontEnd/div_MetodologaMetodologa'))

WebUI.click(findTestObject('spa/Page_FrontEnd/mat-option_mat-option-52'))

WebUI.click(findTestObject('spa/Page_FrontEnd/span_Evaluaciones'))

WebUI.click(findTestObject('spa/Page_FrontEnd/mat-pseudo-checkbox_mat-option'))

WebUI.click(findTestObject('spa/Page_FrontEnd/div_cdk-overlay-backdrop cdk-o'))

WebUI.click(findTestObject('spa/Page_FrontEnd/div_Habilitado'))

WebUI.click(findTestObject('spa/Page_FrontEnd/span_Inhabilitado'))

WebUI.click(findTestObject('spa/Page_FrontEnd/div_Inhabilitado'))

WebUI.click(findTestObject('spa/Page_FrontEnd/span_Habilitado'))

//WebUI.click(findTestObject('spa/Page_FrontEnd/button_Continuar'))

WebUI.closeBrowser()

