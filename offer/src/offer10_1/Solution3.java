package offer10_1;

/*
Solution2优化
 */
public class Solution3 {
    public int fib(int n) {
        int res;
        int[] array = {0, 1};
        if(n==0||n==1) return n==0?0:1;
        for(int i=2; i<n+1; ++i){
            res = (array[0] + array[1])% 1000000007;;
            array[0] = array[1];
            array[1] = res;
        }
        return array[1];
    }
}

