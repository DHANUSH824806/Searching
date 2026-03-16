//This code is for both in Ascending or Descending Order
class AgnosticBinarySearch{
    public static void main(String[] args) {
       // int[] arr={-1,23,234,545,6767,78999,97966};//ascending order sorted array
        int[] arr={111,103,98,89,87,78,76,67,65,56,23};//descending order sorted array
        int target=23;
        int ans=AgnosticBinarySearch(arr,target);
        System.out.print(ans);

    }
    static int AgnosticBinarySearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc= arr[start]<arr[end];
        while(start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            }
            else{
                     if(target<arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

            }
        }
        return -1;

    }
}
