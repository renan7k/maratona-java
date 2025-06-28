package academy.devdojo.maratona.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        System.out.println(bundle.getString("ola")); //Aqui é o valor que bate no arquivo message do src
        System.out.println(bundle.getString("bom.dia"));

        //Aqui é como se o usuário trocasse o idioma
       bundle = ResourceBundle.getBundle("message", new Locale("en", "US"));
        System.out.println(bundle.getString("ola"));
        System.out.println(bundle.getString("bom.dia"));


    }
}
