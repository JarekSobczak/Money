package com.sda.projects.money;

import lombok.Setter;

import java.io.IOException;
import java.time.LocalDate;

@Setter
public class NBPSessionService {
    private final DateChecker dateChecker = new DateChecker();
    private String date = LocalDate.now().toString();



    public void showSessionResults() throws IOException, UnproperDateException {
        if (dateChecker.checkDate(date) == true) { String json = ConnectionServiceImpl.connect("http://api.nbp.pl/api/exchangerates/tables/C/" + date + "/?format=json");
            System.out.println("Data sesji : " + date);
            System.out.println("-----------------------");
            JsonConverter.fromJsonToClass(json).getRates()
                    .forEach(c -> System.out.println(c.getCurrency() + " " + c.getCode() + " " +                c.getBid() + " " + c.getAsk()));
            System.out.println();
             } else throw new
                UnproperDateException();
    }
}


