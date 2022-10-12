package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class _11_JDBCSteps {
    @Then("Send the query to database {string} and control match")
    public void sendTheQueryToDatabaseAndControlMatch(String sorgu) {
        // DB den gerekli listeyi alacağım
        List < List < String > > dbList = DBUtility.getListData(sorgu);
        System.out.println("dbList = " + dbList);

        // Web den ekrandaki isimleri alacağım
        DialogContent dc = new DialogContent();
        List < WebElement > uiList = dc.waitVisibleListAllElement(dc.stateList);

        for (WebElement e : uiList)
            System.out.println("e = " + e.getText());

        // birbiriyle karşılaştıracağım
        for (int i = 0; i < dbList.size(); i++)
            Assert.assertEquals(dbList.get(i).get(1), uiList.get(i).getText());





    }
}
