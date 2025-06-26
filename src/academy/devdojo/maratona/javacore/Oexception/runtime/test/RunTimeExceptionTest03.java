package academy.devdojo.maratona.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
        //exemplo de cenário onde deve se fechar um recurso para nn ficar ocupando memória
        //exemplificada pelo sout, caso estore um exceção, a linha 16 nn seria executada
        //portanto, ficaria um recurso aberto, isso com milhoes de usuários poderia dar ruim
        // por isso o bloco finally, q SEMPRE vai ser executado
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            //System.out.println("Fechando recurso liberado pelo SO");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
}
