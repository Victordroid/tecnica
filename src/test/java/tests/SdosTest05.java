package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Navegacion;

public class SdosTest05 {

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
	public void SuscripcionClick(){
		objNavegacion = new Navegacion(driver);
		objNavegacion.PulsarCookiesClick();
		objNavegacion.ServiciosClick();
		//System.out.println("Espera de 10 segundos");
		objNavegacion.esperarSegundos(driver, 3);
		//System.out.println("Suscripcion");
		objNavegacion.SuscripcionClick();
	}
	
	@AfterTest 
	public void tearDown(){
		driver.quit();
	}
}
