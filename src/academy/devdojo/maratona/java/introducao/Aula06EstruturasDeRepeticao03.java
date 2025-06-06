package academy.devdojo.maratona.java.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //Imprimir os primeiros 25 números de um dado valor. Por exemplo, 50.

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if(i > 25){
                break;  //parando um laço de repetição. Ele nn pertence ao if, e sim ao for.
            }
            System.out.println(i);
        }
    }
}
