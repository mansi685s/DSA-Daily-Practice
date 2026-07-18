class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,mm=0;
        for(int i=0;nums.length>i;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int i=1;
        for(;min>=i;i++){
                if(max%i==0 && min%i==0){
                   mm=i;
                 
                }
        }
        return mm;
    }
}