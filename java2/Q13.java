package java2;

import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;
class CheckAge extends RuntimeException{
    private boolean flag=false;
    CheckAge(String msg, boolean flag){
        super(msg, null, flag, !flag);
    }
}
public class Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        try{
            if(age<18)
                throw new CheckAge("You are not eligible", true);
        }
        catch (CheckAge c){
            c.printStackTrace();
        }

    }
}
