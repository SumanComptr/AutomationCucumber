package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Pageobject.Loginpage;
import Pageobject.Purchasepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {

	public WebDriver driver;

	public Loginpage lp;
	
	public Purchasepage pp;

	@Given("user Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver(options);

		lp = new Loginpage(driver);
		// ad = new AddcustomerPage(driver);
	}

	@When("User opens url {string}")
	public void user_opens_url(String url) throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String mail, String pwd) {
		lp.enterEmail(mail);
		lp.enterPassword(pwd);

	}

	@When("Click on Login")
	public void click_on_login() {
		lp.clickOnLoginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String exptitle) {

		String actualtitle = driver.getTitle();

		if (actualtitle.equals(exptitle)) {

			System.out.println("True");
		} else {
			System.out.println("False");

		}
	}

	@When("User click on the log out link")
	public void user_click_on_the_log_out_link() {
		lp.getClass();
	}

	@When("Close the Browser")
	public void close_the_browser() {
		driver.close();
	}
	///////////////////////////// Purchase////////////////////////

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser1() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver(options);

		pp = new Purchasepage(driver);
	}
	
	@When("User opens new url {string}")
	public void user_opens_new_url(String url1) throws InterruptedException {
		driver.get(url1);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("User select Processor as {string}")
	public void user_select_processor_as(String string) throws InterruptedException {
		pp.SelectProcessor();
	}

	@When("User select RAM as {string}")
	public void user_select_ram_as(String string) throws InterruptedException {
		pp.SelectRam();
	}

	@When("User check HDD as {string}")
	public void user_check_hdd_as(String string) throws InterruptedException {
		pp.CheckHDD();
	}

	@When("User check OS as {string}")
	public void user_check_os_as(String string) throws InterruptedException {
		pp.CheckOS();
	}

	@When("User check Software as {string}")
	public void user_check_software_as(String string) throws InterruptedException {
		pp.CheckSoftware();
	}

	@When("Click on AddToCart")
	public void click_on_add_to_cart() throws InterruptedException {
		pp.AddBtnClk();
	}

	@When("Close the browser")
	public void close_the_browser1() {
		driver.close();
	}

}
