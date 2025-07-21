package academy.devdojo.maratona.javacore.Xserializacao.test;

import academy.devdojo.maratona.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratona.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Renan Dias", "Teste12345");
        Turma turma = new Turma("Maratona Java");
        aluno.setTurma(turma);
        //Desafio: Salvar o estado desse objeto num arquivo, e depois ler
        serializar(aluno);
        deserializar();
    }
    //serializar é transformar um objeto em um array de bytes(baixo nível)
    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch (IOException e ){
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch (IOException |  ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
