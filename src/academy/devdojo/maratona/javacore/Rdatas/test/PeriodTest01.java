package academy.devdojo.maratona.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(9);
        Period p5 = Period.ofYears(9);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3); //Retorna apenas em dias, para retornar em meses, tem q usar orutra classe: ChronoUnit
        System.out.println(p4);
        System.out.println(p5);

        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS)); //Para descobrir quantos meses são as 58 semanas do p3
    }
}
