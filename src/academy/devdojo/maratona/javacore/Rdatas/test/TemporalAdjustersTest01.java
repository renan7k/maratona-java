package academy.devdojo.maratona.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withDayOfMonth(20);// With troca apenas o dia/mês/ou ano, sem afetar os outros. Ex: estamos setando apenas o dia como 20
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        //E se quisermos saber qual o dia que será aa próxima sexta feira
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        //Primeiro dia do mês
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()); //tbm tem o lastDayOfmonth
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        //primeiro dia do próximo ano
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }
}
