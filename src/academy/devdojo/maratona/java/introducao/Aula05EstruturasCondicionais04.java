package academy.devdojo.maratona.java.introducao;

//Exercício
//Com base em uma renda, informar qual o percentual de taxa será pago anualmente por um trabalhador na holanda
// De 0,00    A 34.712  - 9,70%
// De 34.713  A 68.507  - 37,35%
// De 68.508  A ~~~~~   - 49.50%

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 45000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        double valorLiquido;
        
        if(salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaixa;
            valorLiquido = salarioAnual - valorImposto;
        }else if (salarioAnual >= 34713 && salarioAnual <= 68507 ){
            valorImposto = salarioAnual * segundaFaixa;
            valorLiquido = salarioAnual - valorImposto;
        }else{
            valorImposto = salarioAnual * terceiraFaixa;
            valorLiquido = salarioAnual - valorImposto;
        }
        System.out.println("O valor pago de imposto anual é de: "+valorImposto+" , e o valor liquido é de: "+valorLiquido);
    }
}
