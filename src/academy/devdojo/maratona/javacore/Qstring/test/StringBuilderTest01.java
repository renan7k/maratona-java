package academy.devdojo.maratona.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Renan Dias";
        nome.concat(" Silva");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Renan Silva"); // A stringBuilder não segue o padrão imutável igual a string
        sb.append(" Dias").append(" RS"); // essa é a forma de inserir o valor na stringBuilder ou StringBuffer| funciona tbm como um concat
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0,3);
        System.out.println(sb);

    }
}
