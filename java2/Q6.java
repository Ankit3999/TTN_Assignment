package java2;
// 6. WAP showing try, multi-catch and finally blocks.
public class Q6 {
    public static void main(String[] args) {
        try{
            int a=10, b=0;
            System.out.println(a/b);
            int arr[]={1,2,3,4};
            System.out.println(arr[6]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Error: Array is out of bound");
        }
        catch (ArithmeticException e){
            System.out.println("Error: Dividing by zero");
        }
        catch (Exception e){
            System.out.println("Error: Exceptions found");
        }
        finally {
            System.out.println("Finally block: End of the code");
        }
    }
}
