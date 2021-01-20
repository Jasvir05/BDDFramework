package step_definition;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.CustomerOrder;
import testBae.Base;

public class CustomerOrderStep extends Base{
	CustomerOrder CusOr;
	
	CustomerOrderStep(){
		super();
		 CusOr = new CustomerOrder();
	}
	
	@Given("User Open the Url")
	public void user_open_the_url() {
		//initialization();
		Assert.assertEquals(CusOr.getHomePageTitle(), "McDonald's: Burgers, Fries & More. Quality Ingredients.");
		
	}

	@And("User is in the Url")
	public void user_is_in_the_url() {
	  
	}

	@When("Click change your location")
	public void click_change_your_location() {
		CusOr.ClickChangeLocation();
	    
	}

	@When("enter the zip code and hit serch")
	public void enter_the_zip_code() {
		CusOr.enterZipCity(prop.getProperty("zipcode"));
	    CusOr.clickSearchBtn();
	}

	@And("select set as prefered location click order McDelivery")
	public void select_set_as_prefered_location_click_order_mc_delivery() {
		CusOr.clickRadio1();
		CusOr.ClickOrderMCdelivery();
	  
	}

	@Then("select Door Dash Delivery and click Continue")
	public void select_door_dash_delivery_and_click_continue() {
		CusOr.clickRadio2();
		CusOr.clickContinuBtn();
	   
	}

	@And("add the address to deliver")
	public void add_the_address_to_deliver() {
		CusOr.EnterAddress(prop.getProperty("address"));
		CusOr.clickSaveBtn();
	    
	}

	@Then("select buttermilk chicken meal with options")
	public void select_buttermilk_chicken_meal_with_options() {
		CusOr.addDoorDashSelection();
		CusOr.clickAddToCart();
	   	}

	@And("click for cheakout")
	public void click_for_cheakout() {
		CusOr.clickCheakOut();
		
	    
	}


}
