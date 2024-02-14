package Pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Purchasepage {
	
	WebDriver ldriver;
	
	public Purchasepage(WebDriver rdriver) {
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="product_attribute_1")
	@CacheLookup
	WebElement processor;
	
	@FindBy(id="product_attribute_2")
	@CacheLookup
	WebElement ram;
	
	@FindBy(xpath="//input[@type='checkbox']")
	@CacheLookup
	List<WebElement> Software;
	
	@FindBy(id="product_attribute_3_7")
	@CacheLookup
	WebElement HDD;
	
	@FindBy(id="product_attribute_4_9")
	@CacheLookup
	WebElement OS;
	
	@FindBy(id="add-to-cart-button-1")
	@CacheLookup
	WebElement AddBtn;
	
	
	public void SelectProcessor() throws InterruptedException {
		Thread.sleep(4000);
		Select el1=new Select(processor);
		el1.selectByValue("1");
		Thread.sleep(4000);
	}
	
	public void SelectRam() throws InterruptedException {
		Select el2=new Select(ram);
		el2.selectByValue("5");
		Thread.sleep(4000);
	}
	
	public void CheckSoftware() throws InterruptedException {
		for(WebElement chk : Software) {
			chk.click();
			Thread.sleep(4000);
		}
	}
	public void CheckHDD() throws InterruptedException {
		HDD.click();
		Thread.sleep(4000);
	}
	public void CheckOS() throws InterruptedException {
		OS.click();
		Thread.sleep(4000);
	}
	
	public void AddBtnClk() throws InterruptedException {
		AddBtn.click();
		Thread.sleep(4000);
	}

}
