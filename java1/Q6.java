//Q6. There is an array with every element repeated twice except one. Find that element
public class Q6 {
    public static void main(String[] args) {
        int a[]={1,1,2,2,5,3,3};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]) {
                    a[j] = -1;
                    break;
                }
                if(a[i]!=-1)
                    System.out.println(a[i]);
            }
        }
    }
}
