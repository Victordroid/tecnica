package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import pages.HomePage;
import pages.Navegacion;

public class SdosTest01 {
	
	WebDriver driver;
	HomePage objHomePage;
	Navegacion objNavegacion;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.gecko.driver","C:/geckodriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://sdos.es");

	}
	
	@Test
	public void AbrirPaginaSdos(){
		objNavegacion = new Navegacion(driver);
		
		//String titulo = objNavegacion.getSdosTitle();
		String titulo = driver.getTitle();
		Assert.assertTrue(titulo.toLowerCase().contains("sdos - tecnología"));
		//System.out.println("Título: "+titulo+" Carga de la página completada");	
		objNavegacion.PulsarCookiesClick();
		//System.out.println("Cookies pulsada");	
	}
	
	
	@AfterTest 
	public void tearDown(){
		driver.quit();
	}
}
