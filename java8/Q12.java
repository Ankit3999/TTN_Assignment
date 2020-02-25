package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find the first even number in the integer list which is greater than 3.
public class Q12 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4);
        System.out.println(list.stream().filter(e->e>3).filter(e->e%2==0).findFirst().orElse(0));
    }

}
