import java.util.*;
public class subarray {
    public static void main(String[] args) {
    int max_sum=0;
    int current_sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the array size");
    int size=sc.nextInt();
    int arr[]=new int[size];
    for( int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("the arrays :");
    for( int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    for (int i = 0; i < arr.length; i++) {
        current_sum=current_sum+arr[i];
        if(current_sum>max_sum){
            max_sum=current_sum;
        }if(current_sum<0){ 
            max_sum=0;
        }

        
    }
    System.out.println("the maximum subarrays is"+max_sum);
        
    }
    
}
