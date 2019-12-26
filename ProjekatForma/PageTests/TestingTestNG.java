package page.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.ExcelUtils;
import page.objects.HomePage;
import page.objects.PetStoreMenu;
import page.objects.Registration;
import page.objects.SignIn;

public class TestingTestNG {

	public static void pause() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Testiranje ulaska u radnju (klik na Enter the store).

	@Test
	public void enterTheStoreTest() {

		System.setProperty("webdriver.chrome.driver", "src//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(HomePage.URL);
		HomePage.getEnterButton(driver);
		HomePage.clickEnterBtn(driver);
		String currUrl = driver.getCurrentUrl();
		Assert.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action");
		driver.close();

	}

	// Testiranje Sign In dugmeta

	@Test
	public void SignIn() {

		System.setProperty("webdriver.chrome.driver", "src//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		pause();

		driver.manage().window().maximize();

		driver.get(PetStoreMenu.MENU_URL);

		SignIn.clickSignIn(driver);

		boolean currentText = driver.findElement(By.xpath(SignIn.LOG_BTN_XPATH)).isDisplayed();

		Assert.assertTrue(currentText);

		driver.close();
	}

	// Testiranje levog menija

	@Test
	public void petStoryLeftMenu() {

		System.setProperty("webdriver.chrome.driver", "src//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(PetStoreMenu.MENU_URL);

		PetStoreMenu.getFish(driver);
		PetStoreMenu.clickFish(driver);
		String currUrlFish = driver.getCurrentUrl();
		currUrlFish = currUrlFish.replaceAll(";jsessionid=[^?]*", "");
		pause();
		Assert.assertEquals(currUrlFish,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH");
		pause();
		driver.navigate().back();
		pause();
		PetStoreMenu.getDogs(driver);
		PetStoreMenu.clickDogs(driver);
		pause();
		String currUrlDogs = driver.getCurrentUrl();
		currUrlDogs = currUrlDogs.replaceAll(";jsessionid=[^?]*", "");
		Assert.assertEquals(currUrlDogs,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS");

		driver.navigate().back();
		pause();
		PetStoreMenu.getCats(driver);
		PetStoreMenu.clickCats(driver);
		pause();
		String currUrlCats = driver.getCurrentUrl();
		currUrlCats = currUrlCats.replaceAll(";jsessionid=[^?]*", "");
		Assert.assertEquals(currUrlCats,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS");

		driver.navigate().back();
		pause();
		PetStoreMenu.getReptiles(driver);
		PetStoreMenu.clickReptiles(driver);
		pause();
		String currUrlReptiles = driver.getCurrentUrl();
		currUrlReptiles = currUrlReptiles.replaceAll(";jsessionid=[^?]*", "");
		Assert.assertEquals(currUrlReptiles,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES");

		driver.navigate().back();
		pause();
		PetStoreMenu.getBirds(driver);
		PetStoreMenu.clickBirds(driver);
		pause();
		String currUrlBirds = driver.getCurrentUrl();
		currUrlBirds = currUrlBirds.replaceAll(";jsessionid=[^?]*", "");
		Assert.assertEquals(currUrlBirds,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS");
		pause();
		driver.close();
	}

	// Testiranje gornjeg menija

	@Test
	public void petStoryUpMenu() {

		System.setProperty("webdriver.chrome.driver", "src//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(PetStoreMenu.MENU_URL);

		PetStoreMenu.getFishUp(driver);
		PetStoreMenu.clickFishUp(driver);
		String currUrlFishUp = driver.getCurrentUrl();
		currUrlFishUp = currUrlFishUp.replaceAll(";jsessionid=[^?]*", "");
		Assert.assertEquals(currUrlFishUp,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH");
		pause();
		driver.navigate().back();
		pause();
		PetStoreMenu.getDogsUp(driver);
		PetStoreMenu.clickDogsUp(driver);
		String currUrlDogsUp = driver.getCurrentUrl();
		currUrlDogsUp = currUrlDogsUp.replaceAll(";jsessionid=[^?]*", "");
		Assert.assertEquals(currUrlDogsUp,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS");
		pause();
		driver.navigate().back();
		pause();
		PetStoreMenu.getReptilesUp(driver);
		PetStoreMenu.clickReptilesUp(driver);
		String currUrlReptilesUp = driver.getCurrentUrl();
		currUrlReptilesUp = currUrlReptilesUp.replaceAll(";jsessionid=[^?]*", "");
		Assert.assertEquals(currUrlReptilesUp,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES");
		pause();
		driver.navigate().back();
		pause();
		PetStoreMenu.getCatsUp(driver);
		PetStoreMenu.clickCatsUp(driver);
		String currUrlCatsUp = driver.getCurrentUrl();
		currUrlCatsUp = currUrlCatsUp.replaceAll(";jsessionid=[^?]*", "");
		Assert.assertEquals(currUrlCatsUp,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS");
		pause();
		driver.navigate().back();
		pause();
		PetStoreMenu.getBirdsUp(driver);
		PetStoreMenu.clickBirdsUp(driver);
		String currUrlBirdsUp = driver.getCurrentUrl();
		currUrlBirdsUp = currUrlBirdsUp.replaceAll(";jsessionid=[^?]*", "");
		Assert.assertEquals(currUrlBirdsUp,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS");

		driver.close();
	}

	// Testiranje slikovnog menija

	@Test
	public void PetStoryImgMenu() {

		System.setProperty("webdriver.chrome.driver", "src//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(PetStoreMenu.MENU_URL);

		PetStoreMenu.getFishImg(driver);
		PetStoreMenu.clickFishImg(driver);
		String currUrlFishImg = driver.getCurrentUrl();
		currUrlFishImg = currUrlFishImg.replaceAll(";jsessionid=[^?]*", "");
		Assert.assertEquals(currUrlFishImg,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH");
		pause();
		driver.navigate().back();
		pause();
		PetStoreMenu.getDogsImg(driver);
		PetStoreMenu.clickDogsImg(driver);
		String currUrlDogsImg = driver.getCurrentUrl();
		currUrlDogsImg = currUrlDogsImg.replaceAll(";jsessionid=[^?]*", "");
		Assert.assertEquals(currUrlDogsImg,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS");
		pause();
		driver.navigate().back();
		pause();
		PetStoreMenu.getReptilesImg(driver);
		PetStoreMenu.clickReptilesImg(driver);
		String currUrlReptilesImg = driver.getCurrentUrl();
		currUrlReptilesImg = currUrlReptilesImg.replaceAll(";jsessionid=[^?]*", "");
		Assert.assertEquals(currUrlReptilesImg,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES");
		pause();
		driver.navigate().back();
		pause();
		PetStoreMenu.getCatsImg(driver);
		PetStoreMenu.clickCatsImg(driver);
		String currUrlCatsImg = driver.getCurrentUrl();
		currUrlCatsImg = currUrlCatsImg.replaceAll(";jsessionid=[^?]*", "");
		Assert.assertEquals(currUrlCatsImg,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS");
		pause();
		driver.navigate().back();
		pause();
		PetStoreMenu.getBirdsSmallImg(driver);
		PetStoreMenu.clickBirdsSmallImg(driver);
		String currUrlBirdsSmallImg = driver.getCurrentUrl();
		currUrlBirdsSmallImg = currUrlBirdsSmallImg.replaceAll(";jsessionid=[^?]*", "");
		Assert.assertEquals(currUrlBirdsSmallImg,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS");
		pause();
		driver.navigate().back();
		pause();
		PetStoreMenu.getBirdsBigImg(driver);
		PetStoreMenu.clickBirdsBigImg(driver);
		String currUrlBirdsBigImg = driver.getCurrentUrl();
		currUrlBirdsBigImg = currUrlBirdsBigImg.replaceAll(";jsessionid=[^?]*", "");
		Assert.assertEquals(currUrlBirdsBigImg,
				"https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS");

		driver.close();
	}

	// Registracija jednog Usera

	@Test
	public void oneUserReg() {
		int i = 41;

		System.setProperty("webdriver.chrome.driver", "src//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(SignIn.REGISTRATION_URL);

		String tabela;
		tabela = "C:\\Users\\Win 10\\Desktop\\PROJEKAT\\ProjekatKopija\\src\\UserRandomData.xlsx";
		ExcelUtils.setExcell(tabela);
		ExcelUtils.setWorkSheet(0);

		String userid, password, firstname, lastname, email, phone, address1, address2, city, state, zip, country;

		double id = Double.parseDouble(ExcelUtils.getDataAt(i, 0).toString());
		int id1 = (int) id;
		userid = String.valueOf(id1);

		password = ExcelUtils.getDataAt(i, 1);
		firstname = ExcelUtils.getDataAt(i, 2);
		lastname = ExcelUtils.getDataAt(i, 3);
		email = ExcelUtils.getDataAt(i, 4);
		phone = ExcelUtils.getDataAt(i, 5);
		address1 = ExcelUtils.getDataAt(i, 6);
		address2 = ExcelUtils.getDataAt(i, 7);
		city = ExcelUtils.getDataAt(i, 8);
		state = ExcelUtils.getDataAt(i, 9);

		double z = Double.parseDouble(ExcelUtils.getDataAt(i, 10).toString());
		int z1 = (int) z;
		zip = String.valueOf(z1);

		country = ExcelUtils.getDataAt(i, 11);

		Registration.inputId(driver, userid);
		Registration.inputNewPass(driver, password);
		Registration.inputRepPass(driver, password);
		Registration.inputFirstName(driver, firstname);
		Registration.inputLastName(driver, lastname);
		Registration.inputEmail(driver, email);
		Registration.inputPhone(driver, phone);
		Registration.inputAddress1(driver, address1);
		Registration.inputAddress2(driver, address2);
		Registration.inputCity(driver, city);
		Registration.inputState(driver, state);
		Registration.inputZip(driver, zip);
		Registration.inputCountry(driver, country);

		Registration.clickSaveBtn(driver);

		pause();

		SignIn.clickSignIn(driver);

		SignIn.inputUser(driver, userid);
		SignIn.clearPass(driver);
		SignIn.inputPass(driver, password);
		pause();
		SignIn.clickLogIn(driver);

		boolean currentHeading = driver.findElement(By.xpath(SignIn.ACC_LINK)).isDisplayed();

		Assert.assertTrue(currentHeading);

		pause();

		driver.close();

	}

	// Registracija vise Usera iz tabele

	@Test
	public void regFromExcel() {

		String tabela;
		tabela = "C:\\Users\\Win 10\\Desktop\\PROJEKAT\\ProjekatKopija\\src\\UserRandomData.xlsx";
		ExcelUtils.setExcell(tabela);
		ExcelUtils.setWorkSheet(0);

		System.setProperty("webdriver.chrome.driver", "src//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(SignIn.REGISTRATION_URL);
		for (int i = 1; i <= 51; i++) {

			Registration.inputId(driver, ExcelUtils.getDataAt(i, 0));
			pause();
			Registration.inputNewPass(driver, ExcelUtils.getDataAt(i, 1));
			pause();
			Registration.inputRepPass(driver, ExcelUtils.getDataAt(i, 1));
			pause();
			Registration.inputFirstName(driver, ExcelUtils.getDataAt(i, 2));
			pause();
			Registration.inputLastName(driver, ExcelUtils.getDataAt(i, 3));
			pause();
			Registration.inputEmail(driver, ExcelUtils.getDataAt(i, 4));
			pause();
			Registration.inputPhone(driver, ExcelUtils.getDataAt(i, 5));
			pause();
			Registration.inputAddress1(driver, ExcelUtils.getDataAt(i, 6));
			pause();
			Registration.inputAddress2(driver, ExcelUtils.getDataAt(i, 7));
			pause();
			Registration.inputCity(driver, ExcelUtils.getDataAt(i, 8));
			pause();
			Registration.inputState(driver, ExcelUtils.getDataAt(i, 9));
			pause();
			Registration.inputZip(driver, ExcelUtils.getDataAt(i, 10));
			pause();
			Registration.inputCountry(driver, ExcelUtils.getDataAt(i, 11));
			pause();
			Registration.getSaveBtn(driver);
			pause();
			Registration.clickSaveBtn(driver);
			pause();
			SignIn.getSignIn(driver);
			SignIn.clickSignIn(driver);
			SignIn.getRegBtn(driver);
			SignIn.clickRegBtn(driver);
			Registration.clearId(driver);
			Registration.clearNewPass(driver);
			Registration.clearRepPass(driver);
			Registration.clearFirstName(driver);
			Registration.clearLastName(driver);
			Registration.clearEmail(driver);
			Registration.clearPhone(driver);
			Registration.clearkAddress1(driver);
			Registration.clearAddress2(driver);
			Registration.clearCity(driver);
			Registration.clearState(driver);
			Registration.clearZip(driver);
			Registration.clearCountry(driver);
			pause();
		}

		driver.close();

	}

	// Testiranje logovanja Usera

	@Test
	public void testLogIn() {

		int i = 41;

		System.setProperty("webdriver.chrome.driver", "src//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(PetStoreMenu.MENU_URL);

		String tabela;
		tabela = "C:\\Users\\Win 10\\Desktop\\PROJEKAT\\ProjekatKopija\\src\\UserRandomData.xlsx";
		ExcelUtils.setExcell(tabela);
		ExcelUtils.setWorkSheet(0);

		String userid, password;

		double id = Double.parseDouble(ExcelUtils.getDataAt(i, 0).toString());
		int id1 = (int) id;
		userid = String.valueOf(id1);

		password = ExcelUtils.getDataAt(i, 1);

		SignIn.clickSignIn(driver);

		SignIn.inputUser(driver, userid);
		SignIn.clearPass(driver);
		SignIn.inputPass(driver, password);
		SignIn.clickLogIn(driver);

		boolean currentHeading = driver.findElement(By.xpath(SignIn.ACC_LINK)).isDisplayed();

		SoftAssert sa = new SoftAssert();
		sa.assertTrue(currentHeading);

		driver.close();
		sa.assertAll();
	}

	// Testiranje kupovine

	@Test
	public void addToCardTest() {
		int i = 41;

		System.setProperty("webdriver.chrome.driver", "src//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(PetStoreMenu.MENU_URL);

		String tabela;
		tabela = "C:\\Users\\Win 10\\Desktop\\PROJEKAT\\ProjekatKopija\\src\\UserRandomData.xlsx";
		ExcelUtils.setExcell(tabela);
		ExcelUtils.setWorkSheet(0);

		String userid1, password1;

		double id = Double.parseDouble(ExcelUtils.getDataAt(i, 0).toString());
		int id1 = (int) id;
		userid1 = String.valueOf(id1);

		password1 = ExcelUtils.getDataAt(i, 1);

		SignIn.clickSignIn(driver);

		SignIn.inputUser(driver, userid1);
		SignIn.clearPass(driver);
		SignIn.inputPass(driver, password1);
		pause();
		SignIn.clickLogIn(driver);

		PetStoreMenu.clickCats(driver);

		Registration.clickCat(driver);
		pause();
		Registration.clickCatMale(driver);
		pause();
		Registration.clickAddCat(driver);
		pause();

		boolean currentCat = driver.findElement(By.xpath(Registration.EST_17_CAT_XPATH)).isDisplayed();

		Assert.assertTrue(currentCat);

		SignIn.clickLogout(driver);

		driver.close();
	}

	// Registracija jednog Usera, proizvoljno

	@Test
	public void oneUser() {

		System.setProperty("webdriver.chrome.driver", "src//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(HomePage.URL);
		driver.manage().window().maximize();

		HomePage.getEnterButton(driver);
		HomePage.clickEnterBtn(driver);

		SignIn.getSignIn(driver);
		SignIn.clickSignIn(driver);
		SignIn.getRegBtn(driver);
		SignIn.clickRegBtn(driver);

//   registracija jednog korisnika

		Registration.getId(driver);
		Registration.clickId(driver);
		Registration.inputId(driver, "azika");
		pause();
		Registration.getNewPass(driver);
		Registration.clickNewPass(driver);
		Registration.inputNewPass(driver, "1gR22");
		pause();
		Registration.getRepPass(driver);
		Registration.clickRepPass(driver);
		Registration.inputRepPass(driver, "1gR22");
		pause();
		Registration.getFirstName(driver);
		Registration.clickFirstName(driver);
		Registration.inputFirstName(driver, "Zika");
		pause();
		Registration.getLastName(driver);
		Registration.clickLastName(driver);
		Registration.inputLastName(driver, "Milic");
		pause();
		Registration.getEmail(driver);
		Registration.clickEmail(driver);
		Registration.inputEmail(driver, "zika_milic@gmail.com");
		pause();
		Registration.getPhone(driver);
		Registration.clickPhone(driver);
		Registration.inputPhone(driver, "3112023");
		pause();
		Registration.getAddress1(driver);
		Registration.clickAddress1(driver);
		Registration.inputAddress1(driver, "Milankovacka 2");
		pause();
		Registration.getAddress2(driver);
		Registration.clickAddress2(driver);
		Registration.inputAddress2(driver, "Ruzveltova 1");
		pause();
		Registration.getCity(driver);
		Registration.clickCity(driver);
		Registration.inputCity(driver, "Belgrade");
		pause();
		Registration.getState(driver);
		Registration.clickState(driver);
		Registration.inputState(driver, "Serbia");
		pause();
		Registration.getZip(driver);
		Registration.clickZip(driver);
		Registration.inputZip(driver, "11000");
		pause();
		Registration.getCountry(driver);
		Registration.clickCountry(driver);
		Registration.inputCountry(driver, "Serbia");
		pause();
		Registration.getSaveBtn(driver);
		Registration.clickSaveBtn(driver);
		pause();

		driver.close();
	}
}
