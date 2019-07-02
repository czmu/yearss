import java.util.Scanner;

public class yearss {
    public static void main(String[]args) {
        double age;
        int year,month, day, hour,minute;
        Scanner scnr= new Scanner(System.in);
        System.out.print("please input the year you were born: ");
        year=scnr.nextInt();
        year=2019-year;

        System.out.print("please input the month you were born: ");
        month=scnr.nextInt();
        month=12-month;

        System.out.print("please input the day you were born: ");
        day=scnr.nextInt();
        day=30-day;

        System.out.print("please input the hour you were born(in 24-hour format): ");
        hour=scnr.nextInt();
        hour=24-hour;

        System.out.print("please input the minute you were born: ");
        minute=scnr.nextInt();
        minute=24-minute;

        System.out.print("you have lived");
        System.out.print(year + " years");
        System.out.print(month + " months");
        System.out.print(day + " days");
        System.out.print(hour + " hours");
        System.out.print(minute + " minute");



    }
}
