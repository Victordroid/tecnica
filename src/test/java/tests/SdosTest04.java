package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Navegacion;

public class SdosTest04 {
	
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
	public void HacerBusqueda(){
		objNavegacion = new Navegacion(driver);
		objNavegacion.PulsarCookiesClick();
		//System.out.println("pulsar boton de lupa");
		objNavegacion.BotonBusquedaClick();
		//System.out.println("Espera de 10 segundos");
		objNavegacion.esperarSegundos(driver, 2);
		//System.out.println("pulsar en la barra de busqueda");
		objNavegacion.BarraBusquedaClick();
		//System.out.println("busqueda hecha");		
	}
	
	@AfterTest 
	public void tearDown(){
		driver.quit();
	}

}
