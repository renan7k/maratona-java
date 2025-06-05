package academy.devdojo.maratona.java.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000

        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDooar = "Ainda não tenho condições";

        //Operador ternário
        //String resultado = (condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDooar;
        System.out.println(resultado);
    }
}
