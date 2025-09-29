import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args)
    {
        java.time.LocalDate date = java.time.LocalDate.now();
        System.out.println(date);
        LocalDate dateString= LocalDate.parse("2025-04-08");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(dateString));
      int k=  dateString.getMonthValue()-LocalDate.now().getMonthValue();
        System.out.println("Differeenc in Month ==>"+""+k);

    }
}
