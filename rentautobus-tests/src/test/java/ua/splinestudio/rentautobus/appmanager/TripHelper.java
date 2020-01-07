package ua.splinestudio.rentautobus.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ua.splinestudio.rentautobus.model.TripData;

public class TripHelper extends HelperBase {

    public TripHelper(WebDriver driver) {
        super(driver);
    }

    public void fillOneWayTripForm(TripData tripData) {
        filling(By.id("from"), tripData.getFrom());
        click(By.id("one_way"));
        filling(By.id("to"), tripData.getTo());
        click(By.id("one_way"));
        filling(By.id("from_date"), tripData.getDate());
        click(By.id("one_way"));
        fillTime(By.id("from_time-hour"), tripData.getTime());
        click(By.id("one_way"));
    }

}
