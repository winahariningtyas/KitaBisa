package testkitabisa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kitabisa.com/campaign/proteksi/contribute");
		WebElement amount_field = driver.findElement(By.name("amount"));
		amount_field.sendKeys("10000");
		WebElement button = driver.findElement(By.id("contribute_button_pilih-metode-pembayaran"));
		button.click();
		WebElement dropdown = driver.findElement(By.className("style__VendorDropdownList-sc-1wfxixd-2"));
		List<WebElement> options = dropdown.findElements(By.tagName("div"));
		for (WebElement div : options) {
		if (div.getText().equals("GO-PAY")){
			div.click();
		}
		WebElement nama_field = driver.findElement(By.name("fullname"));
		nama_field.sendKeys("QA");
		WebElement number_field = driver.findElement(By.name("username"));
		number_field.sendKeys("085213254082");
		WebElement button2 = driver.findElement(By.id("contribute_button_lanjutkan-pembayaran"));
		button2.click();
	}
	
  
  }
}
