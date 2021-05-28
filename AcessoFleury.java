package testeFleury;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AcessoFleury {
	
	private WebDriver driver;//está como variavel global para poder usar em todas as classes
	
	@Before
	public void inicializa() {		
		//WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\fmnfe\\Desktop\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@After
	public void finaliza() {
		driver.quit();
	}
		
	
	@Test
	public void teste () {
		
		driver.get("http://www.fleury.com.br");
		//driver.findElement(By.className("buttoncomponentstyle_LinkButtonContentStyled-sc-11us310-2.jSPngX.unidades")).click();
	}
	
	@Test
	public void testeUnidades () {
		
			driver.get("http://www.fleury.com.br/unidades");
		driver.findElement(By.tagName("buttoncomponentstyle_ButtonContentStyled-sc-11us310 bTUJDG")).click();
	}
	
	@Test
	public void testeUnidadesJau () {
		
		driver.get("https://www.fleury.com.br/unidades/jau");
		driver.findElement(By.tagName("h1")).click();
	}

}
