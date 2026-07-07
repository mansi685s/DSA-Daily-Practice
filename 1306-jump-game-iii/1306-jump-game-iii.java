class Solution {
    public boolean canReach(int[] arr, int start) {
      boolean visited[]=new boolean[arr.length];
      Queue<Integer>q=new ArrayDeque<>();
      q.offer(start);
      while(!q.isEmpty()){
        int i=q.poll();
        if(i<0 || i>=arr.length || visited[i]){
            continue;
        }
        if(arr[i]==0)return true;
        visited[i]=true;
        q.offer(arr[i]+i);
        q.offer(i-arr[i]);
      }
      return false;
    }
}