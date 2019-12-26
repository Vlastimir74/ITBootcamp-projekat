package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {

	// Registration - elementi od interesa su svi potrebni za uspesnu registraciju
	// korisnika

	private static final String USER_ID_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	private static final String NEW_PASS_XPATH = "//input[@name='password']";
	private static final String REP_PASS_XPATH = "//input[@name='repeatedPassword']";
	private static final String FIRST_NAME_XPATH = "//input[@name='account.firstName']";
	private static final String LAST_NAME_XPATH = "//input[@name='account.lastName']";
	private static final String EMAIL_XPATH = "//input[@name='account.email']";
	private static final String TXTPHONE_XPATH = "//input[@name='account.phone']";
	private static final String ADDRESS1_XPATH = "//input[@name='account.address1']";
	private static final String ADDRESS2_XPATH = "//input[@name='account.address2']";
	private static final String CITY_XPATH = "//input[@name='account.city']";
	private static final String STATE_XPATH = "//input[@name='account.state']";
	private static final String ZIP_XPATH = "//input[@name='account.zip']";
	private static final String COUNTRY_XPATH = "//input[@name='account.country']";
	private static final String SAVE_BTN_XPATH = "//input[@name='newAccount']";
	private static final String EDIT_ACC_XPATH = "//input[@name='editAccount']";
	private static final String SAVE_ACC_XPATH = "//input[@name='newAccount']";
	private static final String CAT_XPATH = "//a[contains(text(),'FL-DLH-02')]";
	private static final String CAT_MALE_XPATH = "//a[contains(text(),'EST-17')]";
	private static final String ADD_CAT_XPATH = "//a[@class='Button']";
	public static final String EST_17_CAT_XPATH = "//a[contains(text(),'EST-17')]";

	// metode za elemente Registracije
	// ID

	public static WebElement getId(WebDriver driver) {
		return driver.findElement(By.xpath(USER_ID_XPATH));
	}

	public static void clickId(WebDriver driver) {
		getId(driver).click();
	}

	public static void inputId(WebDriver driver, String data) {
		getId(driver).sendKeys(data);
	}

	public static void clearId(WebDriver driver) {
		getId(driver).clear();
	}

	// New Password

	public static WebElement getNewPass(WebDriver driver) {
		return driver.findElement(By.xpath(NEW_PASS_XPATH));
	}

	public static void clickNewPass(WebDriver driver) {
		getNewPass(driver).click();
	}

	public static void inputNewPass(WebDriver driver, String data) {
		getNewPass(driver).sendKeys(data);
	}

	public static void clearNewPass(WebDriver driver) {
		getNewPass(driver).clear();
	}

	// Repeat Password

	public static WebElement getRepPass(WebDriver driver) {
		return driver.findElement(By.xpath(REP_PASS_XPATH));
	}

	public static void clickRepPass(WebDriver driver) {
		getRepPass(driver).click();
	}

	public static void inputRepPass(WebDriver driver, String data) {
		getRepPass(driver).sendKeys(data);
	}

	public static void clearRepPass(WebDriver driver) {
		getRepPass(driver).clear();
	}

	// First Name

	public static WebElement getFirstName(WebDriver driver) {
		return driver.findElement(By.xpath(FIRST_NAME_XPATH));
	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void inputFirstName(WebDriver driver, String data) {
		getFirstName(driver).sendKeys(data);
	}

	public static void clearFirstName(WebDriver driver) {
		getFirstName(driver).clear();
	}

	// Last Name

	public static WebElement getLastName(WebDriver driver) {
		return driver.findElement(By.xpath(LAST_NAME_XPATH));
	}

	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void inputLastName(WebDriver driver, String data) {
		getLastName(driver).sendKeys(data);
	}

	public static void clearLastName(WebDriver driver) {
		getLastName(driver).clear();
	}

	// Email

	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void inputEmail(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}

	public static void clearEmail(WebDriver driver) {
		getEmail(driver).clear();
	}

	// Phone

	public static WebElement getPhone(WebDriver driver) {
		return driver.findElement(By.xpath(TXTPHONE_XPATH));
	}

	public static void clickPhone(WebDriver driver) {
		getPhone(driver).click();
	}

	public static void inputPhone(WebDriver driver, String data) {
		getPhone(driver).sendKeys(data);
	}

	public static void clearPhone(WebDriver driver) {
		getPhone(driver).clear();
	}

	// Address 1

	public static WebElement getAddress1(WebDriver driver) {
		return driver.findElement(By.xpath(ADDRESS1_XPATH));
	}

	public static void clickAddress1(WebDriver driver) {
		getAddress1(driver).click();
	}

	public static void inputAddress1(WebDriver driver, String data) {
		getAddress1(driver).sendKeys(data);
	}

	public static void clearkAddress1(WebDriver driver) {
		getAddress1(driver).clear();
	}

	// Address2

	public static WebElement getAddress2(WebDriver driver) {
		return driver.findElement(By.xpath(ADDRESS2_XPATH));
	}

	public static void clickAddress2(WebDriver driver) {
		getAddress2(driver).click();
	}

	public static void inputAddress2(WebDriver driver, String data) {
		getAddress2(driver).sendKeys(data);
	}

	public static void clearAddress2(WebDriver driver) {
		getAddress2(driver).clear();
	}

	// City

	public static WebElement getCity(WebDriver driver) {
		return driver.findElement(By.xpath(CITY_XPATH));
	}

	public static void clickCity(WebDriver driver) {
		getCity(driver).click();
	}

	public static void inputCity(WebDriver driver, String data) {
		getCity(driver).sendKeys(data);
	}

	public static void clearCity(WebDriver driver) {
		getCity(driver).clear();
	}

	// State

	public static WebElement getState(WebDriver driver) {
		return driver.findElement(By.xpath(STATE_XPATH));
	}

	public static void clickState(WebDriver driver) {
		getState(driver).click();
	}

	public static void inputState(WebDriver driver, String data) {
		getState(driver).sendKeys(data);
	}

	public static void clearState(WebDriver driver) {
		getState(driver).clear();
	}

	// Zip

	public static WebElement getZip(WebDriver driver) {
		return driver.findElement(By.xpath(ZIP_XPATH));
	}

	public static void clickZip(WebDriver driver) {
		getZip(driver).click();
	}

	public static void inputZip(WebDriver driver, String data) {
		getZip(driver).sendKeys(data);
	}

	public static void clearZip(WebDriver driver) {
		getZip(driver).clear();
	}

	// Country

	public static WebElement getCountry(WebDriver driver) {
		return driver.findElement(By.xpath(COUNTRY_XPATH));
	}

	public static void clickCountry(WebDriver driver) {
		getCountry(driver).click();
	}

	public static void inputCountry(WebDriver driver, String data) {
		getCountry(driver).sendKeys(data);
	}

	public static void clearCountry(WebDriver driver) {
		getCountry(driver).clear();
	}

	// Save Account Button

	public static WebElement getSaveBtn(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_BTN_XPATH));
	}

	public static void clickSaveBtn(WebDriver driver) {
		getSaveBtn(driver).click();
	}

	// Edit Account Information

	public static WebElement getEditAcc(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_ACC_XPATH));
	}

	public static void clickEditAcc(WebDriver driver) {
		getEditAcc(driver).click();
	}

	// Save Account Information
	public static WebElement getSaveAcc(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_ACC_XPATH));
	}

	public static void clickSaveAcc(WebDriver driver) {
		getSaveAcc(driver).click();
	}

	// Cat
	public static WebElement getCat(WebDriver driver) {
		return driver.findElement(By.xpath(CAT_XPATH));
	}

	public static void clickCat(WebDriver driver) {
		getCat(driver).click();
	}

	// Cat Male
	public static WebElement getCatMale(WebDriver driver) {
		return driver.findElement(By.xpath(CAT_MALE_XPATH));
	}

	public static void clickCatMale(WebDriver driver) {
		getCatMale(driver).click();
	}

	// Add Cat
	public static WebElement getAddCat(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_CAT_XPATH));
	}

	public static void clickAddCat(WebDriver driver) {
		getAddCat(driver).click();
	}

}
