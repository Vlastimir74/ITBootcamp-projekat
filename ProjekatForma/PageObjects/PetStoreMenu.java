package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreMenu {

	// pristup stranici za prijavljivanje

	public static final String MENU_URL = "https://petstore.octoperf.com/actions/Catalog.action";

	// meni sa leve strane

	private static final String LEFT_MENU_FISH_BTN_XPATH = "//div[@id='Content']//a[1]//img[1]";
	private static final String LEFT_MENU_DOGS_BTN_XPATH = "//div[@id='Content']//a[2]//img[1]";
	private static final String LEFT_MENU_CATS_BTN_XPATH = "//div[@id='Content']//a[3]//img[1]";
	private static final String LEFT_MENU_REPTILES_BTN_XPATH = "//div[@id='Content']//a[4]//img[1]";
	private static final String LEFT_MENU_BIRDS_BTN_XPATH = "//div[@id='Content']//a[5]//img[1]";

	// meni sa gornje strane

	private static final String QUICK_LINK_FISH_BTN_XPATH = "//div[@id='QuickLinks']//a[1]//img[1]";
	private static final String QUICK_LINK_DOGS_BTN_XPATH = "//div[@id='Header']//a[2]//img[1]";
	private static final String QUICK_LINK_CATS_BTN_XPATH = "//div[@id='Header']//a[4]//img[1]";
	private static final String QUICK_LINK_REPTILES_BTN_XPATH = "//div[@id='Header']//a[3]//img[1]";
	private static final String QUICK_LINK_BIRDS_BTN_XPATH = "//div[@id='Header']//a[5]//img[1]";

	// meni sa slikama

	private static final String IMG_LINK_FISH_BTN_XPATH = "//body//area[2]";
	private static final String IMG_LINK_DOGS_BTN_XPATH = "//body//area[3]";
	private static final String IMG_LINK_CATS_BTN_XPATH = "//body//area[5]";
	private static final String IMG_LINK_REPTILES_BTN_XPATH = "//body//area[4]";
	private static final String BIG_IMG_LINK_BIRDS_BTN_XPATH = "//body//area[1]";
	private static final String SMALL_IMG_LINK_BIRDS_BTN_XPATH = "//body//area[6]";

	// pristup levom meniju:

	// Fish

	public static WebElement getFish(WebDriver driver) {
		return driver.findElement(By.xpath(LEFT_MENU_FISH_BTN_XPATH));
	}

	public static void clickFish(WebDriver driver) {
		getFish(driver).click();
	}

	// Dogs

	public static WebElement getDogs(WebDriver driver) {
		return driver.findElement(By.xpath(LEFT_MENU_DOGS_BTN_XPATH));
	}

	public static void clickDogs(WebDriver driver) {
		getDogs(driver).click();
	}

	// Cats

	public static WebElement getCats(WebDriver driver) {
		return driver.findElement(By.xpath(LEFT_MENU_CATS_BTN_XPATH));
	}

	public static void clickCats(WebDriver driver) {
		getCats(driver).click();
	}

	// Reptiles

	public static WebElement getReptiles(WebDriver driver) {
		return driver.findElement(By.xpath(LEFT_MENU_REPTILES_BTN_XPATH));
	}

	public static void clickReptiles(WebDriver driver) {
		getReptiles(driver).click();
	}

	// Birds

	public static WebElement getBirds(WebDriver driver) {
		return driver.findElement(By.xpath(LEFT_MENU_BIRDS_BTN_XPATH));
	}

	public static void clickBirds(WebDriver driver) {
		getBirds(driver).click();
	}

//  pristup gornjem meniju:

	// Fish

	public static WebElement getFishUp(WebDriver driver) {
		return driver.findElement(By.xpath(QUICK_LINK_FISH_BTN_XPATH));
	}

	public static void clickFishUp(WebDriver driver) {
		getFishUp(driver).click();
	}

	// Dogs

	public static WebElement getDogsUp(WebDriver driver) {
		return driver.findElement(By.xpath(QUICK_LINK_DOGS_BTN_XPATH));
	}

	public static void clickDogsUp(WebDriver driver) {
		getDogsUp(driver).click();
	}

	// Cats

	public static WebElement getCatsUp(WebDriver driver) {
		return driver.findElement(By.xpath(QUICK_LINK_CATS_BTN_XPATH));
	}

	public static void clickCatsUp(WebDriver driver) {
		getCatsUp(driver).click();
	}

	// Reptiles

	public static WebElement getReptilesUp(WebDriver driver) {
		return driver.findElement(By.xpath(QUICK_LINK_REPTILES_BTN_XPATH));
	}

	public static void clickReptilesUp(WebDriver driver) {
		getReptilesUp(driver).click();
	}

	// Birds

	public static WebElement getBirdsUp(WebDriver driver) {
		return driver.findElement(By.xpath(QUICK_LINK_BIRDS_BTN_XPATH));
	}

	public static void clickBirdsUp(WebDriver driver) {
		getBirdsUp(driver).click();
	}

//  pristup slikovnom meniju:

	// Fish

	public static WebElement getFishImg(WebDriver driver) {
		return driver.findElement(By.xpath(IMG_LINK_FISH_BTN_XPATH));
	}

	public static void clickFishImg(WebDriver driver) {
		getFishImg(driver).click();
	}

	// Dogs

	public static WebElement getDogsImg(WebDriver driver) {
		return driver.findElement(By.xpath(IMG_LINK_DOGS_BTN_XPATH));
	}

	public static void clickDogsImg(WebDriver driver) {
		getDogsImg(driver).click();
	}

	// Cats

	public static WebElement getCatsImg(WebDriver driver) {
		return driver.findElement(By.xpath(IMG_LINK_CATS_BTN_XPATH));
	}

	public static void clickCatsImg(WebDriver driver) {
		getCatsImg(driver).click();
	}

	// Reptiles

	public static WebElement getReptilesImg(WebDriver driver) {
		return driver.findElement(By.xpath(IMG_LINK_REPTILES_BTN_XPATH));
	}

	public static void clickReptilesImg(WebDriver driver) {
		getReptilesImg(driver).click();
	}

	// Birds Big Icon

	public static WebElement getBirdsBigImg(WebDriver driver) {
		return driver.findElement(By.xpath(BIG_IMG_LINK_BIRDS_BTN_XPATH));
	}

	public static void clickBirdsBigImg(WebDriver driver) {
		getBirdsBigImg(driver).click();
	}

	// Birds Small Icon

	public static WebElement getBirdsSmallImg(WebDriver driver) {
		return driver.findElement(By.xpath(SMALL_IMG_LINK_BIRDS_BTN_XPATH));
	}

	public static void clickBirdsSmallImg(WebDriver driver) {
		getBirdsSmallImg(driver).click();
	}
}
