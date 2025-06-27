package academy.devdojo.maratona.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

//FORMATANDO MOEDA
public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeUS = Locale.US;
        Locale localePT = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance(localeUS);
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localePT);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits()); //verifiicar a qtd de casas decimais
            System.out.println(numberFormat.format(valor));
        }

    }
}
