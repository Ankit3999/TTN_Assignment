// Q8. Write a program to reverse a string and remove character from
// index 4 to index 9 from the reversed string using String Buffer
import java.io.*;
import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        a.append(sc.nextLine());
        a.reverse();
        a.replace(3,8,"");
        System.out.println("new string is: "+a.toString());
    }
}
