package academy.devdojo.maratona.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it","IT"); //usando 2 iso's para referenciar a italia
        Locale localeCH = new Locale("it","CH"); //usando 2 iso's para referenciar o italiano da suiça
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");


        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Itália: "+df1.format(calendar.getTime()));
        System.out.println("Suiça: "+df2.format(calendar.getTime()));
        System.out.println("India: "+df3.format(calendar.getTime()));
        System.out.println("Japão: "+df4.format(calendar.getTime()));
        System.out.println("Holanda: "+df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeItaly.getDisplayCountry(localeJapao));
        System.out.println(localeCH.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry(localeJapao));
    }
}
