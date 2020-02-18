/*Q10.Write a single program for following operation using overloading
        A) Adding 2 integer number
        B) Adding 2 double
        C) multiplying 2 float
        D) multiplying 2 int
        E) concate 2 string
        F) Concate 3 String*/
import java.io.*;
import java.util.Scanner;
class operation{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    float multiply(float a, float b){
        return a*b;
    }
    int multiply(int a, int b){
        return a*b;
    }
    String concate(String a, String b){
        return a+b;
    }
    String concate(String a, String b,String c){
        return a+b+c;
    }
}
public class Q10{
    public static void main(String[] args){
        operation op = new operation();
        System.out.println("Integer sum: "+op.add(324,2232));
        System.out.println("Double sum: "+op.add(2543.3434343434,1222.68686868686));
        System.out.println("Integer multiply: "+op.multiply(123,242));
        System.out.println("float multiply"+op.multiply(243.34f,212.68f));
        System.out.println("Two String concatenation: "+op.concate("Hello ","World"));
        System.out.println("Three String concatenation: "+op.concate("Hey, ","Hi ","There"));


    }
}
