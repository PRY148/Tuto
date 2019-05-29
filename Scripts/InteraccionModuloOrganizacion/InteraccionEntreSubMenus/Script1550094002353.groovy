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

WebUI.callTestCase(findTestCase('Login/Logiin'), [:])

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/')

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_Daruma Software  Quality Manag/path'))

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_Daruma Software  Quality Manag/a_Organizacin'))

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_/a_reas'))

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_/a_Sistemas de gestin  Document'))

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_/a_Requisitos  Aspectos aplicab'))

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_/a_Procesos'))

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_/a_Cargos'))

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_/a_Permisos'))

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_/a_Grupos'))

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_/a_Usuarios'))

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_/a_Perfiles'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > aside > div > section > ul > li.treeview.active.first.last > ul > li:nth-child(11) > a\').click();', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_/a_Tipo global'))

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_Daruma Software  Quality Manag/a_Subtipo global'))

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_/a_Clase global'))

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_/a_Categora global'))

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_/a_Criterio de priorizacin'))

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/ModuloOrganizacion/Page_/a_Rango de priorizacin'))

WebUI.delay(2)

