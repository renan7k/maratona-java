package academy.devdojo.maratona.javacore.Uregex.test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        //metrocaracteres
        // []
        //String regex = "[abcABC]"; //procure ou por aA, ou por bB, ou por cC
        //String regex = "[a-zA-C]"; //a até z minúsculo, A até C maiúsculo
        String regex = "0[xX][0-9a-fA-F]"; //Desafio: Procurar numero hexa, tem que começar com 0x, ter algum digito depois, e nn pode ter letra maior q F
        String texto = "cafeBABE";
        String texto2 = "12 0x 0x 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:   " +texto2);
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
