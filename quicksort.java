public class quicksort{
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;i<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }

    public static void quicksor(int arr[],int low,int high){
        if(low<high){
            int pidx=partition(arr, low, high);
        quicksor(arr,low,pidx-1);
        quicksor(arr,pidx+1,high);
        }
    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        quicksor(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}