package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class FuncoesFuncionario {
    public void imprime (Funcionario funcionario){
        System.out.println("Nome: " + funcionario.nome );
        System.out.println("Idade: " + funcionario.idade);
        for (double salario: funcionario.salarios){
            System.out.println(salario + " ");
        }
    }

    public void mediaSalarial (Funcionario funcionario){
        double media = 0;
        //for comum
        //for (int i = 0; i < funcionario.salarios.length ; i++) {
        //    media += funcionario.salarios[i];
        // }
        //forEach
        for(double salario : funcionario.salarios){
            media += salario;
        }
        media = media / funcionario.salarios.length;
        System.out.println("A média salárial é de: R$" + media);
    }
}
