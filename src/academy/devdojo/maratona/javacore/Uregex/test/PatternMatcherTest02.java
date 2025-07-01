package academy.devdojo.maratona.javacore.Uregex.test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternMatcherTest02 {
    public static void main(String[] args) {
        //metrocaracteres
        // \d = Todos os digitos
        // \D =  Tudo o que não for dígito
        // \s = Todos os espaços em branco (\t, \n, \f, \r)
        // \S = Todos os caracteres excluindo os brancos
        // \w = Tudo que for de a-z/A-Z, digitos, e _
        // \W = Tudo que não for incluso no \w
        String regex = "\\w";
        String texto = "hh_j2 12g@h21kh2";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:   " +texto);
        System.out.println("indice:  0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas:");

        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
