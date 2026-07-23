class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>>list=new ArrayList<>();
        int m=grid.length,n=grid[0].length;
        List<Integer>l1=new ArrayList<>();
        for(int i=0;m>i;i++){
            for(int j=0;n>j;j++){
                l1.add(grid[i][j]);
            }
        }
        k=k%l1.size();
        List<Integer>l2=new ArrayList<>();
        for(int i=l1.size()-k;i<l1.size();i++){
            l2.add(l1.get(i));
        }
        List<Integer>l3=new ArrayList<>();
        for(int i=0;l2.size()>i;i++){
            l3.add(l2.get(i));
        }
        for(int i=0;l1.size()-k>i;i++){
            l3.add(l1.get(i));
        }
        int x=0;
        for(int i=0;m>i;i++){
            List<Integer>l5=new ArrayList<>();
            for(int j=0;n>j;j++){
                l5.add(l3.get(x++));
            }
            list.add(l5);
        }
        return list;
    }
}