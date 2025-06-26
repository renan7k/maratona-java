package academy.devdojo.maratona.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }


    //quando colocamos trhow IOException na assinatura do metodo, quem chamar, terá q tratar a exception
    //Ou colocondo try/catch, ou passando para frente
    //se for um metodo privado, a maior chance é usar tryCatch, pq ngm fora da classe vai poder usar o metodo,
    //então nn teria como a exception ser tratada em outro lugar
    public static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        }catch (IOException e){
            e.printStackTrace();
            throw e; //relançando a exceção
        }
    }

}
