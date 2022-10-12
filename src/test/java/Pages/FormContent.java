package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement academicPeriod1;

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[3]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement gradeLevel1;

    @FindBy(xpath = "//mat-select[@formcontrolname='gender']")
    private WebElement gender;

    @FindBy(xpath = "//span[text()=' Male ']")
    private WebElement male;

    @FindBy(xpath = "//span[text()=' Female ']")
    private WebElement female;

    @FindBy(xpath = "//span[text()='Employee Type']")
    private WebElement employeeType;

    @FindBy(xpath = "//span[text()=' Teacher ']")
    private WebElement teacher;

    @FindBy(xpath = "//span[text()=' Supervisor ']")
    private WebElement supervisor;

    @FindBy(xpath = "//span[text()=' Other ']")
    private WebElement other;

    @FindBy(xpath = "//span[text()='Qualification']")
    private WebElement qualification;

    @FindBy(xpath = "//span[text()=' Secondary Technical ']")
    private WebElement secondaryTechnical;

    @FindBy(xpath = "//span[text()=' Bachelor ']")
    private WebElement barchelor;

    @FindBy(xpath = "//span[text()=' Master ']")
    private WebElement master;

    @FindBy(xpath = "//span[text()=' Ph.D ']")
    private WebElement phD;

    @FindBy(xpath = "//span[text()=' Doctor of Science ']")
    private WebElement doctorOfScience;

    @FindBy(xpath = "//span[text()=' Professor ']")
    private WebElement professor;

    @FindBy(xpath = "//span[text()=' ASPIRANT ']")
    private WebElement aspirant;

    @FindBy(xpath = "//mat-select[@formcontrolname='type']")
    private WebElement documentType;

    @FindBy(xpath = "//span[text()=' Personal ID ']")
    private WebElement personalId;

    @FindBy(xpath = "//span[text()=' Passport ']")
    private WebElement passport;

    @FindBy(xpath = "//span[text()=' Birth Certificate ']")
    private WebElement birthCertificate ;

    WebElement myElement;

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "academicPeriod": myElement = academicPeriod; break;
            case "academicPeriod1": myElement = academicPeriod1; break;
            case "gradeLevel": myElement = gradeLevel; break;
            case "gradeLevel1": myElement = gradeLevel1; break;
            case "gender": myElement = gender; break;
            case "male": myElement = male; break;
            case "female": myElement = female; break;
            case "employeeType": myElement = employeeType; break;
            case "teacher": myElement = teacher; break;
            case "supervisor": myElement = supervisor; break;
            case "other": myElement = other; break;
            case "qualification": myElement = qualification; break;
            case "secondaryTechnical": myElement = secondaryTechnical; break;
            case "barchelor": myElement = barchelor; break;
            case "master": myElement = master; break;
            case "phD": myElement = phD; break;
            case "doctorOfScience": myElement = doctorOfScience; break;
            case "professor": myElement = professor; break;
            case "aspirant": myElement = aspirant; break;
            case "documentType": myElement = documentType; break;
            case "personalId": myElement = personalId; break;
            case "passport": myElement = passport; break;
            case "birthCertificate": myElement = birthCertificate; break;



        }
        clickFunction(myElement);
    }


}