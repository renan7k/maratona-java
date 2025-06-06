package academy.devdojo.maratona.java.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //Laços de repetição, While, Do while, for - Feito para iterar algo
        //Sempre resultam num booleano. Ex: enquanto i <= 2
        //Sempre é necessário trocar o estado da variável (i++)
        int count = 0;
        while(count < 10){
            System.out.println(count);
            count += 1;
        }

        //A diferença do while para o do while, é que a 2º opção vai executar pelo menos 1 vez
        int count1 = 12;
        do{
            System.out.println("dentro do do-while :" + count1);
            count++;
        }while (count1 < 10);

        //for trabalha com índices
        for(int i=0; i<10 ; i++){
            System.out.println("For "+i);
        }
    }
}
