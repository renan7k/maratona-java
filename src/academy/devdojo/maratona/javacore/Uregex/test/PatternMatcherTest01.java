package academy.devdojo.maratona.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//EXPRESSÕES REGULARES
//É UMA lnguage, desenvolvida que utiliza metrocaracteres (símbolos), ela vai encontrar padões no texto
//Exemplo: Encontrar umaa página, todas as frases que começam com núnero, ou pegar todos os emails de um arquivo
//tbm é usado para validações, como regras de um email
//Classe PATTERN é o padrão, e a MATCHER é a q encontra o padrão
public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab"; //padrão que quer ser encontrado
        String texto = "abaaba";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:   " +texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas:");

        while (matcher.find()){
            System.out.print(matcher.start()+" ");// imprimindo o índice
        }
    }
}
