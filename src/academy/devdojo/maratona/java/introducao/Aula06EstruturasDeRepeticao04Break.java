package academy.devdojo.maratona.java.introducao;

public class Aula06EstruturasDeRepeticao04Break {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+parcela+" R$ "+valorParcela);
//            Mesmo código de cima, com a lógica invertida . Desta forma acrescenta +4 linhas
//            if(valorParcela >= 1000){
//                System.out.println("Parcela "+parcela+" R$ "+valorParcela);
//            }else{//Se nn colocasse o break, o código iria executar 30k vezes
//                break;
//            }
//            System.out.println("Fora do if, mas dentro do for"+parcela);

        }
    }
}
