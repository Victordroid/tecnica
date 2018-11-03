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
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://sdos.es");

	}
	
	@Test(priority=0)
	public void AbrirPaginaSdos(){
		objNavegacion = new Navegacion(driver);
		
		//String titulo = objNavegacion.getSdosTitle();
		String titulo = driver.getTitle();
		Assert.assertTrue(titulo.toLowerCase().contains("sdos - tecnología"));
		//System.out.println("Título: "+titulo+" Carga de la página completada");	
		objNavegacion.PulsarCookiesClick();
		//System.out.println("Cookies pulsada");	
	}
	
	@Test(priority=2)
	public void NavegarApartados(){
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
	
	@Test(priority=3)
	public void HacerBusqueda(){
		objNavegacion = new Navegacion(driver);
		
		//System.out.println("pulsar boton de lupa");
		objNavegacion.BotonBusquedaClick();
		//System.out.println("Espera de 10 segundos");
		objNavegacion.esperarSegundos(driver, 2);
		//System.out.println("pulsar en la barra de busqueda");
		objNavegacion.BarraBusquedaClick();
		//System.out.println("busqueda hecha");		
	}
	
	@Test(priority=1)
	public void EmpleoClick(){
		objNavegacion = new Navegacion(driver);
		//System.out.println("Empleo");
		objNavegacion.EmpleoClick();
		objNavegacion.esperarSegundos(driver, 3);

	}
	@Test(priority=4)
	public void SuscripcionClick(){
		objNavegacion = new Navegacion(driver);
		
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
