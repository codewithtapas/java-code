public class method_over {
    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static int add(int num1,int num2,int num3 ){
         return num1+num2+num3;
    }
    public static void main(String[] args) {
        int soloution=add(10,20);
        int soloution2=add(10,20,30);
        System.out.println(soloution);
        System.out.println(soloution2);
    }
    
}
