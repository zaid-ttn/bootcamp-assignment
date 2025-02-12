package javafeatures;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TakeDate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter first date in format dd/MM/yyyy");
        String date1= sc.nextLine();
        System.out.println("Enter end date");
        String date2= sc.nextLine();
        LocalDate parse1=LocalDate.parse(date1,formatter);
        LocalDate parse2=LocalDate.parse(date2,formatter);
        System.out.println(parse1);
        System.out.println(parse2);
        if(parse1.isBefore(parse2)){
            System.out.println("First Date is before Second Date");
        }else{
            System.out.println("First date is after Second date");
        }
        //part 2
        ZonedDateTime indiaTime= ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime japanTime=ZonedDateTime.now(ZoneId.of("Japan"));
        ZonedDateTime canadaTime=ZonedDateTime.now(ZoneId.of("Canada/Saskatchewan"));
        System.out.println("Time in india -"+indiaTime);
        System.out.println("Time in Japan -"+japanTime);
        System.out.println("Time in Canada -"+canadaTime);


    }
}
