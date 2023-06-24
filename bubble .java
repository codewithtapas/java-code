 class main  {
    public static void main(String[] args) {
        int j;
        int arr[]={7,4,3,2,1};
        for( int i=3;i>=0;i--){
            for(  j=0;j<=arr.length-1;j++){
                if (arr[j]>=arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
        System.out.println(arr[4]+"  ");

    }
    
}
