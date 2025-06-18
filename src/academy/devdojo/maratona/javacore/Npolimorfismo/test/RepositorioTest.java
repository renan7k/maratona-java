package academy.devdojo.maratona.javacore.Npolimorfismo.test;


import academy.devdojo.maratona.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratona.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

    }
}
