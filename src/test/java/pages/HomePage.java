package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	By homePageUserName = By.xpath("//table//tr[@class='heading3']");
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	//Get the User name from Home Page  ----- BORRAR
		public String getHomePageDashboardUserName(){
		 return	driver.findElement(homePageUserName).getText();
		}
		
		//devuelve el t�tulo de la p�gina SDOS - Tecnolog�a que se siente
		public String getHomePage(){
			return driver.getTitle();
		}
}
