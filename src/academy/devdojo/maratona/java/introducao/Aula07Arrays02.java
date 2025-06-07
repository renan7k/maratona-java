package academy.devdojo.maratona.java.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //Padrão de inicialização
        // byte, short, int, long, float e double 0
        //char '\u0000' ' '
        //boolean false
        //String null

        String [] nomes = new String[3];
        nomes[0] = "Adenor Moraes";
        nomes[1] = "Goku";
        nomes[2] = "Michael Jackson";

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }
    }
}
