//Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
import java.io.*;
import java.util.Scanner;
import java.lang.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=s.length();
        int scount=0,ccount=0,ncount=0,spcount=0;
        for(int i=0;i<count;i++){
            if(Character.isLowerCase(s.charAt(i)))
                scount++;
            else if(Character.isUpperCase(s.charAt(i)))
                ccount++;
            else if(Character.isDigit(s.charAt(i)))
                ncount++;
            else
                spcount++;
        }
        //System.out.println(scount+" "+ccount+" "+ncount+" "+spcount);
        double d=(scount*100.0)/count;
        System.out.println("lower case letters count is "+scount+" and percentage is "+d);
        d=(ccount*100.0)/count;
        System.out.println("upper case letters count is "+ccount+" and percentage is "+d);
        d=(ncount*100.0)/count;
        System.out.println("numbers count is "+ncount+" and percentage is "+d);
        d=(spcount*100.0)/count;
        System.out.println("special characters count is "+spcount+" and percentage is "+d);
    }
}
