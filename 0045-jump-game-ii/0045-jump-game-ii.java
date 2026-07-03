class Solution {
    public int jump(int[] nums) {
        int i=0,j=0,count=0;
        while(j<nums.length-1){
            int total=0;
            for(int k=i;j>=k;k++){
                total=Math.max(total,k+nums[k]);
            }
            i=j+1;
            j=total;
            count++;
        }
        return count;
    }
}