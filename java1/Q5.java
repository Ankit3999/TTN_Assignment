//Q5. Find common elements between two arrays.
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("first array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("second array size: ");
        int m = sc.nextInt();
        int arr1[] = new int[m];
        System.out.println("second array elements: ");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        List<Integer> commonElements = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i] == arr1[j]) {
                    if (!commonElements.contains(arr[i]))
                        commonElements.add(arr[i]);
                }
            }
        }
        Iterator<Integer> itr = commonElements.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
