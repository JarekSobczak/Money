package com.sda.projects.money;

import java.time.LocalDate;

public class DateChecker {

    public boolean checkDate(String date) {

        String parameter = "\\d{4}-\\d{2}-\\d{2}";
        if (!date.matches(parameter) || LocalDate.parse(date).isAfter(LocalDate.now())) {
            return false;
        }
        return true;
    }
}
