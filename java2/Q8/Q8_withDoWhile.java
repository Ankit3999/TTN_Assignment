package java2;

import java.util.Scanner;

public class Q8_withDoWhile {
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
            do{
                Character first=s.charAt(0);
                Character last=s.charAt(s.length()-1);
                if(first.equals(last)){
                    System.out.println("First and last characters of "+s+" are same");
                }
                else{
                    System.out.println("First and last characters of "+s+" are not same");
                }

            }while (!(s=sc.next()).equals("done"));
        }
    }
}
