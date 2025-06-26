package academy.devdojo.maratona.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        }catch (IOException e) { // e|ex é a cariável de referência do objeto da exception
            //NUNCA DEIXAR ESSE BLOCO EM BRANCO, pq ngm estaria sendo avisado da exceção
            e.printStackTrace();
        }
    }

}
