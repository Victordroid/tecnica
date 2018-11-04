package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Navegacion;

public class SdosTest02 {
	
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
	public void NavegarApartados(){
		objNavegacion = new Navegacion(driver);
		
		//String titulo = objNavegacion.getSdosTitle();
		String titulo = driver.getTitle();
		Assert.assertTrue(titulo.toLowerCase().contains("sdos - tecnología"));
		//System.out.println("Título: "+titulo+" Carga de la página completada");	
		objNavegacion.PulsarCookiesClick();
		//System.out.println("Cookies pulsada");	
		
		
		objNavegacion = new Navegacion(driver);
		//System.out.println("Buscar Servicios");

		objNavegacion.ServiciosClick();
		//System.out.println("Servicios pulsado");
			
		objNavegacion.ProductosClick();
		//System.out.println("Productos pulsado");
			
		objNavegacion.ProyectosClick();
		//System.out.println("Proyectos pulsado");
			
		objNavegacion.EquipoClick();
		//System.out.println("Equipo pulsado");
			
		objNavegacion.ContactoClick();
		//System.out.println("Contacto pulsado");
		
		objNavegacion.esperarSegundos(driver, 1);
			
		objNavegacion.BlogClick();
		//System.out.println("Blog pulsado");
	}
	
	@AfterTest 
	public void tearDown(){
		driver.quit();
	}

}
