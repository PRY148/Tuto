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

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_Daruma Software  Quality Manag/a_Accidentes'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > div > div > div > div.modal-body > a:nth-child(2)\').click();', 
    [])

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Actas'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_ARD'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > div > div > div > div.modal-body > a:nth-child(5)\').click();', 
    [])

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Aud. Comp.'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Docs. legales y externos'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_Daruma Software  Quality Manag/a_Documentos'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > div > div > div > div.modal-body > a:nth-child(9)\').click();', 
    [])

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Equipos'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Estrategia'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Eventos'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_Daruma Software  Quality Manag/a_Habilitacin'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Herramientas'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Incidentes'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > div > div > div > div.modal-body > a:nth-child(16)\').click();', 
    [])

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > div > div > div > div.modal-body > a:nth-child(17)\').click();', 
    [])

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Oportunidades'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_PAMEC'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Admin. Portal'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Planes de accin'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > div > div > div > div.modal-body > a:nth-child(22)\').click();', 
    [])

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Procesos'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Proveedores'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_Daruma Software  Quality Manag/a_Proyectos'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Riesgos'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Satisfaccin'))

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > div > div > div > div.modal-body > a:nth-child(28)\').click();', 
    [])

WebUI.delay(2)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(2)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Tableros de Mando'))

WebUI.delay(3)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(3)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_T. Humano'))

WebUI.delay(3)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(3)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Work flow'))

WebUI.delay(3)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(3)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_Daruma Software  Quality Manag/a_Organizacin'))

WebUI.delay(3)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(3)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Configuracin'))

WebUI.delay(3)

WebUI.executeJavaScript('$(\'body > div.wrapper > div.content-modules > a\').click();', [])

WebUI.delay(3)

WebUI.click(findTestObject('Interacciones/InteraccionesGenerales/Page_/a_Servicio No Conforme'))

WebUI.delay(3)

WebUI.executeJavaScript('$(\'body > div.wrapper > header > a\').click();', [])

WebUI.delay(3)

