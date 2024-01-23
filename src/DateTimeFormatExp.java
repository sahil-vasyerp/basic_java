import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExp {
    public static void main(String[] args) {

//   ---------only date format change ----------------------------------------
        LocalDate localDate=LocalDate.now();
        DateTimeFormatter dtfName=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formateDate=localDate.format(dtfName);
        System.out.println(formateDate);

//        date time both format change-----------------------------------------

        LocalDateTime localDateTime=LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("E,dd-MMM-yyyy, hh:mm:ss");
        String dateTimeFormat=localDateTime.format(dateTimeFormatter);
        System.out.println(dateTimeFormat);
    }
}
