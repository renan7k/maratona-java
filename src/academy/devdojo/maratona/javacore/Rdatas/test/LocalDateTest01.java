package academy.devdojo.maratona.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
//LOCAL DATE FOI INTRODUZIDA NA VERSÃO 8 DO JAVA , CLASSE IMUTÁVEL,
//É A CLASSE MAIS USADA
public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 28);
        LocalDate agora = LocalDate.now(); // como o construtor é privado, nn pode usar new
        //Metodos utilitarios :
        System.out.println(date.getYear()); //pegando o ano
        System.out.println(date.getMonth()); //pegando o mês
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth()); //saber se a qtd de dias do mês
        System.out.println(date.isLeapYear()); //Descobrir se é um ano bissexto
        System.out.println(date);
        System.out.println(agora);


    }
}
