public class LinearSearch {
    public static void main(String[] args){
        int[] nums = {1,7,9,11,6,3};
        int target = 11;
        int result = linearSearch(nums,target);
        System.out.println(result);
        if(result != -1){
            System.out.println("Elements found at index :"+ result);
        }else{
            System.out.println("Elements not found");
        }

    }
    public static int linearSearch(int nums[],int target){
        for (int i = 0;i<nums.length;i++){
            if(nums[i]==target){
//                System.out.println(target);
                return i;
            }
        }
        return -1;
    }

}
