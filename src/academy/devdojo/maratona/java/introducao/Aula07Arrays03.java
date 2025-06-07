package academy.devdojo.maratona.java.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        //maneiras de inicializar um array
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5}; //definir array já com os valores
        int[] numeros3 = new int[]{6,7,8,9,10};

        //maneiras de imprimir
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        //forEach não acessa um índice específico, pois ele é uma versão simplificada
        //a variável num percorre cada posição do array
        for(int num:numeros3){
            System.out.println(num);
        }
    }
}
