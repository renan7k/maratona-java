package academy.devdojo.maratona.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

//Junção da localDate e localDateTime
public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2026, Month.AUGUST, 6);
        //Para pegar a data, tbm pode ser realizando o parse de uma string, por exemplo
        LocalDate date2 = LocalDate.parse("2025-10-30");
        LocalTime time = LocalTime.of(9,45,00);
        System.out.println(localDateTime);
        System.out.println(localDateTime.getHour());
        System.out.println(date2);

        //Tbm é possível fazer uma junção entre as classes LocalDate e LocalTime
        LocalDateTime ldt1 = date.atTime(time); //Juntando a date com o time
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);


    }
}
