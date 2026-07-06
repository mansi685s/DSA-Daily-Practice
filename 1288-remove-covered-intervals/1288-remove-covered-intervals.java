class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]!=b[0]?a[0]-b[0]:b[1]-a[1]);
        int count=0,r=0;
        for(int x[]:intervals){
           if(x[1]>r){
            r=x[1];
            count++;
           }
        }
return count;
    }
}