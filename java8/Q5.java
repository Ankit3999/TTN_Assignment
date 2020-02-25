package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Implement following functional interfaces from java.util.function using lambdas:
//(1) Consumer  (2) Supplier  (3) Predicate  (4) Function
interface consumerInterface{
    void consumerMethod();
}
public class Q5 {
    public static void main(String[] args) {
        //Consumer
        Consumer consumer=(e)->{
            System.out.println("Welcome to "+e);
        };
        consumer.accept("TTN");
        //Supplier
        Supplier supplier=()->{
            return "Content of Supplier";
        };
        System.out.println(supplier.get());
        //Predicate
        Predicate<Integer> predicate=(e)->{
            return e%2==0;
        };
        System.out.println(predicate.test(21));
        //Function
        Function<Integer, Integer> function=(e)-> e/=2;
        function=function.andThen(e->e*2);
        System.out.println(function.apply(25));

    }
}
