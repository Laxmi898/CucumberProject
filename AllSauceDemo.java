package saucedemopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllSauceDemo {
	WebDriver d;
	@Given("I am in Login page")
	public void i_am_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		d=new ChromeDriver();
		System.out.println("Opening the sauce demo website");
		d.get("https://www.saucedemo.com/");
	
	}

	@Given("I will enter username and password")
	public void i_will_enter_username_and_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("entering username and password");
		d.findElement(By.id("user-name")).clear();
	d.findElement(By.id("user-name")).sendKeys("standard_user");
	d.findElement(By.id("password")).clear();
	d.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	}

	@And("CLick on Login Button")
	public void c_lick_on_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("clicking on login button");
		d.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
	}

	@When("Add products to the cart")
	public void add_products_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("adding products in cart");
		d.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	}

	@And("Click on Basket")
	public void click_on_basket() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(2000);
		System.out.println("clicking on basket");
		d.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
	Thread.sleep(2000);
	}

	@And("Click on Checkout")
	public void click_on_checkout() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("clicking on checkout button");
		d.findElement(By.id("checkout")).click();
		
	}

	@And("Enter first name,lastname and zipcode")
	public void enter_first_name_lastname_and_zipcode() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Thread.sleep(2000);
		System.out.println("entering first last name and zip code");
		d.findElement(By.id("first-name")).sendKeys("john");	
		Thread.sleep(2000);
		d.findElement(By.id("last-name")).sendKeys("smith");
		Thread.sleep(2000);
		d.findElement(By.id("postal-code")).sendKeys("5800044");
		Thread.sleep(2000);
	}

	@And("click on continue")
	public void click_on_continue() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		d.findElement(By.id("continue")).click();
	}

	@And("CLick on finish")
	public void c_lick_on_finish() throws InterruptedException {
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		d.findElement(By.id("finish")).click();
	}

	@Then("Click on home page")
	public void click_on_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		d.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);
	}

	@And("I Will be in Home page of saucedemo website")
	public void i_will_be_in_home_page_of_saucedemo_website() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    d.close();
	}

	
}
