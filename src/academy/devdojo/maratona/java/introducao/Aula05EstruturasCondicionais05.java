package academy.devdojo.maratona.java.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo
        byte dia = 5;

        //No switch, entre (), só podemos passar char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
