import java.time.*;

public class DateAPI {

    public void dateTimeExample() {

        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateAndTime = LocalDateTime.now();

        System.out.println(currentDate);
        System.out.println(currentTime);
        System.out.println(currentDateAndTime);

        //NoToDateTime
        LocalDate localDate = currentDateAndTime.toLocalDate();
        LocalTime localTime = currentDateAndTime.toLocalTime();

        System.out.println(localDate);
        System.out.println(localTime);

    }

    public LocalDateTime creatingNewDate(Integer year, Integer month, Integer day, Integer hour, Integer minute) {
        return LocalDateTime.of(year, month, day, hour, minute);
    }

    public ZonedDateTime creatingTimezoneDate() {
        return ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
    }

}
