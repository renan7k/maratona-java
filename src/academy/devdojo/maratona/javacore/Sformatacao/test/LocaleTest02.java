package academy.devdojo.maratona.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault()); //Comando para descobrir como o computador está configurado
        String[] isoCountries = Locale.getISOCountries(); //puxando todas os países suportados
        String[] isoLanguages = Locale.getISOLanguages(); //puxando todas as línguas suportadas

        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry+ " ");
        }
        System.out.println();

        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage+" ");
        }

    }
}
