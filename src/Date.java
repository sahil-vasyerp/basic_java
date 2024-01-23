import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        LocalTime localTime=LocalTime.now();
        LocalDateTime localDateTime=LocalDateTime.now();


//        Datetime format change

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
    }
}

