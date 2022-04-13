package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Day {

    public static void getDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате yyyy-MM-dd");
        String dateInput = scanner.next();
        String[] date = dateInput.split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        LocalDate userDate = LocalDate.of(year, month, day);
        System.out.println(userDate.getDayOfWeek());
    }
}
