package academy.devdojo.maratona.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

// of para criar um horário espercífico, e now para o horário atual
public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12); //As hrs só vai até 23
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        //metodos
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));

        System.out.println(LocalTime.MIN);
    }
}
