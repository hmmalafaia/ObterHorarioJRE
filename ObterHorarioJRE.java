import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class ObterHorarioJRE{
     public static void main(String []args){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss z");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));
     }
}
