class selectionsort{
    public void sort(int arr[]){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                min=j;
                }
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
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
