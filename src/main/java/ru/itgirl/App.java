package ru.itgirl;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //System.out.println( "Hello World!" );
        System.out.println("Enter day of week");
        Scanner inputDay = new Scanner(System.in);
        String day = inputDay.next();

        switch (day) {
            case "MONDAY","monday", "Monday":
                System.out.println("сегодня понедельник");
                break;
            case "TUESDAY", "tuesday", "Tuesday":
                System.out.println("сегодня вторник");
                break;
            case "WEDNESDAY", "Wednesday", "wednesday":
                System.out.println("сегодня среда");
                break;
            case "THURSDAY", "Thursday", "thursday":
                System.out.println("сегодня четверг");
                break;
            case "FRIDAY", "Friday","friday" :
                System.out.println("сегодня пятница");
                break;
            case "SATURDAY", "Saturday", "saturday":
                System.out.println("сегодня суббота");
                break;
            case "SUNDAY", "Sunday", "sunday":
                System.out.println("сегодня воскресенье");
                break;
            default:
                throw new RuntimeException();
        }
    }
}
