//Q1. Write a program to replace a substring inside a string with other string ?
import java.io.*;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer();
        Scanner sc=new Scanner(System.in);
        a.append(sc.nextLine());
        System.out.println("enter two strings to remove and append");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(a.toString().indexOf(s1)!=-1){
            System.out.println("after appending: "+a.toString().replace(s1,s2));
        }
        else{
            System.out.println(s1+"not found in string"+a.toString());
        }

    }
}
