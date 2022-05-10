package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

@FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleField;

    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;

    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearch;
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryType;
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobType;
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobs;
//    @FindBy(xpath = "//h1[normalize-space()='Permanent Tester jobs in Harrow on the Hill']")
//    WebElement resultText;


    public void enterJobTitle(String jobTitle){
        sendTextToElement(jobTitleField,jobTitle);
    }
    public void enterLocation(String location){
        sendTextToElement(locationField,location);
    }
    public void selectDistance(String distance){
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearch);
    }
    public void enterMinSalary(String salary){
        sendTextToElement(salaryMin,salary);
    }
    public void enterMaxSalary(String salary){
        sendTextToElement(salaryMax,salary);
    }
    public void selectSalaryType(String sType){
        sendTextToElement(salaryType,sType);
    }
    public void selectJobType(String jType){
        selectByVisibleTextFromDropDown(jobType,jType);
    }
    public void clickOnJobsButton(){
        clickOnElement(findJobs);
    }
//    public String resultPage(){
//        return getTextFromElement(resultText);
//    }

}
/*
1.HomePage -
Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin,
salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
Methods - enterJobTitle(String jobTitle), enterLocation(String location),
selectDistance(String distance), clickOnMoreSearchOptionLink(),
enterMinSalary(String minSalary), enterMaxSalary(String maxSalary), selectSalaryType(String
sType), selectJobType(String jobType),
clickOnFindJobsButton().

1.verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
distance, String salaryMin, String salaryMax, String salaryType, String jobType,
String result).
enter job title 'jobTitle'
enter Location 'location'
select distance 'distance'
click on moreSearchOptionsLink
enter salaryMin 'salaryMin'
enter salaryMax 'salaryMax'
select salaryType 'salaryType'
select jobType 'jobType'
click on 'Find Jobs' button
 */