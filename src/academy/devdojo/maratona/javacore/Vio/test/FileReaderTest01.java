package academy.devdojo.maratona.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//a função read retorna um inteiro, que corresponde a uma letra em decimal.Ex: A - 65
//Isso se nn usar o array
//Se usar array, retorna a quantidade de caracteres lidos
public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fr = new FileReader(file)){
//            char[] in = new char[1];
//            fr.read(in);
//            for (char c : in) {
//                System.out.println(c);
//            }
            int i;
            while((i= fr.read()) != -1){
                System.out.print((char)i); //se imprimir só o i, vai vir o numero q corresponde a letra , por isso o casting
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
