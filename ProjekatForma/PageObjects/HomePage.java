package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static final String URL = "https://petstore.octoperf.com/";
	private static final String ENTER_THE_STORE_BUTTON = "//a[contains(text(),'Enter the Store')]";

	public static WebElement getEnterButton(WebDriver driver) {
		return driver.findElement(By.xpath(ENTER_THE_STORE_BUTTON));
	}

	public static void clickEnterBtn(WebDriver driver) {
		getEnterButton(driver).click();
	}

}
