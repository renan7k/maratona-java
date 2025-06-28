package academy.devdojo.maratona.javacore.Sformatacao.test;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Esta é a classe responsável pelas formatações no java
public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        //Agr q temos a string, queremos transformar num objeto : parse. De objeto para strint, format
        LocalDate parse1 = LocalDate.parse("20250628", DateTimeFormatter.BASIC_ISO_DATE); //Tem q passar a data e a formatação
        System.out.println(parse1);

        LocalDateTime now = LocalDateTime.now();
        String format = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(format);

        DateTimeFormatter dateTimeFormatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //setando a máscara
        String formatBR = LocalDate.now().format(dateTimeFormatterBR);
        System.out.println(formatBR);
    }
}
