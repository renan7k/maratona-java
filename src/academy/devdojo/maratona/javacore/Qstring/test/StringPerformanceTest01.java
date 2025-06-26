package academy.devdojo.maratona.javacore.Qstring.test;

//Aqui vamos comparar as performances entre metodos criados, e fornecidos pelo java

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis(); //pegando o milissegundo de inicio da execução
        concatString(100_000);
        long fim = System.currentTimeMillis(); //pegando o milissegundo de fim da execução
        System.out.println("Tempo gasto para String: " + (fim - inicio) + "ms");
        System.out.println("----------------------------------------------------");

        inicio = System.currentTimeMillis(); //pegando o milissegundo de inicio da execução
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis(); //pegando o milissegundo de fim da execução
        System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + "ms");
        System.out.println("----------------------------------------------------");

        inicio = System.currentTimeMillis(); //pegando o milissegundo de inicio da execução
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis(); //pegando o milissegundo de fim da execução
        System.out.println("Tempo gasto para StringBuffer: " + (fim - inicio) + "ms");

        //Quando devemos usar String, StringBuilder ou StringBuffer?
        //Na maioria das vezes, vamos usar String, pq é o q representa o mundo real
        //os outros 2, são mais para os cenários onde a performance vai estar impactada

    }
    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i; //0, 01, 012, 0123
        }
    }
    //Tem q analisar, pq dependendo das Strings, e qtd de usuários, a performance pode cair muito
    //Pensando nisso, o java criou algumas classes para ajudar nisso, por exemplo: String builder
    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i); //0, 01, 012, 0123
        }
    }
    //Tbm existe o recurso do java para trabalhar com múltiplas threads emúltiplos recursos
    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i); //0, 01, 012, 0123
        }
    }

}
