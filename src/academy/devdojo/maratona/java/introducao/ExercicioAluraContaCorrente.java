package academy.devdojo.maratona.java.introducao;

import java.util.Scanner;

public class ExercicioAluraContaCorrente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeCliente = "Renan Dias";
        String tipoDeConta = "Conta Corrente";
        double saldoDaConta = 2000.50;
        int opcao = 0;
        String extratoConta = """
                ***********************************
                ********EXTRATO DA CONTA***********
                Nome: %s
                Tipo conta: %s
                Saldo Atual: R$ %.2f
                ***********************************
                """.formatted(nomeCliente, tipoDeConta, saldoDaConta);

        System.out.println(extratoConta);

        String menu = """
                1 - Consultar saldo
                2 - Transferir valor
                3 - Depositar valor
                4 - Sair
                Digite sua opção:
                """;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = input.nextInt();
            double valor = 0;
            switch (opcao){
                case 1:
                    System.out.println("O saldo atual da conta é de: R$ " + saldoDaConta);
                    System.out.println("----------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Digite o valor da transferência:");
                    valor = input.nextDouble();
                    if(valor > saldoDaConta){
                        System.out.println("Não existe saldo suficiente para essa transferência.");
                        System.out.println("----------------------------------------------------");
                    }else{
                        saldoDaConta -= valor;
                        System.out.println("Transferência realizada com sucesso.");
                        System.out.println("----------------------------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor depositado:");
                    valor = input.nextDouble();
                    saldoDaConta += valor;
                    System.out.println("Valor depositado com sucesso.");
                    System.out.println("----------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Saindo do programa ...");
                    System.out.println("----------------------------------------------------");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    System.out.println("----------------------------------------------------");
                    break;
            }
        }

    }
}
