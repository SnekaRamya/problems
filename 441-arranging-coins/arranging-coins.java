class Solution {
    public int arrangeCoins(int n) {
        int ans=0;
        for(int i=1;n>0;i++){
            n=n-i;
            ans++;
            

        }     
        return n==0?ans:ans-1;   
    }
}