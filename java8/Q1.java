package java8;
//Write the following a functional interface and implement it using lambda:
interface Greater{
    boolean method(int a, int b);
}
interface incre{
    int method(int a);
}
interface concat{
    String method(String a,String b);
}
interface upper{
    String method(String a);
}
public class Q1 {
    public static void main(String[] args) {
        Greater g=(a,b)->{
                if(a>b) return true;
                else return false;
        };
        incre i=a -> {return ++a;};
        concat c=(a,b)-> {return a.concat(b);};
        upper u=(a) -> {return a.toUpperCase();};
        boolean b=g.method(10,15);
        int var=i.method(20);
        String s=c.method("Hello", "World");
        String s1=u.method("ankit");
        System.out.println(b);
        System.out.println(var);
        System.out.println(s);
        System.out.println(s1);
    }
}