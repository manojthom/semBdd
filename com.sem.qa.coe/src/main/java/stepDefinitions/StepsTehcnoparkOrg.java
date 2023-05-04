package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsTehcnoparkOrg {

	WebDriver driver; 

@Given("Open chrome")
public void open_chrome() {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Open chrome ");
   WebDriverManager.chromedriver().setup();
   driver = new ChromeDriver();
}
@When("Go to the technopark job search page")
public void go_to_the_infopark_job_search_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Navigate to infopark job search page");
    driver.get("https://www.technopark.org/job-search");
}
@When("Search for the search keyword")
public void search_for_the_search_keyword() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
     System.out.println("Search for the keyword");
     driver.findElement(By.id("searchId")).sendKeys("QA");
     driver.findElement(By.className("search-icon")).click();
     Thread.sleep(10000);
     driver.close();
}
@Then("Write it on console")
public void write_it_on_console() {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("Write it on console");
}
}
