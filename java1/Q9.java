// Q9.Write a program to display values of enums using a constructor & getPrice() method
// (Example display house & their prices)
import jdk.nashorn.internal.runtime.regexp.joni.ast.BackRefNode;

import java.io.*;
import java.util.Scanner;
class test1{
    enum Status {
        House(1000),
        Hut(1500),
        Hotel(2500),
        Building(1300),
        Farmhouse(1800),
        Barn(2700),
        Lighthouse(9000);

        private int value;

        Status(int value) {
            this.value = value;
        }

        public int getPrice() {
            return this.value;
        }
    }
    int p;
    test1(Status v) {
        Status myVar = v;

        switch (myVar) {
            case House:
                System.out.println("Price is : " + myVar.getPrice());
                break;
            case Hut:
                System.out.println("Price is : " + myVar.getPrice());
                break;
            case Hotel:
                System.out.println("Price is : " + myVar.getPrice());
                break;
            case Building:
                System.out.println("Price is : " + myVar.getPrice());
                break;
            default:
                System.out.println("404 not found");
                break;
        }
    }
}
public class Q9 {
    public static void main(String[] args) {
        test1 obj=new test1(test1.Status.Hut);
    }
}
