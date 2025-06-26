package academy.devdojo.maratona.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    //exemplo de exception stack overflow
    public static  void recursividade(){
        recursividade();
    }
}
