//Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?
import java.io.*;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        String arr[]=s.split(" ");
        int count=0;
        for(int i=0;i<arr.length;i++){
            count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                    arr[j]="0";
                }
            }
            if(count > 1 && arr[i] != "0")
                System.out.println(arr[i]);
        }
    }
}
