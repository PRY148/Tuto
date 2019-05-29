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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain as WebUIKeywordMain
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://54.203.130.100:8106/app_mysql.php/')

WebUI.setText(findTestObject('Login/txtUser'), 'tester4')

WebUI.delay(5)
//WebUI.executeJavaScript('var user=\'tester4\';', null)

WebUI.delay(5)

WebUI.executeJavaScript('if($(\'#signin_username\').val()==\'tester4\'){ console.log(\'Esta igual.\') }else{ console.log(\'Esta mal...\') }', 
    null)

/*String elem = findTestObject('Login/txtUser')

String user = 'tester4'

if (elem.contentEquals(user)) {
    System.out.println('Melo')
} else {
    System.out.println('InMelo')
}*/
//CustomKeywords.'com.example.Select.Verificar'(findTestObject('Login/txtUser'))
//CustomKeywords.'com.example.WebUICustomKeywords.isElementPresent'('Login/txtUser', 2)
WebUI.delay(5)

WebUI.setText(findTestObject('Login/txtPass'), 'c4m1n0')

WebUI.click(findTestObject('Login/btnIngresar'))

//WebUI.switchToWindowTitle('Google')
