package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}		
	//devuelve el t�tulo de la p�gina SDOS - Tecnolog�a que se siente
	public String getHomePage(){
		return driver.getTitle();
	}
}
