class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumo=0;
        int sume=0;
        int i=1;
        for(int j=1;n>=j;j++){
            sumo+=i;
            i=i+2;
        }
        int g=2;
        for(int h=1;n>=h;h++){
            sume+=g;
            g=g+2;
        }
        int a = sumo, b = sume;
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        
        return a; 
    }
}