package academy.devdojo.maratona.java.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        //Implementando lógicaa no próprio IF
        int idade = 17;
        if(idade >= 18){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("NÃO Autorizado a comprar bebida alcólica");
        }
        //Implementando lógica na variável
        int idade1 = 15;
        boolean isAutorizadoTirarHabilitacao = idade1 >= 18;
        if(isAutorizadoTirarHabilitacao){
            System.out.println("Autorizado a tirar habilitação!");
        }
        // Operador de negação - usar "!" ou "==false" funciona da mesmaa forma
        if(!isAutorizadoTirarHabilitacao){
            System.out.println("NÃO autorizado a tirar habilitação!");
        }
    }
}
