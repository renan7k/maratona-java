package academy.devdojo.maratona.javacore.Rdatas.test;

import java.util.Date;
//Classe date nn é muito utilizada, deve encontrar em sistemas legados
//a maioria dos metodos estão obsoletos
public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1750964077188L); //trabalha com milissegundos - lomg 100000
        System.out.println(date);
        //System.out.println(date.getTime());
    }
}
