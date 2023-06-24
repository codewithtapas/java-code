import java.util.*;
public class alternate_reverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int size=sc.nextInt();
        int i,temp=0;
        int arr[]=new int[size];
        System.out.println("enter the input");
        for ( i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        System.out.println("the array is :");
        for ( i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            
        }
       System.out.println("reverse array :");
        for(i=0;i<size;i+=2){
            if(i+1<size){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            }

        }for (i = 0; i < arr.length; i++) {
            
        
        System.out.print(arr[i]+"  ");
        }
       
    }

    
}
