package java8.datas;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class ExemplosDatasHoras {
    public static void main(String[] args) {
        // Instant é o tempo contabilizado desde 01/01/1970 às 00:00:00.

        Instant instant = Instant.now(); //
        Instant start = Instant.MIN;
        System.out.println(instant.getEpochSecond());
        Instant instantDataZero = Instant.ofEpochSecond(0);
        System.out.println(instantDataZero);



        //LocalDates

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);


        //Zoned Time

        ZoneId timEZoneSaoPaulo = ZoneId.of("America/Sao_Paulo");
        ZoneId timEZoneNovaYork = ZoneId.of("America/New_York");

        LocalDateTime saidaDeSaoPauloSemFusoHorario = LocalDateTime.of(2014, Month.APRIL, 4, 22, 30);
        LocalDateTime chegadaEmNovaYorkSemFusoHorario = LocalDateTime.of(2014, Month.APRIL, 5, 7, 10);

        ZonedDateTime saidaDeSaoPauloComFusoHorario = ZonedDateTime.of(saidaDeSaoPauloSemFusoHorario, timEZoneSaoPaulo);
        System.out.println(saidaDeSaoPauloComFusoHorario);

        ZonedDateTime chegadaEmNovaYorkComFusoHorario = ZonedDateTime.of(chegadaEmNovaYorkSemFusoHorario, timEZoneNovaYork);
        System.out.println(chegadaEmNovaYorkComFusoHorario);

        Duration duracaoDoVoo = Duration.between(saidaDeSaoPauloComFusoHorario, chegadaEmNovaYorkComFusoHorario);
        System.out.println(duracaoDoVoo);



        // Formatter

        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(hoje.format(formatador));
        System.out.println(hoje);




        Calendar calendario = new Calendar.Builder().
                setDate(2014, Calendar.APRIL, 8)
                .setTimeOfDay(10, 2, 57)
                .setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"))
                .setLocale(new Locale("pt", "br")) .build();
    }
}
