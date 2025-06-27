package academy.devdojo.maratona.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

//Mais simples que a classe dateFormat
//O objetivo dessa classe, é trabalhar com a formatação de datas um pouco mais flexível que a dateFormat
public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String mascara = "yyyy.MM.dd G 'at' HH:mm:ss z"; //mascara da documentacao. Tudo q está em aspas simples, é desconsiderado pelo dateFormat
        //Essa mascara pode ser bem customizada
        SimpleDateFormat sdf = new SimpleDateFormat(mascara);
        System.out.println(sdf.format(new Date()));

    }
}
