class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,numsSize;
       int[] indices = new int[2];
            numsSize=nums.length;
            for(i=0;i<numsSize;i++){
                for(int j=i+1;j<numsSize;j++){
                    if(nums[j]+nums[i]==target){
                        System.out.println(i+j);
                        indices[0]=i;
                        indices[1]=j;
                        return indices;
                 }
     }
    }
    throw new IllegalArgumentException("No two sum solution"); 
    }
}
