import java.util.*;
class main{
    public static void main(String[] args) {
        int max,min;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size : ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("the array is "+arr[i]);
            
        }
        if (arr.length==1) {
            min=arr[0];
            max=arr[0];
        }else{
            if(arr[0]>arr[1]){
                min=arr[1];
                max=arr[0];

            }else{
                min=arr[0];
                max=arr[1];
            }
            for (int i = 2; i < arr.length; i++) {
                if(arr[i]>max){
                    max=arr[i];
                }else{
                    if(arr[i]<min){
                        min=arr[i];
                    }
                }
                
            }
            System.out.println("the min array is"+min+"the max array is "+max);
                
        }
    }
}