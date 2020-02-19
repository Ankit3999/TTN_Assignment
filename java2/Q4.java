package java2;
// 4. WAP to create singleton class.
public class Q4 {
    private static Q4 obj=null;
    String s="";
    private Q4(){
        s="This is private constructor";
    }
    static Q4 smethod(){
        if(obj==null) {
            System.out.println("object created");
            obj = new Q4();
        }
        return obj;
    }
}
class singleton{
    public static void main(String[] args) {
        Q4 obj1= Q4.smethod();
        Q4 obj2=Q4.smethod();
        System.out.println(obj1.s);
        System.out.println(obj2.s);
    }
}
