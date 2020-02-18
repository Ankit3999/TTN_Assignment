//Q3. Write a program to find the number of occurrences of a character in a string without using loop?
import java.io.*;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer();
        Scanner sc=new Scanner(System.in);
        a.append(sc.nextLine());
        String temp = sc.nextLine();
        if(temp.length()==1) {
            int slength = a.length();
            String n = "";
            if (a.toString().contains(temp))
                n = a.toString().replace(temp, "");
            int nlenth = n.length();
            System.out.println("occurence of char: " + temp + " is " + (slength - nlenth));
        }
        else
            System.out.println("Enter a single character");
    }
}
