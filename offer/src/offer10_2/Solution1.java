package offer10_2;

/*
青蛙跳台阶
 */
class Solution1 {
    public int numWays(int n) {
        int res;
        int temp1 = 1;
        int temp2 = 1;
        if(n==0||n==1) return 1;
        for(int i=2; i<n+1; ++i){
            res = (temp1 + temp2) % 1000000007;
            temp1 = temp2;
            temp2 = res;
        }
        return temp2;
    }
}