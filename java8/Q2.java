package java8;
//Create a functional interface whose method takes 2 integers and return one integer.
interface sum{
    int sum(int a,int b);
}
public class Q2 {

    public static void main(String[] args) {
        sum sum=(a,b)->{return a+b;};
        System.out.println(sum.sum(10,20));
    }
}
