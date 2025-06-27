package academy.devdojo.maratona.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

//Calendar foi a 2º classe q o java criou para tentar solucinar os problemas q a galera estava tendo
//Calendar é uma classe abstrata, portanto nn pode usar new
//tbm são usadas mais em sistemas legados
public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana.");
        }
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 2); //adicionando 2 dias as datas
        Date date = c.getTime();
        System.out.println(date);
    }
}
