import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateExp {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalDate yesterday=date.minusDays(1);
        LocalDate Tommorow=date.plusDays(1);

        System.out.println("Today date: "+date);
        System.out.println("yesterday date: "+yesterday);
        System.out.println("Tommorow date: "+Tommorow);
    }
}
