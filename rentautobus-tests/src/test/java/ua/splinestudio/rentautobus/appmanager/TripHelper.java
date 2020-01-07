package ua.splinestudio.rentautobus.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.splinestudio.rentautobus.model.TripData;

import java.util.ArrayList;
import java.util.List;

public class TripHelper extends HelperBase {

    public TripHelper(WebDriver driver) {
        super(driver);
    }

    public void fillOneWayTripForm(TripData tripData) {
        filling(By.id("from"), tripData.getFrom());
        click(By.id("one_way"));
        filling(By.id("to"), tripData.getTo());
        click(By.id("one_way"));
        fillingDate(By.id("from_date"), tripData.getDate());
        click(By.id("one_way"));
        fillTime(By.id("from_time-hour"), tripData.getTime());
        click(By.id("one_way"));
    }

    public List<String> getTripWebText(By locator) {
        List<String> trips = new ArrayList<String>();
        List<WebElement> elements = driver.findElements(locator);
        for (WebElement e : elements) {
            String text = e.getText();
            String trip = new String(text);
            trips.add(trip);
        }
        return trips;
    }

 /*   public void fillNextOneWayTripForm() {
        filling(By.id("from"), tripData.getFrom());
        click(By.id("one_way"));
        filling(By.id("to"), tripData.getTo());
        click(By.id("one_way"));
        filling(By.id("from_date"), tripData.getDate());
        click(By.id("one_way"));
        fillTime(By.id("from_time-hour"), tripData.getTime());
        click(By.id("one_way"));
    }*/
}
