package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom extends BaseClass {

	public LoginPagePom() {

		PageFactory.initElements(driver, this);
	}
	//	Test
	@CacheLookup	
	@FindBy(how=How.ID, using="user-name")
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}

	@FindBy(how=How.ID, using="password")
	private WebElement passWord;

	public WebElement getPassWord() {
		return passWord;
	}

	@FindBy(how = How.ID, using = "login-button")
	private WebElement login;	

	public WebElement getLogin() {
		return login;	
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Open Menu']")
	private WebElement openmenu;

	public WebElement getOpenMenu() {
		return openmenu;
	}	

	@FindBy(how = How.XPATH, using = "//a[text()='All Items']")
	private WebElement allitems;

	public WebElement getAllItems() {
		return allitems;
	}	

	@FindBy(how = How.XPATH, using = "//button[text()='Close Menu']")
	private WebElement closemenu;

	public WebElement getCloseMenu() {
		return closemenu;
	}

	@FindBy(how = How.XPATH, using = "//select[@class='product_sort_container']")
	private WebElement productshort;

	public WebElement getProductSort() {
		return productshort;
	}

	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-backpack")
	private WebElement backpack;

	public WebElement getBackPack() {
		return backpack;
	}

	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-bike-light")
	private WebElement bikelight;

	public WebElement getBikeLight() {
		return bikelight;
	}

	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement tshirt;

	public WebElement getTshirt() {
		return tshirt;
	}

	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement fleecejacket;

	public WebElement getFleeceJacket() {
		return fleecejacket;
	}

	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-onesie")
	private WebElement onesie;

	public WebElement getOneSie() {
		return onesie;
	}

	@FindBy(how = How.ID, using = "add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement redtshirt;

	public WebElement getRedTshirt() {
		return redtshirt;
	}

	@FindBy(how = How.XPATH, using = "//a[@class='shopping_cart_link']")
	private WebElement cartlink;

	public WebElement getShopCartLink() {
		return cartlink;
	}

	@FindBy(how = How.ID, using = "remove-test.allthethings()-t-shirt-(red)")
	private WebElement removeredtshirt;

	public WebElement getRemoveTshirt() {
		return removeredtshirt;
	}

	@FindBy(how = How.ID, using = "remove-sauce-labs-onesie")
	private WebElement removeonesie;

	public WebElement getRemoveOneSie() {
		return removeonesie;
	}

	@FindBy(how = How.ID, using = "remove-sauce-labs-bike-light")
	private WebElement removebikelight;

	public WebElement getRemoveBikeLight() {
		return removebikelight;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Checkout']")
	private WebElement checkout;

	public WebElement getCheckout() {
		return checkout;
	}
	//	After
	@FindBy(how = How.ID, using = "first-name")
	private WebElement firstname;

	public WebElement getFirstName() {
		return firstname;
	}

	@FindBy(how = How.ID, using = "last-name")
	private WebElement lastname;

	public WebElement getLastName() {
		return lastname;
	}

	@FindBy(how = How.ID, using = "postal-code")
	private WebElement postcode;

	public WebElement getPostalCode() {
		return postcode;
	}

	@FindBy(how = How.ID, using = "continue")
	private WebElement proceed;

	public WebElement getProceed() {
		return proceed;
	}

	@FindBy(how = How.XPATH, using = "//div[text()=' Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy']")
	private WebElement text;

	public WebElement getScrollText() {
		return text;
	}

	@FindBy(how = How.ID, using = "finish")
	private WebElement finish;

	public WebElement getFinish() {
		return finish;
	}
	//	AfterClass
	@FindBy(how = How.ID, using = "back-to-products")
	private WebElement backhome;

	public WebElement getBackHome() {
		return backhome;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Open Menu']")
	private WebElement openmenu2;

	public WebElement getOpenOutMenu() {
		return openmenu2;
	}

	@FindBy(how = How.ID, using = "logout_sidebar_link")
	private WebElement out;

	public WebElement getOut() {
		return out;
	}

}