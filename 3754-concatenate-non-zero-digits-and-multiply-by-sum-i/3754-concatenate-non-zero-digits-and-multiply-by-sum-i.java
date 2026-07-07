class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
       
        StringBuilder sb=new StringBuilder();
        while(n>0){
            if(n%10!=0){
                sb.append(n%10);
            }
            sum+=n%10;
            n=n/10;
        }
        if (sb.length() == 0)
            return 0;
sb.reverse();
long x=Long.parseLong(sb.toString());
       x=x*sum;
       return x;
    }
}