import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Viernes13 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        boolean hayViernes13 = false;

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

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

        if (!hayViernes13) {
            System.out.println("No hay un viernes 13 en el año " + year + ".");
        }
    }
}
