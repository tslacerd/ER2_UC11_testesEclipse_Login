
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeLogin {

	private WebDriver driver; 
	
	@Before 
	public void Setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Progam Files\\chromedriver\\chromedriver98.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:4200/login");
		
	}
	
	@Test
	public void TestarLogin() {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		WebElement inputEmail = driver.findElement(By.id("email"));
		WebElement inputSenha = driver.findElement(By.id("senha"));
		WebElement botaoLogin = driver.findElement(By.id("botao-enviar"));
		
		String[] listaSenhas = {"senha1", "senha2", "senha3", "123"	};
		
		for (int tentativas = 0; tentativas <listaSenhas.length; tentativas++) {
			try {inputEmail.clear();
			inputSenha.clear();
			inputEmail.sendKeys("tiago@email.com");
			inputSenha.sendKeys(listaSenhas[tentativas]);
			botaoLogin.click();
			Thread.sleep(3000);
				
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	//#2
			
			//inputEmail.clear();
			//inputSenha.clear();
			//inputEmail.sendKeys("tiago@email.com");
			//inputSenha.sendKeys(listaSenhas[tentativas]);
			//botaoLogin.click();
			
			
			
		//#1
		 
		//inputEmail.sendKeys("tiago@email.com");
		//inputSenha.sendKeys("123");
		//botaoLogin.click();
		

	}
}
