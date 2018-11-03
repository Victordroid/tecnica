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
	
	@AfterTest 
	public void tearDown(){
		//driver.quit();
	}

}
