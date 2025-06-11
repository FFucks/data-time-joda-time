import org.joda.time.DateTime;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Application {

    public static void main(String[] args) {

        JodaTime jodaTime = new JodaTime();
        //jodaTime.jodaTimeExample();
        DateAPI dateAPI = new DateAPI();
        //dateAPI.dateTimeExample();

        DateTime jodaTimeCreated = jodaTime.creatingNewDate(2025, 6, 1, 20, 46);
        System.out.println("Joda time Created: " + jodaTimeCreated);
        LocalDateTime apiTimeCreated = dateAPI.creatingNewDate(2025, 6, 1, 20, 46);
        System.out.println("API time Created: " + apiTimeCreated);

        System.out.println();

        DateTime jodaPlusDay = jodaTimeCreated.plusDays(1);
        System.out.println("Joda plus day: " + jodaPlusDay);
        LocalDateTime apiPlusDay = apiTimeCreated.plusDays(1);
        System.out.println("API plus day: " + apiPlusDay);

        System.out.println();

        DateTime jodaTimeZone = jodaTime.creatingTimezoneDate();
        System.out.println("Joda timezone: " + jodaTimeZone);
        ZonedDateTime apiTimeZone = dateAPI.creatingTimezoneDate();
        System.out.println("API timezone: " + apiTimeZone);



    }
}
