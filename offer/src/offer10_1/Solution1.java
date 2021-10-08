package offer10_1;

/*
斐波那契数列
 */
/*
递归+数组存储结果，减少重复子问题的计算
自顶向下
 */
public class Solution1 {
    public int fib(int n) {
        int[] cacheArray = new int[n+1];
        return iter(cacheArray, n);
    }
    public int iter(int[] array, int n){
        if(n==0||n==1){
            return n==0?0:1;
        }
        if(array[n]!=0){
            return array[n];
        }
        array[n] = (iter(array, n-1) + iter(array, n-2)) % 1000000007;
        return array[n];
    }
}
