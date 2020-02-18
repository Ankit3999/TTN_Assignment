// Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails
// which provide there specific details like rateofinterest etc,print details of every banks
import java.io.*;
import java.util.Scanner;
public class Q11 {
    private float interest=0.0f;
    class SBI{
        void getDetails(){
            System.out.println("___Welcome to SBI___");
            interest=12.0f;
            System.out.println("Rate of interest is: "+interest);
        }
    }
    class BOI{
        void getDetails(){
            System.out.println("___Welcome to BOI___");
            interest=15.0f;
            System.out.println("Rate of interest is: "+interest);
        }
    }
    class ICICI{
        void getDetails(){
            System.out.println("___Welcome to ICICI___");
            interest=19.0f;
            System.out.println("Rate of interest is: "+interest);
        }
    }

    public static void main(String[] args) {
        Q11 obj=new Q11();
        obj.new SBI().getDetails();
        obj.new BOI().getDetails();
        obj.new ICICI().getDetails();
    }
}
