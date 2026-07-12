class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int atr[]=new int[arr.length];
        int asr[]=new int[arr.length];
        int k=0;
        for(int x:arr){
            asr[k]=x;
            k++;
        }
        Arrays.sort(asr);
        HashMap<Integer,Integer>map=new HashMap<>();
        k=1;
        for(int i=0;asr.length>i;i++){
            if(!map.containsKey(asr[i])){
                map.put(asr[i],k);
                k++;
            }
        }
        for(int i=0;arr.length>i;i++){
            if(map.containsKey(arr[i])){
                atr[i]=map.get(arr[i]);
            }
        }
        return atr;
    }
}