package java2;
// 3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
public class Q3_ClassNotFoundException {
    public static void main(String[] args) {
        try{
            Class.forName("ankit.class");
        }
        catch (Exception e){
            System.out.println(e+" class not found");
        }
    }
}
