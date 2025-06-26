package academy.devdojo.maratona.javacore.Oexception.runtime.test;


//runTime excepction nn é obrigado a fazer o tratamento, ex: divisão por 0
public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }
    private static int divisao (int a, int b){
        if(b == 0){
            //throw new RuntimeException("Argumento inválido, não pode dividir por 0");
            throw new IllegalArgumentException("Argumento inválido, não pode dividir por 0");
        }
        return a/b;
        //COM O IF, dispensa o uso do try/ catch
//        try{
//            return a/b;
//        }catch(ArithmeticException e){
//            e.printStackTrace();
//        }
//        return 0;
    }
}
