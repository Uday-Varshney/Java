class bubblesort{
    public void bubblesort(int arr[]){
        int n=arr.length;
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        bubblesort ob=new bubblesort();
        int arr[]={11,23,3,65,22};
        ob.bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
