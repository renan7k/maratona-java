package academy.devdojo.maratona.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

//Classe parecida com a date, só que com nano segundos
//imutável
public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
    }
}
