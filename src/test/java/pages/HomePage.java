package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}		
	//devuelve el título de la página SDOS - Tecnología que se siente
	public String getHomePage(){
		return driver.getTitle();
	}
}
