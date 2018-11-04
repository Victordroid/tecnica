package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Navegacion;

public class SdosTest03 {
	
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
	public void EmpleoClick(){
		objNavegacion = new Navegacion(driver);
		objNavegacion.PulsarCookiesClick();
		//System.out.println("Empleo");
		objNavegacion.EmpleoClick();
		objNavegacion.esperarSegundos(driver, 3);

	}
	@AfterTest 
	public void tearDown(){
		driver.quit();
	}

}
