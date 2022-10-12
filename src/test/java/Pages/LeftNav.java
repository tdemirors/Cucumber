package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath ="(//span[text()='Setup'])[1]" )
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private  WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExams;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setupTwo;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement createExams;

    @FindBy(xpath = "//button[contains(@class,'mr-8')]")
    private WebElement exitButton;

    @FindBy(xpath = "//span[text()='Human Resources']" )
    private WebElement humanResources;

    @FindBy(xpath = "//span[text()='Employees']" )
    private WebElement employees;

    @FindBy(xpath = "//span[text()='States']" )
    private WebElement states;


    WebElement myElement;

    public void findAndClick(String strElement){

        switch (strElement){
            case "setupOne" : myElement = setupOne; break;
            case "parameters" : myElement = parameters; break;
            case "countries" : myElement = countries; break;
            case "citizenShip" : myElement = citizenShip; break;
            case "nationalities" : myElement = nationalities; break;
            case "fees" : myElement = fees; break;
            case "entranceExams" : myElement = entranceExams; break;
            case "setupTwo" : myElement = setupTwo; break;
            case "createExams" : myElement = createExams; break;
            case "exitButton" : myElement = exitButton; break;
            case "humanResources" : myElement = humanResources; break;
            case "employees" : myElement = employees; break;
            case "states" : myElement = states; break;
        }
        clickFunction(myElement);
    }








}
