package academy.devdojo.maratona.javacore.Uregex.test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        //quantificadores:
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // () -agrupamento
        // | - ou ex: o(v|c)o - vai dar match nas ocorrências de oco ou ovo
        // $ - final da linha
        // . - Ex: 1.3 : Vai retornar 123,133, 1@3, 1A3

        //DESAFIO - retornar todos os emails válidos
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "fulano@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("#@!zoro@mail.br".matches(regex)); //validando se a string bate com a expressão regular
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
