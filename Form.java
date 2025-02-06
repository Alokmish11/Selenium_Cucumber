package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormTestRunner {
  WebDriver driver = new ChromeDriver();

  @Given("navigate to the form")
  public void navigate_to_the_form() throws InterruptedException {
    driver.get("https://formy-project.herokuapp.com/form");
    driver.manage().window().maximize();
    Thread.sleep(3000);

  }

  @When("enter {string} in the first name field")
  public void enter_in_the_first_name_field(String string) throws InterruptedException {
    driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Alok");
    Thread.sleep(3000);

  }

  @When("enter {string} in the last name field")
  public void enter_in_the_last_name_field(String string) throws InterruptedException {
    driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Mishra");
    Thread.sleep(3000);
  }

  @When("enter {string} in the job title field")
  public void enter_in_the_job_title_field(String string) throws InterruptedException {
    driver.findElement(By.xpath("//input[@id='job-title']")).sendKeys("Automation Engineer");
    Thread.sleep(3000);
  }

  @When("select {string} years of experience")
  public void select_years_of_experience(String string) throws InterruptedException {
    driver.findElement(By.xpath("//select[@id='select-menu']")).click();
    driver.findElement(By.xpath("//option[@value=\"1\"]")).click();
    Thread.sleep(3000);

  }

  @When("select the {string} radio button")
  public void select_the_radio_button(String string) throws InterruptedException {
    driver.findElement(By.xpath("//input[@id='radio-button-3']")).click();
    Thread.sleep(3000);

  }

  @When("check the {string} checkbox")
  public void check_the_checkbox(String string) throws InterruptedException {
    driver.findElement(By.xpath("//input[@id='checkbox-1']")).click();
    Thread.sleep(3000);

  }

  @When("pick a date")
  public void pick_a_date() throws InterruptedException {
    driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05/01/2025");
    Thread.sleep(3000);

  }

  @When("click the submit button")
  public void click_the_submit_button() throws InterruptedException {
    driver.findElement(By.xpath("//a[@role='button']")).click();
    Thread.sleep(3000);

  }

  @Then("should see a success message")
  public void should_see_a_success_message() {
    String message = driver.findElement(By.xpath("//div[@role='alert']")).getText();
    Assert.assertEquals(message, "The form was successfully submitted!");

  }

}
