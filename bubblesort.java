class bubblesort{
    public void bubblesort(int arr[]){
        int n=arr.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
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