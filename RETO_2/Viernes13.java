// This class is used to format and parse dates in a specific pattern.
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Viernes13 {
    public static void main(String[] args) {
        // `Calendar cal = Calendar.getInstance();` is creating a new instance of the `Calendar` class
        // and setting it to the current date and time based on the system clock.
        Calendar cal = Calendar.getInstance();
        // `int year = cal.get(Calendar.YEAR);` is getting the current year from the `Calendar`
        // instance `cal` and storing it in the variable `year`.
        int year = cal.get(Calendar.YEAR);
        // `boolean hayViernes13 = false;` is initializing a boolean variable `hayViernes13` to
        // `false`. This variable is used to keep track of whether there is at least one Friday the
        // 13th in the current year.
        boolean hayViernes13 = false;

        // `SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");` is creating a new instance
        // of the `SimpleDateFormat` class and setting the format pattern to "dd/MM/yyyy". This format
        // pattern specifies that dates should be formatted with the day of the month followed by the
        // month and year, separated by slashes. For example, the date January 1, 2022 would be
        // formatted as "01/01/2022". This format is used later in the code to format the dates of any
        // Friday the 13th that are found.
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        // The `for` loop is iterating over each month of the current year (represented by the variable
        // `year`). It starts with the first month (January), represented by `mes = 0`, and continues
        // until the last month (December), represented by `mes = 11`. For each month, the code sets
        // the `Calendar` instance `cal` to the 13th day of that month and checks if it falls on a
        // Friday. If it does, the date is printed in a specific format. If there are no Friday the
        // 13ths in the current year, a message is printed indicating so.
        for (int mes = 0; mes < 12; mes++) {
            cal.set(year, mes, 13);
            int diaSemana = cal.get(Calendar.DAY_OF_WEEK);
            if (diaSemana == Calendar.FRIDAY) {
                hayViernes13 = true;
                Date fecha = cal.getTime();
                String nombreMes = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.getDefault());
                System.out.println("Viernes 13 de " + nombreMes + " de " + year + ": " + format.format(fecha));
            }
        }

        // The `if (!hayViernes13)` statement is checking if the boolean variable `hayViernes13` is
        // `false`. If it is `false`, it means that there were no Friday the 13ths found in the current
        // year, so the code inside the `if` block is executed. This block prints a message indicating
        // that there is no Friday the 13th in the current year.
        if (!hayViernes13) {
            System.out.println("No hay un viernes 13 en el año " + year + ".");
        }
    }
}
