package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	// link za registraciju
	public static final String REGISTRATION_URL = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";

	// korisnicko ime
	private static final String USER_NAME_FIELD_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";

	// lozinka
	private static final String PASSWORD_FIELD_XPATH = "//input[@name='password']";

	// dugme za registraciju
	private static final String REG_BTN_XPATH = "/html[1]/body[1]/div[2]/div[1]/a[1]";

	// link za Sign in
	private static final String SIGN_IN_BTN_XPATH = "//a[contains(text(),'Sign In')]";

	// dugme za log in
	private static final String LOG_BTN_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/input[1]";

	// log out
	private static final String LOGOUT_XPATH = "//a[contains(text(),'Sign Out')]";

	// link za account
	public static final String ACC_LINK = "//a[contains(text(),'My Account')]";

	// log in button

	public static WebElement getLogIn(WebDriver driver) {
		return driver.findElement(By.xpath(LOG_BTN_XPATH));
	}

	public static void clickLogIn(WebDriver driver) {
		getLogIn(driver).click();
	}

	// sign in button

	public static WebElement getSignIn(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_IN_BTN_XPATH));
	}

	public static void clickSignIn(WebDriver driver) {
		getSignIn(driver).click();
	}

	// polje za korisnicko ime

	public static WebElement getUser(WebDriver driver) {
		return driver.findElement(By.xpath(USER_NAME_FIELD_XPATH));
	}

	public static void clickUser(WebDriver driver) {
		getUser(driver).click();
	}

	public static void inputUser(WebDriver driver, String data) {
		getUser(driver).sendKeys(data);
	}

	// polje za lozinku

	public static WebElement getPass(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_FIELD_XPATH));
	}

	public static void clickPass(WebDriver driver) {
		getPass(driver).click();
	}

	public static void clearPass(WebDriver driver) {
		getPass(driver).clear();
	}

	public static void inputPass(WebDriver driver, String data) {
		getPass(driver).sendKeys(data);
	}

	// dugme za registraciju

	public static WebElement getRegBtn(WebDriver driver) {
		return driver.findElement(By.xpath(REG_BTN_XPATH));
	}

	public static void clickRegBtn(WebDriver driver) {
		getRegBtn(driver).click();
	}

	// dugme za Logout

	public static WebElement getLogout(WebDriver driver) {
		return driver.findElement(By.xpath(LOGOUT_XPATH));
	}

	public static void clickLogout(WebDriver driver) {
		getLogout(driver).click();
	}

	// Account

	public static WebElement getMyAccount(WebDriver driver) {
		return driver.findElement(By.xpath(ACC_LINK));
	}

	public static void clickMyAccount(WebDriver driver) {
		getMyAccount(driver).click();
	}

}
