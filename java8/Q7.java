package java8;
//Override the default method of the interface.
interface toOverride{
    default void overriding(){
        System.out.println("Hello, Welcome to CDAC");
    }
}
public class Q7 implements toOverride{
    @Override
    public void overriding(){
        System.out.println("Hello, Welcome to TTN");
    }
    public static void main(String[] args) {
        Q7 obj=new Q7();
        obj.overriding();


    }

}
