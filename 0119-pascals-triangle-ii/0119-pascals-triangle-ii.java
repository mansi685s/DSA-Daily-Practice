class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;rowIndex>=i;i++){
            ArrayList<Integer>l1=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i)l1.add(1);
                else{
                    int val=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                    l1.add(val);
                }
            }
            list.add(l1);
        }
        ArrayList<Integer>l2=new ArrayList<>();
        for(int i=0;list.get(list.size()-1).size()>i;i++){
            l2.add(list.get(list.size()-1).get(i));
        }
return l2;
    }
}