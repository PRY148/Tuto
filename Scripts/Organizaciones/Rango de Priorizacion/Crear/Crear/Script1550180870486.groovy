import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.sql.Driver as Driver
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
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Organizaciones/Rango de Priorizacion/Ingresar Modulo/Ingreso'), [:])

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/priorization_range?related_module=org')

WebUI.click(findTestObject('Organizacion/Rango de priorizacion/Crear/Page_/a_btn btn-primary btn-circle b'))

WebUI.setText(findTestObject('Organizacion/Rango de priorizacion/Crear/Page_/input_tq_priorization_rangenam'), 'Prueba 6')

WebUI.selectOptionByValue(findTestObject('Organizacion/Rango de priorizacion/Crear/Page_/select_Acciones PropuestasAuto'), 
    'TqProposedAction', true)

WebUI.executeJavaScript('$(\'input[name="tq_priorization_range[color]"]\').val(\'#000000\');', [])

WebUI.executeJavaScript('$(\'input[name="tq_priorization_range[image]"]\').click();', [])

dd()

//Runtime.getRuntime().exec('C:\\Users\\Jessica\\Desktop\\FileUpload.exe')
WebUI.delay(10)

//WebUI.click(findTestObject('Organizacion/Rango de priorizacion/Crear/Page_Daruma Software  Quality Manag/td'))
//com.sun.java.util.jar.pack.Driver driver = new Driver();
//WebElement elem = driver.findElement(ByXPath("//input[@id='tq_priorization_range_image']"));
//elem.sendKeys("C:/Users/Jessica/Downloads/img.jpg");
WebUI.setText(findTestObject('Organizacion/Rango de priorizacion/Crear/Page_Daruma Software  Quality Manag/input_tq_priorization_rangelow'), 
    '10')

WebUI.setText(findTestObject('Organizacion/Rango de priorizacion/Crear/Page_Daruma Software  Quality Manag/input_tq_priorization_rangeupp'), 
    '90')

WebUI.click(findTestObject('Organizacion/Rango de priorizacion/Crear/Page_Daruma Software  Quality Manag/input_btn btn-primary btn-sm'))

def dd() {
    Runtime runtime = Runtime.getRuntime()

    Process process = runtime.exec('C:\\Users\\Jessica\\Desktop\\File\\FileUpload.exe')
}

