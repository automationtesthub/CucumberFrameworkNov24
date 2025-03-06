package com.vtiger.stepsdefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;

public class leadssteps extends basesteps {


    @When("user click on new lead link")
    public void user_new_lead_link() {
        driver.findElement(By.linkText("New Lead")).click();
    }

    @When("fill mandatory fields and click save button")
    public void createlead_with_mandate() {

        driver.findElement(By.name("lastname")).sendKeys("Modi");
        driver.findElement(By.name("company")).sendKeys("BJP");
        driver.findElement(By.name("button")).click();

    }

    @Then("Lead should be created successfully")
    public void Lead_successfully() {

        driver.findElement(By.xpath("//td[text()='Last Name:']/following::td[text()='Modi']")).isDisplayed();
        driver.findElement(By.xpath("//td[text()='Company:']/following::td[text()='BJP']")).isDisplayed();

    }

    @When("fill mandatory fields lastname {string} and company {string} click save button")
    public void fill_mandatory_fields_lastname_and_company_click_save_button(String lname, String comp) {
        driver.findElement(By.name("lastname")).sendKeys(lname);
        driver.findElement(By.name("company")).sendKeys(comp);
        driver.findElement(By.name("button")).click();
    }

    @Then("Lead should be created successfully with lastname {string} and company {string}")
    public void lead_should_be_created_successfully_with_lastname_and_company(String lname, String comp) {
        driver.findElement(By.xpath("//td[text()='Last Name:']/following::td[text()='"+lname+"']")).isDisplayed();
        driver.findElement(By.xpath("//td[text()='Company:']/following::td[text()='"+comp+"']")).isDisplayed();

    }

    @When("user create the lead with data {string} and {string} and verify successful lead creation")
    public void user_create_the_lead_with_data_and_and_verify_successful_lead_creation(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> lst = dataTable.asLists();
        for(int i = 0;i<lst.size();i++)
        {

            driver.findElement(By.linkText("New Lead")).click();
            driver.findElement(By.name("lastname")).sendKeys(lst.get(i).get(0));
            driver.findElement(By.name("company")).sendKeys(lst.get(i).get(1));
            driver.findElement(By.name("button")).click();
            driver.findElement(By.xpath("//td[text()='Last Name:']/following::td[text()='"+lst.get(i).get(0)+"']")).isDisplayed();
            driver.findElement(By.xpath("//td[text()='Company:']/following::td[text()='"+lst.get(i).get(1)+"']")).isDisplayed();

        }
    }
}
