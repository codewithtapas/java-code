public class func_even {
    public static void checkEvenodd( int num){
        if (num%2==0){
            System.out.println("the no is even");
        }
        else{
            System.out.println("no is odd");
        }
    }
    public static void main(String[] args) {
        int num=20;
        checkEvenodd(num);
    }
    
}
