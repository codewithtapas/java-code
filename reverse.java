
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        int size;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size  of array:");
       size=sc.nextInt();
       int arr[]=new int[size];
       for (int i = 0; i < arr.length; i++) {
        arr[i]=sc.nextInt();
        
       }
       System.out.println("the array is :");
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+"     ");
        
       }
       System.out.println("the reverse array is :");
       for (int i = arr.length-1; i >=0; i--) {
        System.out.print(arr[i]+"     ");
        
       }
       

        
    }
    
}
