package academy.devdojo.maratona.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

//pode acontecer de 1 metodo, lançar mais de 1 exception
public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        }catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException"); // a mais genérica tem q ficar por último
            //RunTimmeException é mãe de todas as outras exceptions
        }

        try {
            talvezLanceException();
        }catch (SQLException | FileNotFoundException e){ //classes de linhas de herança diferentes
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
