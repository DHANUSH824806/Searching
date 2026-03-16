//Linear Search
class LinearSearch{
    public static void main(String[] args) {
        int[] nums={11,223,4,32,4,4,534,5,53,45,3,5,55,4,545};
        int target=1;
        int ans=linearsearch(nums, target);
        System.out.print(ans);
    }
    static int linearsearch(int[] arr,int target){
        if(arr.length==0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==target){
                return index;
            }
            
        }
        return -1;

    }
}