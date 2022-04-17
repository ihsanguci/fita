package stepDefinition;

import config.Capabilities;
import cucumber.api.PendingException;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.object;

public class checkout extends Capabilities{
	object checkout = new object();
	 @Given("^Already open the apps$")
	    public void already_open_the_apps() throws Throwable {
	        preparation();
	    }

	    @When("^I click shrine card menu$")
	    public void i_click_shrine_card_menu() throws Throwable {
	    	for (int i = 0; i < 5; i++) {
	    		if(driver.findElement(checkout.menu_shrine).isDisplayed()==false) {
	    			TouchAction swipe = new TouchAction(driver)
		                    .press(PointOption.point(715,595))
		                    .moveTo(PointOption.point(555,595))
		                    .release()
		                    .perform();
	    		}
	    		else {
					break;
				}     
			}
	    	driver.findElement(checkout.menu_shrine).click();
	    }

	    @When("^I click the chart$")
	    public void i_click_the_chart() throws Throwable {
	    	driver.findElement(checkout.btn_chart).click();
	    }

	    @Then("^The product will be in cart$")
	    public void the_product_will_be_in_cart() throws Throwable {
	    	driver.findElement(checkout.btn_chart).isDisplayed();
	    }

	    @Then("^the product will be empty$")
	    public void the_product_will_be_empty() throws Throwable {
	    	driver.findElement(checkout.btn_clear_chart).isDisplayed();
	    }

	    @And("^I input username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void i_input_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	    	driver.findElement(checkout.et_username).sendKeys(strArg1);
	    	driver.findElement(checkout.et_password).sendKeys(strArg2);
	    }

	    @And("^I swipe to \"([^\"]*)\" product$")
	    public void i_swipe_to_something_product(String strArg1) throws Throwable {
	    	for (int i = 0; i < 5; i++) {
	    		if(driver.findElement(checkout.txt_product).isDisplayed()==false) {
	    			TouchAction swipe = new TouchAction(driver)
		                    .press(PointOption.point(715,595))
		                    .moveTo(PointOption.point(555,595))
		                    .release()
		                    .perform();
	    		}
	    		else {
					break;
				}     
			}
	    	
	    }

	    @And("^I click \"([^\"]*)\" product$")
	    public void i_click_something_product(String strArg1) throws Throwable {
	    	driver.findElement(checkout.menu_shrine).click();
	    }

	    @And("^I click clear basket button$")
	    public void i_click_clear_basket_button() throws Throwable {
	    	driver.findElement(checkout.btn_clear_chart).click();
	    }

}
