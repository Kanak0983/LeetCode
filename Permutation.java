class Solution {
    private void reverse(int[] arr, int start){
        int end = arr.length-1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        // decreasing order find kro 
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        // jese hi mila swap krdo
        if(i>=0){
            // required element dhundo swap krne ke liye 
            int j = nums.length-1;
            while(j>=0 && nums[j] <= nums[i]){
                j--;
            }
            // jese hi element miljaye swap krdo 
            swap(nums, i, j);
        }
        // reverse krdo baki ka 
        reverse(nums, i+1);
    }
}
    
