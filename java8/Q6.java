package java8;
//Create and access default and static method of an interface.
interface staticInterface{
    static void display(){
        System.out.println("this is from static method");
    }
    default void print(){
        System.out.println("this is from default method");
    }
}
public class Q6 implements staticInterface{
    public static void main(String[] args) {
        Q6 obj=new Q6();
        staticInterface.display();
        obj.print();
    }
}
