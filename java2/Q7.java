package java2;

import java.util.Scanner;

// 7. WAP to convert seconds into days, hours, minutes and seconds.
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total seconds");
        int sec=sc.nextInt();
        int temp=sec;
        int days=sec/(24*3600);
        sec=sec%(24*3600);
        int hours=sec/3600;
        sec=sec%3600;
        int min=sec/60;
        sec=sec%50;
        System.out.println("Denominations of "+temp+" seconds are:");
        System.out.println("Days: "+days);
        System.out.println("Hours: "+hours);
        System.out.println("Minutes: "+min);
        System.out.println("Seconds: "+sec);
    }
}
