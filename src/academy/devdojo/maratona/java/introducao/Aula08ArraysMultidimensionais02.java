package academy.devdojo.maratona.java.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int [3][];

        arrayInt[0] = new int[2]; // quero q o array[0] faça referência a um array de 2 posições
        arrayInt[1] = new int[]{1, 2, 3}; // quero q o array[0] faça referência a um array de 3 posições
        arrayInt[2] = new int[6]; // quero q o array[0] faça referência a um array de 6 posições

        for(int[] arrayBase: arrayInt){
            System.out.println("\n-----");
            for (int num: arrayBase){
                System.out.print(num + " ");
            }
        }
        //outra forma de inicializar
        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};
    }
}
