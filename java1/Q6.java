//Q6. There is an array with every element repeated twice except one. Find that element
import java.util.*;
public class Q6 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("elements of the array are:");
        int a[]={1,2,1,2,5,3,3,4,4};
        for(int i=0;i<a.length;i++) {
            int count=0;
            for(int j=0;j<a.length;j++) {
                if(a[i]==a[j]) {
                count++;
            }
        }
            if(count==1) {
                System.out.println("unique element is "+a[i]);
                break;
            }
        }
    }
}