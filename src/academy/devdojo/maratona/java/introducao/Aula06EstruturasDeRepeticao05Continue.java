package academy.devdojo.maratona.java.introducao;

//Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
//Condição valorParcela >= 1000
//Mesmo exercício da aula anterior, porém usando continue no lugar do break

public class Aula06EstruturasDeRepeticao05Continue {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int)valorTotal; parcela >= 1 ; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000){
                continue;
            }//Enquanto a parcela for menor que 1000, o for irá continuar e não irá executar a linha abaixo
            System.out.println("Parcela "+parcela+" R$ "+valorParcela);
        }
    }
}
