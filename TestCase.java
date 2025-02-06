package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;

public class Assignment2TestRunner {
  WebDriver driver = new ChromeDriver();

  @Given("navigate to the form")
  public void navigate_to_the_form() throws InterruptedException {
    driver.get("https://v1.training-support.net/selenium/simple-form");
    driver.manage().window().maximize();
    Thread.sleep(3000);
  }

  @Given("enter {string} first name")
  public void enter_first_name(String string) throws InterruptedException {
    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Alok");
    Thread.sleep(3000);

  }

  @Given("enter {string} last name")

  public void enter_last_name(String string) throws InterruptedException {
    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Mishra");
    Thread.sleep(3000);

  }

  @Given("enter {string} email id")
  public void enter_email_id(String string) throws InterruptedException {
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Alokmi2111997@gmail.com");
    Thread.sleep(3000);

  }

  @Given("enter contact number")
  public void enter_contact_number() throws InterruptedException {
    driver.findElement(By.xpath("//input[@id='number']")).sendKeys("8932945274");
    Thread.sleep(3000);

  }

  @Given("fill the message")
  public void fill_the_message() throws InterruptedException {
    driver.findElement(By.xpath("//div[@class='field']//textarea"))
        .sendKeys("My name ia Alok Mishra , i am student of masai school");
    Thread.sleep(3000);

  }

  @Given("submit form")
  public void submit_form() throws InterruptedException {
    driver.findElement(By.xpath("//input[@value='submit']")).click();
    Thread.sleep(3000);

  }
}
