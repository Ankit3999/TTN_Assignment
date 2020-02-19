// 2. WAP to sorting string without using string Methods?.
package java2;
import java.io.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence: ");
        String string= sc.nextLine();
        String arr[]=string.split(" ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(compare(arr[i],arr[j])<0){
                    String temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int compare(String str1, String str2){
        int a=0;
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        if (l1 != l2) {
            return l1 - l2;
        }
        else {
            return 0;
        }
    }
}
