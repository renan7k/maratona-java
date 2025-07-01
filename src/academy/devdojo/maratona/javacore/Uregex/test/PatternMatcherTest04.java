package academy.devdojo.maratona.javacore.Uregex.test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        //quantificadores:
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // () -agrupamento
        // | - ou ex: o(v|c)o - vai dar match nas ocorrências de oco ou ovo
        // $ - final da linha

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0x 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:   " +texto);
        System.out.println("indice:  0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas:");

        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
        int numeroHex = 0x59f86A; //valor hexadecimal, colocar 0x antes
        //System.out.println(numeroHex);
    }
}
