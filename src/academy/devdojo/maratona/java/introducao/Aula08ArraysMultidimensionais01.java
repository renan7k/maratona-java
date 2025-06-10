package academy.devdojo.maratona.java.introducao;

//são arrays de arrays, são arrays linkados que podem navegar para qualquer posição
public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //Ex: Cenário onde 1 array possui 12 posições que guardam os meses do ano
        //e o outro array, que a qtd de posições, sejaa a qtd de dias dos meses
        //então o array dias, depende do mês (outro array)
        // o primeiro array [0] possui o endereço de memória, de onde está o outro array
        int [][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        //imprimindo o array com o for
        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]);
            for (int j = 0; j < dias[0].length ; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("----------------------------------");
        //imprimindo o array com o forEach
        for(int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
