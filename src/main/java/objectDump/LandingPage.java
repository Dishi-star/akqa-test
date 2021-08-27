package objectDump;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private By searchitem = By.xpath("//*[@id='custom-css-outlined-input']");
	private By serchIcon = By.cssSelector("button[id='crossIcon']");
	private By store = By.xpath("//div[@id='panel1bh-header']");
	private By collect = By.xpath("//div[@data-locator='Store & AvailabilityResult-Click & Collect']");
	private By cartButton = By.cssSelector("a[href='/dulux-ceiling-white-paint_p1370213\'] button[type='button']");
	private By cartlink = By.xpath("//a[@id='icon-cart']");
	private By productName = By.xpath("//div[@class='ProductName']/a/h4");
	private By productPrice=By.cssSelector("div[data-locator='tile_TotalPrice']");
	private By productQty=By.cssSelector("div[data-locator='title_Total']");

	public WebElement search() {
		return driver.findElement(searchitem);
	}

	public WebElement Icon() {
		return driver.findElement(serchIcon);
	}

	public WebElement ClickStore() {
		return driver.findElement(store);
	}

	public WebElement clickCollect() {
		return driver.findElement(collect);
	}

	public WebElement addToCart() {
		return driver.findElement(cartButton);
	}

	public WebElement cartPage() {
		return driver.findElement(cartlink);
	}

	public WebElement nameCheck() {
		return driver.findElement(productName);
	}
	
	public WebElement priceCheck()
	{
		return driver.findElement(productPrice);
	}
	
	public WebElement qtyCheck()
	{
		return driver.findElement(productQty);
	}
}
