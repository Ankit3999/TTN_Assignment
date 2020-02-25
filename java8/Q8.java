package java8;
//Implement multiple inheritance with default method inside  interface.
interface multInherit1{
    default void show(){
        System.out.println("from interface one");
    }
}
interface multInherit2{
    default void show(){
        System.out.println("from interface two");
    }
}
public class Q8 implements multInherit1, multInherit2{
    @Override
    public void show(){
        multInherit1.super.show();
        multInherit2.super.show();
    }

    public static void main(String[] args) {
        Q8 obj=new Q8();
        obj.show();
    }
}
