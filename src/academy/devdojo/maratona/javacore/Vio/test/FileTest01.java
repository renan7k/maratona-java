package academy.devdojo.maratona.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;


public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile(); //o metodo retorna um booleano
            System.out.println("Created "+isCreated);
            System.out.println("path: "+file.getPath());
            System.out.println("path absolute: "+file.getAbsolutePath());
            System.out.println("is file: "+file.isDirectory());
            System.out.println("is hidden: "+file.isHidden());
            System.out.println("last modified: "+file.lastModified()); //retorno em long milissegundos
            System.out.println("last modified: "+ new Date(file.lastModified())); //convertendo para data
            System.out.println("last modified: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault())); //conversao usando instant



            boolean exists = file.exists();
            if(exists){
                System.out.println("Deleted "+file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
