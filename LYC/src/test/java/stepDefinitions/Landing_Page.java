package stepDefinitions;

import org.apache.logging.log4j.*;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.applicationHooks.AppHooks;
import com.pages.Landing_Page_objects;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.*;

public class Landing_Page {

	private Landing_Page_objects lp = new Landing_Page_objects(DriverFactory.getDriver());
	Logger logger = LogManager.getLogger(Landing_Page.class);

	@Given("^User is on the Landing page$")
	public void user_is_on_the_Landing_page() {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url"));
		logger.info("user_is_on_the_Landing_page()"); // reflect into log file
		AppHooks.scn.log("user_is_on_the_Landing_page() Condition Successfull"); // reflect into pdf report
	}

	@Then("^Verify that navigation logo button is clickable in top navigation panel$")
	public void verify_that_navigation_logo_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_navigation_logo_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_navigation_logo_button_is_clickable()");
		AppHooks.scn.log("verify_that_navigation_logo_button_is_clickable() Condition Successfull");
	}

	@Then("^Verify that Home button is clickable in top navigation panel$")
	public void verify_that_home_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_home_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_home_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log("verify_that_home_button_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that Student button is clickable in top navigation panel$")
	public void verify_that_student_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_student_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_student_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log("verify_that_student_button_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that Eductors button is clickable in top navigation panel$")
	public void verify_that_eductors_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_educators_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_eductors_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log("verify_that_eductors_button_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that About us button is clickable in top navigation panel$")
	public void verify_that_about_us_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_about_us_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_about_us_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log("verify_that_about_us_button_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that Contact us button is clickable in top navigation panel$")
	public void verify_that_contact_us_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_contact_us_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_contact_us_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log("verify_that_contact_us_button_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that Sign up and take the quiz button is clickable in top navigation panel$")
	public void verify_that_sign_up_and_take_the_quiz_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_sign_up_and_take_the_quiz_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_up_and_take_the_quiz_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_sign_up_and_take_the_quiz_button_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that main Flag is clickable in top navigation panel$")
	public void verify_that_main_flag_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_main_flag_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_main_flag_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log("verify_that_main_flag_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that Flag into United Kingdom Flag is clickable in top navigation panel$")
	public void verify_that_flag_into_united_kingdom_flag_is_clickable_in_top_navigation_panel() {
		lp.click_on_Flag_button();
		boolean actual = lp.validation_on_united_kingdom_flag_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_flag_into_united_kingdom_flag_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_flag_into_united_kingdom_flag_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that Flag into United States Flag is clickable in top navigation panel$")
	public void verify_that_flag_into_united_states_flag_is_clickable_in_top_navigation_panel() {
		lp.click_on_Flag_button();
		boolean actual = lp.validation_on_united_states_flag_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_flag_into_united_states_flag_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_flag_into_united_states_flag_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that Flag into Canada Flag is clickable in top navigation panel$")
	public void verify_that_flag_into_canada_flag_is_clickable_in_top_navigation_panel() {
		lp.click_on_Flag_button();
		boolean actual = lp.validation_on_canada_flag_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_flag_into_canada_flag_is_clickable_in_top_navigation_panel()");
		AppHooks.scn
				.log("verify_that_flag_into_canada_flag_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that Flag into India Flag is clickable in top navigation panel$")
	public void verify_that_flag_into_india_flag_is_clickable_in_top_navigation_panel() {
		lp.click_on_Flag_button();
		boolean actual = lp.validation_on_indian_flag_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_flag_into_india_flag_is_clickable_in_top_navigation_panel()");
		AppHooks.scn
				.log("verify_that_flag_into_india_flag_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that Sign In button is clickable in top navigation panel$")
	public void verify_that_sign_in_button_is_clickable_in_top_navigation_panel() {
		boolean actual = lp.validation_on_sign_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log("verify_that_sign_in_button_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that Sign In into students button is clickable in top navigation panel$")
	public void verify_that_sign_in_into_students_button_is_clickable_in_top_navigation_panel() {
		lp.click_on_sign_in_button();
		boolean actual = lp.validation_on_students_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_students_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_sign_in_into_students_button_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that Sign In into School or Consortium button is clickable in top navigation panel$")
	public void verify_that_sign_in_into_school_or_consortium_button_is_clickable_in_top_navigation_panel() {
		lp.click_on_sign_in_button();
		boolean actual = lp.validation_on_school_or_consortium_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_school_or_consortium_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_sign_in_into_school_or_consortium_button_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that Sign In into Employers button is clickable in top navigation panel$")
	public void verify_that_sign_in_into_employers_button_is_clickable_in_top_navigation_panel() {
		lp.click_on_sign_in_button();
		boolean actual = lp.validation_on_employers_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_employers_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_sign_in_into_employers_button_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that Sign In into College button is clickable in top navigation panel$")
	public void verify_that_sign_in_into_college_button_is_clickable_in_top_navigation_panel() {
		lp.click_on_sign_in_button();
		boolean actual = lp.validation_on_college_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_college_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_sign_in_into_college_button_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that Sign In into VICTAR Code button is clickable in top navigation panel$")
	public void verify_that_sign_in_into_victar_code_button_is_clickable_in_top_navigation_panel() {
		lp.click_on_sign_in_button();
		boolean actual = lp.validation_on_victar_code_button_clickable_in_top();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_victar_code_button_is_clickable_in_top_navigation_panel()");
		AppHooks.scn.log(
				"verify_that_sign_in_into_victar_code_button_is_clickable_in_top_navigation_panel() Condition Successfull");
	}

	@Then("^Verify that firstname user field is clickable$")
	public void verify_that_firstname_user_field_is_clickable() {
		boolean actual = lp.validation_on_firstname_user_field_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_firstname_user_field_is_clickable()");
		AppHooks.scn.log("verify_that_firstname_user_field_is_clickable() Condition Successfull");
	}

	@Then("^Verify that lastname user field is clickable$")
	public void verify_that_lastname_user_field_is_clickable() {
		boolean actual = lp.validation_on_lastname_user_field_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_lastname_user_field_is_clickable()");
		AppHooks.scn.log("verify_that_lastname_user_field_is_clickable() Condition Successfull");
	}

	@Then("^verify that Sign up and take the quiz button is clickable$")
	public void verify_that_sign_up_and_take_the_quiz_button_is_clickable() {
		boolean actual = lp.validation_on_sign_up_and_take_the_quiz_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_up_and_take_the_quiz_button_is_clickable()");
		AppHooks.scn.log("verify_that_sign_up_and_take_the_quiz_button_is_clickable() Condition Successfull");
	}

	@Then("^Verify that Sign In into students button is clickable$")
	public void verify_that_sign_in_into_students_button_is_clickable() {
		boolean actual = lp.validation_on_students_login_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_students_button_is_clickable()");
		AppHooks.scn.log("verify_that_sign_in_into_students_button_is_clickable() Condition Successfull");
	}

	@Then("^Verify that Sign In into School or Consortium button is clickable$")
	public void verify_that_sign_in_into_school_or_consortium_button_is_clickable() {
		boolean actual = lp.validation_on_school_or_consortium_login_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_school_or_consortium_button_is_clickable()");
		AppHooks.scn.log("verify_that_sign_in_into_school_or_consortium_button_is_clickable() Condition Successfull");
	}

	@Then("^Verify that Sign In into Employers button is clickable$")
	public void verify_that_sign_in_into_employers_button_is_clickable() {
		boolean actual = lp.validation_on_employers_login_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_employers_button_is_clickable()");
		AppHooks.scn.log("verify_that_sign_in_into_employers_button_is_clickable() Condition Successfull");
	}

	@Then("^Verify that Sign In into College button is clickable$")
	public void verify_that_sign_in_into_college_button_is_clickable() {
		boolean actual = lp.validation_on_college_login_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_college_button_is_clickable()");
		AppHooks.scn.log("verify_that_sign_in_into_college_button_is_clickable() Condition Successfull");
	}

	@Then("^Verify that Sign In into VICTAR Code button is clickable$")
	public void verify_that_sign_in_into_victar_code_button_is_clickable() {
		boolean actual = lp.validation_on_VICTAR_code_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_victar_code_button_is_clickable()");
		AppHooks.scn.log("verify_that_sign_in_into_victar_code_button_is_clickable() Condition Successfull");
	}

	@Then("^Verify that dropdown arrow is clickable$")
	public void verify_that_dropdown_arrow_is_clickable() {
		boolean actual = lp.validation_on_dropdown_arrow_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_sign_in_into_victar_code_button_is_clickable()");
		AppHooks.scn.log("verify_that_sign_in_into_victar_code_button_is_clickable() Condition Successfull");
	}

	@Then("^Verify that Im student Lets go button is clickable$")
	public void verify_that_im_student_lets_go_button_is_clickable() {
		boolean actual = lp.validation_on_student_lets_go_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_im_student_lets_go_button_is_clickable()");
		AppHooks.scn.log("verify_that_im_student_lets_go_button_is_clickable() Condition Successfull");
	}

	@Then("^Verify that Im an eductor Lets go button is clickable$")
	public void verify_that_im_an_eductor_lets_go_button_is_clickable() {
		boolean actual = lp.validation_on_educators_lets_go_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_im_an_eductor_lets_go_button_is_clickable()");
		AppHooks.scn.log("verify_that_im_an_eductor_lets_go_button_is_clickable() Condition Successfull");
	}

	@Then("^Verify that Launch Your Career student button is clickable in footer$")
	public void verify_that_launch_your_career_student_button_is_clickable_in_footer() {
		boolean actual = lp.validate_on_launch_your_career_footer_student_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_launch_your_career_student_button_is_clickable_in_footer()");
		AppHooks.scn
				.log("verify_that_launch_your_career_student_button_is_clickable_in_footer() Condition Successfull");
	}

	@Then("^verify that Launch Your Career educator button is clickable in footer$")
	public void verify_that_launch_your_career_educator_button_is_clickable_in_footer() {
		boolean actual = lp.validate_on_launch_your_career_footer_educators_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_launch_your_career_educator_button_is_clickable_in_footer()");
		AppHooks.scn
				.log("verify_that_launch_your_career_educator_button_is_clickable_in_footer() Condition Successfull");
	}

	@Then("^Verify that Get in touch about us button is clickable in footer$")
	public void verify_that_get_in_touch_about_us_button_is_clickable_in_footer() {
		boolean actual = lp.validate_on_launch_your_career_footer_about_us_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_get_in_touch_about_us_button_is_clickable_in_footer()");
		AppHooks.scn.log("verify_that_get_in_touch_about_us_button_is_clickable_in_footer() Condition Successfull");
	}

	@Then("^Verify that Get in touch conatct us button is clickable in footer$")
	public void verify_that_get_in_touch_conatct_us_button_is_clickable_in_footer() {
		boolean actual = lp.validate_on_launch_your_career_footer_contact_us_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_get_in_touch_conatct_us_button_is_clickable_in_footer()");
		AppHooks.scn.log("verify_that_get_in_touch_conatct_us_button_is_clickable_in_footer() Condition Successfull");
	}

	@Then("^Verify that Privacy & Cookie Policy button is clickable in footer$")
	public void verify_that_privacy_cookie_policy_button_is_clickable_in_footer() {
		boolean actual = lp.validate_on_launch_your_career_footer_Privacy_and_Cookie_Policy_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_privacy_cookie_policy_button_is_clickable_in_footer()");
		AppHooks.scn.log("verify_that_privacy_cookie_policy_button_is_clickable_in_footer() Condition Successfull");
	}

	@Then("^Verify that Back to Top button is clickable is clickable in footer$")
	public void verify_that_back_to_top_button_is_clickable_is_clickable_in_footer() {
		boolean actual = lp.validate_on_launch_your_career_footer_Back_to_top_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_back_to_top_button_is_clickable_is_clickable_in_footer()");
		AppHooks.scn.log("verify_that_back_to_top_button_is_clickable_is_clickable_in_footer() Condition Successfull");
	}

	@Then("^Verify that Keep up with all things careers Facebook button is clickable$")
	public void verify_that_keep_up_with_all_things_careers_facebook_button_is_clickable() {
		boolean actual = lp.validate_on_launch_your_career_footer_facebook_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_keep_up_with_all_things_careers_facebook_button_is_clickable()");
		AppHooks.scn.log(
				"verify_that_keep_up_with_all_things_careers_facebook_button_is_clickable() Condition Successfull");
	}

	@Then("^Verify that Keep up with all things careers Twitter button is clickable$")
	public void verify_that_keep_up_with_all_things_careers_twitter_button_is_clickable() {
		boolean actual = lp.validate_on_launch_your_career_footer_twitter_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_keep_up_with_all_things_careers_twitter_button_is_clickable()");
		AppHooks.scn
				.log("verify_that_keep_up_with_all_things_careers_twitter_button_is_clickable() Condition Successfull");
	}

	@Then("^Verify that Keep up with all things careers Instagram button is clickable$")
	public void verify_that_keep_up_with_all_things_careers_instagram_button_is_clickable() {
		boolean actual = lp.validate_on_launch_your_career_footer_instagram_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_keep_up_with_all_things_careers_instagram_button_is_clickable()");
		AppHooks.scn.log(
				"verify_that_keep_up_with_all_things_careers_instagram_button_is_clickable() Condition Successfull");
	}

	@Then("^Verify that Keep up with all things careers LinkedIn button is clickable$")
	public void verify_that_keep_up_with_all_things_careers_linkedin_button_is_clickable() {
		boolean actual = lp.validate_on_launch_your_career_footer_instagram_button_is_clickable();
		Assert.assertEquals(actual, true);
		logger.info("verify_that_keep_up_with_all_things_careers_linkedin_button_is_clickable()");
		AppHooks.scn.log(
				"verify_that_keep_up_with_all_things_careers_linkedin_button_is_clickable() Condition Successfull");
	}

	/*
	 * Scenario number=02
	 */

	@When("^User click on the home function in top naviagation panel$")
	public void user_click_on_the_home_function_in_top_naviagation_panel() {
		lp.home_button_is_clicked_top();
		logger.info("user_click_on_the_home_function()");
		AppHooks.scn.log("user_click_on_the_home_function() Condition Successfull");
	}

	@Then("verify that Home button working as Expected {string}")
	public void verify_that_home_button_working_as_expected_something(String strArg1) {
		String home_title = lp.home_page_title();
		boolean actual = home_title.contains(strArg1);
		Assert.assertEquals(actual, true);
		logger.info("verify_that_home_button_working_as_expected_something()");
		AppHooks.scn.log("verify_that_home_button_working_as_expected_something() Condition Successfull");
	}

	@When("^User click on student function in top naviagation panel$")
	public void user_click_on_student_function_in_top_naviagation_panel() {
		lp.student_button_is_clicked_top();
		logger.info("user_click_on_the_home_function()");
		AppHooks.scn.log("user_click_on_the_home_function() Condition Successfull");
	}

	@Then("verify that Students button working as Expected {string}")
	public void verify_that_students_button_working_as_expected_something(String strArg2) {
		String student_title = lp.student_page_title();
		System.out.println(student_title);
		boolean actual = student_title.contains(strArg2);
		Assert.assertEquals(actual, true);
		logger.info("verify_that_students_button_working_as_expected_something()");
		AppHooks.scn.log("verify_that_students_button_working_as_expected_something() Condition Successfull");
	}

}
