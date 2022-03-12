class selectionsort{
    public void sort(int arr[]){
        int j=0,temp;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                temp=arr[j];
                arr[j]=arr[min];
                arr[min]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        selectionsort ob=new selectionsort();
        int arr[]={15,8,3,7,2};
        ob.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
       }
    }
}