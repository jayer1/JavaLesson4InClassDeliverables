/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdates;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dateTime;
import com.sun.xml.internal.ws.util.StringUtils;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ayerj
 */
public class Testdates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        Date date = new Date(117, 8, 21);
        //System.out.println("date " + date);

        LocalDate date2 = LocalDate.of(2017, 9, 21);
        //System.out.println("date2 " + date2);

        LocalDate today = LocalDate.now();
        //System.out.println("today " + today);

        LocalTime time = LocalTime.of(13, 45, 20);
        //System.out.println("time " + time);

        LocalTime current = LocalTime.now();
        //System.out.println("current " + current);

        Instant i1 = Instant.ofEpochSecond(3);
        //System.out.println("instant " + i1);

        Period tenDays = Period.ofDays(10);
        //System.out.println("tenDays " + tenDays);

        Period threeWeeks = Period.ofWeeks(3);
        //System.out.println("threeWeeks " + threeWeeks);

        Period twoYearsSixMonthsOneDay = Period.of(2, 6, 1);
        //System.out.println("twoYearsSixMonthsOneDay " + twoYearsSixMonthsOneDay);

        LocalDate joshuaTreeDate = LocalDate.of(1987, 3, 9);
        //System.out.println("U2date " + joshuaTreeDate);

        LocalDate rattleAndHumDate = LocalDate.of(1988, 10, 10);
        //System.out.println("rattleAndHumDate " + rattleAndHumDate);

        LocalDate today2 = LocalDate.now();
        //System.out.println("today2 " + today2);

        Period p1 = Period.between(joshuaTreeDate, today2);
        Period p2 = Period.between(joshuaTreeDate, rattleAndHumDate);
        LocalDate chDate = rattleAndHumDate.plusYears(p2.getYears());
        chDate = chDate.plusMonths(p2.getMonths());
        chDate = chDate.plusDays(p2.getDays());
        System.out.println("\nU2 deliverable p 32 from slides");
        System.out.println("It has been " + p1.getYears() + " years " + p1.getMonths() + " months " + p1.getDays() + " days since U2's Joshua Tree was released.");
        System.out.println("It has been " + p2.getYears() + " year " + p2.getMonths() + " months " + p2.getDays() + " days between Joshua Tree and Rattle and Hum.");
        System.out.println("The album after Rattle and Hum came out on " + chDate);

        System.out.println("\nNBA deliverable p 47 from slides");
        System.out.print("Enter your favorite pro basketball team: ");
        String favorite = keyboard.nextLine().toUpperCase();
        String threeChars = favorite.substring(0, 3);
        //System.out.println(threeChars);

        for (Team t : Team.values()) {
            if (t.name().contains(favorite)) {
                printTeam(t.name());
                //System.out.println(t.name());
            }
        }

        System.out.println("\nData Type Conversion deliverable p 55 from slides");
        System.out.print("Please enter a number: ");
        String number = keyboard.nextLine();

        //System.out.println("Max value of byte " + Byte.MAX_VALUE);
        //System.out.println("Min value of byte " + Byte.MIN_VALUE);
        byte bVal = 0;
        int iVal = 0;
        short sVal = 0;
        long lVal = 0;
        double dVal = 0;
        float fVal = 0;
        String msg = "";

        try {

            Float myFloat = Float.parseFloat(number);
            if ((myFloat <= Float.MAX_VALUE) && (myFloat >= Double.MIN_VALUE)) {
                fVal = (float) myFloat;
                msg = "Number is a Float ";
            }

        } catch (Exception e) {

        }

        try {

            Double myDouble = Double.parseDouble(number);
            if ((myDouble <= Double.MAX_VALUE) && (myDouble >= Double.MIN_VALUE)) {
                dVal = (double) myDouble;
                msg = "Number is a Double ";
            }

        } catch (Exception e) {

        }

        try {
            Long myLong = Long.parseLong(number);

            if ((myLong <= Long.MAX_VALUE) && (myLong >= Long.MIN_VALUE)) {
                lVal = (long) myLong;
                msg = "Number is a Long ";
            }
        } catch (Exception e) {

        }

        try {
            Short myShort = Short.parseShort(number);

            if ((myShort <= Short.MAX_VALUE) && (myShort >= Short.MIN_VALUE)) {
                sVal = (short) myShort;
                msg = "Number is a Short ";
            }
        } catch (Exception e) {

        }

        try {
            Integer myint = Integer.parseInt(number);

            if ((myint <= Integer.MAX_VALUE) && (myint >= Integer.MIN_VALUE)) {
                iVal = (int) myint;
                msg = "Number is an Integer ";
            }
        } catch (Exception e) {

        }

        try {

            Byte myByte = Byte.parseByte(number);
            if ((myByte <= Byte.MAX_VALUE) && (myByte >= Byte.MIN_VALUE)) {
                bVal = (byte) myByte;
                msg = "Number is a Byte ";
            }

        } catch (Exception e) {

        }

        printTeam(msg);

    }

    public static void printTeam(String n) {
        System.out.println(n);
    }
}
