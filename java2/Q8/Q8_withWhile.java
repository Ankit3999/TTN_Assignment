package java2;

import java.util.Scanner;

//8. WAP to read words from the keyboard until the word done is entered. For each word except done,
// report whether its first character is equal   to  its last character. For the required loop, use a
//a)while statement
//b)do-while statement
public class Q8_withWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String s=sc.next();
        s.toLowerCase();
        if(s.equals("done")){
            System.out.println("Error: no words entered");
            System.exit(0);
        }
        else{
            checkChar(s);
        }
        while(!(s=sc.next()).equals("done")){
            checkChar(s);
        }
    }
    static void checkChar(String s){
        Character first=s.charAt(0);
        Character last=s.charAt(s.length()-1);
        if(first.equals(last)){
            System.out.println("First and last characters of "+s+" are same");
        }
        else{
            System.out.println("First and last characters of "+s+" are not same");
        }
    }
}
