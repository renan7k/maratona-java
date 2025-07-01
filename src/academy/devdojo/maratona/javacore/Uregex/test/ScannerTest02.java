package academy.devdojo.maratona.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Erenm,Mikasa,true,200";
        Scanner scanner = new Scanner(texto); //delimitador padrão da scanner é o espaço " "
        scanner.useDelimiter(","); //aqui estamos trocanco o delimitador

        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Int "+i);
            }else if(scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean "+b);
            }else{
                System.out.println(scanner.next());
            }
        }

    }
}
