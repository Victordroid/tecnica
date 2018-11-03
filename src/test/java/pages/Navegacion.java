package pages;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Navegacion {
	WebDriver driver;

	By servicio = By.id("menu-item-2586");
	By productos = By.id("menu-item-2666");
	By equipo = By.id("menu-item-2839");
	By proyectos = By.id("menu-item-2584");
	By contacto = By.id("menu-item-2845");
	By blog = By.id("menu-item-6625");
	By botonBusqueda = By.className("header-search-controls");
	By barraBusqueda = By.className("s");
	By empleo = By.id("menu-item-4722");
	By nombre = By.name("your-name");
	By puesto = By.name("puesto");
	By email = By.name("your-email");
	By botonExaminar = By.name("file-190");
	By cookies = By.className("cdp-cookies-boton-cerrar");
	By botonOk = By.cssSelector("input.wpcf7-form-control.wpcf7-submit");
	By botonEnviar = By.cssSelector("input.wpcf7-form-control.wpcf7-submit");
	By mensaje = By.name("your-message");
	
	public Navegacion (WebDriver driver) {
		this.driver = driver;
	}
	
	public void esperarSegundos(WebDriver driver, int segundos){
	       
	      synchronized(driver){
	         try {
	            driver.wait(segundos * 1000);
	         } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	         }
	      }
	   }
	
	//pulsar cookies
	public void PulsarCookiesClick(){
		driver.findElement(cookies).click();
	}
	
	//Servicios
	public void ServiciosClick(){
		driver.findElement(servicio).click();
	}
	
	//Productos
	public void ProductosClick(){
		driver.findElement(productos).click();
	}
	
	//Equipo
	public void EquipoClick(){
		driver.findElement(equipo).click();
	}
	
	//Contacto
	public void ContactoClick(){
		driver.findElement(contacto).click();
		driver.findElement(nombre).sendKeys("nombre");
		driver.findElement(email).sendKeys("correo@correo.com");
		driver.findElement(mensaje).sendKeys("Mensaje de prueba");
		//driver.findElement(botonEnviar).click();
		}
	
	//Proyectos
	public void ProyectosClick(){
		driver.findElement(proyectos).click();
	}
	
	//Blog
	public void BlogClick(){
		driver.findElement(blog).click();
	}
	
	//Busqueda
	public void BotonBusquedaClick(){
		driver.findElement(botonBusqueda).click();
	}
	
	//Busqueda
	public void BarraBusquedaClick(){
		
		//System.out.println("Espera de la barra de busqueda");
		driver.findElement(barraBusqueda).click();
		driver.findElement(barraBusqueda).sendKeys("sdos");
		driver.findElement(barraBusqueda).sendKeys(Keys.ENTER);
	}
	
	//Empleo
	public void EmpleoClick(){
		driver.findElement(empleo).click();
		
		driver.findElement(nombre).click();
		driver.findElement(nombre).sendKeys("nombre");
		
		driver.findElement(puesto).click();
		driver.findElement(puesto).sendKeys("puesto");
		
		driver.findElement(email).click();
		driver.findElement(email).sendKeys("correo@correo.com");

		URL fileLocation = getClass().getClassLoader().getResource("CV.txt");
		File CV = new File(fileLocation.getFile());
		
		driver.findElement(botonExaminar).sendKeys(CV.getAbsolutePath());
		
		//driver.findElement(botonEnviar).click();
	}
	
	//Suscripcion
	public void SuscripcionClick(){
		driver.findElement(email).click();
		//System.out.println("Campo Localizado");
		driver.findElement(email).sendKeys("correo@correo.com");
		//System.out.println("rellenar email");
		driver.findElement(botonOk).click();
		//System.out.println("pulsar ok");
	}
	

}
