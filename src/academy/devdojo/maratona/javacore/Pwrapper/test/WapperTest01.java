package academy.devdojo.maratona.javacore.Pwrapper.test;

//Wrapper nada mais é do q objetos que vão encapsular os tipos primitivos
public class WapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'P';
        boolean booleanP = false;

        //wrapper encapsula os tipos primitivos e transforma em objeto
        //Basicamente, necessita começar o tipo com letra miúscula (exceto int e char)
        // quando passar os valores por referência, igual objeto

        //autoboxing - QUANDO o java faz a conversão automática
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; //unboxing
        //Com wrapper, existe a possibilidade de usar metodos
        Integer intW2 = Integer.parseInt("1"); //vai fazer o parse de string para int

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
    }
}
