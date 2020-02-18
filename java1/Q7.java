// Q7. Write a program to print your Firstname,LastName & age using static block,static method & static variable
// respectively
import java.io.*;
import java.util.Scanner;
class test{
    static int roll;
    static String fname;
    static String lname;

    public static int getRoll() {
        return roll;
    }

    public static void setRoll(int roll) {
        test.roll = roll;
    }

    public static String getFname() {
        return fname;
    }

    public static void setFname(String fname) {
        test.fname = fname;
    }

    public static String getLname() {
        return lname;
    }

    public static void setLname(String lname) {
        test.lname = lname;
    }

    static void print(){
        System.out.println("roll is: "  +getRoll());
        System.out.println("first name is: " +getFname());
        System.out.println("last name is: " +getLname());
    }
    static {
        System.out.println("Your details are as following:");
    }
}
public class Q7 {
    public static void main(String[] args) {
    test obj=new test();
    obj.setRoll(3999);
    obj.setFname("ankit");
    obj.setLname("sagar");
    obj.print();
    }
}