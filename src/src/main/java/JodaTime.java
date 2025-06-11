import org.joda.time.*;

public class JodaTime {

    public void jodaTimeExample() {

        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateAndTime = LocalDateTime.now();

        System.out.println(currentDate);
        System.out.println(currentTime);
        System.out.println(currentDateAndTime);

        System.out.println();

        DateTime dateTime  = currentDateAndTime.toDateTime();
        LocalDate localDate = currentDateAndTime.toLocalDate();
        LocalTime localTime = currentDateAndTime.toLocalTime();

        System.out.println(dateTime);
        System.out.println(localDate);
        System.out.println(localTime);

    }

    public DateTime creatingNewDate(Integer year, Integer month, Integer day, Integer hour, Integer minute) {
        return new DateTime(year, month, day, hour, minute);
    }

    public DateTime creatingTimezoneDate() {
        return new DateTime(DateTimeZone.forID("America/New_York"));
    }

}
