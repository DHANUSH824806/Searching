// Simple Binary Search
class BinarySearch{
    public static void main(String[] args) {
        int[] arr={1,2,34,45,55,56,57,67,68,79,80};
        int target=79;
        int ans=BinarySearch(arr, target);
        System.out.print(ans);
    }
    static int BinarySearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
 }
